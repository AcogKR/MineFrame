package cloud.acog.mineframe.functions.inventory

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.inventory.InventoryType
import org.bukkit.inventory.Inventory

fun inventory(size: Int, title: String) = Bukkit.createInventory(null, size, title)

fun inventory(type: InventoryType, title: String) = Bukkit.createInventory(null, type, title)

fun Inventory.contain(material: Material, amount: Int = 0) {
    
}


