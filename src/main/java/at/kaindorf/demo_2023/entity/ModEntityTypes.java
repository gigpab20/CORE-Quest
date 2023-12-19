package at.kaindorf.demo_2023.entity;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.MagicGolemEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.text.html.parser.Entity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Demo_2023.MODID);

    public static final RegistryObject<EntityType<MagicGolemEntity>> MAGIC_GOLEM =
            ENTITY_TYPES.register("magic_golem", () -> EntityType.Builder.of((MagicGolemEntity::new), MobCategory.MONSTER)
                    .sized(2.0f, 1.5f).build(new ResourceLocation(Demo_2023.MODID, "magic_golem").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
