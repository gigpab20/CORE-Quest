package at.kaindorf.demo_2023.event;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.ModEntityTypes;
import at.kaindorf.demo_2023.entity.custom.*;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


public class ModEvents {
    @Mod.EventBusSubscriber(modid = Demo_2023.MODID)
    public static class ForgeEvents {

    }
    @Mod.EventBusSubscriber(modid = Demo_2023.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents{

        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.MAGIC_GOLEM.get(), MagicGolemEntity.setAttributes());
            event.put(ModEntityTypes.WATER_GOLEM.get(), WaterGolemEntity.setAttributes());
            event.put(ModEntityTypes.FIRE_GOLEM.get(), FireGolemEntity.setAttributes());
            event.put(ModEntityTypes.ROCK_GOLEM.get(), RockGolemEntity.setAttributes());
            event.put(ModEntityTypes.FIRE_SERVITOR.get(), FireServitorEntity.setAttributes());
            event.put(ModEntityTypes.WATER_SERVITOR.get(), WaterServitorEntity.setAttributes());
            event.put(ModEntityTypes.ROCK_SERVITOR.get(), RockServitorEntity.setAttributes());
            event.put(ModEntityTypes.MAGIC_SERVITOR.get(), MagicServitorEntity.setAttributes());

        }
    }
}
