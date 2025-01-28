package huaji121.moreusefulstuff.datagen;

import huaji121.moreusefulstuff.MoreUsefulStuff;
import huaji121.moreusefulstuff.block.ModBlocks;
import huaji121.moreusefulstuff.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> TO_BLUE_CRYSTAL = List.of(ModItems.RAW_BLUE_CRYSTAL);

    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerReversibleCompactingRecipes(
                recipeExporter,
                RecipeCategory.MISC, ModItems.RAW_BLUE_CRYSTAL,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_BLUE_CRYSTAL_BLOCK);

        offerReversibleCompactingRecipes(
                recipeExporter,
                RecipeCategory.MISC, ModItems.BLUE_CRYSTAL,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CRYSTAL_BLOCK);

        offerSmelting(
                recipeExporter,
                TO_BLUE_CRYSTAL,
                RecipeCategory.MISC,
                ModItems.BLUE_CRYSTAL,
                0.7f, 200, "blue_crystal"
        );

        offerBlasting(
                recipeExporter,
                TO_BLUE_CRYSTAL,
                RecipeCategory.MISC,
                ModItems.BLUE_CRYSTAL,
                0.7f, 100, "blue_crystal"
        );

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SUGAR,1)
                .pattern("###")
                .input('#',Ingredient.ofItems(Items.BEETROOT))
                .criterion("has_item", RecipeProvider.conditionsFromItem(Items.BEETROOT))
                .offerTo(recipeExporter, Identifier.of(MoreUsefulStuff.MOD_ID,"beetroot_to_sugar"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.BLUE_CRYSTAL_BLOCK,1)
                .input(ModItems.RAW_BLUE_CRYSTAL)
                .input(Items.STONE)
                .criterion("has_item",RecipeProvider.conditionsFromItem(ModItems.RAW_BLUE_CRYSTAL))
                .criterion("has_item",RecipeProvider.conditionsFromItem(Items.STONE))
                .offerTo(recipeExporter,Identifier.of(MoreUsefulStuff.MOD_ID,"blue_crystal_ore"));

    }
}
