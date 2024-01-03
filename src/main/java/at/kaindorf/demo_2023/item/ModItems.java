package at.kaindorf.demo_2023.item;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.items.ModArmorMaterials;
import at.kaindorf.demo_2023.items.custom.BootsItem;
import at.kaindorf.demo_2023.items.custom.ChestplateItem;
import at.kaindorf.demo_2023.items.custom.HelmetItem;
import at.kaindorf.demo_2023.items.custom.LeggingsItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
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
    //MAGIC CORE ARMOR
    public static final RegistryObject<Item> MAGIC_CORE_HELMET_ITEM = ITEMS.register("magic_core_helmet", () ->
            new HelmetItem(ModArmorMaterials.MAGICCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGIC_CORE_CHESTPLATE_ITEM = ITEMS.register("magic_core_chestplate", () ->
            new ChestplateItem(ModArmorMaterials.MAGICCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGIC_CORE_BOOTS_ITEM = ITEMS.register("magic_core_boots", () ->
            new BootsItem(ModArmorMaterials.MAGICCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> MAGIC_CORE_LEGGINGS_ITEM = ITEMS.register("magic_core_leggings", () ->
            new LeggingsItem(ModArmorMaterials.MAGICCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //FIRE CORE ARMOR
    public static final RegistryObject<Item> FIRE_CORE_HELMET_ITEM = ITEMS.register("fire_core_helmet", () ->
            new HelmetItem(ModArmorMaterials.FIRECORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> FIRE_CORE_CHESTPLATE_ITEM = ITEMS.register("fire_core_chestplate", () ->
            new ChestplateItem(ModArmorMaterials.FIRECORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> FIRE_CORE_BOOTS_ITEM = ITEMS.register("fire_core_boots", () ->
            new BootsItem(ModArmorMaterials.FIRECORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> FIRE_CORE_LEGGINGS_ITEM = ITEMS.register("fire_core_leggings", () ->
            new LeggingsItem(ModArmorMaterials.FIRECORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //ROCK CORE ARMOR
    public static final RegistryObject<Item> ROCK_CORE_HELMET_ITEM = ITEMS.register("rock_core_helmet", () ->
            new HelmetItem(ModArmorMaterials.ROCKCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROCK_CORE_CHESTPLATE_ITEM = ITEMS.register("rock_core_chestplate", () ->
            new ChestplateItem(ModArmorMaterials.ROCKCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROCK_CORE_BOOTS_ITEM = ITEMS.register("rock_core_boots", () ->
            new BootsItem(ModArmorMaterials.ROCKCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROCK_CORE_LEGGINGS_ITEM = ITEMS.register("rock_core_leggings", () ->
            new LeggingsItem(ModArmorMaterials.ROCKCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //WATER CORE ARMOR
    public static final RegistryObject<Item> WATER_CORE_HELMET_ITEM = ITEMS.register("water_core_helmet", () ->
            new HelmetItem(ModArmorMaterials.WATERCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> WATER_CORE_CHESTPLATE_ITEM = ITEMS.register("water_core_chestplate", () ->
            new ChestplateItem(ModArmorMaterials.WATERCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> WATER_CORE_BOOTS_ITEM = ITEMS.register("water_core_boots", () ->
            new BootsItem(ModArmorMaterials.WATERCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> WATER_CORE_LEGGINGS_ITEM = ITEMS.register("water_core_leggings", () ->
            new LeggingsItem(ModArmorMaterials.WATERCORE,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}
