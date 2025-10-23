package io.github.thebusybiscuit.slimefun4.implementation.items.androids;

import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import javax.annotation.Nonnull;
import org.bukkit.inventory.ItemStack;

/**
 * This enum covers all different fuel sources a {@link ProgrammableAndroid} can have.
 *
 * @author TheBusyBiscuit
 *
 */
public enum AndroidFuelSource {

    /**
     * This {@link ProgrammableAndroid} runs on solid fuel, e.g. Wood or coal
     */
    SOLID("", "Robots like & f need solid fuel.", "& f e.g. coal, logs..."),

    /**
     * This {@link ProgrammableAndroid} runs on liquid fuel, e.g. Fuel, Oil or Lava
     */
    LIQUID("", "Robots like & f need liquid fuel.", "& f e.g. magma, crude oil, fuel oil..."),

    /**
     * This {@link ProgrammableAndroid} runs on nuclear fuel, e.g. Uranium
     */
    NUCLEAR("", "Robots like & f require radioactive fuel.", "&f e.g. uranium, neptunium or plutonium uranium mixed oxide nuclear fuel");

    private final String[] lore;

    AndroidFuelSource(@Nonnull String... lore) {
        this.lore = lore;
    }

    /**
     * This returns a display {@link ItemStack} for this {@link AndroidFuelSource}.
     *
     * @return An {@link ItemStack} to display
     */
    @Nonnull
    public ItemStack getItem() {
        return new CustomItemStack(HeadTexture.GENERATOR.getAsItemStack(), "& 8\u21E9 &c Fuel Input Slot & 8\u21E9", lore);
    }
}
