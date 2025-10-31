package net.cultist.diffusium.item;

import net.cultist.diffusium.Diffusium;
import net.cultist.diffusium.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Diffusium.MOD_ID, "diffusium_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TOMATO))
                    .displayName(Text.translatable("itemgroup.diffusium.diffusium_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TOMATO);
                        entries.add(ModBlocks.TOMATO_BLOCK);
                        entries.add(ModItems.LUMINTITE_CRYSTAL_SHARD);
                        entries.add(ModBlocks.LUMINTITE_CRYSTAL);
                        entries.add(ModBlocks.BARTITE_CRYSTAL);
                    }).build());


    public static void registerItemGroups() {
        Diffusium.LOGGER.info("Registering Item Groups for " + Diffusium.MOD_ID);
    }
}
