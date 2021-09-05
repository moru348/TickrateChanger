package dev.moru3.tickratechanger

import net.minecraft.client.Minecraft
import net.minecraft.server.MinecraftServer
import net.minecraft.util.Timer
object Data {

    private val timerField = Minecraft::class.java.getDeclaredField("timer").also { it.isAccessible = true }
    private val tickLengthField = Timer::class.java.getDeclaredField("tickLength").also { it.isAccessible = true }
    lateinit var SERVER: MinecraftServer

    @JvmField
    var NOW_SERVER_TICK_RATE = 100L

    var clientTick = 100F
        get() = 1000F / field
        set(value) {
            val ticks = 1000F / value
            tickLengthField.set(timerField.get(Minecraft.getInstance()), ticks)
            field = ticks
        }

    var serverTick: Long
        get() = 1000 / NOW_SERVER_TICK_RATE
        set(value) { NOW_SERVER_TICK_RATE = 1000 / value }
}