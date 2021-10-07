package cloud.acog.mineframe.functions.plugin

import cloud.acog.mineframe.MineFrame
import cloud.acog.mineframe.functions.command.CommandCreator
import org.bukkit.event.Listener

fun Listener.register() {
    MineFrame.inst!!.server.pluginManager.registerEvents(this, MineFrame.inst!!)
}

fun CommandCreator.register(command: String) : CommandCreator {
    MineFrame.inst!!.getCommand(command)!!.setExecutor(this)
    return this
}

