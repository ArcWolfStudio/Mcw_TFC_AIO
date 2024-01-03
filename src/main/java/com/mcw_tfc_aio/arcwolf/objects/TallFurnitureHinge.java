package com.mcw_tfc_aio.arcwolf.objects;


import com.mcw_tfc_aio.arcwolf.objects.TallFurniture.ConnectionStatus;
import com.mcw_tfc_aio.arcwolf.storage.StorageTileEntity;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.Vec3;

public class TallFurnitureHinge extends TallFurniture implements EntityBlock {
    public static final EnumProperty<DoorHingeSide> HINGE;
    public static final DirectionProperty FACING;

    public TallFurnitureHinge(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState((((this.stateDefinition.any()).setValue(FACING, Direction.NORTH)).setValue(CONNECTION, ConnectionStatus.BASE)).setValue(HINGE, DoorHingeSide.LEFT));
    }

    private BlockState TableState(BlockState state, LevelAccessor level, BlockPos pos) {
        boolean above = level.getBlockState(pos.above()).getBlock() == this && state.getValue(FACING) == level.getBlockState(pos.above()).getValue(FACING);
        boolean below = level.getBlockState(pos.below()).getBlock() == this && state.getValue(FACING) == level.getBlockState(pos.below()).getValue(FACING);
        TallFurniture.ConnectionStatus connection = this.getConnectionStatus(state.getValue(FACING), above, below);
        return state.setValue(CONNECTION, connection);
    }

    private TallFurniture.ConnectionStatus getConnectionStatus(Direction facing, boolean above, boolean below) {
        if (above && below) {
            return ConnectionStatus.MIDDLE;
        } else if (above && !below) {
            return ConnectionStatus.BOTTOM;
        } else {
            return !above && below ? ConnectionStatus.TOP : ConnectionStatus.BASE;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, CONNECTION, HINGE});
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState)((BlockState)this.TableState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos()).setValue(HINGE, this.getHinge(context))).setValue(FACING, context.getHorizontalDirection().getClockWise());
    }

    private DoorHingeSide getHinge(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        Direction direction = context.getHorizontalDirection();
        int j = direction.getStepX();
        int k = direction.getStepZ();
        Vec3 vector3d = context.getClickLocation();
        double d0 = vector3d.x - (double)blockpos.getX();
        double d1 = vector3d.z - (double)blockpos.getZ();
        return j < 0 && d1 < 0.5 || j > 0 && d1 > 0.5 || k < 0 && d0 > 0.5 || k > 0 && d0 < 0.5 ? DoorHingeSide.RIGHT : DoorHingeSide.LEFT;
    }

    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity livent, ItemStack stack) {
        Block block = level.getBlockState(pos).getBlock();
        Block below = level.getBlockState(pos.below(1)).getBlock();
        if (stack.hasCustomHoverName()) {
            BlockEntity blockentity = level.getBlockEntity(pos);
            this.TableState(state, level, pos);
            if (blockentity instanceof StorageTileEntity) {
                ((StorageTileEntity)blockentity).setCustomName(stack.getHoverName());
                this.TableState(state, level, pos);
            }
        }

        if (block == this && below == block) {
            DoorHingeSide hinge = (DoorHingeSide)level.getBlockState(pos.below(1)).getValue(HINGE);
            level.setBlockAndUpdate(pos, (BlockState)state.setValue(HINGE, hinge));
        }

    }

    static {
        HINGE = BlockStateProperties.DOOR_HINGE;
        FACING = HorizontalDirectionalBlock.FACING;
    }
}