package queue;

import entry.AbstractYLogEntry;

public interface LogQueue<E extends AbstractYLogEntry> {
    boolean add(E e);

    E poll();
}
