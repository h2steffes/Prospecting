package azathoth.util.prospecting.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class PickItem extends ProspectingItem {
	protected PickItem() {
		super();
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitx, float hity, float hitz) {
		if (OreDictionary.getOres("stone").contains(new ItemStack(world.getBlock(x, y, z)))) {
			super.doProspect(player, world, x, y, z);
			return true;
		}
		return false;
	}
}
