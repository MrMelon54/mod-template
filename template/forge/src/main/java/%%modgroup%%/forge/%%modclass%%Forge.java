package %%modgroup%%.forge;

import %%modgroup%%.%%modclass%%;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(%%modclass%%.MOD_ID)
public class %%modclass%%Forge {
    public %%modclass%%Forge() {
        EventBuses.registerModEventBus(%%modclass%%.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        %%modclass%%.init();
    }
}
