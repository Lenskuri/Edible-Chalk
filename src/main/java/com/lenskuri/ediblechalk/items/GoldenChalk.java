package com.lenskuri.ediblechalk.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class GoldenChalk extends Item {
    public GoldenChalk() {
        super(new Item.Properties()
                .rarity(Rarity.RARE)
                .food(new FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.8F)
                        .build()
                ));
    }
}
