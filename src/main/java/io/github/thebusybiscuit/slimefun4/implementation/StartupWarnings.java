package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.utils.NumberUtils;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This class stores some startup warnings we occasionally need to print.
 * If you setup your server the recommended way, you are never going to see
 * any of these messages.
 *
 * @author TheBusyBiscuit
 *
 */
final class StartupWarnings {

    private static final String BORDER = "****************************************************";
    private static final String PREFIX = "* ";

    private StartupWarnings() {}

    @ParametersAreNonnullByDefault
    static void discourageCSCoreLib(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Looks like you're still using CS-CoreLib.");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Slimefun since 2021/01/30");
        logger.log(Level.SEVERE, PREFIX + "It's not like we're dependent on CS-CoreLib anymore.");
        logger.log(Level.SEVERE, PREFIX + "You need to remove CS-CoreLib");
        logger.log(Level.SEVERE, PREFIX + "To get Slimefun to run.");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidMinecraftVersion(Logger logger, int majorVersion, String slimefunVersion) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Slimefun is not installed correctly!");
        logger.log(Level.SEVERE, PREFIX + "You are using unsupported Minecraft version!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "You're using Minecraft 1.x", majorVersion);
        logger.log(Level.SEVERE, PREFIX + "Support only Slimefun", slimefunVersion);
        logger.log(Level.SEVERE, PREFIX + "Minecraft {0}", String.join(" / ", Slimefun.getSupportedVersions()));
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void invalidServerSoftware(Logger logger) {
        logger.log(Level.SEVERE, BORDER);
        logger.log(Level.SEVERE, PREFIX + "Slimefun is not installed correctly!");
        logger.log(Level.SEVERE, PREFIX + "We no longer support CraftBukkit server!");
        logger.log(Level.SEVERE, PREFIX);
        logger.log(Level.SEVERE, PREFIX + "Slimefun needs you to use Spigot, Paper");
        logger.log(Level.SEVERE, PREFIX + "Or any server for the Spigot/Paper branch.");
        logger.log(Level.SEVERE, PREFIX + "♪ We recommend Papa ♪");
        logger.log(Level.SEVERE, BORDER);
    }

    @ParametersAreNonnullByDefault
    static void oldJavaVersion(Logger logger, int recommendedJavaVersion) {
        int javaVersion = NumberUtils.getJavaVersion();

        logger.log(Level.WARNING, BORDER);
        logger.log(Level.WARNING, PREFIX + "The Java version (Java {) in use is outdated.", javaVersion);
        logger.log(Level.WARNING, PREFIX);
        logger.log(Level.WARNING, PREFIX + "_Other Organiser", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "We recommend you upgrade to Java as soon as possible.", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "At the same time, in order to make use of the properties of the new version of Java as soon as possible,");
        logger.log(Level.WARNING, PREFIX + "Slimefun will also depend on Java in the near future.", recommendedJavaVersion);
        logger.log(Level.WARNING, PREFIX + "In order not to interfere with your future normal use, please update as soon as possible!");
        logger.log(Level.WARNING, BORDER);
    }
}
