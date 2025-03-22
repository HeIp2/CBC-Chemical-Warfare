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
public class SmokeParticles extends TextureSheetParticle {
    SmokeParticles(ClientLevel pLevel, double pX, double pY, double pZ) {
        super(pLevel, pX, pY, pZ);
        this.alpha = 0F;
        this.gravity = 0F;
        //set particle to live for 100-140 ticks
        this.lifetime = (int)(120+Math.floor(Math.random()*40)-20);
        this.scale(4);
        this.quadSize*=2;
        this.hasPhysics = false;
    }

    public @NotNull ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Override
    public void tick() {
        super.tick();
        // fade out in 100-140 ticks
        alpha = (float) Math.min(lifetime - age,
                age*10
        ) /lifetime;
        age++;
    }

    @Override
    protected int getLightColor(float pPartialTick) {
        return Math.max(super.getLightColor(pPartialTick), 15-age);
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {

        private final SpriteSet sprite;

        public Provider(SpriteSet pSprites) {
            this.sprite = pSprites;
        }

        @Nullable
        @Override
        public Particle createParticle(SimpleParticleType pType, ClientLevel pLevel, double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed) {
            SmokeParticles smokeParticles = new SmokeParticles(pLevel, pX, pY, pZ);
            smokeParticles.pickSprite(this.sprite);
            return smokeParticles;
        }
    }
}
*/
