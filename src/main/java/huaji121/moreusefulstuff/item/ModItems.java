package huaji121.moreusefulstuff.item;

import huaji121.moreusefulstuff.MoreUsefulStuff;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLUE_CRYSTAL = registerItems("blue_crystal",new Item(new Item.Settings()));
    public static final Item RAW_BLUE_CRYSTAL = registerItems("raw_blue_crystal",new Item(new Item.Settings()));
    public static final Item ANTHRACITE = registerItems("anthracite",new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item) {
        return Items.register(Identifier.of(MoreUsefulStuff.MOD_ID, id), item);
    }

    public static void registerModItems(){
        FuelRegistry.INSTANCE.add(ModItems.ANTHRACITE,1600);

        MoreUsefulStuff.LOGGER.info("Registering Items");
    }
}
