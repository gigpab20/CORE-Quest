package at.kaindorf.demo_2023.item;

import at.kaindorf.demo_2023.Demo_2023;

import at.kaindorf.demo_2023.entity.ModEntityTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
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

    public static final RegistryObject<Item> FIRE_HELMET = ITEMS.register("fire_helmet",
            () -> new ArmorItem(ModArmorMaterials.FIRE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> FIRE_CHESTPLATE = ITEMS.register("fire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.FIRE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> FIRE_LEGGINGS = ITEMS.register("fire_leggings",
            () -> new ArmorItem(ModArmorMaterials.FIRE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


    public static final RegistryObject<Item> FIRE_BOOTS = ITEMS.register("fire_boots",
            () -> new ArmorItem(ModArmorMaterials.FIRE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> WATER_HELMET = ITEMS.register("water_helmet",
            () -> new ArmorItem(ModArmorMaterials.WATER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> WATER_CHESTPLATE = ITEMS.register("water_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WATER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> WATER_LEGGINGS = ITEMS.register("water_leggings",
            () -> new ArmorItem(ModArmorMaterials.WATER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> WATER_BOOTS = ITEMS.register("water_boots",
            () -> new ArmorItem(ModArmorMaterials.WATER, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROCK_HELMET = ITEMS.register("rock_helmet",
            () -> new ArmorItem(ModArmorMaterials.ROCK, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROCK_CHESTPLATE = ITEMS.register("rock_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ROCK, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROCK_LEGGINGS = ITEMS.register("rock_leggings",
            () -> new ArmorItem(ModArmorMaterials.ROCK, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROCK_BOOTS = ITEMS.register("rock_boots",
            () -> new ArmorItem(ModArmorMaterials.ROCK, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGIC_HELMET = ITEMS.register("magic_helmet",
            () -> new ArmorItem(ModArmorMaterials.MAGIC, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MAGIC_CHESTPLATE = ITEMS.register("magic_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MAGIC, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MAGIC_LEGGINGS = ITEMS.register("magic_leggings",
            () -> new ArmorItem(ModArmorMaterials.MAGIC, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MAGIC_BOOTS = ITEMS.register("magic_boots",
            () -> new ArmorItem(ModArmorMaterials.MAGIC, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> FireSword =
            ITEMS.register("fire_sword",
                    () -> new FireSword());

    public static final RegistryObject<Item> Watersword =
            ITEMS.register("water_sword", () -> new Watersword());

    public static final RegistryObject<Item> MagicSword = ITEMS.register("magic_sword", () -> new Magicsword());
    public static final RegistryObject<Item> Rocksword = ITEMS.register("rock_sword", () -> new Rocksword());



}
