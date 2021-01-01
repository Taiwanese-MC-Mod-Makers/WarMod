
package net.mcreator.warmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.warmod.itemgroup.WarmodItemGroup;
import net.mcreator.warmod.WarmodModElements;

@WarmodModElements.ModElement.Tag
public class AmmoItem extends WarmodModElements.ModElement {
	@ObjectHolder("warmod:ammo")
	public static final Item block = null;
	public AmmoItem(WarmodModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(WarmodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("ammo");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(this);
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
