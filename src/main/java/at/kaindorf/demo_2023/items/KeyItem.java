package at.kaindorf.demo_2023.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class KeyItem extends Item {

    public KeyItem() {
        super(new
                Item.Properties()
                .tab(CreativeModeTab.TAB_MISC)
                .stacksTo(10));
    }
}
