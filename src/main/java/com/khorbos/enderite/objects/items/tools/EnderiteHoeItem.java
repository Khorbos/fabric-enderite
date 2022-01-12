package com.khorbos.enderite.objects.items.tools;

import com.khorbos.enderite.Enderite;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class EnderiteHoeItem extends HoeItem {
    protected EnderiteHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public EnderiteHoeItem() {
        this(ModToolMaterials.ENDERITE, -4, 0.0F, new Item.Settings().group(Enderite.ENDERITE_GROUP));
    }
}
