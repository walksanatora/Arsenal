package smartin.arsenal.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.Event;
import smartin.arsenal.Arsenal;

public class ArsenalFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Arsenal.init();
        Event event;
    }
}