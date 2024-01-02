package at.kaindorf.demo_2023.init;

import at.kaindorf.demo_2023.Demo_2023;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Demo_2023.MODID);

    public static final RegistryObject<Item> Example_ITEM =
            ITEMS.register("key_item",
                    () -> new Item(new Item.Properties()
                            .stacksTo(8)
                            .tab(CreativeModeTab.TAB_MISC)));

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

    public static final RegistryObject<BlockItem> METAL_BLOCK =
            ITEMS.register("metal_block",
                    () -> new BlockItem(BlockInit.METAL_BOCK.get(),
                            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
