package qc.slow.quariummod.world.struct;

import java.util.Random;

import net.minecraft.world.World;

public class StructGenH {
	public static final String struct="QChamp";
public boolean gen(String s, World w,Random r,int X, int Y, int Z) {
	if (s==struct) {
		temple1struct.inits(w, X, Y, Z);
	}
	return true;
}
}
