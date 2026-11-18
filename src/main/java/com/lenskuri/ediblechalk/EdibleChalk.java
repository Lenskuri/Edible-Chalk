package com.lenskuri.ediblechalk;


import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(EdibleChalk.MODID)
public class EdibleChalk {
    public static final String MODID = "ediblechalk";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EdibleChalk(IEventBus modEventBus, ModContainer modContainer) {
        Items.register(modEventBus);
        Tabs.register(modEventBus);
    }
}
