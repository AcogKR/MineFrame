package cloud.acog.mineframe.functions.command

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

abstract class CommandCreator : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        execute(sender, command, label, args)
        return false
    }

    abstract fun execute(sender: CommandSender, command: Command, label: String, args: Array<out String>)
}