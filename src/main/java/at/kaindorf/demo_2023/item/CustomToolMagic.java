package at.kaindorf.demo_2023.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class CustomToolMagic implements Tier {
    @Override
    public int getUses() {
        return 10000;  // Haltbarkeit des Werkzeugs
    }

    @Override
    public float getSpeed() {
        // Die Geschwindigkeit, ähnlich wie bei anderen Materialien.
        // Du kannst den Wert von DIAMOND oder einem anderen Material nehmen.
        return 12.0F;
    }

    @Override
    public float getAttackDamageBonus() {
        // Zusätzlicher Angriffsschaden, den das Werkzeug verursacht
        return 0;  // oder einen anderen Wert, falls gewünscht
    }

    @Override
    public int getLevel() {
        // Die Stufe des Materials, ähnlich wie DIAMOND, IRON usw.
        return 3;  // 3 für Diamant-Niveau, ändere es je nach Bedarf
    }

    @Override
    public int getEnchantmentValue() {
        // Der Wert für die Verzauberbarkeit
        return 15;  // Wert ähnlich dem von Diamant
    }

    @Override
    public Ingredient getRepairIngredient() {
        // Das Material, das für die Reparatur des Werkzeugs verwendet wird
        return Ingredient.of(ModItems.Magic_Core.get());  // oder was immer du möchtest
    }
}
