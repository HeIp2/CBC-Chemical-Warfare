package me.help2.chemicalwarfare.item.custom;

import net.minecraft.item.Item;

public class Debug extends Item {
    public Debug(Item.Settings settings) {
        super(settings);
    }
    /*public @NotNull InteractionResultHolder<ItemStack> use( pLevel, Player pPlayer, @NotNull InteractionHand pHand) {
        ItemStack itemStack = pPlayer.getItemInHand(pHand);

        if (!pLevel.isClientSide) {
                for (int i = 0;i<10;i++){
                    PhosphorusProjectile pProjectile = new PhosphorusProjectile(pLevel, pPlayer.getX(),pPlayer.getEyeY(),pPlayer.getZ());
                    pProjectile.setItem(new ItemStack(ItemRegistry.PHOSPHORUS_CHUNK.get()));
                    pProjectile.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0F, 1.0F, 25.0F);
                    pLevel.addFreshEntity(pProjectile);
                }
        }

        return InteractionResultHolder.sidedSuccess(itemStack, pLevel.isClientSide());
    }*/
}
