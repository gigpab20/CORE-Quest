package at.kaindorf.demo_2023.items;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    // Beispielwerte, bitte entsprechend anpassen
    MAGICCORE("magiccore", 33, new int[]{2, 5, 6, 2}, 25, () -> Ingredient.of(Items.NETHERITE_INGOT), 0.5F, () -> SoundEvents.ARMOR_EQUIP_NETHERITE);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] damageReductionArray;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterialSupplier;
    private final float toughness;
    private final Supplier<SoundEvent> equipSoundSupplier;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] damageReductionArray, int enchantability, Supplier<Ingredient> repairMaterialSupplier, float toughness, Supplier<SoundEvent> equipSoundSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.damageReductionArray = damageReductionArray;
        this.enchantability = enchantability;
        this.repairMaterialSupplier = repairMaterialSupplier;
        this.toughness = toughness;
        this.equipSoundSupplier = equipSoundSupplier;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40410_) {
        return 0;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot p_40411_) {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterialSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F; // Ändere dies nach Bedarf
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSoundSupplier.get();
    }
}
