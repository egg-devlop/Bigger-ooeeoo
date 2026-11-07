package com.eggdevlop.femalesize500;

import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(FemaleSize500.MODID)
public class FemaleSize500 {
    public static final String MODID = "female_size_500";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public FemaleSize500() {
        LOGGER.info("Female Size 500 loaded");
    }
}
