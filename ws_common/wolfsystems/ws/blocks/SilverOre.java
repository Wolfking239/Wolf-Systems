package wolfsystems.ws.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SilverOre extends Block {

	public SilverOre(int id, Material material) {
		super(id, material);
		
		setHardness(2F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("SilverOre");
		setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	
}


