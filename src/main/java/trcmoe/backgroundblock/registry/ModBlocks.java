package trcmoe.backgroundblock.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import trcmoe.backgroundblock.BackgroundBlock;

import javax.swing.plaf.nimbus.State;

public class ModBlocks {
    public static final Block RED_BACKGROUND_BLOCK = registerBlock("red_background_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing()),
            ModItemGroups.BGB);
    public static final Block BLUE_BACKGROUND_BLOCK = registerBlock("blue_background_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing()),
            ModItemGroups.BGB);
    public static final Block GREEN_BACKGROUND_BLOCK = registerBlock("green_background_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing()),
            ModItemGroups.BGB);
    public static final Block YELLOW_BACKGROUND_BLOCK = registerBlock("yellow_background_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing()),
            ModItemGroups.BGB);
    public static final Block WHITE_BACKGROUND_BLOCK = registerBlock("white_background_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing()),
            ModItemGroups.BGB);
    public static final Block BLACK_BACKGROUND_BLOCK = registerBlock("black_background_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing()),
            ModItemGroups.BGB);
    public static final Block RED_BACKGROUND_BLOCK_BRIGHTNESS_15 = registerBlock("red_background_block_brightness_15",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing().luminance(state -> 15)),
            ModItemGroups.BGB);
    public static final Block BLUE_BACKGROUND_BLOCK_BRIGHTNESS_15 = registerBlock("blue_background_block_brightness_15",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing().luminance(state -> 15)),
            ModItemGroups.BGB);
    public static final Block GREEN_BACKGROUND_BLOCK_BRIGHTNESS_15 = registerBlock("green_background_block_brightness_15",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing().luminance(state -> 15)),
            ModItemGroups.BGB);
    public static final Block YELLOW_BACKGROUND_BLOCK_BRIGHTNESS_15 = registerBlock("yellow_background_block_brightness_15",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing().luminance(state -> 15)),
            ModItemGroups.BGB);
    public static final Block WHITE_BACKGROUND_BLOCK_BRIGHTNESS_15 = registerBlock("white_background_block_brightness_15",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing().luminance(state -> 15)),
            ModItemGroups.BGB);
    public static final Block BLACK_BACKGROUND_BLOCK_BRIGHTNESS_15 = registerBlock("black_background_block_brightness_15",
            new Block(FabricBlockSettings.of(Material.STONE).strength(-1.0f, 3600000.0f).dropsNothing().luminance(state -> 15)),
            ModItemGroups.BGB);
    public static Block registerBlock(String name, Block block, ItemGroup... itemGroups) {
        ModItems.registerItem(name, new BlockItem(block, new FabricItemSettings()), itemGroups);
        return Registry.register(Registries.BLOCK, new Identifier(BackgroundBlock.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        BackgroundBlock.LOGGER.debug("Registering mod blocks for" + BackgroundBlock.MOD_ID);
    }
}
