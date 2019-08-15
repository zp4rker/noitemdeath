package com.zp4rker.noitemdeath

import com.zp4rker.noitemdeath.lstnr.EntityDamage
import com.zp4rker.noitemdeath.lstnr.ItemSpawn
import org.bukkit.plugin.java.JavaPlugin

class NoItemDeath : JavaPlugin() {

    override fun onEnable() {
        logger.info("Successfully enabled!")
        server.pluginManager.registerEvents(ItemSpawn, this)
        server.pluginManager.registerEvents(EntityDamage, this)
    }
}