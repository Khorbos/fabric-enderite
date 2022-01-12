package com.khorbos.enderite.objects.items.tools;

import com.khorbos.enderite.Enderite;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class EnderitePickaxeItem extends PickaxeItem {
    protected EnderitePickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    public EnderitePickaxeItem() {
        this(ModToolMaterials.ENDERITE, 1, -2.8F, new Item.Settings().group(Enderite.ENDERITE_GROUP));
    }
}
