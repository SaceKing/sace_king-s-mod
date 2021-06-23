
package net.mcreator.sacekingsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.sacekingsmod.block.ForgetmenotBlock;
import net.mcreator.sacekingsmod.SaceKingsModModElements;

@SaceKingsModModElements.ModElement.Tag
public class SacekingsitemItemGroup extends SaceKingsModModElements.ModElement {
	public SacekingsitemItemGroup(SaceKingsModModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsacekingsitem") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ForgetmenotBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
