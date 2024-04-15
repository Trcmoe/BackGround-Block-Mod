package trcmoe.backgroundblock.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import trcmoe.backgroundblock.BackgroundBlock;

public class ModItemGroups {
    public static RegistryKey<ItemGroup> BGB = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(BackgroundBlock.MOD_ID));
    public static void registeredModItemGroup() {
        Registry.register(Registries.ITEM_GROUP, BGB, ItemGroup.create(ItemGroup.Row.TOP, 3)
                .displayName(Text.translatable("itemGroup.background-block.bgb"))
                .icon(() -> new ItemStack(ModBlocks.BLUE_BACKGROUND_BLOCK_BRIGHTNESS_15))
                .entries((displayContext, entries) -> {
                    entries.add(ModBlocks.RED_BACKGROUND_BLOCK);
                    entries.add(ModBlocks.BLUE_BACKGROUND_BLOCK);
                    entries.add(ModBlocks.GREEN_BACKGROUND_BLOCK);
                    entries.add(ModBlocks.YELLOW_BACKGROUND_BLOCK);
                    entries.add(ModBlocks.WHITE_BACKGROUND_BLOCK);
                    entries.add(ModBlocks.BLACK_BACKGROUND_BLOCK);
                    entries.add(ModBlocks.RED_BACKGROUND_BLOCK_BRIGHTNESS_15);
                    entries.add(ModBlocks.BLUE_BACKGROUND_BLOCK_BRIGHTNESS_15);
                    entries.add(ModBlocks.GREEN_BACKGROUND_BLOCK_BRIGHTNESS_15);
                    entries.add(ModBlocks.YELLOW_BACKGROUND_BLOCK_BRIGHTNESS_15);
                    entries.add(ModBlocks.WHITE_BACKGROUND_BLOCK_BRIGHTNESS_15);
                    entries.add(ModBlocks.BLACK_BACKGROUND_BLOCK_BRIGHTNESS_15);
                }).build());
    }
    public static void registerModItemGroup() {
        BackgroundBlock.LOGGER.debug("Registering mod item group for" + BackgroundBlock.MOD_ID);
    }
}
