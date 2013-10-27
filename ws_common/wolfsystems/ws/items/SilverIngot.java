package wolfsystems.ws.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SilverIngot extends Item {

	public SilverIngot(int id) {
		super(id);
		
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("SilverIngot");
	}

}
