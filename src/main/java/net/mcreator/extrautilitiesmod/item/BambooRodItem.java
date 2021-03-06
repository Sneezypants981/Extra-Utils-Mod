
package net.mcreator.extrautilitiesmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.extrautilitiesmod.ExtraUtilitiesModModElements;

@ExtraUtilitiesModModElements.ModElement.Tag
public class BambooRodItem extends ExtraUtilitiesModModElements.ModElement {
	@ObjectHolder("extra_utilities_mod:bamboo_rod")
	public static final Item block = null;
	public BambooRodItem(ExtraUtilitiesModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 128;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BambooRodItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("bamboo_rod"));
	}
}
