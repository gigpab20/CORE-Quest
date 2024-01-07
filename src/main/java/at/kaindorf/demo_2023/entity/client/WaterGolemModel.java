package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.WaterGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WaterGolemModel extends AnimatedGeoModel<WaterGolemEntity> {
    @Override
    public ResourceLocation getModelResource(WaterGolemEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "geo/watergolem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WaterGolemEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/watergolem_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WaterGolemEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "animations/water_golem.json");
    }
}
