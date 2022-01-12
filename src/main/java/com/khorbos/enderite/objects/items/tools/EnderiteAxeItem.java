package com.khorbos.enderite.objects.items.tools;

import com.khorbos.enderite.Enderite;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class EnderiteAxeItem extends AxeItem {
    protected EnderiteAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public EnderiteAxeItem() {
        this(ModToolMaterials.ENDERITE, 5.0F, -3.0F, new Item.Settings().group(Enderite.ENDERITE_GROUP));
    }
}
