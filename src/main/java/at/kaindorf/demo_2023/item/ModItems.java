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

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Demo_2023.MODID);

    public static final RegistryObject<Item> Magic_Core =
            ITEMS.register("magic_core",
                    () -> new Item(new Item.Properties()
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> Water_Core =
            ITEMS.register("water_core",
                    () -> new Item(new Item.Properties()
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> Fire_Core =
            ITEMS.register("fire_core",
                    () -> new Item(new Item.Properties()
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> Rock_Core =
            ITEMS.register("rock_core",
                    () -> new Item(new Item.Properties()
                            .stacksTo(1)
                            .tab(CreativeModeTab.TAB_MISC)));
  
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

    public static final RegistryObject<ForgeSpawnEggItem> WATER_SERVITOR_SPAWN_EGG = ITEMS.register("water_servitor_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.WATER_SERVITOR, 0x474444, 0x3df3f3,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<ForgeSpawnEggItem> ROCK_SERVITOR_SPAWN_EGG = ITEMS.register("rock_servitor_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.ROCK_SERVITOR, 0x474444, 0x521f01,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> FIRE_SERVITOR_SPAWN_EGG = ITEMS.register("fire_servitor_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.FIRE_SERVITOR, 0x474444, 0xff0000,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<ForgeSpawnEggItem> MAGIC_SERVITOR_SPAWN_EGG = ITEMS.register("magic_servitor_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MAGIC_SERVITOR, 0x474444, 0x8900dd,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> FireSword =
            ITEMS.register("fire_sword",
                    () -> new FireSword());

    public static final RegistryObject<Item> Watersword =
            ITEMS.register("water_sword", () -> new Watersword());

    public static final RegistryObject<Item> MagicSword = ITEMS.register("magic_sword", () -> new Magicsword());
    public static final RegistryObject<Item> Rocksword = ITEMS.register("rock_sword", () -> new Rocksword());

}
