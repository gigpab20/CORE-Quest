package at.kaindorf.demo_2023.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;

public class Magicsword extends SwordItem {
    public Magicsword() {
        super(new CustomToolMagic(), 10, -1.0F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
