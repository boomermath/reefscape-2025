package queue;

import entry.AbstractYLogEntry;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class AtomicRingBufferQueue<E extends AbstractYLogEntry> implements LogQueue<E> {
    private final AtomicInteger head = new AtomicInteger(0); // write index
    private final AtomicInteger tail = new AtomicInteger(0); // read index

    private final E[] buffer;

    @SuppressWarnings("unchecked")
    public AtomicRingBufferQueue(int size, Supplier<E> entryCreator) {
        if (size <= 1) throw new IllegalArgumentException("Size must be > 1");
        this.buffer = (E[]) new Object[size + 1];

        for (int i = 0; i < size; i++) {
            buffer[i] = entryCreator.get();
        }
    }

    @Override
    public boolean add(E e) {
        int currHead = head.getAcquire();
        int currTail = tail.getAcquire();

        int nextHead = (currHead + 1) % (buffer.length);

        if (nextHead == currTail) {
            return false; // full
        }

        buffer[currHead] = e;
        head.setRelease(nextHead);
        return true;
    }

    @Override
    public E poll() {
        int currHead = head.getAcquire();
        int currTail = tail.getAcquire();

        if (currTail == currHead) {
            return null; // empty
        }

        E e = buffer[currTail];
        tail.setRelease((currTail + 1) % (buffer.length));
        return e;
    }
}

