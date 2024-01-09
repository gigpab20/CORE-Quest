package at.kaindorf.demo_2023.item;

import at.kaindorf.demo_2023.Demo_2023;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;


public enum ModArmorMaterial implements ArmorMaterial {


    FIRE("fire", 40, new int[]{10, 10, 13, 10}, 14, SoundEvents.ARMOR_EQUIP_GOLD,
            4.0F, 0.6F, () -> {
        return Ingredient.of(ModItems.Fire_Core.get());
    }),
    WATER("water", 40, new int[]{10, 10, 13, 10}, 14, SoundEvents.ARMOR_EQUIP_GOLD,
            4.0F, 0.6F, () -> {
        return Ingredient.of(ModItems.Water_Core.get());
    }),
    ROCK("rock", 40, new int[]{10, 10, 13, 10}, 14, SoundEvents.ARMOR_EQUIP_GOLD,
            4.0F, 0.6F, () -> {
        return Ingredient.of(ModItems.Rock_Core.get());
    }),
    MAGIC("magic", 40, new int[]{10, 10, 13, 10}, 14, SoundEvents.ARMOR_EQUIP_GOLD,
            4.0F, 0.6F, () -> {
        return Ingredient.of(ModItems.Magic_Core.get());
    });


    private static final int[] HEALTH_PER_SLOT = new int[]{10, 10, 10, 10};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound,
                     float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40410_) {
        return durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot p_40411_) {
        return this.slotProtections[p_40411_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Demo_2023.MODID +":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
