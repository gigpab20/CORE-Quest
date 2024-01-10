package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.FireServitorEntity;
import at.kaindorf.demo_2023.entity.custom.WaterServitorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WaterServitorModel extends AnimatedGeoModel<WaterServitorEntity> {
    @Override
    public ResourceLocation getModelResource(WaterServitorEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "geo/waterservitor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WaterServitorEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/waterservitor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WaterServitorEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "animations/water_servitor.json");
    }
}
