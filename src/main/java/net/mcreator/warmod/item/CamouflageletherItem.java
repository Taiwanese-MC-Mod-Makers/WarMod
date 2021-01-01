
package net.mcreator.warmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.warmod.itemgroup.WarmodItemGroup;
import net.mcreator.warmod.WarmodModElements;

@WarmodModElements.ModElement.Tag
public class CamouflageletherItem extends WarmodModElements.ModElement {
	@ObjectHolder("warmod:camouflagelether")
	public static final Item block = null;
	public CamouflageletherItem(WarmodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(WarmodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("camouflagelether");
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
