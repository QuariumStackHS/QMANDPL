package qc.slow.quariummod.crafts;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import qc.slow.quariummod.blocks.blocks;
import qc.slow.quariummod.items.items;

public class Crafts {
	public static void register() {
		GameRegistry.addSmelting(blocks.Quarium_ore, new ItemStack(items.Quarium_ingot,1), 12.0f);
		GameRegistry.addRecipe(new ItemStack(blocks.Quarium_Block), new Object[] {"###","###","###",'#',items.Quarium_ingot});
		GameRegistry.addRecipe(new ItemStack(items.Quarium_ingot,9), new Object[] {"#",'#',blocks.Quarium_Block});
		GameRegistry.addRecipe(new ItemStack(items.Quarium_Sword), new Object[] {"#","#","^",'#',items.Quarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Quarium_Axe), new Object[] {"## ","#^ "," ^ ",'#',items.Quarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Quarium_Axe), new Object[] {" ##"," ^#"," ^ ",'#',items.Quarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Quarium_Hoe), new Object[] {" ##"," ^ "," ^ ",'#',items.Quarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Quarium_Pickaxe), new Object[] {"###"," ^ "," ^ ",'#',items.Quarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Quarium_Shovel), new Object[] {"#","^","^",'#',items.Quarium_ingot,'^',Items.stick});
	
		
		
		GameRegistry.addSmelting(blocks.Samarium_ore, new ItemStack(items.Samarium_Chunk,1), 14.0f);
		GameRegistry.addRecipe(new ItemStack(blocks.Samarium_Block), new Object[] {"###","###","###",'#',items.samarium_ingot});
		GameRegistry.addRecipe(new ItemStack(items.samarium_ingot,9), new Object[] {"#",'#',blocks.Samarium_Block});
		GameRegistry.addRecipe(new ItemStack(items.Samarium_Sword), new Object[] {"#","#","^",'#',items.samarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Samarium_Axe), new Object[] {"## ","#^ "," ^ ",'#',items.samarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Samarium_Axe), new Object[] {" ##"," ^#"," ^ ",'#',items.samarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Samarium_Hoe), new Object[] {" ##"," ^ "," ^ ",'#',items.samarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Samarium_Pickaxe), new Object[] {"###"," ^ "," ^ ",'#',items.samarium_ingot,'^',Items.stick});
		GameRegistry.addRecipe(new ItemStack(items.Samarium_Shovel), new Object[] {"#","^","^",'#',items.samarium_ingot,'^',Items.stick});	
		
	
	}
	
}
