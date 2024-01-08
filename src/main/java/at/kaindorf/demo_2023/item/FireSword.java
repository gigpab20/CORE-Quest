package at.kaindorf.demo_2023.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.Map;


public class FireSword extends SwordItem {
    public FireSword() {
        // Die super-Methode ruft den Konstruktor der SwordItem-Klasse auf.
        // Hier wird das Material des Schwertes festgelegt (z.B. DIAMOND, GOLD, usw.)

        super(new CustomToolFire(), 11, -1.4F, new Properties().tab(CreativeModeTab.TAB_COMBAT));

        // Der dritte Parameter ist die Angriffsgeschwindigkeit des Schwertes.
        // Der Standardwert (-2.4F) entspricht der des Diamantschwerts.
        // Der zweite Parameter (3) ist die Schadensstärke, die du auf 44 ändern möchtest.


        //EnchantmentHelper.setEnchantments(Map.of(Enchantments.FIRE_ASPECT, 2), new ItemStack(this));
    }

    // Diese Methode wird überschrieben, um das Schwert zu initialisieren
    @Override
    public void onCraftedBy(ItemStack stack, net.minecraft.world.level.Level world, net.minecraft.world.entity.player.Player player) {
        // Füge Fire Aspect I hinzu
        stack.enchant(Enchantments.FIRE_ASPECT, 1);
    }
}


