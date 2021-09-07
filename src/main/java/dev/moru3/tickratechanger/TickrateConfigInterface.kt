package dev.moru3.tickratechanger

import com.mojang.blaze3d.matrix.MatrixStack
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.screen.inventory.InventoryScreen
import net.minecraft.client.gui.widget.list.ExtendedList
import net.minecraft.client.settings.KeyBinding
import net.minecraft.inventory.container.Container
import net.minecraftforge.client.event.InputEvent


class TickrateConfigScrollContents: ExtendedList.AbstractListEntry<TickrateConfigScrollContents>() {
    override fun render(matrixStack: MatrixStack, index: Int, top: Int, left: Int, width: Int, height: Int, mouseX: Int, mouseY: Int, isMouseOver: Boolean, partialTicks: Float) {

    }

}

class TickrateConfigList(mcIn: Minecraft, widthIn: Int, heightIn: Int, topIn: Int, bottomIn: Int, slotHeightIn: Int
) : ExtendedList<TickrateConfigScrollContents>(mcIn, widthIn, heightIn, topIn, bottomIn, slotHeightIn) {

}