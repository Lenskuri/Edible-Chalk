package com.lenskuri.ediblechalk.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class Chalk extends Item {
    public Chalk() {
        super(new Item.Properties().food(
                new FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.25F)
                        .build()
        ));
    }
}
