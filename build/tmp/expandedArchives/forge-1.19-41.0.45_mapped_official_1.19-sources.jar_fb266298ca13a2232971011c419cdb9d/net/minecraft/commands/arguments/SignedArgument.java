package net.minecraft.commands.arguments;

import net.minecraft.network.chat.Component;

public interface SignedArgument<T> extends PreviewedArgument<T> {
   Component getPlainSignableComponent(T p_233887_);
}