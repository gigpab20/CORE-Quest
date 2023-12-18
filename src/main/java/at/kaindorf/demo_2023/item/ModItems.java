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

    public static final RegistryObject<Item> MAGIC_GOLEM_SPAWN_EGG = ITEMS.register("magic_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MAGIC_GOLEM, 0x22b341, 0x19732e,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
