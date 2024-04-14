package trcmoe.backgroundblock.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import trcmoe.backgroundblock.BackgroundBlock;

public class ModItemGroups {
    public static ItemGroup BGB = FabricItemGroup.builder(new Identifier(BackgroundBlock.MOD_ID, "bgb"))
            .displayName(Text.translatable("itemGroup.background-block.bgb"))
            .icon(() -> new ItemStack(ModBlocks.BLUE_BACKGROUND_BLOCK_BRIGHTNESS_15))
            .build();
    public static void registeredModItemGroup() {
        BackgroundBlock.LOGGER.debug("Registering mod item group for" + BackgroundBlock.MOD_ID);
    }
}
