/*
package me.help2.chemicalwarfare.weapontype.phosphorus;

import java.util.List;

import me.help2.chemicalwarfare.ChemicalWarfare.EntityRegistry;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import rbasamoyai.createbigcannons.munitions.big_cannon.AbstractBigCannonProjectile;
import rbasamoyai.createbigcannons.munitions.big_cannon.CommonShellBigCannonProjectileProperties;
import rbasamoyai.createbigcannons.munitions.big_cannon.SimpleShellBlock;
import rbasamoyai.createbigcannons.munitions.config.PropertiesMunitionEntity;

public class PhosphorusShellBlock extends SimpleShellBlock<CommonShellBigCannonProjectileProperties> {
    public PhosphorusShellBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public boolean isBaseFuze() {
        return !super.isBaseFuze();
        //Fuze was being added on the base for some reason, so I added this scuffed code to fix it
    }



    public AbstractBigCannonProjectile<?> getProjectile(Level level, List<StructureTemplate.StructureBlockInfo> projectileBlocks) {
        PhosphorusShellProjectile projectile = (PhosphorusShellProjectile)((EntityType<?>) EntityRegistry.PHOSPHORUS_SHELL_PROJECTILE.get()).create(level);
        getFuze(projectileBlocks).getOrCreateTag().putInt("DetonationDistance",
                getFuze(projectileBlocks).getOrCreateTag().getInt("DetonationDistance")*2
        ); // double detonation distance of fuze
        assert projectile != null;
        projectile.setFuze(getFuze(projectileBlocks));
        return projectile;
    }


    public EntityType<? extends PropertiesMunitionEntity<? extends CommonShellBigCannonProjectileProperties>> getAssociatedEntityType() {
        return EntityRegistry.PHOSPHORUS_SHELL_PROJECTILE.get();
    }
}
*/
