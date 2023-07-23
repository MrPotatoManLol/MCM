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
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCM.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mcmitems"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.BLACK_OPAL);
                        entries.add(ModItems.RAW_BLACK_OPAL);
                        entries.add(ModItems.CITRINE);
                        entries.add(ModItems.RAW_CITRINE);

                        // Blocks
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.BLACK_OPAL_BLOCK);
                        entries.add(ModBlocks.BLACK_OPAL_ORE_BLOCK);
                        entries.add(ModBlocks.CITRINE_BLOCK);
                        entries.add(ModBlocks.CITRINE_ORE_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        MCM.LOGGER.info("Registering Item Groups for " + MCM.MOD_ID);
    }
}
