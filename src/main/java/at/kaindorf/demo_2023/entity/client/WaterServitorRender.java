package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.FireServitorEntity;
import at.kaindorf.demo_2023.entity.custom.WaterServitorEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WaterServitorRender extends GeoEntityRenderer<WaterServitorEntity> {
    public WaterServitorRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WaterServitorModel());
        this.shadowRadius = 0.3f;
    }
    @Override
    public ResourceLocation getTextureLocation(WaterServitorEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/waterservitor.png");
    }

    @Override
    public RenderType getRenderType(WaterServitorEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight,
                                    ResourceLocation texture) {

        poseStack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}