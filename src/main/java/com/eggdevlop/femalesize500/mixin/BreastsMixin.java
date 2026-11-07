package com.eggdevlop.femalesize500.mixin;

import com.wildfire.common.entities.Breasts;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Breasts.class)
public abstract class BreastsMixin {
    /**
     * Female Gender Mod original code:
     * public static final ConfigKey<Float> BUST_SIZE = ConfigKey.create(0.6F, 0, 0.8F);
     *
     * We raise max from 0.8F to 5.0F => 500%
     */
    @ModifyConstant(
        method = "<clinit>",
        constant = @Constant(floatValue = 0.8F),
        require = 1
    )
    private static float femalesize500$raiseMax(float original) {
        return 5.0F;
    }
}
