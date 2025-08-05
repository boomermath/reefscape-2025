package processor;

import edu.wpi.first.util.struct.StructSerializable;
import entry.*;

public interface YLogProcessor {
    void process(NumberYLogEntry entry);
    void process(NumberArrayYLogEntry entry);
    void process(BooleanYLogEntry entry);
    void process(BooleanArrayYLogEntry entry);
    void process(DoubleArrayYLogEntry value);
    void process(DoubleYLogEntry value);
    void process(FloatYLogEntry value);
    void process(FloatArrayYLogEntry value);
    void process(RawYLogEntry value);
   <T extends StructSerializable> void process(StructYLogEntry<T> entry);
}
