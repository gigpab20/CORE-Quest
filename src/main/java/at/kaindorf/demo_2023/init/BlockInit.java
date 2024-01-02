package at.kaindorf.demo_2023.init;

import at.kaindorf.demo_2023.Demo_2023;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Demo_2023.MODID);

    //create Block and define its properties :
    public static final RegistryObject<Block> METAL_BOCK =
            BLOCKS.register("metal_block",
                    () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                            .strength(6.0f)
                            .sound(SoundType.METAL)));
}
