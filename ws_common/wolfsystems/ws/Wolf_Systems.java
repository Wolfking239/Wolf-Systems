package wolfsystems.ws;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import wolfsystems.ws.core.proxy.CommonProxy;
import wolfsystems.ws.lib.Reference;
import wolfsystems.ws.blocks.CopperOre;
import wolfsystems.ws.blocks.SilverOre;
import wolfsystems.ws.items.SilverIngot;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Wolf_Systems {
	
	 
    @Instance(Reference.MOD_ID)
    public static Wolf_Systems instance;
        
	@SidedProxy( clientSide = "wolfsystems.ws.core.proxy.ClientProxy", serverSide = "wolfsystems.ws.core.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	
		//block
		public final static Block SilverOre = new SilverOre(5001, Material.rock);
		public final static Block CopperOre = new CopperOre(5003, Material.rock);
		
		
		//items
		private final static Item SilverIngot = new SilverIngot(5002);
		ItemStack SilverIngotStack = new ItemStack(wolfsystems.ws.items.SilverIngot);
		
		
		

		
		
       
        
        
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
                
        
            //blocks
        	GameRegistry.registerBlock(SilverOre, "SilverOre");
            LanguageRegistry.addName(SilverOre, "Silver Ore");
    		MinecraftForge.setBlockHarvestLevel(SilverOre, "pickaxe", 2);
                 //0=wood 1=stone 2=iron 3= diamond 
            FurnaceRecipes.smelting().addSmelting(wolfsystems.ws.blocks.SilverOre.blockID, SilverIngotStack, 1F);
              
                
                //items
                //GameRegistry.registerItem(SilverIngot, "SilverIngot");
                //LanguageRegistry.addName(SilverIngot, "Silver Ingot");
               
                
                
               
        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
       
}
