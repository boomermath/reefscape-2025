package processor;

import edu.wpi.first.networktables.GenericPublisher;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.StructPublisher;
import edu.wpi.first.util.struct.Struct;
import edu.wpi.first.util.struct.StructSerializable;
import entry.*;

import java.util.HashMap;
import java.util.Map;

public class NetworkTableProcessor implements YLogProcessor {
    private final Map<String, GenericPublisher> publishers = new HashMap<>();


    @Override
    public void process(NumberYLogEntry entry) {
        NetworkTableInstance inst = NetworkTableInstance.getDefault().addSchema();

        NetworkTableInstance.getDefault()
                .g
    }

    @Override
    public void process(NumberArrayYLogEntry entry) {

    }

    @Override
    public void process(BooleanYLogEntry entry) {

    }

    @Override
    public void process(BooleanArrayYLogEntry entry) {

    }

    @Override
    public void process(DoubleArrayYLogEntry value) {

    }

    @Override
    public void process(DoubleYLogEntry value) {

    }

    @Override
    public void process(FloatYLogEntry value) {

    }

    @Override
    public void process(FloatArrayYLogEntry value) {

    }

    @Override
    public void process(RawYLogEntry value) {

    }

    @Override
    public <T extends StructSerializable> void process(StructYLogEntry<T> entry) {

    }
}
