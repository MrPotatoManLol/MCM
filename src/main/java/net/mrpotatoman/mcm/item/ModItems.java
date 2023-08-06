package net.mrpotatoman.mcm.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mrpotatoman.mcm.MCM;

public class ModItems {

    // Ores
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item BLACK_OPAL = registerItem("black_opal", new Item(new FabricItemSettings()));
    public static final Item RAW_BLACK_OPAL = registerItem("raw_black_opal", new Item(new FabricItemSettings()));
    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings()));
    public static final Item RAW_CITRINE = registerItem("raw_citrine", new Item(new FabricItemSettings()));

    // Foods
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCM.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MCM.LOGGER.info("Registering Mod items for " + MCM.MOD_ID);
    }
}
