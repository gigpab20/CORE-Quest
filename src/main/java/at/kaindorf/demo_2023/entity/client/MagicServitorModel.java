package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.MagicServitorEntity;
import at.kaindorf.demo_2023.entity.custom.WaterServitorEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MagicServitorModel extends AnimatedGeoModel<MagicServitorEntity> {
    @Override
    public ResourceLocation getModelResource(MagicServitorEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "geo/magicservitor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MagicServitorEntity object) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/magicservitor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MagicServitorEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "animations/magic_servitor.json");
    }
}
