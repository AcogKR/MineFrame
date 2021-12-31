package cloud.acog.mineframe.functions.plugin

import cloud.acog.mineframe.MineFrame
import cloud.acog.mineframe.functions.command.CommandCreator
import org.bukkit.event.Listener

fun registerCommand(vararg commands : Pair<String, CommandCreator>) {
    MineFrame.inst?.getCommand(commands.get(0))
}

