package cloud.acog.mineframe.functions.item

import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.util.io.BukkitObjectInputStream
import org.bukkit.util.io.BukkitObjectOutputStream
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream

fun item(material: Material, amount: Int = 0) = ItemStack(material, amount)

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

fun convertStringItem(data: String) : ItemStack{
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
