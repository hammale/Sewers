package me.hammale.Sewer;

import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Sewer extends JavaPlugin {
	static Server server;
	static Plugin plugin;
	
	private final SewerBlockListener blockListener = new SewerBlockListener();
	
	public void onEnable()
    {
	    System.out.println("Sewer Enabled!" );
		registerEvents();
		server = this.getServer();
		plugin = this;
    }
	public void onDisable()
    {
		System.out.println("Sewer Disabled!");
    }
	private void registerEvents()
    {
		getServer().getPluginManager().registerEvent(Event.Type.BLOCK_PLACE, this.blockListener, Event.Priority.Normal, this);
    }
}