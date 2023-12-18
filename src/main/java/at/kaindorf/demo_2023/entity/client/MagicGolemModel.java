package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.MagicGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MagicGolemModel extends AnimatedGeoModel<MagicGolemEntity> {
    @Override
    public ResourceLocation getModelResource(MagicGolemEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "geo/magicgolem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MagicGolemEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/magicgolem_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MagicGolemEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "animations/magicgolem.animation.json");
    }
}
