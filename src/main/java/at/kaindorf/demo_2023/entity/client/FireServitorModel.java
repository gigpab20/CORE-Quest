package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.FireServitorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireServitorModel extends AnimatedGeoModel<FireServitorEntity> {
    @Override
    public ResourceLocation getModelResource(FireServitorEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "geo/fireservitor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireServitorEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/fireservitor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireServitorEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "animations/fire_servitor.json");
    }
}
