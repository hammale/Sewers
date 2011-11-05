package me.hammale.Sewer;

import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Sewer extends JavaPlugin {
	static Server server;
	static Plugin plugin;
	
	//private final SewerBlockListener blockListener = new SewerBlockListener();
	//public final SewerPlayerListener playerListener = new SewerPlayerListener();
	
	private SewerCommandListener cmdExecutor;
	@Override
	public void onEnable()
    {	 
	    System.out.println("Sewers Enabled!" );
	    cmdExecutor = new SewerCommandListener(this);
		getCommand("sewer").setExecutor(cmdExecutor);
		
		server = this.getServer();
		plugin = this;
    }
	public void onDisable()
    {
		System.out.println("Sewers Disabled!");
    }
	private void registerEvents()
    {
		//getServer().getPluginManager().registerEvent(Event.Type.BLOCK_PLACE, this.blockListener, Event.Priority.Normal, this);
		//getServer().getPluginManager().registerEvent(Event.Type.PLAYER_CHAT, this.playerListener, Event.Priority.Normal, this);
    }    
}