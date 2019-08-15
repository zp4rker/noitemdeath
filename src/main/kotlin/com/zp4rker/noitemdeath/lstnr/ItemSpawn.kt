package com.zp4rker.noitemdeath.lstnr

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ItemSpawnEvent

object ItemSpawn : Listener {

    @EventHandler
    fun onItemSpawn(event: ItemSpawnEvent) {
        event.entity.isInvulnerable = true
    }

}