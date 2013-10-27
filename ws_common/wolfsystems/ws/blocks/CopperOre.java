package wolfsystems.ws.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends Block {

	public CopperOre(int id, Material material) {
		super(id, material);
		
		setHardness(2F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName("CopperOre");
		setCreativeTab(CreativeTabs.tabBlock);
		
	}
}
