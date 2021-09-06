package dev.moru3.tickratechanger

import com.mojang.blaze3d.matrix.MatrixStack
import net.minecraft.client.gui.widget.list.ExtendedList


class TickrateConfigScrollContents: ExtendedList.AbstractListEntry<TickrateConfigScrollContents>() {
    override fun render(
        matrixStack: MatrixStack,
        index: Int,
        top: Int,
        left: Int,
        width: Int,
        height: Int,
        mouseX: Int,
        mouseY: Int,
        isMouseOver: Boolean,
        partialTicks: Float
    ) {
        TODO("Not yet implemented")
    }

}

class TickrateConfigList: ExtendedList<TickrateConfigScrollContents>() {

}