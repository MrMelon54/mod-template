package %%modgroup%%;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "%%modid%%")
@Config.Gui.Background("minecraft:textures/block/dirt.png")
public class ConfigStructure implements ConfigData {
    public boolean modeEnabled = true;
}
