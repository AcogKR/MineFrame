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
            "This Plugin is Acog Plugin Support Library",
            "Please contact me if there is an error in the plugin",
            "Discord : Acog#5030, Telegram : @Acogkr"
        ).forEach(logger::info)
    }
}

/*
fun convertItemString(item: ItemStack) : String{
    var outputStream: ByteArrayOutputStream? = null
    var dataOutput: BukkitObjectOutputStream?

    runCatching {
        outputStream = ByteArrayOutputStream()
        dataOutput = BukkitObjectOutputStream(outputStream)
        dataOutput!!.writeObject(item)
        dataOutput!!.close()
    }.onFailure {
            e -> e.printStackTrace()
    }
    return Base64Coder.encodeLines(outputStream!!.toByteArray())
}

fun convertStringItem(data: String) : ItemStack {
    var inputStream: ByteArrayInputStream?
    var dataInput: BukkitObjectInputStream?
    var item = item(Material.AIR)

    runCatching {
        inputStream = ByteArrayInputStream(Base64Coder.decodeLines(data))
        dataInput = BukkitObjectInputStream(inputStream)
        item = dataInput!!.readObject() as ItemStack
    }.onFailure {
            e -> e.printStackTrace()
    }
    return item
}
*/