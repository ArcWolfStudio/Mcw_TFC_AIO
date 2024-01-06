package com.mcw_tfc_aio.arcwolf.storage;


import com.mcw_tfc_aio.arcwolf.init.EntityInit;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.network.NetworkHooks;

public class ChairEntity extends Entity {
    private BlockPos chair;

    public ChairEntity(Level level){
        super((EntityType)EntityInit.CHAIR.get(),level);
        this.noPhysics = true;
    }

    private ChairEntity(Level level, BlockPos pos, double yOffset){
        this(level);
        this.chair = pos;
        this.setPos((double)this.chair.getX() + 0.5, (double)this.chair.getY() + yOffset, (double)this.chair.getZ() + 0.5);
    }

    protected void readAdditionalSaveData(CompoundTag tag) {
    }

    protected void addAdditionalSaveData(CompoundTag tag) {
    }

    protected boolean canRide(Entity entity){
        return true;
    }
    protected void defineSynchedData() {
    }

    public Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    public void tick() {
        super.tick();
        if (!this.level().isClientSide && (this.getPassengers().isEmpty() || this.level().isEmptyBlock(this.blockPosition()))) {
            this.remove(RemovalReason.DISCARDED);
        }

    }

    public double getMyRidingOffset() {
        return 0.0;
    }

    public static InteractionResult create(Level level, BlockPos pos, double doub,Player player){
        if(!level.isClientSide()){
            List<ChairEntity> seatsInThisBlock = level.getEntitiesOfClass(ChairEntity.class,new AABB((double) pos.getX(),(double) pos.getY(),(double) pos.getZ(),(double) pos.getX()+1.0,(double) pos.getY()+1.0,(double) pos.getZ()+1.0));
            if(seatsInThisBlock.isEmpty()){
                ChairEntity chair = new ChairEntity(level, pos, doub);
                level.addFreshEntity(chair);
                player.startRiding(chair);
            }
        }
        return InteractionResult.SUCCESS;
    }

//    public static InteractionResult create(Level level, BlockPos pos, double doub, Player player) {
//        if (!level.isClientSide()) {
//            List<ChairEntity> seatsInThisBlock = level.getEntitiesOfClass(ChairEntity.class, new AABB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)pos.getX() + 1.0, (double)pos.getY() + 1.0, (double)pos.getZ() + 1.0));
//            if (seatsInThisBlock.isEmpty()) {
//                ChairEntity chair = new ChairEntity(level, pos, doub);
//                level.addFreshEntity(chair);
//                player.startRiding(chair);
//            }
//        }
//
//        return InteractionResult.SUCCESS;
//    }
}