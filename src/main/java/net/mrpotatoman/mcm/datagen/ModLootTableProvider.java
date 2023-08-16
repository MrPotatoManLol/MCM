package net.mrpotatoman.mcm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.mrpotatoman.mcm.block.ModBlocks;
import net.mrpotatoman.mcm.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.BLACK_OPAL_BLOCK);
        addDrop(ModBlocks.CITRINE_BLOCK);

        addDrop(ModBlocks.RUBY_ORE_BLOCK, copperLikeOreDrops(ModBlocks.RUBY_ORE_BLOCK, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK, copperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK, ModItems.RUBY));
        addDrop(ModBlocks.BLACK_OPAL_ORE_BLOCK, copperLikeOreDrops(ModBlocks.BLACK_OPAL_ORE_BLOCK, ModItems.RAW_BLACK_OPAL));
        addDrop(ModBlocks.CITRINE_ORE_BLOCK, copperLikeOreDrops(ModBlocks.CITRINE_ORE_BLOCK, ModItems.RAW_CITRINE));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
