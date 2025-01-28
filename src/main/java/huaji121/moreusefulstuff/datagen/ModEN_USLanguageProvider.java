package huaji121.moreusefulstuff.datagen;

import huaji121.moreusefulstuff.block.ModBlocks;
import huaji121.moreusefulstuff.item.ModItemGroups;
import huaji121.moreusefulstuff.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEN_USLanguageProvider extends FabricLanguageProvider {
    public ModEN_USLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItemGroups.USEFUL_STUFF_GROUP_KEY,"Useful Stuff");

        translationBuilder.add(ModItems.BLUE_CRYSTAL, "Blue Crystal");
        translationBuilder.add(ModItems.RAW_BLUE_CRYSTAL, "Raw Blue Crystal");
        translationBuilder.add(ModItems.ANTHRACITE, "Anthracite");

        translationBuilder.add(ModBlocks.BLUE_CRYSTAL_ORE, "Blue Crystal Ore");
        translationBuilder.add(ModBlocks.RAW_BLUE_CRYSTAL_BLOCK, "Raw Blue Crystal Block");
        translationBuilder.add(ModBlocks.BLUE_CRYSTAL_BLOCK, "Blue Crystal BLOCk");
    }
}
