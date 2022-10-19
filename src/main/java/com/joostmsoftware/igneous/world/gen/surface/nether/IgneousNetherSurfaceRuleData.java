package com.joostmsoftware.igneous.world.gen.surface.nether;

import com.joostmsoftware.igneous.world.biomes.nether.IgneousNetherBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class IgneousNetherSurfaceRuleData {

    private static final MaterialRules.MaterialRule WARPED_NYLIUM = makeStateRule(Blocks.WARPED_NYLIUM);
    private static final MaterialRules.MaterialRule WARPED_WART_BLOCK = makeStateRule(Blocks.WARPED_WART_BLOCK);
    private static final MaterialRules.MaterialRule NETHERRACK = makeStateRule(Blocks.NETHERRACK);
    private static final MaterialRules.MaterialRule BEDROCK = makeStateRule(Blocks.BEDROCK);
    private static final MaterialRules.MaterialRule LAVA = makeStateRule(Blocks.LAVA);
    private static final MaterialRules.MaterialRule GRAVEL = makeStateRule(Blocks.GRAVEL);

    public static MaterialRules.MaterialRule makeNetherRules() {
        MaterialRules.MaterialCondition MaterialCondition = MaterialRules.aboveY(YOffset.fixed(31), 0);
        MaterialRules.MaterialCondition MaterialCondition2 = MaterialRules.aboveY(YOffset.fixed(32), 0);
        MaterialRules.MaterialCondition MaterialCondition3 = MaterialRules.aboveYWithStoneDepth(YOffset.fixed(30), 0);
        MaterialRules.MaterialCondition MaterialCondition4 = MaterialRules.not(MaterialRules.aboveYWithStoneDepth(YOffset.fixed(35), 0));
        MaterialRules.MaterialCondition MaterialCondition5 = MaterialRules.aboveY(YOffset.belowTop(5), 0);
        MaterialRules.MaterialCondition MaterialCondition6 = MaterialRules.hole();
        MaterialRules.MaterialCondition MaterialCondition7 = MaterialRules.noiseThreshold(NoiseParametersKeys.SOUL_SAND_LAYER, -0.012);
        MaterialRules.MaterialCondition MaterialCondition8 = MaterialRules.noiseThreshold(NoiseParametersKeys.GRAVEL_LAYER, -0.012);
        MaterialRules.MaterialCondition MaterialCondition9 = MaterialRules.noiseThreshold(NoiseParametersKeys.PATCH, -0.012);
        MaterialRules.MaterialCondition MaterialCondition10 = MaterialRules.noiseThreshold(NoiseParametersKeys.NETHERRACK, 0.54);
        MaterialRules.MaterialCondition MaterialCondition11 = MaterialRules.noiseThreshold(NoiseParametersKeys.NETHER_WART, 1.17);
        MaterialRules.MaterialCondition MaterialCondition12 = MaterialRules.noiseThreshold(NoiseParametersKeys.NETHER_STATE_SELECTOR, 0.0);
        MaterialRules.MaterialRule ruleSource = MaterialRules.condition(
                MaterialCondition9, MaterialRules.condition(MaterialCondition3, MaterialRules.condition(MaterialCondition4, GRAVEL))
        );

        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.verticalGradient("bedrock_floor", YOffset.getBottom(), YOffset.aboveBottom(5)), BEDROCK),
                MaterialRules.condition(MaterialRules.not(MaterialRules.verticalGradient("bedrock_roof", YOffset.belowTop(5), YOffset.getTop())), BEDROCK),
                MaterialRules.condition(MaterialCondition5, NETHERRACK),

                MaterialRules.condition(
                        MaterialRules.STONE_DEPTH_FLOOR,
                        MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.not(MaterialCondition2), MaterialRules.condition(MaterialCondition6, LAVA)),
                                MaterialRules.condition(
                                        MaterialRules.biome(IgneousNetherBiomes.HOT_SPRINGS),
                                        MaterialRules.condition(
                                                MaterialRules.not(MaterialCondition10),
                                                MaterialRules.condition(MaterialCondition, MaterialRules.sequence(MaterialRules.condition(MaterialCondition11, WARPED_WART_BLOCK), WARPED_NYLIUM))
                                        )
                                )
                        )
                ),
                MaterialRules.condition(
                        MaterialRules.STONE_DEPTH_FLOOR,
                        MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.not(MaterialCondition2), MaterialRules.condition(MaterialCondition6, LAVA)),
                                MaterialRules.condition(
                                        MaterialRules.biome(IgneousNetherBiomes.LUSH_HOT_SPRINGS),
                                        MaterialRules.condition(
                                                MaterialRules.not(MaterialCondition10),
                                                MaterialRules.condition(MaterialCondition, MaterialRules.sequence(MaterialRules.condition(MaterialCondition11, WARPED_WART_BLOCK), WARPED_NYLIUM))
                                        )
                                )
                        )
                ),
                NETHERRACK
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
