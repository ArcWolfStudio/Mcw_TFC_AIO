package com.mcw_tfc_aio.arcwolf.objects.bridges;

import com.mcw_tfc_aio.arcwolf.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Bridge_Base extends Stair_Base implements SimpleWaterloggedBlock {
    public static final BooleanProperty TOGGLE = BooleanProperty.create("toggle");
    protected static final VoxelShape BASE = Block.box(0.0, 0.0, 0.0, 15.99, 2.0, 15.99);
    protected static final VoxelShape SIDE0 = Block.box(0.0, 1.0, 15.0, 16.0, 23.0, 16.0);
    protected static final VoxelShape SIDE90 = Block.box(0.0, 1.0, 0.0, 1.0, 23.0, 16.0);
    protected static final VoxelShape SIDE180 = Block.box(0.0, 1.0, 0.0, 16.0, 23.0, 1.0);
    protected static final VoxelShape SIDE270 = Block.box(15.0, 1.0, 0.0, 16.0, 23.0, 16.0);
    protected static final VoxelShape SIDE_0 = Shapes.or(BASE, SIDE0);
    protected static final VoxelShape SIDE_90 = Shapes.or(BASE, SIDE90);
    protected static final VoxelShape SIDE_180 = Shapes.or(BASE, SIDE180);
    protected static final VoxelShape SIDE_270 = Shapes.or(BASE, SIDE270);
    protected static final VoxelShape CORNER_0 = Shapes.or(BASE, SIDE180, SIDE90);
    protected static final VoxelShape CORNER_90 = Shapes.or(BASE, SIDE180, SIDE270);
    protected static final VoxelShape CORNER_180 = Shapes.or(BASE, SIDE270, SIDE0);
    protected static final VoxelShape CORNER_270 = Shapes.or(BASE, SIDE0, SIDE90);
    protected static final VoxelShape MIDDLE_90 = Shapes.or(SIDE0, SIDE180, BASE);
    protected static final VoxelShape MIDDLE_0 = Shapes.or(SIDE90, SIDE270, BASE);
 
    public Bridge_Base(Properties properties) {
        super(properties.lightLevel(setLightLevel(15)));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(TOGGLE, false).setValue(TORCH, false).setValue(NORTH, false).setValue(EAST, false).setValue(SOUTH, false).setValue(WEST, false).setValue(WATERLOGGED, false));
    }

    public static int shapeMaker(BlockState state) {
        boolean n = state.getValue(NORTH);
        boolean e = state.getValue(EAST);
        boolean s = state.getValue(SOUTH);
        boolean w = state.getValue(WEST);
        boolean toggle = state.getValue(TOGGLE);
        if (!toggle) {
            if (n && w && !e && !s) {
                return 0;
            }

            if (n && !w && e && !s) {
                return 1;
            }

            if (!n && !w && e && s) {
                return 3;
            }

            if (!n && w && !e && s) {
                return 2;
            }

            if (n && w && e && !s) {
                return 6;
            }

            if (!n && w && e && s) {
                return 4;
            }

            if (n && !w && e && s) {
                return 7;
            }

            if (n && w && !e && s) {
                return 5;
            }
        }

        if (!n) {
            if (!w && !e && s) {
                return 8;
            }

            if (w && !e && !s) {
                return 9;
            }

            if (!w && e && !s) {
                return 9;
            }

            if (w && e && !s) {
                return 9;
            }
        } else {
            if (!w && !e && !s) {
                return 8;
            }

            if (!w && !e && s) {
                return 8;
            }
        }

        switch (state.getValue(FACING)) {
            case NORTH:
                if (toggle) {
                    if (n) {
                        if (!e && !s & w) {
                            return 6;
                        }

                        if (e && !s & !w) {
                            return 6;
                        }
                    } else {
                        if (!e && s & w) {
                            return 4;
                        }

                        if (e && s & !w) {
                            return 4;
                        }
                    }
                }

                if (!n && !e && !s & !w) {
                    return 9;
                }

                return 10;
            case SOUTH:
                if (toggle) {
                    if (n) {
                        if (!e && !s & w) {
                            return 6;
                        }

                        if (e && !s & !w) {
                            return 6;
                        }
                    } else {
                        if (!e && s & w) {
                            return 4;
                        }

                        if (e && s & !w) {
                            return 4;
                        }
                    }
                }

                if (!n && !e && !s & !w) {
                    return 9;
                }

                return 10;
            case EAST:
                if (toggle) {
                    if (n) {
                        if (!e && !s & w) {
                            return 5;
                        }

                        if (e && !s & !w) {
                            return 7;
                        }
                    } else {
                        if (!e && s & w) {
                            return 5;
                        }

                        if (e && s & !w) {
                            return 7;
                        }
                    }
                }

                if (!n && !e && !s & !w) {
                    return 8;
                }

                return 10;
            case WEST:
                if (toggle) {
                    if (n) {
                        if (!e && !s & w) {
                            return 5;
                        }

                        if (e && !s & !w) {
                            return 7;
                        }
                    } else {
                        if (!e && s & w) {
                            return 5;
                        }

                        if (e && s & !w) {
                            return 7;
                        }
                    }
                }

                if (!n && !e && !s & !w) {
                    return 8;
                }

                return 10;
            default:
                return 10;
        }
    }

    public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        VoxelShape[] obj = new VoxelShape[]{CORNER_180, CORNER_270, CORNER_90, CORNER_0, SIDE_180, SIDE_270, SIDE_0, SIDE_90, MIDDLE_0, MIDDLE_90, BASE};
        return obj[shapeMaker(state)];
    }

    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        Boolean i = state.getValue(TORCH);
        if (item == ItemInit.PLIERS.get()) {
            worldIn.setBlockAndUpdate(pos, state.cycle(TOGGLE));
        } else if (!i) {
            if (item == Items.TORCH) {
                state = state.cycle(TORCH);
                worldIn.setBlock(pos, state, 2);
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }

                return InteractionResult.CONSUME;
            }

            if (item != Items.TORCH) {
                return InteractionResult.PASS;
            }
        } else {
            if (i) {
                state = state.cycle(TORCH);
                worldIn.setBlock(pos, state, 2);
                dropTorch(worldIn, pos);
                return InteractionResult.CONSUME;
            }

            if (!(Boolean)state.getValue(WATERLOGGED)) {
                return InteractionResult.PASS;
            }

            worldIn.getFluidTicks().hasScheduledTick(pos, Fluids.WATER);
        }

        return InteractionResult.SUCCESS;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(NORTH, EAST, SOUTH, WEST, WATERLOGGED, TORCH, TOGGLE, FACING);
    }
    
}