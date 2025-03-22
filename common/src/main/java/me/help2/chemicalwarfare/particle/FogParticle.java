package me.help2.chemicalwarfare.particle;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.architectury.registry.client.particle.ParticleProviderRegistry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.world.ClientWorld;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector4f;

@Environment(EnvType.CLIENT)
public class FogParticle extends SpriteBillboardParticle {
    private static final ParticleTextureSheet FOG_PARTICLE_RENDERTYPE = new ParticleTextureSheet() {
        public void begin(BufferBuilder buffer, @NotNull TextureManager p_107456_) {
            RenderSystem.depthMask(false);
            //RenderSystem.setShaderTexture(0, TextureAtlas.LOCATION_PARTICLES);
            //RenderSystem.setShader(Shaders::getFogShader);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            buffer.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR_LIGHT);
        }
        public void draw(Tessellator p_107458_) {
            p_107458_.draw();
        }
        public String toString() {
            return "FOG_PARTICLE_RENDERTYPE";
        }
    };

    /*@Override
    public void tick() {
        super.tick();

        // desmos graph of fade in/out -
        //     y\ =\ \min\left(1,\frac{x}{50},-\frac{x}{250}+2\right)\cdot50
        this.alpha = Math.min(Math.min(
                        1, (-lifetime / 250) + 2
                ), lifetime / 50
        );
    }*/

    public FogParticle(ClientWorld world, double pX, double pY, double pZ, float r, float g, float b, float a) {
        super(world, pX, pY, pZ);
        this.gravityStrength = 0.0F;
        this.maxAge = 500;
        this.scale(6);
        //this.hasPhysics = false;
        this.alpha = 1f;
        this.red = r;
        this.green = g;
        this.blue = (float)(b-Math.random()*0.1);
    }

    @Override
    protected int getBrightness(float tint) {
        return 100;
    }

    @Override
    public ParticleTextureSheet getType() {
        return FOG_PARTICLE_RENDERTYPE;
    }

    @Environment(EnvType.CLIENT)
    public static class Provider implements ParticleProviderRegistry.DeferredParticleProvider<ModParticleType> {

        private final ParticleProviderRegistry.ExtendedSpriteSet sprite;

        public Provider(ParticleProviderRegistry.ExtendedSpriteSet pSprites) {
            this.sprite = pSprites;
        }

        public Particle create(@NotNull ModParticleType particleType, @NotNull ClientWorld pLevel, double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed) {
            FogParticle fogParticle;
            fogParticle = new FogParticle(pLevel, pX, pY+1, pZ,particleType.r,particleType.g,particleType.b,particleType.a);
            fogParticle.setSprite(this.sprite);
//            Shaders.getFogShader().safeGetUniform("UVLocations").set(new Vector4f(
//                                fogParticle.getU0(),
//                                fogParticle.getV0(),
//                                fogParticle.getU1(),
//                                fogParticle.getV1()
//                        )
//                );
            return fogParticle;
        }

        @Override
        public ParticleFactory<ModParticleType> create(ParticleProviderRegistry.ExtendedSpriteSet spriteSet) {
            return null;
        }
    }
}
