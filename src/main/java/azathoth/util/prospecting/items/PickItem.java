package azathoth.util.prospecting.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
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
		Block b = world.getBlock(x, y, z);
		if (OreDictionary.getOreID("stone")==OreDictionary.getOreID(new ItemStack(b))) {
			super.doProspect(player, world, x, y, z);
			return true;
		}
		return false;
	}
}
