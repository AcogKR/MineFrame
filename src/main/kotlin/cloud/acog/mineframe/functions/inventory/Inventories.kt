package cloud.acog.mineframe.functions.inventory

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.inventory.InventoryType
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

fun inventory(title: String, row: Int, configure: Inventory.() -> Unit) =
    Bukkit.createInventory(null, row * 9, title).apply(configure)

fun inventory(type: InventoryType, title: String, configure: Inventory.() -> Unit) =
    Bukkit.createInventory(null, type, title).apply(configure)

fun Inventory.contain(material: Material, amount: Int = 0) : Boolean {
   return TODO()
}

fun Inventory.fill(item: ItemStack?) {
    for (i in 0 until size) {
        setItem(i, item)
    }
}
