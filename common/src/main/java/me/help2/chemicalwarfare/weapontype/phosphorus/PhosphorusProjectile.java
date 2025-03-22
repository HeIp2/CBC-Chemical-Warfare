package me.help2.chemicalwarfare.weapontype.phosphorus;

import me.help2.chemicalwarfare.registry.ModEntityTypes;
import me.help2.chemicalwarfare.registry.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class PhosphorusProjectile extends ThrownItemEntity {
    protected int time;

    /*protected FogUtils FogManager = new FogUtils(
            level(),
            new PositionImpl(getX(),getY(),getZ()),
            3.5f,
            1f,
            new Vector4d(0.7f,0.8f,0.0f,1f),//lime color gas
            1f
    );*/
    public PhosphorusProjectile(EntityType<? extends PhosphorusProjectile> entityType, World level) {
        super(entityType, level);
        time=0;
    }



    public PhosphorusProjectile(World pLevel,double pX,double pY,double pZ) {
        super(ModEntityTypes.PHOSPHORUS_PROJECTILE.get(), pX, pY, pZ, pLevel);
        time=0;
    }


    public PhosphorusProjectile(World world, LivingEntity livingEntity) {
        super(ModEntityTypes.PHOSPHORUS_PROJECTILE.get(), livingEntity, world);
        time=0;
    }


    @Override
    protected Item getDefaultItem() {
        return ModItems.PHOSPHORUS_CHUNK.get();
    }


    @Override
    protected void onBlockHit(BlockHitResult result) {
        if (time==1000) {//kill projectile after 50 seconds
            this.kill();
        }


        Vec3d vec3 = result.getPos().subtract(this.getX(), this.getY(), this.getZ());
        this.setVelocity(vec3);
        Vec3d pos1 = vec3.normalize().multiply(0.05F);
        this.setPos(this.getX() - pos1.x, this.getY() - pos1.y, this.getZ() - pos1.z);

        /*if (time%20==0) {
            getWorld().getOtherEntities(this,this.getBoundingBox().expand(3)).forEach(
                    (entity) -> {
                        if (entity instanceof LivingEntity livingEntity) {
                            livingEntity.addStatusEffect(new MobEffectInstance(ModEffects.PHOSPHORUS_DAMAGED.get(),100,0));
                        }
                    }
            );
        }*/

        super.onBlockHit(result);

        /*
        //TODO make better fire spread
        BlockPos location = this.blockPosition().subtract(new BlockPos(
            (int)(Math.random()*10)-5,// addition-offsets might be wrong.
                (int)(Math.random()*7)+5,// addition-offsets might be wrong.
                (int)(Math.random()*10)-5));// addition-offsets might be wrong.
        if (level().getBlockState(location).isAir()&&!level().getBlockState(location.below()).isAir()) {
            level().setBlock(location, Blocks.FIRE.defaultBlockState(), 1);
        }*/

        time++;
    }

    /*@Override
        public float getGravity(){
            return 0.025F;
        }*/
    @Override
    public void tick() {
        /*Vec3d pos = this.getPos();
        if (!this.onGround()) {
            this.getWorld().addParticle(ModParticles.SMOKE_PARTICLE.get(),
                    pos.x + Math.random() * 0.5 - 0.25,
                    pos.y + Math.random() * 0.5 - 0.25,
                    pos.z + Math.random() * 0.5 - 0.25,
                    0, 0, 0);
        }*/
        this.setOnFire(true);
        super.tick();
    }

}
