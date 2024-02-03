package smartin.arsenal.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import smartin.arsenal.Arsenal;

@Mod(Arsenal.MOD_ID)
public class ArsenalForge {
    public ArsenalForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Arsenal.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            Arsenal.init();
        Event event;
        AttackEntityEvent event1;
    }
}