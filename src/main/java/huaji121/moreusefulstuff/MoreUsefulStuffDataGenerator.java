package huaji121.moreusefulstuff;

import huaji121.moreusefulstuff.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreUsefulStuffDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModBlockTagsProvider::new);
        pack.addProvider(ModItemTagsProvider::new);
        pack.addProvider(ModEN_USLanguageProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModModelsProvider::new);
        pack.addProvider(ModRecipesProvider::new);


    }
}
