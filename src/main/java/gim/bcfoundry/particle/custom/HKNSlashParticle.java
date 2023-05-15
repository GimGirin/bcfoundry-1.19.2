//package gim.bcfoundry.particle.custom;
//
//import gim.bcfoundry.particle.BCFParticles;
//import net.fabricmc.api.EnvType;
//import net.fabricmc.api.Environment;
//import net.minecraft.client.particle.*;
//import net.minecraft.client.world.ClientWorld;
//import net.minecraft.network.PacketByteBuf;
//import net.minecraft.particle.DefaultParticleType;
//import net.minecraft.particle.ParticleEffect;
//import net.minecraft.particle.ParticleType;
//import net.minecraft.particle.ParticleTypes;
//
//public class HKNSlashParticle extends AnimatedParticle {
//    HKNSlashParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, SpriteProvider spriteProvider) {
//        super(world, x, y, z, spriteProvider, 0.0125F);
//        this.velocityX = velocityX;
//        this.velocityY = velocityY;
//        this.velocityZ = velocityZ;
//        this.scale *= 0.75F;
//        this.maxAge = 60 + this.random.nextInt(12);
//        this.setTargetColor(15916745);
//        this.setSpriteForAge(spriteProvider);
//    }
//
//    @Environment(EnvType.CLIENT)
//    public static class Factory implements ParticleFactory<DefaultParticleType> {
//        private final SpriteProvider spriteProvider;
//
//        public Factory(SpriteProvider spriteProvider) {
//            this.spriteProvider = spriteProvider;
//        }
//
//        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
//            return new HKNSlashParticle(clientWorld, d, e, f, g, h, i, this.spriteProvider);
//        }
//    }
//
//}
