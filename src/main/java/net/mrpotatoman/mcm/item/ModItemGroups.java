package net.mrpotatoman.mcm.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mrpotatoman.mcm.MCM;
import net.mrpotatoman.mcm.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ORES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCM.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mcmores"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK);

                        entries.add(ModItems.BLACK_OPAL);
                        entries.add(ModItems.RAW_BLACK_OPAL);
                        entries.add(ModBlocks.BLACK_OPAL_BLOCK);
                        entries.add(ModBlocks.BLACK_OPAL_ORE_BLOCK);

                        entries.add(ModItems.CITRINE);
                        entries.add(ModItems.RAW_CITRINE);
                        entries.add(ModBlocks.CITRINE_BLOCK);
                        entries.add(ModBlocks.CITRINE_ORE_BLOCK);

                    }).build());

    public static final ItemGroup FOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCM.MOD_ID, "tomato"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mcmfoods"))
                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries((displayContext, entries) -> {

                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.STRAWBERRY);

                    }).build());


    public static void registerItemGroups() {
        MCM.LOGGER.info("Registering Item Groups for " + MCM.MOD_ID);
    }
}
