package at.kaindorf.demo_2023.entity;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.*;
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


    public static final RegistryObject<EntityType<WaterGolemEntity>> WATER_GOLEM =
            ENTITY_TYPES.register("water_golem", () -> EntityType.Builder.of((WaterGolemEntity::new), MobCategory.MONSTER)
                    .sized(2.0f, 1.5f).build(new ResourceLocation(Demo_2023.MODID, "water_golem").toString()));

    public static final RegistryObject<EntityType<FireGolemEntity>> FIRE_GOLEM =
            ENTITY_TYPES.register("fire_golem", () -> EntityType.Builder.of((FireGolemEntity::new), MobCategory.MONSTER)
                    .sized(2.0f, 1.5f).build(new ResourceLocation(Demo_2023.MODID, "fire_golem").toString()));

    public static final RegistryObject<EntityType<RockGolemEntity>> ROCK_GOLEM =
            ENTITY_TYPES.register("rock_golem", () -> EntityType.Builder.of((RockGolemEntity::new), MobCategory.MONSTER)
                    .sized(2.0f, 1.5f).build(new ResourceLocation(Demo_2023.MODID, "rock_golem").toString()));

    public static final RegistryObject<EntityType<FireServitorEntity>> FIRE_SERVITOR =
            ENTITY_TYPES.register("fire_servitor", () -> EntityType.Builder.of((FireServitorEntity::new), MobCategory.MONSTER)
                    .sized(2.0f, 1.5f).build(new ResourceLocation(Demo_2023.MODID, "fire_servitor").toString()));

    public static final RegistryObject<EntityType<WaterServitorEntity>> WATER_SERVITOR =
            ENTITY_TYPES.register("water_servitor", () -> EntityType.Builder.of((WaterServitorEntity::new), MobCategory.MONSTER)
                    .sized(2.0f, 1.5f).build(new ResourceLocation(Demo_2023.MODID, "water_servitor").toString()));
    public static final RegistryObject<EntityType<RockServitorEntity>> ROCK_SERVITOR =
            ENTITY_TYPES.register("rock_servitor", () -> EntityType.Builder.of((RockServitorEntity::new), MobCategory.MONSTER)
                    .sized(2.0f, 1.5f).build(new ResourceLocation(Demo_2023.MODID, "rock_servitor").toString()));
    public static final RegistryObject<EntityType<MagicServitorEntity>> MAGIC_SERVITOR =
            ENTITY_TYPES.register("magic_servitor", () -> EntityType.Builder.of((MagicServitorEntity::new), MobCategory.MONSTER)
                    .sized(2.0f, 1.5f).build(new ResourceLocation(Demo_2023.MODID, "magic_servitor").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
