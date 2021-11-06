package net.fabricmc.gilded.materials;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class GildedDiamond implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};
    private static final int ENCHANTABILITY = 22;
 
	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * X;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return ENCHANTABILITY;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return ITEM_ARMOR_EQUIP_DIAMOND;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(RegisterItems.Diamond);
	}
 
	@Override
	public String getName() {
		// Must be all lowercase
		return "gilded_diamond";
	}
 
	@Override
	public float getToughness() {
		return 2.0F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 0.0F;
	}
}
