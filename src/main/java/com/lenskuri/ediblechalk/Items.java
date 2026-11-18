package com.lenskuri.ediblechalk;

import com.lenskuri.ediblechalk.items.Chalk;
import com.lenskuri.ediblechalk.items.GoldenChalk;
import com.lenskuri.ediblechalk.items.ChalkDust;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EdibleChalk.MODID);

    public static final DeferredItem<Item> CHALK = ITEMS.register("chalk", Chalk::new);
    public static final DeferredItem<Item> GOLDEN_CHALK = ITEMS.register("golden_chalk", GoldenChalk::new);
    public static final DeferredItem<Item> CHALK_DUST = ITEMS.register("chalk_dust", ChalkDust::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
