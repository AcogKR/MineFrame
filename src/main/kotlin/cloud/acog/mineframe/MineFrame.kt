package cloud.acog.mineframe

import org.bukkit.plugin.java.JavaPlugin

class MineFrame : JavaPlugin() {

    companion object {
        var inst: MineFrame? = null
    }

    override fun onDisable() {
        listOf(
            "This plugin is a plugin for Acog's personal library and is used in",
            "the library for all plugins developed by Acog."
        ).forEach(logger::info)
    }

    override fun onEnable() {
        inst = this
        listOf(
            "Please contact me if there is an error in the plugin",
            "Discord : Acog#5030, Telegram : @Acogkr"
        ).forEach(logger::info)
    }
}