package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.RockGolemEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RockGolemModel extends AnimatedGeoModel<RockGolemEntity> {
    @Override
    public ResourceLocation getModelResource(RockGolemEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "geo/rockgolem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RockGolemEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/rockgolem_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RockGolemEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "animations/rock_golem.json");
    }
}
