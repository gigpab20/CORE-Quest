package at.kaindorf.demo_2023.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.enchantment.Enchantments;

public class Watersword extends SwordItem {

    public Watersword() {
        super(new CustomToolWater(), 11, -1.4F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    // Diese Methode wird überschrieben, um das Schwert zu initialisieren
    @Override
    public void onCraftedBy(ItemStack stack, net.minecraft.world.level.Level world, net.minecraft.world.entity.player.Player player) {
        // Füge Fire Aspect I hinzu
        stack.enchant(Enchantments.MOB_LOOTING, 1);
    }

}
