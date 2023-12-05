package com.mcw_tfc_aio.arcwolf.objects.gutters;


import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GutterTall extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private static final VoxelShape BOT_E = Shapes.or(Block.box(6.0, 0.0, 0.0, 9.8, 16.0, 4.0), Block.box(6.0, 0.0, 4.0, 10.0, 4.0, 8.0));
    private static final VoxelShape BOT_S = Shapes.or(Block.box(12.0, 0.0, 6.0, 16.0, 16.0, 9.8), Block.box(8.0, 0.0, 6.0, 12.0, 4.0, 9.9));
    private static final VoxelShape BOT_W = Shapes.or(Block.box(6.2, 0.0, 12.0, 10.0, 16.0, 16.0), Block.box(6.1, 0.0, 8.0, 10.0, 4.0, 12.0));
    private static final VoxelShape BOT_N = Shapes.or(Block.box(0.0, 0.0, 6.2, 4.0, 16.01, 10.0), Block.box(4.0, 0.0, 6.1, 8.0, 4.0, 10.0));
    private static final VoxelShape MID_E = Shapes.or(Block.box(6.0, 0.0, 0.0, 9.8, 16.0, 4.0));
    private static final VoxelShape MID_S = Shapes.or(Block.box(12.0, 0.0, 6.0, 16.0, 16.0, 9.8));
    private static final VoxelShape MID_W = Shapes.or(Block.box(6.2, 0.0, 12.0, 10.0, 16.0, 16.0));
    private static final VoxelShape MID_N = Shapes.or(Block.box(0.0, 0.0, 6.2, 4.0, 16.01, 10.0));
    private static final VoxelShape TOP_E = Shapes.or(Block.box(5.0, 9.0, 2.8, 11.0, 16.0, 9.0), new VoxelShape[]{Block.box(0.0, 11.0, 0.0, 16.0, 15.0, 4.0), Block.box(6.0, 0.0, 0.0, 9.8, 11.4, 4.0)});
    private static final VoxelShape TOP_S = Shapes.or(Block.box(7.0, 9.0, 5.1, 13.2, 16.0, 11.1), new VoxelShape[]{Block.box(12.0, 11.0, 0.1, 16.0, 15.0, 16.1), Block.box(12.0, 0.0, 6.1, 16.0, 11.4, 9.9)});
    private static final VoxelShape TOP_W = Shapes.or(Block.box(4.9, 9.0, 7.0, 10.9, 16.0, 13.2), new VoxelShape[]{Block.box(-0.1, 11.0, 12.0, 15.9, 15.0, 16.0), Block.box(6.1, 0.0, 12.0, 9.9, 11.4, 16.0)});
    private static final VoxelShape TOP_N = Shapes.or(Block.box(2.8, 9.0, 4.9, 9.0, 16.0, 10.9), new VoxelShape[]{Block.box(0.0, 11.0, -0.1, 4.0, 15.0, 15.9), Block.box(0.0, 0.0, 6.1, 4.0, 11.4, 9.9)});
    public static final BooleanProperty ABOVE = BooleanProperty.create("above");
    public static final BooleanProperty BELOW = BooleanProperty.create("below");
    private static final BooleanProperty WATER = BooleanProperty.create("water");
    
    public GutterTall(BlockState state, BlockBehaviour.Properties prop) {
        super(prop);
        registerDefaultState( ( ( ( ( stateDefinition.any()).setValue(WATER, false)).setValue(FACING, Direction.NORTH)).setValue(ABOVE, false)).setValue(BELOW, false));
    }

    private BlockState GutterState(BlockState state, LevelAccessor access, BlockPos pos) {
        boolean above = access.getBlockState(pos.above()).getBlock() == this;
        boolean below = access.getBlockState(pos.below()).getBlock() == this;
        return ( state.setValue(ABOVE, above)).setValue(BELOW, below);
    }

    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState statetwo, boolean bolean) {
        if (!statetwo.is(state.getBlock())) {
            this.GutterState(state, world, pos);
        }

    }

    public void setPlacedBy(Level world, BlockPos pos, BlockState state, @Nullable Entity entity, ItemStack stack) {
        this.GutterState(state, world, pos);
    }

    public BlockState updateShape(BlockState state, Direction dir, BlockState bstate, LevelAccessor world, BlockPos pos, BlockPos postwo) {
        return this.GutterState(state, world, pos);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return  this.GutterState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos()).setValue(FACING, context.getHorizontalDirection().getClockWise());
    }

    public void placeAt(Level world, BlockPos pos, int into) {
        world.setBlock(pos, this.defaultBlockState(), into);
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        switch ( state.getValue(FACING)) {
            case WEST:
                if ( state.getValue(ABOVE) && !(Boolean) state.getValue(BELOW) || !(Boolean) state.getValue(ABOVE) && !(Boolean) state.getValue(BELOW)) {
                    return BOT_W;
                } else {
                    return  state.getValue(ABOVE) && state.getValue(ABOVE) ? MID_W : TOP_W;
                }
            case EAST:
                if ( state.getValue(ABOVE) && !(Boolean) state.getValue(BELOW) || !(Boolean) state.getValue(ABOVE) && !(Boolean) state.getValue(BELOW)) {
                    return BOT_E;
                } else {
                    if ( state.getValue(ABOVE) &&  state.getValue(ABOVE)) {
                        return MID_E;
                    }

                    return TOP_E;
                }
            case SOUTH:
                if ((!(Boolean) state.getValue(ABOVE) || state.getValue(BELOW)) && (state.getValue(ABOVE) || state.getValue(BELOW))) {
                    if (state.getValue(ABOVE) && state.getValue(ABOVE)) {
                        return MID_S;
                    }

                    return TOP_S;
                }

                return BOT_S;
            case NORTH:
                if ((!(Boolean) state.getValue(ABOVE) || state.getValue(BELOW)) && (state.getValue(ABOVE) || state.getValue(BELOW))) {
                    if (state.getValue(ABOVE) && state.getValue(ABOVE)) {
                        return MID_N;
                    }

                    return TOP_N;
                }

                return BOT_N;
            default:
                return null;
        }
    }

    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        boolean i = state.getValue(WATER);
        if (item == Items.WATER_BUCKET && !i) {
            state = state.cycle(WATER);
            world.setBlock(pos, state, 2);
            itemstack.shrink(1);
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

    public void onBroken(Level worldIn, BlockPos pos) {
        worldIn.levelEvent(1029, pos, 0);
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
        if (world.isRainingAt(blockpos) && !(Boolean) state.getValue(WATER)) {
            world.setBlockAndUpdate(pos, state.setValue(WATER, true));
        }

        if (!world.isRainingAt(blockpos) && state.getValue(WATER)) {
            world.setBlockAndUpdate(pos, state.setValue(WATER, false));
        }

    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, ABOVE, BELOW, WATER);
    }
    
}