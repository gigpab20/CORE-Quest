package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.RockServitorEntity;
import at.kaindorf.demo_2023.entity.custom.WaterServitorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RockServitorModel extends AnimatedGeoModel<RockServitorEntity> {
    @Override
    public ResourceLocation getModelResource(RockServitorEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "geo/rockservitor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RockServitorEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/rockservitor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RockServitorEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "animations/rock_servitor.json");
    }
}
