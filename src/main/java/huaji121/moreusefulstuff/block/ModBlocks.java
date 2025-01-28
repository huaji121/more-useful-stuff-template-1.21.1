package huaji121.moreusefulstuff.block;

import huaji121.moreusefulstuff.MoreUsefulStuff;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BLUE_CRYSTAL_BLOCK = register("blue_crystal_block", new Block(
            AbstractBlock.Settings.create().requiresTool().strength(4.5f, 6.0f)
    ));

    public static final Block BLUE_CRYSTAL_ORE = register("blue_crystal_ore", new Block(
            AbstractBlock.Settings.create().requiresTool().strength(4.5f, 6.0f)
    ));

    public static final Block RAW_BLUE_CRYSTAL_BLOCK = register("raw_blue_crystal_block", new Block(
            AbstractBlock.Settings.create().requiresTool().strength(4.5f, 6.0f)
    ));

    private static void registerBlockItem(String id, Block block) {
        BlockItem item = Registry.register(
                Registries.ITEM,
                Identifier.of(MoreUsefulStuff.MOD_ID, id),
                new BlockItem(block, new Item.Settings())
        );
        item.appendBlocks(Item.BLOCK_ITEMS, item);
    }

    private static Block register(String id, Block block) {
        registerBlockItem(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreUsefulStuff.MOD_ID, id), block);
    }

    public static void registerModBlocks() {
        MoreUsefulStuff.LOGGER.info("Registering Blocks");
    }

}
