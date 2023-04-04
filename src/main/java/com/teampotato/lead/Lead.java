package com.teampotato.lead;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Lead.ID)
public class Lead {
    public static final String ID = "lead";
    public static final Logger LOGGER = LogManager.getLogger(ID);
    public Lead() {}
}
