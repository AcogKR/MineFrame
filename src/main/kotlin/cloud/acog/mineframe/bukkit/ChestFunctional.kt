package cloud.acog.mineframe.bukkit

import cloud.acog.mineframe.functions.command.CommandCreator
import cloud.acog.mineframe.functions.plugin.register
import org.bukkit.command.Command
import org.bukkit.command.CommandSender

fun ChestCommandFunctional() : CommandCreator = object : CommandCreator() {

    override fun execute(sender: CommandSender, command: Command, label: String, args: Array<out String>) {
        TODO("Not yet implemented")
    }
}.register("ChestManager")