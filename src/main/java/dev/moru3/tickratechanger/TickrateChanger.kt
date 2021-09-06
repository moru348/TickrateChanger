package dev.moru3.tickratechanger

import com.mojang.brigadier.Command
import dev.moru3.tickratechanger.Data.SERVER
import net.minecraft.client.Minecraft
import net.minecraft.command.Commands
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.server.FMLServerStartingEvent
import kotlin.concurrent.thread

@Mod("tickratechanger")
class TickrateChanger {

    var tickConfig: TickrateConfigScrollContents? = null

    @SubscribeEvent
    fun onServerStarting(event: FMLServerStartingEvent) {
        SERVER = event.server
        if(tickConfig==null) { tickConfig = TickrateConfigScrollContents() }
        event.server.commandManager.dispatcher.register(Commands.literal("tickratechanger").executes {
            thread {
                Thread.sleep(2 * Data.clientTick.toLong())
                Minecraft.getInstance().displayGuiScreen(tickConfig)
            }
            Command.SINGLE_SUCCESS
        })
    }

    init {
        MinecraftForge.EVENT_BUS.register(this)
    }
}