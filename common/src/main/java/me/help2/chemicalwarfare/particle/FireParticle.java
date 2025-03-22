/*
package me.help2.chemicalwarfare.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@OnlyIn(Dist.CLIENT)
public class FireParticle extends SpriteBillboardParticle {
    private final SpriteSet sprites;

    FireParticle(ClientLevel pLevel, double pX, double pY, double pZ, double pQuadSizeMulitiplier, SpriteSet pSprites) {
        super(pLevel, pX, pY, pZ, 0.0, 0.0, 0.0);
        this.lifetime = 6 + this.random.nextInt(4);
        float randomColor = this.random.nextFloat() * 0.6F + 0.4F;
        this.rCol = randomColor;
        this.gCol = randomColor;
        this.bCol = randomColor;
        this.quadSize = 2.0F * (1.0F - (float)pQuadSizeMulitiplier * 0.5F);
        this.sprites = pSprites;
        this.setSpriteFromAge(pSprites);
    }

    @Override
    protected int getLightColor(float p_107249_) {
        return 15728880; //set particles to be full bright
    }

    public @NotNull ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    */
/*
    Short time = 0;
    @Override
    public void tick() {
        super.tick();
        // fade out in 100-140 ticks
        this.alpha = (float) (Math.min(
                (-this.time*0.2)+(3*this.lifetime),
                this.lifetime)
                /(this.lifetime*0.7));
        this.time++;
    }

    *//*


    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.age++ >= this.lifetime) {
            this.remove();
        } else {
            this.setSpriteFromAge(this.sprites);
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {

        private final SpriteSet sprites;

        public Provider(SpriteSet spriteSet) {
            this.sprites = spriteSet;
        }

        @Nullable
        @Override
        public Particle createParticle(@NotNull SimpleParticleType pType, @NotNull ClientLevel pLevel, double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed) {
            return new FireParticle(pLevel, pX, pY, pZ, pXSpeed, this.sprites);
        }
    }
}
*/
