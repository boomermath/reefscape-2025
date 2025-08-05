package processor;

import edu.wpi.first.util.struct.Struct;
import edu.wpi.first.util.struct.StructSerializable;

public interface YLogProcessor {
    void process(long value);
    void process(long[] value);
    void process(boolean value);
    void process(boolean[] value);
    void process(double value);
    void process(double[] value);
    void process(float[] value);
    void process(float value);
    void process(byte[] value);
   <T extends StructSerializable> void process(Struct<T> struct, T value);
}
