package com.mcw_tfc_aio.arcwolf.objects.chairs;


import com.mcw_tfc_aio.arcwolf.Mcw_Tfc_Aio;
import java.util.EnumMap;
import java.util.Map;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StripedChair extends ModernChair {
    private static final Map<Direction, VoxelShape> SHAPES = new EnumMap(Direction.class);
    private static final VoxelShape SHAPE = Shapes.or(Block.box(2.01, 11.0, 12.0, 14.01, 20.8, 14.0), new VoxelShape[]{Block.box(3.0, 11.0, 2.0, 13.0, 11.6, 12.0), Block.box(2.0, 0.0, 11.0, 4.0, 9.0, 13.0), Block.box(2.0, 0.0, 2.0, 4.0, 9.0, 4.0), Block.box(12.0, 0.0, 11.0, 14.0, 9.0, 13.0), Block.box(12.0, 0.0, 2.0, 14.0, 9.0, 4.0), Block.box(2.0, 9.0, 1.0, 14.0, 11.0, 14.0), Block.box(1.0, 20.8, 12.0, 15.01, 23.7, 14.0)});

    protected void runCalculation(VoxelShape shape) {
        Direction[] var2 = Direction.values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Direction direction = var2[var4];
            SHAPES.put(direction, Mcw_Tfc_Aio.calculateShapes(direction, shape));
        }

    }

    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return SHAPES.get(state.getValue(FACING));
    }

    public StripedChair(BlockBehaviour.Properties properties) {
        super(properties);
        this.runCalculation(SHAPE);
    }
}
