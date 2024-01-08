package at.kaindorf.demo_2023.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;

public class Magicsword extends SwordItem {
    public Magicsword() {
        super(new CustomToolMagic(), 11, -1.4F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
