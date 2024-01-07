package at.kaindorf.demo_2023.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class Watersword extends SwordItem {

    public Watersword() {
        super(Tiers.DIAMOND, 44, -1.4F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
