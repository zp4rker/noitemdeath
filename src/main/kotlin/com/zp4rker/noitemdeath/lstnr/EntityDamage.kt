package com.zp4rker.noitemdeath.lstnr

import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent

object EntityDamage : Listener {

    @EventHandler
    fun onEntityDamage(event: EntityDamageEvent) {
        if (event.entityType != EntityType.DROPPED_ITEM) return
        if (event.cause != EntityDamageEvent.DamageCause.LAVA && event.cause != EntityDamageEvent.DamageCause.CONTACT) return

        event.isCancelled = true
    }

}