package net.mrpotatoman.mcm.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.mrpotatoman.mcm.MCM;

public class ModBlocks {
    // Non-EXP Dropping Blocks
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(2f)));
    public static final Block BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(2f)));
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(2f)));

    // EXP Dropping Blocks
    public static final Block RUBY_ORE_BLOCK = registerBlock("ruby_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block DEEPSLATE_RUBY_ORE_BLOCK = registerBlock("deepslate_ruby_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundGroup.DEEPSLATE).strength(4f), UniformIntProvider.create(2, 5)));

    public static final Block BLACK_OPAL_ORE_BLOCK = registerBlock("black_opal_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.STONE).strength(2f), UniformIntProvider.create(2, 5)));
    public static final Block CITRINE_ORE_BLOCK = registerBlock("citrine_ore_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(2f), UniformIntProvider.create(2, 5)));


    // Registers
    private static Block registerBlock(String name, Block block) {
        registerBlockitem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MCM.MOD_ID, name), block);
    }

    private static Item registerBlockitem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MCM.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MCM.LOGGER.info("Registering ModBlocks for " + MCM.MOD_ID);
    }
}
