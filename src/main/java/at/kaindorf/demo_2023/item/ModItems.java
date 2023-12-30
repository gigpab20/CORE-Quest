package at.kaindorf.demo_2023.item;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister <Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Demo_2023.MODID);

    public static final RegistryObject<ForgeSpawnEggItem> MAGIC_GOLEM_SPAWN_EGG = ITEMS.register("magic_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MAGIC_GOLEM, 0x33213e, 0x8900dd,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> ROCK_GOLEM_SPAWN_EGG = ITEMS.register("rock_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ROCK_GOLEM, 0x403d3d, 0x521f01,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> FIRE_GOLEM_SPAWN_EGG = ITEMS.register("fire_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.FIRE_GOLEM, 0x433535, 0xff0000,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> WATER_GOLEM_SPAWN_EGG = ITEMS.register("water_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.WATER_GOLEM, 0x26333d, 0x3df3f3,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
