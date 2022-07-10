package com.advantmods.industriallevel.common.item.tool;

import com.advantmods.industriallevel.common.api.enums.ILToolMaterial;
import com.advantmods.industriallevel.common.setup.ModSetup;
import net.minecraft.world.item.AxeItem;

public class LeadSword extends AxeItem {
    public LeadSword() {
        super(ILToolMaterial.LEAD, 2147483647, 340282356779733661637539395458142568447F, new Properties().tab(ModSetup.CLASSIC_TAB));
    }
}