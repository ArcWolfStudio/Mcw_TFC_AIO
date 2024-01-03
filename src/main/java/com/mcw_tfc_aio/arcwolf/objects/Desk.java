package com.mcw_tfc_aio.arcwolf.objects;


import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Desk extends FurnitureObject {
    public static final DirectionProperty FACING;
    public static final EnumProperty<ConnectionStatus> CONNECTION;
    protected static final VoxelShape NORTH_BASE;
    protected static final VoxelShape NORTH_MIDDLE;
    protected static final VoxelShape NORTH_RIGHT;
    protected static final VoxelShape NORTH_LEFT;
    protected static final VoxelShape EAST_BASE;
    protected static final VoxelShape EAST_MIDDLE;
    protected static final VoxelShape EAST_RIGHT;
    protected static final VoxelShape EAST_LEFT;
    protected static final VoxelShape SOUTH_BASE;
    protected static final VoxelShape SOUTH_MIDDLE;
    protected static final VoxelShape SOUTH_RIGHT;
    protected static final VoxelShape SOUTH_LEFT;
    protected static final VoxelShape WEST_BASE;
    protected static final VoxelShape WEST_MIDDLE;
    protected static final VoxelShape WEST_RIGHT;
    protected static final VoxelShape WEST_LEFT;

    public Desk(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH)).setValue(CONNECTION, Desk.ConnectionStatus.SINGLE));
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        ConnectionStatus connectionStatus = (ConnectionStatus)state.getValue(CONNECTION);
        switch ((Direction)state.getValue(FACING)) {
            case NORTH:
                if (connectionStatus == Desk.ConnectionStatus.MIDDLE) {
                    return NORTH_MIDDLE;
                } else if (connectionStatus == Desk.ConnectionStatus.LEFT) {
                    return NORTH_LEFT;
                } else {
                    if (connectionStatus == Desk.ConnectionStatus.RIGHT) {
                        return NORTH_RIGHT;
                    }

                    return NORTH_BASE;
                }
            case SOUTH:
                if (connectionStatus == Desk.ConnectionStatus.MIDDLE) {
                    return SOUTH_MIDDLE;
                } else if (connectionStatus == Desk.ConnectionStatus.RIGHT) {
                    return SOUTH_RIGHT;
                } else {
                    if (connectionStatus == Desk.ConnectionStatus.LEFT) {
                        return SOUTH_LEFT;
                    }

                    return SOUTH_BASE;
                }
            case WEST:
                if (connectionStatus == Desk.ConnectionStatus.MIDDLE) {
                    return WEST_MIDDLE;
                } else if (connectionStatus == Desk.ConnectionStatus.RIGHT) {
                    return WEST_RIGHT;
                } else {
                    if (connectionStatus == Desk.ConnectionStatus.LEFT) {
                        return WEST_LEFT;
                    }

                    return WEST_BASE;
                }
            case EAST:
            default:
                if (connectionStatus == Desk.ConnectionStatus.MIDDLE) {
                    return EAST_MIDDLE;
                } else if (connectionStatus == Desk.ConnectionStatus.LEFT) {
                    return EAST_LEFT;
                } else {
                    return connectionStatus == Desk.ConnectionStatus.RIGHT ? EAST_RIGHT : EAST_BASE;
                }
        }
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState)state.setValue(FACING, rot.rotate((Direction)state.getValue(FACING)));
    }

    private BlockState TableState(BlockState state, LevelAccessor level, BlockPos pos) {
        boolean north = level.getBlockState(pos.north()).getBlock() == this;
        boolean east = level.getBlockState(pos.east()).getBlock() == this;
        boolean south = level.getBlockState(pos.south()).getBlock() == this;
        boolean west = level.getBlockState(pos.west()).getBlock() == this;
        ConnectionStatus connection = this.getConnectionStatus((Direction)state.getValue(FACING), north, east, south, west);
        return (BlockState)state.setValue(CONNECTION, connection);
    }

    private ConnectionStatus getConnectionStatus(Direction facing, boolean north, boolean east, boolean south, boolean west) {
        if (facing == Direction.NORTH) {
            if (north && south && !east && !west) {
                return Desk.ConnectionStatus.MIDDLE;
            }

            if (!north && south && !east && !west) {
                return Desk.ConnectionStatus.RIGHT;
            }

            if (north && !south && !east && !west) {
                return Desk.ConnectionStatus.LEFT;
            }
        }

        if (facing == Direction.SOUTH) {
            if (north && south && !east && !west) {
                return Desk.ConnectionStatus.MIDDLE;
            }

            if (!north && south && !east && !west) {
                return Desk.ConnectionStatus.LEFT;
            }

            if (north && !south && !east && !west) {
                return Desk.ConnectionStatus.RIGHT;
            }
        }

        if (facing == Direction.EAST) {
            if (!north && !south && east && west) {
                return Desk.ConnectionStatus.MIDDLE;
            }

            if (!north && !south && east && !west) {
                return Desk.ConnectionStatus.LEFT;
            }

            if (!north && !south && !east && west) {
                return Desk.ConnectionStatus.RIGHT;
            }
        }

        if (facing == Direction.WEST) {
            if (!north && !south && east && west) {
                return Desk.ConnectionStatus.MIDDLE;
            }

            if (!north && !south && east && !west) {
                return Desk.ConnectionStatus.RIGHT;
            }

            if (!north && !south && !east && west) {
                return Desk.ConnectionStatus.LEFT;
            }
        }

        return Desk.ConnectionStatus.SINGLE;
    }

    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bolean) {
        if (!statetwo.is(state.getBlock())) {
            this.TableState(state, level, pos);
        }

    }

    public RenderShape getRenderShape (BlockState state) {
        return RenderShape.MODEL;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, CONNECTION});
    }

    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity livent, ItemStack stack) {
        this.TableState(state, level, pos);
    }

    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
        return this.TableState(state, level, pos);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState)this.TableState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos()).setValue(FACING, context.getHorizontalDirection().getClockWise());
    }

    public void placeAt(Level level, BlockPos pos, int number) {
        level.setBlock(pos, this.defaultBlockState(), number);
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
        CONNECTION = EnumProperty.create("connection", ConnectionStatus.class, new ConnectionStatus[]{Desk.ConnectionStatus.SINGLE, Desk.ConnectionStatus.MIDDLE, Desk.ConnectionStatus.LEFT, Desk.ConnectionStatus.RIGHT});
        NORTH_BASE = Shapes.or(Block.box(1.77, 0.0, 1.0, 2.0, 14.0, 15.0), new VoxelShape[]{Block.box(0.1, 14.0, 0.1, 16.1, 16.0, 16.1), Block.box(2.0, 12.0, 2.0, 14.0, 14.0, 3.0), Block.box(2.0, 0.0, 13.0, 16.0, 14.0, 15.0), Block.box(2.0, 0.0, 1.0, 16.0, 14.0, 3.0)});
        NORTH_MIDDLE = Shapes.or(Block.box(0.0, 0.0, 0.0, 2.0, 14.0, 16.0), Block.box(0.0, 14.0, 0.0, 16.0, 15.9, 16.0));
        NORTH_RIGHT = Shapes.or(Block.box(2.0, 0.0, 1.0, 16.0, 14.0, 3.0), new VoxelShape[]{Block.box(0.0, 0.0, 1.0, 2.0, 14.0, 16.0), Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0)});
        NORTH_LEFT = Shapes.or(Block.box(2.0, 0.0, 13.0, 16.0, 14.0, 15.0), new VoxelShape[]{Block.box(0.0, 0.0, 0.0, 2.0, 14.0, 15.0), Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0)});
        EAST_BASE = Shapes.or(Block.box(1.1, 0.0, 0.1, 15.1, 14.0, 2.1), new VoxelShape[]{Block.box(0.1, 14.0, 0.1, 16.1, 16.0, 16.1), Block.box(13.1, 12.0, 2.1, 14.1, 14.0, 14.1), Block.box(1.1, 0.0, 2.1, 3.1, 14.0, 16.1), Block.box(13.1, 0.0, 2.1, 15.1, 14.0, 16.1)});
        EAST_MIDDLE = Shapes.or(Block.box(0.1, 0.0, 0.1, 16.1, 14.0, 2.1), Block.box(0.1, 14.0, 0.1, 16.1, 15.9, 16.1));
        EAST_RIGHT = Shapes.or(Block.box(0.1, 0.0, 0.0, 15.0, 14.0, 2.0), new VoxelShape[]{Block.box(0.1, 14.0, 0.0, 16.1, 16.0, 16.1), Block.box(13.1, 0.0, 2.0, 15.0, 14.0, 16.0)});
        EAST_LEFT = Shapes.or(Block.box(1.1, 0.0, 0.1, 16.1, 14.0, 2.1), new VoxelShape[]{Block.box(0.1, 14.0, 0.1, 16.1, 16.0, 16.1), Block.box(1.1, 0.0, 2.1, 3.1, 14.0, 16.1)});
        SOUTH_BASE = Shapes.or(Block.box(14.0, 0.0, 1.0, 16.0, 14.0, 15.0), new VoxelShape[]{Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0), Block.box(2.0, 12.0, 13.0, 14.0, 14.0, 14.0), Block.box(0.0, 0.0, 1.0, 14.0, 14.0, 3.0), Block.box(0.0, 0.0, 13.0, 14.0, 14.0, 15.0)});
        SOUTH_MIDDLE = Shapes.or(Block.box(14.0, 0.0, 0.0, 16.0, 14.0, 16.0), Block.box(0.0, 14.0, 0.0, 16.0, 15.9, 16.0));
        SOUTH_RIGHT = Shapes.or(Block.box(0.0, 0.0, 13.0, 14.0, 14.0, 15.0), new VoxelShape[]{Block.box(14.0, 0.0, 0.0, 16.0, 14.0, 15.0), Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0)});
        SOUTH_LEFT = Shapes.or(Block.box(0.0, 0.0, 1.0, 14.0, 14.0, 3.0), new VoxelShape[]{Block.box(14.0, 0.0, 1.0, 16.0, 14.0, 16.0), Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0)});
        WEST_BASE = Shapes.or(Block.box(1.1, 0.0, 14.1, 15.1, 14.0, 16.1), new VoxelShape[]{Block.box(0.1, 14.0, 0.1, 16.1, 16.0, 16.1), Block.box(2.1, 12.0, 2.1, 3.1, 14.0, 14.1), Block.box(13.1, 0.0, 0.1, 15.1, 14.0, 14.1), Block.box(1.1, 0.0, 0.1, 3.1, 14.0, 14.1)});
        WEST_MIDDLE = Shapes.or(Block.box(0.1, 0.0, 14.1, 16.1, 14.0, 16.1), Block.box(0.1, 14.0, 0.1, 16.1, 15.9, 16.1));
        WEST_RIGHT = Shapes.or(Block.box(0.1, 0.0, 14.1, 15.1, 14.0, 16.1), new VoxelShape[]{Block.box(0.1, 14.0, 0.1, 15.1, 16.0, 16.1), Block.box(0.1, 0.0, 0.1, 2.1, 14.0, 14.1)});
        WEST_LEFT = Shapes.or(Block.box(0.1, 0.0, 14.1, 15.1, 14.0, 16.1), new VoxelShape[]{Block.box(0.1, 14.0, 0.1, 16.1, 16.0, 16.1), Block.box(13.1, 0.0, 0.1, 15.1, 14.0, 14.1)});
    }

    public static enum ConnectionStatus implements StringRepresentable {
        SINGLE("single"),
        MIDDLE("middle"),
        LEFT("left"),
        RIGHT("right");

        private final String name;

        private ConnectionStatus(String name) {
            this.name = name;
        }

        public String getSerializedName() {
            return this.name;
        }
    }
}