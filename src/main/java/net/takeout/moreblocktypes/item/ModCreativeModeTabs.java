package net.takeout.moreblocktypes.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.takeout.moreblocktypes.MoreBlockTypes;
import net.takeout.moreblocktypes.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreBlockTypes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MORE_BLOCK_TYPES = CREATIVE_MODE_TABS.register("more_block_types",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.DIRT))
                    .title(Component.translatable("creativetab.more_block_types"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.DIRT_SLAB.get());
                        pOutput.accept(ModBlocks.DIRT_STAIRS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
