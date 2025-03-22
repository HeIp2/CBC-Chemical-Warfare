/*
package me.help2.chemicalwarfare.particle;

import me.help2.chemicalwarfare.ChemicalWarfare;
import me.help2.chemicalwarfare.registry.ModParticles;
import net.minecraft.util.math.PositionImpl;
import net.minecraft.world.World;
import org.joml.Vector4d;

import java.security.InvalidParameterException;

// Creates gas with many different variables and options.
// TODO add wind and particle physics
public class FogUtils {
    private float particleDensity = 0;
    private World world = null;
    private PositionImpl position = null;
    private float spread = 0;
    private float weight;
    private Vector4d rgbaColor;
    public FogUtils(World world1, PositionImpl position1, float spread1, float weight1, Vector4d rgbaColor1, float particleDensity1) {
        this.position = position1;
        this.spread = spread1;
        this.weight = weight1;
        this.rgbaColor = rgbaColor1;
        this.world = world1;
        this.particleDensity = particleDensity1;
    }

    */
/*if (Math.random()<0.2&&time<100) { //create fog for 5 seconds
            this.level().addParticle(Particles.FOG_PARTICLE.get(),
                    this.position().x-(Math.random()*14-7),
                    (this.position().y-(Math.random()*10-5))+2,
                    this.position().z-(Math.random()*14-7),
                    0,0,0);
        }*//*


    public void disperce(int time,int end) {
        ModParticleType particle = ModParticles.FOG_PARTICLE.get();
        if (time > end) {return;}// exit if time is over end value
        //if (Math.random()>particleDensity) {Main.LOGGER.debug("3");return;}

        ChemicalWarfare.LOGGER.info("IS IN TIME!");

        particle.color(0.8f,0.8f,0.8f,1);
        world.addParticle(
                particle,
                position.getX(), //+ Math.lerp(-spread,spread, Math.random()),
                position.getY(), //+ Math.lerp(-spread,spread, Math.random()),
                position.getZ(), //+ Math.lerp(-spread,spread, Math.random()),
                0,0,0
        );

    }
}
*/
