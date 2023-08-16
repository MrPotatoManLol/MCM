package net.mrpotatoman.mcm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.mrpotatoman.mcm.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.BLACK_OPAL_BLOCK)
                .add(ModBlocks.CITRINE_BLOCK)
                .add(ModBlocks.RUBY_ORE_BLOCK)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK)
                .add(ModBlocks.BLACK_OPAL_ORE_BLOCK)
                .add(ModBlocks.CITRINE_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.BLACK_OPAL_BLOCK)
                .add(ModBlocks.CITRINE_BLOCK)
                .add(ModBlocks.RUBY_ORE_BLOCK)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK)
                .add(ModBlocks.BLACK_OPAL_ORE_BLOCK)
                .add(ModBlocks.CITRINE_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")));
    }
}
