package entry;

import edu.wpi.first.util.struct.Struct;
import edu.wpi.first.util.struct.StructSerializable;

public class StructYLogEntry<T extends StructSerializable> extends AbstractYLogEntry {
    public Struct<T> structType;
    public T value;
}
