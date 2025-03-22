package me.help2.chemicalwarfare.weapontype.phosphorus;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ThrowablePotionItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class PhosphorusItem extends ThrowablePotionItem {
    public PhosphorusItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getActiveItem();

        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW,
                SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));

        if (!world.isClient) {
            PhosphorusProjectile projectile = new PhosphorusProjectile(world, user);
            projectile.setItem(itemStack);
            projectile.setVelocity(user, user.getRoll(), user.getPitch(), 0.0F, 1.0F, 1.0F);
            world.spawnEntity(projectile);
        }

//        user.awardStat(Stats.ITEM_USED.get(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

//        return InteractionResultHolder.sidedSuccess(itemStack, world.isClientSide());
        return super.use(world, user, hand);
    }
}
