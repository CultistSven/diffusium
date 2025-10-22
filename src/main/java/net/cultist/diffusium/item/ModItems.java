package net.cultist.diffusium.item;

import net.cultist.diffusium.Diffusium;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TOMATO = registerItem("tomato",new Item(new Item.Settings()));
    public static final Item LUMINTITE_CRYSTAL_SHARD = registerItem("lumintite_crystal_shard",new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Diffusium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Diffusium.LOGGER.info("Registering Mod Items for " + Diffusium.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries->{
            entries.add(TOMATO);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries->{
            entries.add(LUMINTITE_CRYSTAL_SHARD);
        });
    }
}
