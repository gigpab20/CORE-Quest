package at.kaindorf.demo_2023.items.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class LeggingsItem extends ArmorItem {

    public LeggingsItem(ArmorMaterial material, Item.Properties properties) {
        super(material, EquipmentSlot.LEGS, properties);
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
        // Deine benutzerdefinierte Logik für die Reparaturprüfung hier
        // Beispiel: return repair.getItem() == YOUR_REPAIR_ITEM;
        return super.isValidRepairItem(toRepair, repair);
    }
}