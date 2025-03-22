/*
package me.help2.chemicalwarfare.weapontype.phosphorus;

import me.help2.chemicalwarfare.ChemicalWarfare.BlockRegistry;
import me.help2.chemicalwarfare.ChemicalWarfare.item.ItemRegistry;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.Vec3;
import rbasamoyai.createbigcannons.munitions.big_cannon.CommonShellBigCannonProjectileProperties;
import rbasamoyai.createbigcannons.munitions.big_cannon.FuzedBigCannonProjectile;


public class PhosphorusShellProjectile extends FuzedBigCannonProjectile<CommonShellBigCannonProjectileProperties> {
    public PhosphorusShellProjectile(EntityType<? extends PhosphorusShellProjectile> type, Level level) {
        super(type, level);
    }

    @Override
    protected void detonate() {
        Level pLevel = this.getCommandSenderWorld();
        if (!pLevel.isClientSide) {
            for (int i = 0;i<10;i++){
                Vec3 direction =this.getDeltaMovement();
                PhosphorusProjectile pProjectile = new PhosphorusProjectile(pLevel, this.getX(),this.getEyeY(),this.getZ());
                pProjectile.setItem(new ItemStack(ItemRegistry.PHOSPHORUS_CHUNK.get()));
                pProjectile.shoot(direction.x,direction.y,direction.z, 1.0F, 30.0F);
                pLevel.addFreshEntity(pProjectile);
            }
        } else {
            pLevel.addParticle(ParticleTypes.EXPLOSION_EMITTER,this.getX(),this.getY(),this.getZ(),0,0,0);
        }
        this.discard();
    }

    @Override
    public BlockState getRenderedBlockState() {
        return BlockRegistry.PHOSPHORUS_SHELL.getDefaultState().setValue(BlockStateProperties.FACING, Direction.NORTH);
    }
}
*/
