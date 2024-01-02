package at.kaindorf.demo_2023.init;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.items.ModArmorMaterials;
import at.kaindorf.demo_2023.items.custom.MagicCoreHelmetItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
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

    public static final RegistryObject<BlockItem> METAL_BLOCK =
            ITEMS.register("metal_block",
                    () -> new BlockItem(BlockInit.METAL_BOCK.get(),
                            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> MAGIC_CORE_HELMET =
            ITEMS.register("magic_core_helmet",
                    () -> new MagicCoreHelmetItem(ModArmorMaterials.MAGICCORE,
                            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


}
