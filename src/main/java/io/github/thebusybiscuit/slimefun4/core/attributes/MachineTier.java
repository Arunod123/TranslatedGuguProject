package io.github.thebusybiscuit.slimefun4.core.attributes;

import javax.annotation.Nonnull;

public enum MachineTier {
    BASIC("& e Foundation"),
    AVERAGE("& 6 General"),
    MEDIUM("& a Medium"),
    GOOD("& 2 Excellent"),
    ADVANCED("Advanced & 6"),
    END_GAME("& 4 Final");

    private final String prefix;

    MachineTier(@Nonnull String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }
}
