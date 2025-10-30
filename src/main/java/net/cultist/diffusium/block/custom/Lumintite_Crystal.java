package net.cultist.diffusium.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;

public class Lumintite_Crystal extends Block {
    public static final BooleanProperty LIGHT = BooleanProperty.of("light");

    public Lumintite_Crystal(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(LIGHT, true));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIGHT);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if(!world.isClient) {
            if (world.getLightLevel(LightType.BLOCK, pos) > 13 - state.getOpacity(world, pos)) {
                world.setBlockState(pos, state.cycle(LIGHT));
                world.scheduleBlockTick(pos, this, 20);
            }

        }
    }
    public static int getLuminance(BlockState currentBlockState) {
        boolean litState = currentBlockState.get(LIGHT);
        return litState ? 15 : 0;

    }

}
