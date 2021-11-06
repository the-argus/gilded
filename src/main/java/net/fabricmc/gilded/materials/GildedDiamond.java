package net.fabricmc.gilded.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GildedDiamond implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};
    private static final int ENCHANTABILITY = 22;
	private static final float TOUGHNESS = 2.0F;
 
	@Override
	public int getDurability(EquipmentSlot slot) {
		return this.BASE_DURABILITY[slot.getEntitySlotId()];
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return this.PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return this.ENCHANTABILITY;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Registry.ITEM.get(new Identifier("minecraft", "diamond_chestplate")));
	}
 
	@Override
	public String getName() {
		// Must be all lowercase
		return "gilded_diamond";
	}
 
	@Override
	public float getToughness() {
		return this.TOUGHNESS;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 0.0F;
	}
}
