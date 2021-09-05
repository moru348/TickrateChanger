package dev.moru3.tickratechanger

import com.mojang.authlib.GameProfile
import com.mojang.authlib.minecraft.MinecraftProfileTexture
import com.mojang.blaze3d.matrix.MatrixStack
import dev.moru3.tickratechanger.Data.SERVER
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.widget.TextFieldWidget
import net.minecraft.client.gui.widget.button.Button
import net.minecraft.client.gui.widget.button.ImageButton
import net.minecraft.client.gui.widget.list.OptionsRowList
import net.minecraft.client.settings.IteratableOption
import net.minecraft.util.text.TranslationTextComponent


class TickrateConfigScreen: Screen(TranslationTextComponent("tickratechanger.gui.config.title")) {
    private var optionsRowList: OptionsRowList? = null

    override fun init() {
        this.optionsRowList = OptionsRowList(
            Minecraft.getInstance(),
            this.width,
            this.height,
            24, this.height - 32, 25
        )
        this.children.add(optionsRowList)
        this.addButton(Button((this.width-200)/2,this.height - 26, 200, 20, TranslationTextComponent("gui.done")) {
            this.closeScreen()
        })
        
    }

    override fun render(matrixStack: MatrixStack, mouseX: Int, mouseY: Int, partialTicks: Float) {
        if(optionsRowList==null) {
            init()
            render(matrixStack, mouseX, mouseY, partialTicks)
        } else {
            println("test")
            this.renderBackground(matrixStack)
            this.optionsRowList!!.render(matrixStack, mouseX, mouseY, partialTicks)
            this.drawCenteredString(matrixStack, this.font, this.title.string, this.width/2,8, 0xFFFFFF)
            super.render(matrixStack, mouseX, mouseY, partialTicks)
        }
    }
}