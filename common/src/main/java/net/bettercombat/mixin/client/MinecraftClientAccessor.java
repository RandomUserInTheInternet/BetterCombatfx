package net.bettercombat.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MinecraftClient.class)
public interface MinecraftClientAccessor {
    @Accessor("attackCooldown")
    void setAttackCooldown(int ticks);

    @Accessor("entityRenderDispatcher")
    EntityRenderDispatcher getEntityRenderDispatcher();
}
