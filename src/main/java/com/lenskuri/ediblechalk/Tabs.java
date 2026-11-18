package com.lenskuri.ediblechalk;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Tabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EdibleChalk.MODID);

    public static final Supplier<CreativeModeTab> EDIBLE_CHALK = CREATIVE_MODE_TABS.register("ediblechalk", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + EdibleChalk.MODID + ".base"))
            .icon(() -> new ItemStack(Items.CHALK.get()))
            .displayItems((parameters, output) -> {
                output.accept(Items.CHALK.get());
                output.accept(Items.CHALK_DUST.get());
                output.accept(Items.GOLDEN_CHALK.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
