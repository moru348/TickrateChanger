package dev.moru3.tickratechanger

import com.mojang.blaze3d.matrix.MatrixStack
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.widget.list.ExtendedList


class TickrateConfigScrollContents: ExtendedList.AbstractListEntry<TickrateConfigScrollContents>() {
    override fun render(matrixStack: MatrixStack, index: Int, top: Int, left: Int, width: Int, height: Int, mouseX: Int, mouseY: Int, isMouseOver: Boolean, partialTicks: Float) {
        TODO("Not yet implemented")
    }


}

class TickrateConfigList(mcIn: Minecraft, widthIn: Int, heightIn: Int, topIn: Int, bottomIn: Int, slotHeightIn: Int
) : ExtendedList<TickrateConfigScrollContents>(mcIn, widthIn, heightIn, topIn, bottomIn, slotHeightIn) {

}