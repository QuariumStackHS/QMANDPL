package qc.SlowRiding.Main;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
public void onEnable() {
	System.out.println("Plugin enable");
}
public void onDisable() {
	System.out.println("Plugin disable");
}
}
