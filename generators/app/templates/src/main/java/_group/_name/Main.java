package <%= groupName %>;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/*
	Generated by Bancey's Yeoman Spigot Generator
*/
public class Main extends JavaPlugin {
	
	private Main plugin;
    private PluginDescriptionFile pdfFile;
	
	@Override
	public void onEnable() {
		plugin = this;
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public Main getPlugin() {
		return plugin;
    }
}