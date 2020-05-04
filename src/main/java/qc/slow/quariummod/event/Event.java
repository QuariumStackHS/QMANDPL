package qc.slow.quariummod.event;

import net.minecraftforge.common.MinecraftForge;

public class Event {
public static void Init() {
	MinecraftForge.EVENT_BUS.register(new DropsBlock());
}
}
