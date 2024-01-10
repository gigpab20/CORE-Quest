package at.kaindorf.demo_2023.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.enchantment.Enchantments;

public class Rocksword extends SwordItem {
    public Rocksword() {
        super(new CustomToolRock(), 12, -2.0F, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    // Diese Methode wird überschrieben, um das Schwert zu initialisieren
    @Override
    public void onCraftedBy(ItemStack stack, net.minecraft.world.level.Level world, net.minecraft.world.entity.player.Player player) {
        // Füge Fire Aspect I hinzu
        stack.enchant(Enchantments.UNBREAKING, 1);
    }
}
