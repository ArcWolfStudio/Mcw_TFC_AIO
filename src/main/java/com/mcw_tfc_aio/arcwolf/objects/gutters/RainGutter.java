package com.mcw_tfc_aio.arcwolf.objects.gutters;

import com.mcw_tfc_aio.arcwolf.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class RainGutter extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<StairsShape> SHAPE = BlockStateProperties.STAIRS_SHAPE;
    private static final BooleanProperty WATER = BooleanProperty.create("water");
    private static final VoxelShape SIDE_S = Shapes.or(Block.box(0.0, 11.0, 12.0, 16.0, 15.0, 16.0));
    private static final VoxelShape SIDE_E = Shapes.or(Block.box(12.0, 11.0, 0.0, 16.0, 15.0, 16.0));
    private static final VoxelShape SIDE_W = Shapes.or(Block.box(0.0, 11.0, 0.0, 4.0, 15.0, 16.0));
    private static final VoxelShape SIDE_N = Shapes.or(Block.box(0.0, 11.0, 0.0, 16.0, 15.0, 4.0));
    private static final VoxelShape OUTER_N = Shapes.or(Block.box(0.0, 11.0, 12.0, 4.0, 15.0, 16.0));
    private static final VoxelShape OUTER_E = Shapes.or(Block.box(0.0, 11.0, 0.0, 4.0, 15.0, 4.0));
    private static final VoxelShape OUTER_S = Shapes.or(Block.box(12.0, 11.0, 0.0, 16.0, 15.0, 4.0));
    private static final VoxelShape OUTER_W = Shapes.or(Block.box(12.0, 11.0, 12.0, 16.0, 15.0, 16.0));
    protected static final VoxelShape CORNER_N = Shapes.or(SIDE_N, SIDE_E);
    protected static final VoxelShape CORNER_E = Shapes.or(SIDE_E, SIDE_S);
    protected static final VoxelShape CORNER_S = Shapes.or(SIDE_S, SIDE_W);
    protected static final VoxelShape CORNER_W = Shapes.or(SIDE_W, SIDE_N);
 

    public RainGutter(BlockState state, Properties prop) {
        super(prop);
        registerDefaultState(stateDefinition.any().setValue(WATER, false).setValue(FACING, Direction.NORTH).setValue(SHAPE, StairsShape.STRAIGHT));
    }

    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
        return facing.getAxis().isHorizontal() ? stateIn.setValue(SHAPE, getShapeProperty(stateIn, worldIn, currentPos)) : super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        switch (state.getValue(FACING)) {
            case WEST:
                if (state.getValue(SHAPE) == StairsShape.STRAIGHT) {
                    return SIDE_W;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    return OUTER_E;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    return OUTER_N;
                } else {
                    if (state.getValue(SHAPE) == StairsShape.INNER_LEFT) {
                        return CORNER_S;
                    }

                    return CORNER_W;
                }
            case EAST:
                if (state.getValue(SHAPE) == StairsShape.STRAIGHT) {
                    return SIDE_E;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    return OUTER_W;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    return OUTER_S;
                } else {
                    if (state.getValue(SHAPE) == StairsShape.INNER_LEFT) {
                        return CORNER_N;
                    }

                    return CORNER_E;
                }
            case SOUTH:
                if (state.getValue(SHAPE) == StairsShape.STRAIGHT) {
                    return SIDE_S;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    return OUTER_N;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    return OUTER_W;
                } else {
                    if (state.getValue(SHAPE) == StairsShape.INNER_LEFT) {
                        return CORNER_E;
                    }

                    return CORNER_S;
                }
            case NORTH:
                if (state.getValue(SHAPE) == StairsShape.STRAIGHT) {
                    return SIDE_N;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_RIGHT) {
                    return OUTER_S;
                } else if (state.getValue(SHAPE) == StairsShape.OUTER_LEFT) {
                    return OUTER_E;
                } else {
                    if (state.getValue(SHAPE) == StairsShape.INNER_LEFT) {
                        return CORNER_W;
                    }

                    return CORNER_N;
                }
            default:
                return null;
        }
    }

    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        Boolean i = state.getValue(WATER);
        if (item == ItemInit.ROOFING_HAMMER.get()) {
            state = state.cycle(SHAPE);
            world.setBlock(pos, state, 2);
        }

        if (item == Items.WATER_BUCKET && !i) {
            state = state.cycle(WATER);
            world.setBlock(pos, state, 2);
            player.setItemInHand(hand, new ItemStack(Items.BUCKET));
        }

        if (item == Items.BUCKET && i) {
            state = state.cycle(WATER);
            world.setBlock(pos, state, 2);
            itemstack.shrink(1);
            player.setItemInHand(hand, new ItemStack(Items.WATER_BUCKET));
        }

        if (item == Items.GLASS_BOTTLE && i) {
            state = state.cycle(WATER);
            world.setBlock(pos, state, 2);
            player.setItemInHand(hand, PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.WATER));
        }

        return InteractionResult.PASS;
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction direction = context.getClickedFace();
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());
        return blockstate.setValue(SHAPE, getShapeProperty(blockstate, context.getLevel(), blockpos));
    }

    private static StairsShape getShapeProperty(BlockState state, BlockGetter worldIn, BlockPos pos) {
        Direction direction = state.getValue(FACING);
        BlockState blockstate = worldIn.getBlockState(pos.relative(direction));
        if (isBlockStairs(blockstate)) {
            Direction direction1 = blockstate.getValue(FACING);
            if (direction1.getAxis() != (state.getValue(FACING)).getAxis()) {
                if (direction1 == direction.getCounterClockWise()) {
                    return StairsShape.OUTER_LEFT;
                }

                return StairsShape.OUTER_RIGHT;
            }
        }

        BlockState blockstate1 = worldIn.getBlockState(pos.relative(direction.getOpposite()));
        if (isBlockStairs(blockstate1)) {
            Direction direction2 = blockstate1.getValue(FACING);
            if (direction2.getAxis() != (state.getValue(FACING)).getAxis()) {
                if (direction2 == direction.getCounterClockWise()) {
                    return StairsShape.INNER_LEFT;
                }

                return StairsShape.INNER_RIGHT;
            }
        }

        return StairsShape.STRAIGHT;
    }

    public static boolean isBlockStairs(BlockState state) {
        return state.getBlock() instanceof RainGutter;
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        Direction direction = state.getValue(FACING);
        StairsShape stairsshape = state.getValue(SHAPE);
        switch (mirrorIn) {
            case LEFT_RIGHT:
                if (direction.getAxis() == Axis.Z) {
                    switch (stairsshape) {
                        case INNER_LEFT:
                            return state.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.INNER_RIGHT);
                        case INNER_RIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.INNER_LEFT);
                        case OUTER_LEFT:
                            return state.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.OUTER_RIGHT);
                        case OUTER_RIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.OUTER_LEFT);
                        default:
                            return state.rotate(Rotation.CLOCKWISE_180);
                    }
                }
                break;
            case FRONT_BACK:
                if (direction.getAxis() == Axis.X) {
                    switch (stairsshape) {
                        case INNER_LEFT:
                            return state.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.INNER_LEFT);
                        case INNER_RIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.INNER_RIGHT);
                        case OUTER_LEFT:
                            return state.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.OUTER_RIGHT);
                        case OUTER_RIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180).setValue(SHAPE, StairsShape.OUTER_LEFT);
                        case STRAIGHT:
                            return state.rotate(Rotation.CLOCKWISE_180);
                    }
                }
        }

        return super.mirror(state, mirrorIn);
    }

    protected boolean isRainingday(Level world, BlockPos pos) {
        return world.isRainingAt(pos);
    }

    public boolean isRandomlyTicking(BlockState state) {
        if (state.getValue(WATER)) {
        }

        return true;
    }

    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, Random random) {
        BlockPos blockpos = pos.above(30);
        if (world.isRainingAt(blockpos) && !(Boolean)state.getValue(WATER)) {
            world.setBlockAndUpdate(pos, state.setValue(WATER, true));
        }

        if (!world.isRainingAt(blockpos) && state.getValue(WATER)) {
            world.setBlockAndUpdate(pos, state.setValue(WATER, false));
        }

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{WATER, FACING, SHAPE});
    }


}
