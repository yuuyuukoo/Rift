package net.mira.rift.item;

import net.minecraft.world.item.Item;
import net.mira.rift.Rift;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Rift.MODID);

    public static final DeferredItem<Item> ROPE = ITEMS.register("rope",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
