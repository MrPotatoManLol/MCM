package net.mrpotatoman.mcm.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.mrpotatoman.mcm.block.ModBlocks;
import net.mrpotatoman.mcm.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE_BLOCK, ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
    private static final List<ItemConvertible> BLACK_OPAL_SMELTABLES = List.of(ModBlocks.BLACK_OPAL_ORE_BLOCK, ModItems.RAW_BLACK_OPAL);
    private static final List<ItemConvertible> CITRINE_SMELTABLES = List.of(ModBlocks.CITRINE_ORE_BLOCK, ModItems.RAW_CITRINE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");

        offerSmelting(exporter, BLACK_OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_OPAL,
                0.7f, 200, "ruby");
        offerBlasting(exporter, BLACK_OPAL_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_OPAL,
                0.7f, 100, "ruby");

        offerSmelting(exporter, CITRINE_SMELTABLES, RecipeCategory.MISC, ModItems.CITRINE,
                0.7f, 200, "ruby");
        offerBlasting(exporter, CITRINE_SMELTABLES, RecipeCategory.MISC, ModItems.CITRINE,
                0.7f, 100, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);

        // Block Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK, 1)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLACK_OPAL_BLOCK, 1)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.BLACK_OPAL)
                .criterion(hasItem(ModItems.BLACK_OPAL), conditionsFromItem(ModItems.BLACK_OPAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLACK_OPAL_BLOCK)));

        // Item Recipes
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY, 1)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.CITRINE)
                .criterion(hasItem(ModItems.CITRINE), conditionsFromItem(ModItems.CITRINE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RUBY)));
    }
}
