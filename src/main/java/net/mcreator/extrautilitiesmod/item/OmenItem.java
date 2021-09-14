
package net.mcreator.extrautilitiesmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.extrautilitiesmod.ExtraUtilitiesModModElements;

@ExtraUtilitiesModModElements.ModElement.Tag
public class OmenItem extends ExtraUtilitiesModModElements.ModElement {
	@ObjectHolder("extra_utilities_mod:omen")
	public static final Item block = null;
	public OmenItem(ExtraUtilitiesModModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ExtraUtilitiesModModElements.sounds.get(new ResourceLocation("extra_utilities_mod:omen")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("omen");
		}
	}
}
