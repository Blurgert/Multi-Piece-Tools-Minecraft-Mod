
package net.mcreator.multipiecetools.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class EHGoldenSwordItem extends PickaxeItem {
	public EHGoldenSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 51;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
