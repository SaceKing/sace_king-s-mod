
package net.mcreator.sacekingsmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.sacekingsmod.itemgroup.SacekingsitemItemGroup;
import net.mcreator.sacekingsmod.SaceKingsModModElements;

@SaceKingsModModElements.ModElement.Tag
public class CPUsacekingItem extends SaceKingsModModElements.ModElement {
	@ObjectHolder("sace_kings_mod:cp_usaceking")
	public static final Item block = null;
	public CPUsacekingItem(SaceKingsModModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SacekingsitemItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("cp_usaceking");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
