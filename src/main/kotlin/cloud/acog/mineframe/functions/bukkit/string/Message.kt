package cloud.acog.mineframe.functions.bukkit.string

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import java.util.regex.Pattern

fun String.colorize(altColorChar: Char = '&') =
    ChatColor.translateAlternateColorCodes(altColorChar, this)

fun String.broadcast() = Bukkit.broadcastMessage(toString())

val STRIP_COLORS_PATTERN: Pattern = Pattern.compile("(?i)[${ChatColor.COLOR_CHAR}|&][0-9A-FK-OR]")

fun String.stripColor() = STRIP_COLORS_PATTERN.matcher(this).replaceAll("")