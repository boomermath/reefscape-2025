package processor.nt;

import edu.wpi.first.networktables.GenericPublisher;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.PubSubOption;
import edu.wpi.first.util.struct.StructSerializable;
import entry.*;
import processor.YLogProcessor;

import java.util.HashMap;
import java.util.Map;

public class NetworkTableProcessor implements YLogProcessor {
   private final NetworkTable table = NetworkTableInstance.getDefault().getTable("YLog");

    private final Map<String, GenericPublisher> publishers = new HashMap<>();
    private final Map<String, Object> lastValues = new HashMap<>();


    public GenericPublisher getPublisher(String key, String typeString) {
        NetworkTableInstance.getDefault().addSchema();
        PubSubOption.sendAll(true);
        return publishers.computeIfAbsent(key, () ->
                    table.getTopic(key)
                            .genericPublishEx())
    }

    @Override
    public void process(NumberYLogEntry entry) {

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
