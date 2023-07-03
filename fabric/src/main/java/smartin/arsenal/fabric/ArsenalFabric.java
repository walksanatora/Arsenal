package smartin.arsenal.fabric;

import smartin.arsenal.Arsenal;
import net.fabricmc.api.ModInitializer;

public class ArsenalFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Arsenal.init();
    }
}