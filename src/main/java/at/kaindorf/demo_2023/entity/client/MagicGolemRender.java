package at.kaindorf.demo_2023.entity.client;

import at.kaindorf.demo_2023.Demo_2023;
import at.kaindorf.demo_2023.entity.custom.MagicGolemEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MagicGolemRender extends GeoEntityRenderer<MagicGolemEntity> {
    public MagicGolemRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MagicGolemModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(MagicGolemEntity animatable) {
        return new ResourceLocation(Demo_2023.MODID, "textures/entity/magicgolem_texture.png");
    }

    @Override
    public RenderType getRenderType(MagicGolemEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight,
                                    ResourceLocation texture) {

        poseStack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
