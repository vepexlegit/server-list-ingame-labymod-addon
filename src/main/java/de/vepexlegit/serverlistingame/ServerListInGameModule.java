package de.vepexlegit.serverlistingame;

import net.labymod.ingamegui.Module;
import net.labymod.settings.elements.ControlElement;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ServerListInGameModule extends Module {
    @Override
    public ControlElement.IconData getIconData() {
        return null;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public void loadSettings() {

    }

    @Override
    public String getSettingName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getSortingId() {
        return 0;
    }

    @SubscribeEvent
    public void onGuiScreenInit(GuiScreenEvent.InitGuiEvent.Post event) {
        if (event.gui instanceof GuiIngameMenu) {
            int x = event.gui.width / 2 - 100;
            int y = event.gui.height / 4 + 128;
            event.buttonList.add(new GuiButton(100, x, y, "ServerList"));
        }
    }

    @SubscribeEvent
    public void onGuiScreenActionPerformed(GuiScreenEvent.ActionPerformedEvent.Post event) {
        if (event.gui instanceof GuiIngameMenu && event.button.id == 100) {
            mc.displayGuiScreen(new GuiMultiplayer(event.gui));
        }
    }
}
