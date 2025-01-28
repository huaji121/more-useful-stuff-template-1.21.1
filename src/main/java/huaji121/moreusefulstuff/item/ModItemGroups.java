package huaji121.moreusefulstuff.item;

import huaji121.moreusefulstuff.MoreUsefulStuff;
import huaji121.moreusefulstuff.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> USEFUL_STUFF_GROUP_KEY = register("useful_stuff_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(
                RegistryKeys.ITEM_GROUP,
                Identifier.of(MoreUsefulStuff.MOD_ID, id)
        );
    }

    public static void registerModItemGroups() {
        Registry.register(Registries.ITEM_GROUP, USEFUL_STUFF_GROUP_KEY,
                ItemGroup.create(null, -1)
                        .displayName(Text.translatable("itemGroup.useful_stuff_group"))
                        .icon(() -> new ItemStack(ModItems.BLUE_CRYSTAL))
                        .entries(((displayContext, entries) -> {
                            entries.add(ModItems.BLUE_CRYSTAL);
                            entries.add(ModItems.RAW_BLUE_CRYSTAL);
                            entries.add(ModItems.ANTHRACITE);

                            entries.add(ModBlocks.BLUE_CRYSTAL_BLOCK);
                            entries.add(ModBlocks.BLUE_CRYSTAL_ORE);
                            entries.add(ModBlocks.RAW_BLUE_CRYSTAL_BLOCK);
                        }))
                        .build());

        MoreUsefulStuff.LOGGER.info("Registering Tem Groups");
    }

}
