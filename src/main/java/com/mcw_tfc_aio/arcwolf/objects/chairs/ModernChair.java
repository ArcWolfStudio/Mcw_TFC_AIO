package com.mcw_tfc_aio.arcwolf.objects.chairs;


import com.mcw_tfc_aio.arcwolf.Mcw_Tfc_Aio;
import com.mcw_tfc_aio.arcwolf.objects.FurnitureObject;
import com.mcw_tfc_aio.arcwolf.storage.ChairEntity;
import java.util.EnumMap;
import java.util.Map;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModernChair extends FurnitureObject {
    private static final Map<Direction, VoxelShape> SHAPES = new EnumMap(Direction.class);
    public static final DirectionProperty FACING;
    private static final VoxelShape SHAPE;

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

    public ModernChair(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState((this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
        this.runCalculation(SHAPE);
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player playerEntity, InteractionHand hand, BlockHitResult result) {
        return ChairEntity.create(level, pos, 0.4, playerEntity);
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
        SHAPE = Shapes.or(Block.box(2.0, 12.0, 12.0, 14.0, 18.0, 15.0), new VoxelShape[]{Block.box(0.0, 0.0, 0.0, 2.0, 15.0, 2.0), Block.box(14.0, 0.0, 0.0, 16.0, 15.0, 2.0), Block.box(0.0, 0.0, 14.0, 2.0, 15.0, 16.0), Block.box(14.0, 0.0, 14.0, 16.0, 15.0, 16.0), Block.box(0.0, 15.0, 0.0, 2.0, 16.0, 16.0), Block.box(14.0, 15.0, 0.0, 16.0, 16.0, 16.0), Block.box(1.0, 8.0, 0.1, 15.0, 10.0, 15.9), Block.box(2.0, 9.0, 1.0, 14.0, 12.0, 15.0)});
    }
}
