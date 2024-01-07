package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.FireGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FireGolemModel extends AnimatedGeoModel<FireGolemEntity> {
    @Override
    public ResourceLocation getModelResource(FireGolemEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "geo/firegolem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FireGolemEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/firegolem_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FireGolemEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "animations/fire_golem.json");
    }
}
