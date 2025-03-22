package me.help2.chemicalwarfare.particle;

import net.minecraft.particle.DefaultParticleType;

public class ModParticleType extends DefaultParticleType {
    //Custom particle type that allows additional information to be modified before used in FogParticle.java
    float r = 0F;
    float g = 0F;
    float b = 0F;
    float a = 1F;

    public ModParticleType(boolean pOverrideLimiter) {
        super(pOverrideLimiter);
    }

    public void color(float newR,float newG, float newB, float newA) {
        this.r = newR;
        this.g = newG;
        this.b = newB;
        this.a = newA;
    }
}
