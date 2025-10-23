package io.github.thebusybiscuit.slimefun4.implementation;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerBackpack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.StormStaff;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedEnchantment;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * This class holds a static references to every {@link SlimefunItemStack}
 * found in Slimefun.
 */
@SuppressWarnings("java:S1192") // Suppress "duplicate string literal" warnings
public final class SlimefunItems {

    private SlimefunItems() {}

    /*		 Items 		*/
    public static final SlimefunItemStack PORTABLE_CRAFTER = new SlimefunItemStack(
            "PORTABLE_CRAFTER",
            HeadTexture.PORTABLE_CRAFTER,
            "& 6 Portable Workstations",
            "A portable workstation in &a&o",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack PORTABLE_DUSTBIN = new SlimefunItemStack(
            "PORTABLE_DUSTBIN", HeadTexture.TRASH_CAN, "& 6 portable garbage bins", "& r Lightly eliminate surplus items", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack ENDER_BACKPACK = new SlimefunItemStack(
            "ENDER_BACKPACK", HeadTexture.ENDER_BACKPACK, "& 6 Backpack", "Portable suitcase & a&o", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack MAGIC_EYE_OF_ENDER = new SlimefunItemStack(
            "MAGIC_EYE_OF_ENDER", Material.ENDER_EYE, "♪ 6-and-l-forward eye ♪", "& 4 & l needs a full body armor.", "", "& 7-E right & 7 to eject a magma pearl");
    public static final SlimefunItemStack BROKEN_SPAWNER = new SlimefunItemStack(
            "BROKEN_SPAWNER", Material.SPAWNER, "A damaged & c brush cage", "& Type 7: & b<Type>", "", "& c has been damaged and needs to be repaired in ancient altars.");
    public static final SlimefunItemStack REPAIRED_SPAWNER =
            new SlimefunItemStack("REINFORCED_SPAWNER", Material.SPAWNER, "& b-repaired cages", "& Type 7: & b<Type>");
    public static final SlimefunItemStack INFERNAL_BONEMEAL =
            new SlimefunItemStack("INFERNAL_BONEMEAL", Material.BONE_MEAL, "& 4 Hellbones powder", "", "& c. Accelerating the growth of the thugs of hell.");
    public static final SlimefunItemStack TAPE_MEASURE = new SlimefunItemStack(
            "TAPE_MEASURE",
            "180d5c43a6cf5bb7769fd0c8240e1e70d2ae38ef9d78a1db401aca6a2cb36f65",
            "& 6 rolls",
            "",
            "& eShift+Right Key & 7 Set the measurement starting point",
            "& e Right Key & 7 Measuring Distance");

    /*		 Gadgets 		*/
    public static final SlimefunItemStack GOLD_PAN =
            new SlimefunItemStack("GOLD_PAN", Material.BOWL, "& 6 gold-digger", "& a & o have access to a variety of minerals", "", "& 7 & 7 & 7 & Gold from the gravel");
    public static final SlimefunItemStack NETHER_GOLD_PAN =
            new SlimefunItemStack("NETHER_GOLD_PAN", Material.BOWL, "The gold-picking plate below & 4", "", "& 7 & 7 & 7 & Gold from Soul Sand");
    public static final SlimefunItemStack PARACHUTE = new SlimefunItemStack(
            "PARACHUTE", Material.LEATHER_CHESTPLATE, Color.WHITE, "& r&l parachute", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack GRAPPLING_HOOK =
            new SlimefunItemStack("GRAPPLING_HOOK", Material.LEAD, "& 6 hooks", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SOLAR_HELMET =
            new SlimefunItemStack("SOLAR_HELMET", Material.IRON_HELMET, "& b Solar helmets", "", "The items and equipment that &a&o hold for you are charged.");
    public static final SlimefunItemStack CLOTH = new SlimefunItemStack("CLOTH", Material.PAPER, "& bbu");
    public static final SlimefunItemStack REINFORCED_CLOTH = new SlimefunItemStack(
            "REINFORCED_CLOTH", Material.PAPER, "& b enhanced fabric", "", "& f After the lead was reinforced", "& f can prevent the negative effects of radiation.");
    public static final SlimefunItemStack TIN_CAN = new SlimefunItemStack("CAN", HeadTexture.TIN_CAN, "& r tin cans");
    public static final SlimefunItemStack NIGHT_VISION_GOGGLES = new SlimefunItemStack(
            "NIGHT_VISION_GOGGLES", Material.LEATHER_HELMET, Color.BLACK, "& a Night vision glasses", "", "& 9+ Night vision");
    public static final SlimefunItemStack ELYTRA_CAP = new SlimefunItemStack(
            "ELYTRA_CAP", Material.LEATHER_HELMET, Color.PURPLE, "♪ 5 wingscaps ♪", "", "♪ 7 makes you fly with wings ♪", "♪ 7 won't fall down into meat sauce ♪");
    public static final SlimefunItemStack FARMER_SHOES =
            new SlimefunItemStack("FARMER_SHOES", Material.LEATHER_BOOTS, Color.YELLOW, "& Peasant's boots", "", "#6 # can prevent you from stepping on your fields #");
    public static final SlimefunItemStack INFUSED_MAGNET = new SlimefunItemStack(
            "INFUSED_MAGNET",
            HeadTexture.MAGNET,
            "& a Inhaled magnets",
            "",
            "& r injected magic magnets",
            "& r can bring the nearby items",
            "& r Put in your backpack",
            "",
            "& 7 Press & eShift& 7 to extract the surroundings");
    public static final SlimefunItemStack RAG = new SlimefunItemStack(
            "RAG",
            Material.PAPER,
            "& c Broken",
            "",
            "& a1 level medical supplies",
            "",
            "& r restore 2 points of blood.",
            "&r can put out the fire.",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack BANDAGE = new SlimefunItemStack(
            "BANDAGE",
            Material.PAPER,
            "& C bandages",
            "",
            "& a2 level medical supplies",
            "",
            "& r restored 4 points of blood.",
            "&r can put out the fire.",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SPLINT = new SlimefunItemStack(
            "SPLINT", Material.STICK, "& c plywood", "", "& a1 level medical supplies", "", "& r restore 2 points of blood.", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack VITAMINS = new SlimefunItemStack(
            "VITAMINS",
            Material.NETHER_WART,
            "& cvitamins",
            "",
            "Medical supplies at level & a3",
            "",
            "& r restored 4 points of blood.",
            "&r can put out the fire.",
            "Negative effects of &r cure poisoning/zeroing/radiation",
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack MEDICINE = new SlimefunItemStack(
            "MEDICINE",
            Material.POTION,
            Color.RED,
            "&c Drugs",
            "",
            "Medical supplies at level & a3",
            "",
            "& r restored 4 points of blood.",
            "&r can put out the fire.",
            "Negative effects of &r cure poisoning/zeroing/radiation",
            "",
            "& 7&e Right & 7 Drink");
    public static final SlimefunItemStack MAGICAL_ZOMBIE_PILLS =
            new SlimefunItemStack("MAGICAL_ZOMBIE_PILLS", Material.NETHER_WART, "& 6 is still alive", "", "& e right key immediately cure & 7 zombie villagers/pig spirits");

    public static final SlimefunItemStack FLASK_OF_KNOWLEDGE = new SlimefunItemStack(
            "FLASK_OF_KNOWLEDGE", Material.GLASS_BOTTLE, "The & c Learning Bottle", "", "& r allows you to store your experience in a bottle.", "& 7 requires consumption of & a1 levels");
    public static final SlimefunItemStack FILLED_FLASK_OF_KNOWLEDGE =
            new SlimefunItemStack("FILLED_FLASK_OF_KNOWLEDGE", Material.EXPERIENCE_BOTTLE, "The bottle of & a learning");

    /*		Backpacks		*/
    public static final SlimefunItemStack BACKPACK_SMALL = new SlimefunItemStack(
            "SMALL_BACKPACK",
            HeadTexture.BACKPACK,
            "& e Small backpacks",
            "",
            "& 7 Size: & e9",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_MEDIUM = new SlimefunItemStack(
            "MEDIUM_BACKPACK",
            HeadTexture.BACKPACK,
            "& e Normal backpack",
            "",
            "& 7 Size: & e18",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_LARGE = new SlimefunItemStack(
            "LARGE_BACKPACK",
            HeadTexture.BACKPACK,
            "& e Medium backpack",
            "",
            "& 7 Size: & e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack WOVEN_BACKPACK = new SlimefunItemStack(
            "WOVEN_BACKPACK",
            HeadTexture.BACKPACK,
            "& e Weaving backpacks",
            "",
            "& 7 Size: & e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack GILDED_BACKPACK = new SlimefunItemStack(
            "GILDED_BACKPACK",
            HeadTexture.BACKPACK,
            "& e-plated backpacks",
            "",
            "& 7 Size: & e45",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RADIANT_BACKPACK = new SlimefunItemStack(
            "RADIANT_BACKPACK",
            HeadTexture.BACKPACK,
            "& e-golding backpacks",
            "",
            "& 7 Size: & e54 (Big Box)",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BOUND_BACKPACK = new SlimefunItemStack(
            "BOUND_BACKPACK",
            HeadTexture.ENDER_BACKPACK,
            "& c Soul tied backpacks",
            "",
            "& 7 Size: & e36",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack COOLER = new SlimefunItemStack(
            "COOLER",
            HeadTexture.COOLER,
            "& b Small freezer",
            "& r can store juice and ice sand",
            "&r when the little freezer was in your column",
            "When you're hungry, you'll automatically consume the food inside.",
            "",
            "& 7 Size: & e27",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RESTORED_BACKPACK = new SlimefunItemStack(
            "RESTORED_BACKPACK",
            HeadTexture.RESTORED_BACKPACK,
            "& e backpacker",
            "",
            "& 7 Retrieve the items you lost in your backpack",
            PlayerBackpack.LORE_OWNER,
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /*		 Jetpacks		*/
    public static final SlimefunItemStack DURALUMIN_JETPACK = new SlimefunItemStack(
            "DURALUMIN_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "& 9 Power Jet Pack & 7- & eI",
            "",
            LoreBuilder.material("Hard aluminium"),
            LoreBuilder.powerCharged(0, 20),
            "& 8\u21E8 & 7 Push: &c0.35",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETPACK = new SlimefunItemStack(
            "SOLDER_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "& 9 Power Jet Pack & 7- & eII",
            "",
            LoreBuilder.material("Welding."),
            LoreBuilder.powerCharged(0, 30),
            "& 8\u21E8 & 7 Push: &c0.4",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETPACK = new SlimefunItemStack(
            "BILLON_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "& 9 Power Jet Pack & 7- & eIII",
            "",
            LoreBuilder.material("Silver copper alloy."),
            LoreBuilder.powerCharged(0, 45),
            "& 8\u21E8 & 7 Push: &c0.45",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETPACK = new SlimefunItemStack(
            "STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "& 9 Power Jet Pack & 7- & eIV",
            "",
            LoreBuilder.material("Steel"),
            LoreBuilder.powerCharged(0, 60),
            "& 8\u21E8 & 7 Push: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETPACK = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "& 9 Power Jet Pack & 7- & eV",
            "",
            LoreBuilder.material("Damascus steel"),
            LoreBuilder.powerCharged(0, 75),
            "& 8\u21E8 & 7 Push: &c0.55",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETPACK = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.SILVER,
            "& 9 Power Jet Pack & 7- & eVI",
            "",
            LoreBuilder.material("Enhanced Alloys"),
            LoreBuilder.powerCharged(0, 100),
            "& 8\u21E8 & 7 Push: & c0.6",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETPACK = new SlimefunItemStack(
            "CARBONADO_JETPACK",
            Material.LEATHER_CHESTPLATE,
            Color.BLACK,
            "& 9 Power Jet Pack & 7- & eVII",
            "",
            LoreBuilder.material("Black diamonds."),
            LoreBuilder.powerCharged(0, 150),
            "& 8\u21E8 & 7 Push: &c0.7",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETPACK = new SlimefunItemStack(
            "ARMORED_JETPACK",
            Material.IRON_CHESTPLATE,
            "& 9 Armoured jet backpacks",
            LoreBuilder.material("Steel"),
            "",
            LoreBuilder.powerCharged(0, 50),
            "& 8\u21E8 & 7 Push: &c0.5",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Jetboots		*/
    public static final SlimefunItemStack DURALUMIN_JETBOOTS = new SlimefunItemStack(
            "DURALUMIN_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "& 9 Jet Boots & 7- & eI",
            "",
            LoreBuilder.material("Hard aluminium"),
            LoreBuilder.powerCharged(0, 20),
            "& 8\u21E8 & 7 Speed: & a0.35",
            "& 8\u21E8 & 7 Accuracy: & c 50%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETBOOTS = new SlimefunItemStack(
            "SOLDER_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "& 9 Jet Boots & 7- & eII",
            "",
            LoreBuilder.material("Welding."),
            LoreBuilder.powerCharged(0, 30),
            "& 8\u21E8 & 7 Speed: & a0.4",
            "& 8\u21E8 & 7 Accuracy: & 660%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETBOOTS = new SlimefunItemStack(
            "BILLON_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "& 9 Jet Boots & 7- & eIII",
            "",
            LoreBuilder.material("Silver copper alloy."),
            LoreBuilder.powerCharged(0, 40),
            "& 8\u21E8 & 7 Speed: & a0.45",
            "& 8\u21E8 & 7 Accuracy: & 665%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETBOOTS = new SlimefunItemStack(
            "STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "& 9 Jet Boots & 7- & eIV",
            "",
            LoreBuilder.material("Steel"),
            LoreBuilder.powerCharged(0, 50),
            "& 8\u21E8 & 7 Speed: & a0.5",
            "& 8\u21E8 & 7 Accuracy: & e 70%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETBOOTS = new SlimefunItemStack(
            "DAMASCUS_STEEL_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "& 9 Jet Boots & 7- & eV",
            "",
            LoreBuilder.material("Damascus steel"),
            LoreBuilder.powerCharged(0, 75),
            "& 8\u21E8 & 7 Speed: & a0.55",
            "& 8\u21E8 & 7 Accuracy: & a75%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETBOOTS = new SlimefunItemStack(
            "REINFORCED_ALLOY_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.SILVER,
            "& 9 Jet Boots & 7- & eVI",
            "",
            LoreBuilder.material("Enhanced Alloys"),
            LoreBuilder.powerCharged(0, 100),
            "& 8\u21E8 & 7 Speed: & a0.6",
            "& 8\u21E8 & 7 Accuracy: & c80%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETBOOTS = new SlimefunItemStack(
            "CARBONADO_JETBOOTS",
            Material.LEATHER_BOOTS,
            Color.BLACK,
            "& 9 Jet Boots & 7- & eVII",
            "",
            LoreBuilder.material("Black diamonds."),
            LoreBuilder.powerCharged(0, 125),
            "& 8\u21E8 & 7 Speed: & a0.7",
            "& 8\u21E8 & 7 Accuracy: & c99.9%",
            "",
            LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETBOOTS = new SlimefunItemStack(
            "ARMORED_JETBOOTS",
            Material.IRON_BOOTS,
            "& 9 Armoured jet boots",
            "",
            LoreBuilder.material("Steel"),
            LoreBuilder.powerCharged(0, 50),
            "& 8\u21E8 & 7 Speed: & a0.45",
            "& 8\u21E8 & 7 Accuracy: & e 70%",
            "",
            LoreBuilder.CROUCH_TO_USE);

    /*		 Multi Tools		*/
    public static final SlimefunItemStack DURALUMIN_MULTI_TOOL = new SlimefunItemStack(
            "DURALUMIN_MULTI_TOOL",
            Material.SHEARS,
            "& 9 Multifunctional Tools & 7- & eI",
            "",
            LoreBuilder.material("Hard aluminium"),
            LoreBuilder.powerCharged(0, 20),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "& 7 Press & eShift+Right & 7 to change mode");
    public static final SlimefunItemStack SOLDER_MULTI_TOOL = new SlimefunItemStack(
            "SOLDER_MULTI_TOOL",
            Material.SHEARS,
            "& 9 Multifunctional Tools & 7- & eII",
            "",
            LoreBuilder.material("Welding."),
            LoreBuilder.powerCharged(0, 30),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "& 7 Press & eShift+Right & 7 to change mode");
    public static final SlimefunItemStack BILLON_MULTI_TOOL = new SlimefunItemStack(
            "BILLON_MULTI_TOOL",
            Material.SHEARS,
            "& 9 Multifunctional Tools & 7- & eIII",
            "",
            LoreBuilder.material("Silver copper alloy."),
            LoreBuilder.powerCharged(0, 40),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "& 7 Press & eShift+Right & 7 to change mode");
    public static final SlimefunItemStack STEEL_MULTI_TOOL = new SlimefunItemStack(
            "STEEL_MULTI_TOOL",
            Material.SHEARS,
            "& 9 Multifunctional Tools & 7- & eIV",
            "",
            LoreBuilder.material("Steel"),
            LoreBuilder.powerCharged(0, 50),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "& 7 Press & eShift+Right & 7 to change mode");
    public static final SlimefunItemStack DAMASCUS_STEEL_MULTI_TOOL = new SlimefunItemStack(
            "DAMASCUS_STEEL_MULTI_TOOL",
            Material.SHEARS,
            "& 9 Multifunctional Tools & 7- & eV",
            "",
            LoreBuilder.material("Damascus steel"),
            LoreBuilder.powerCharged(0, 60),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "& 7 Press & eShift+Right & 7 to change mode");
    public static final SlimefunItemStack REINFORCED_ALLOY_MULTI_TOOL = new SlimefunItemStack(
            "REINFORCED_ALLOY_MULTI_TOOL",
            Material.SHEARS,
            "& 9 Multifunctional Tools & 7- & eVI",
            "",
            LoreBuilder.material("Enhanced Alloys"),
            LoreBuilder.powerCharged(0, 75),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "& 7 Press & eShift+Right & 7 to change mode");
    public static final SlimefunItemStack CARBONADO_MULTI_TOOL = new SlimefunItemStack(
            "CARBONADO_MULTI_TOOL",
            Material.SHEARS,
            "& 9 Multifunctional Tools & 7- & eVII",
            "",
            LoreBuilder.material("Black diamonds."),
            LoreBuilder.powerCharged(0, 100),
            "",
            LoreBuilder.RIGHT_CLICK_TO_USE,
            "& 7 Press & eShift+Right & 7 to change mode");

    static {
        ItemMeta duralumin = DURALUMIN_MULTI_TOOL.getItemMeta();
        duralumin.setUnbreakable(true);
        DURALUMIN_MULTI_TOOL.setItemMeta(duralumin);

        ItemMeta solder = SOLDER_MULTI_TOOL.getItemMeta();
        solder.setUnbreakable(true);
        SOLDER_MULTI_TOOL.setItemMeta(solder);

        ItemMeta billon = BILLON_MULTI_TOOL.getItemMeta();
        billon.setUnbreakable(true);
        BILLON_MULTI_TOOL.setItemMeta(billon);

        ItemMeta steel = STEEL_MULTI_TOOL.getItemMeta();
        steel.setUnbreakable(true);
        STEEL_MULTI_TOOL.setItemMeta(steel);

        ItemMeta damascus = DAMASCUS_STEEL_MULTI_TOOL.getItemMeta();
        damascus.setUnbreakable(true);
        DAMASCUS_STEEL_MULTI_TOOL.setItemMeta(damascus);

        ItemMeta reinforced = REINFORCED_ALLOY_MULTI_TOOL.getItemMeta();
        reinforced.setUnbreakable(true);
        REINFORCED_ALLOY_MULTI_TOOL.setItemMeta(reinforced);

        ItemMeta carbonado = CARBONADO_MULTI_TOOL.getItemMeta();
        carbonado.setUnbreakable(true);
        CARBONADO_MULTI_TOOL.setItemMeta(carbonado);
    }

    /*		 Food 		*/
    public static final SlimefunItemStack FORTUNE_COOKIE =
            new SlimefunItemStack("FORTUNE_COOKIE", Material.COOKIE, "♪ 6 fortune cookies ♪", "", "& a&o tells you what happens in the future: o");
    public static final SlimefunItemStack DIET_COOKIE =
            new SlimefunItemStack("DIET_COOKIE", Material.COOKIE, "& 6 Fat Cookies", "", "♪ A very light cookie ♪");
    public static final SlimefunItemStack MAGIC_SUGAR =
            new SlimefunItemStack("MAGIC_SUGAR", Material.SUGAR, "& 6 Magic Sugar", "", "& a & o feel the power of Hermes!");
    public static final SlimefunItemStack MONSTER_JERKY =
            new SlimefunItemStack("MONSTER_JERKY", Material.ROTTEN_FLESH, "& 6 Monsters Dry", "", "& a & & o to fight hunger");
    public static final SlimefunItemStack APPLE_JUICE = new SlimefunItemStack(
            "APPLE_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "& c Apple Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack MELON_JUICE = new SlimefunItemStack(
            "MELON_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "& c Watermelon Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack CARROT_JUICE = new SlimefunItemStack(
            "CARROT_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "& 6 Carrot Juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack PUMPKIN_JUICE = new SlimefunItemStack(
            "PUMPKIN_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "& 6 pumpkin juice",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack SWEET_BERRY_JUICE = new SlimefunItemStack(
            "SWEET_BERRY_JUICE",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "& c-berries",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GLOW_BERRY_JUICE = new SlimefunItemStack(
            "GLOW_BERRY_JUICE",
            Color.ORANGE,
            new PotionEffect(PotionEffectType.SATURATION, 5, 0),
            "♪ 6 luminous juice ♪",
            "",
            LoreBuilder.hunger(3));
    public static final SlimefunItemStack GOLDEN_APPLE_JUICE = new SlimefunItemStack(
            "GOLDEN_APPLE_JUICE", Color.YELLOW, new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0), "& b Gold Apple Juice");

    public static final SlimefunItemStack BEEF_JERKY =
            new SlimefunItemStack("BEEF_JERKY", Material.COOKED_BEEF, "& 6 beef jerky", "", "# R get rid of hunger!");
    public static final SlimefunItemStack PORK_JERKY =
            new SlimefunItemStack("PORK_JERKY", Material.COOKED_PORKCHOP, "& 6 Pork dry", "", "# R get rid of hunger!");
    public static final SlimefunItemStack CHICKEN_JERKY =
            new SlimefunItemStack("CHICKEN_JERKY", Material.COOKED_CHICKEN, "& 6 Chicken Dry", "", "# R get rid of hunger!");
    public static final SlimefunItemStack MUTTON_JERKY =
            new SlimefunItemStack("MUTTON_JERKY", Material.COOKED_MUTTON, "& 6 sheep dry", "", "# R get rid of hunger!");
    public static final SlimefunItemStack RABBIT_JERKY =
            new SlimefunItemStack("RABBIT_JERKY", Material.COOKED_RABBIT, "& 6 rabbits dry", "", "# R get rid of hunger!");
    public static final SlimefunItemStack FISH_JERKY =
            new SlimefunItemStack("FISH_JERKY", Material.COOKED_COD, "& 6 Fish dry", "", "# R get rid of hunger!");
    public static final SlimefunItemStack KELP_COOKIE = new SlimefunItemStack("KELP_COOKIE", Material.COOKIE, "& 2 Sea belt cookies");

    /*		Christmas		*/
    public static final SlimefunItemStack CHRISTMAS_MILK = new SlimefunItemStack(
            "CHRISTMAS_MILK",
            Color.WHITE,
            new PotionEffect(PotionEffectType.SATURATION, 4, 0),
            "Six glass of milk.",
            "",
            LoreBuilder.hunger(2.5));
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_MILK = new SlimefunItemStack(
            "CHRISTMAS_CHOCOLATE_MILK",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 11, 0),
            "& 6 chocolate milk",
            "",
            LoreBuilder.hunger(3.5));
    public static final SlimefunItemStack CHRISTMAS_EGG_NOG = new SlimefunItemStack(
            "CHRISTMAS_EGG_NOG",
            Color.GRAY,
            new PotionEffect(PotionEffectType.SATURATION, 6, 0),
            "&a eggnog",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_APPLE_CIDER = new SlimefunItemStack(
            "CHRISTMAS_APPLE_CIDER",
            Color.RED,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "& c Apple",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_COOKIE =
            new SlimefunItemStack("CHRISTMAS_COOKIE", Material.COOKIE, ChatUtils.christmas("Christmas cookies."));
    public static final SlimefunItemStack CHRISTMAS_FRUIT_CAKE =
            new SlimefunItemStack("CHRISTMAS_FRUIT_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Fruit cake."));
    public static final SlimefunItemStack CHRISTMAS_APPLE_PIE =
            new SlimefunItemStack("CHRISTMAS_APPLE_PIE", Material.PUMPKIN_PIE, "& r Apple pies");
    public static final SlimefunItemStack CHRISTMAS_HOT_CHOCOLATE = new SlimefunItemStack(
            "CHRISTMAS_HOT_CHOCOLATE",
            Color.MAROON,
            new PotionEffect(PotionEffectType.SATURATION, 13, 0),
            "& 6 hot cocoa",
            "",
            LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_CAKE =
            new SlimefunItemStack("CHRISTMAS_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Christmas cake."));
    public static final SlimefunItemStack CHRISTMAS_CARAMEL =
            new SlimefunItemStack("CHRISTMAS_CARAMEL", Material.BRICK, "Caramel & 6");
    public static final SlimefunItemStack CHRISTMAS_CARAMEL_APPLE =
            new SlimefunItemStack("CHRISTMAS_CARAMEL_APPLE", Material.APPLE, "& 6 caramel apples");
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_APPLE =
            new SlimefunItemStack("CHRISTMAS_CHOCOLATE_APPLE", Material.APPLE, "Six chocolate apples.");
    public static final SlimefunItemStack CHRISTMAS_PRESENT = new SlimefunItemStack(
            "CHRISTMAS_PRESENT",
            HeadTexture.CHRISTMAS_PRESENT,
            ChatUtils.christmas("Christmas present."),
            "& 7 from & eTheBusyBiscuit & 7",
            "& 7 To: & e You",
            "",
            LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /*		Easter			*/
    public static final SlimefunItemStack EASTER_EGG = new SlimefunItemStack(
            "EASTER_EGG", HeadTexture.EASTER_EGG, "& r Easter egg", "Happy Easter!", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack EASTER_CARROT_PIE =
            new SlimefunItemStack("CARROT_PIE", Material.PUMPKIN_PIE, "& 6 carrot pies");
    public static final SlimefunItemStack EASTER_APPLE_PIE =
            new SlimefunItemStack("EASTER_APPLE_PIE", Material.PUMPKIN_PIE, "& r Apple pies");

    /*		 Weapons 		*/
    public static final SlimefunItemStack GRANDMAS_WALKING_STICK =
            new SlimefunItemStack("GRANDMAS_WALKING_STICK", Material.STICK, "Grandma 7's cane.");
    public static final SlimefunItemStack GRANDPAS_WALKING_STICK =
            new SlimefunItemStack("GRANDPAS_WALKING_STICK", Material.STICK, "Grandfather's cane.");
    public static final SlimefunItemStack SWORD_OF_BEHEADING = new SlimefunItemStack(
            "SWORD_OF_BEHEADING", Material.IRON_SWORD, "The Sword of Execution", "& 7 decapitation II", "", "& r has a chance to cut off the head of the creature.", "& r (Increased probability of losing a broken skull)");
    public static final SlimefunItemStack BLADE_OF_VAMPIRES = new SlimefunItemStack(
            "BLADE_OF_VAMPIRES", Material.GOLDEN_SWORD, "The & c Vampire Sword.", "♪ 7 lives stolen I", "", "& r had a 45% chance of attack.", "Two points of blood.");
    public static final SlimefunItemStack SEISMIC_AXE = new SlimefunItemStack(
            "SEISMIC_AXE", Material.IRON_AXE, "& a seismological axe", "", "♪ 7 and o make an earthquake... ♪", "", LoreBuilder.RIGHT_CLICK_TO_USE);

    static {
        GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);

        BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 4);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(VersionedEnchantment.SHARPNESS, 2);
    }

    /*		Bows		*/
    public static final SlimefunItemStack EXPLOSIVE_BOW =
            new SlimefunItemStack("EXPLOSIVE_BOW", Material.BOW, "& c Blast bow", "The arrow that & r was shot by the Blast bow will fly to heaven.");
    public static final SlimefunItemStack ICY_BOW =
            new SlimefunItemStack("ICY_BOW", Material.BOW, "The & b ice bow.", "& r was hit by arrows fired from this bow", "& r won't be able to move because of the cold (in 2 seconds)");

    /*		 Tools		*/
    public static final SlimefunItemStack SMELTERS_PICKAXE =
            new SlimefunItemStack("SMELTERS_PICKAXE", Material.DIAMOND_PICKAXE, "& 6 Melting furnaces", "& c&l Automelting", "", "& 9 sometimes works when mining");
    public static final SlimefunItemStack LUMBER_AXE =
            new SlimefunItemStack("LUMBER_AXE", Material.DIAMOND_AXE, "& 6 Logging ax", "&a ando cut down the whole tree...");
    public static final SlimefunItemStack PICKAXE_OF_CONTAINMENT =
            new SlimefunItemStack("PICKAXE_OF_CONTAINMENT", Material.IRON_PICKAXE, "& c. Scrubbing cages", "", "♪ 9 can get a brush cage ♪");
    public static final SlimefunItemStack EXPLOSIVE_PICKAXE = new SlimefunItemStack(
            "EXPLOSIVE_PICKAXE", Material.DIAMOND_PICKAXE, "& e Explosion", "", "&r Explosion Rapid Exploitation of Minerals", "", "& 9 Supported by magic");
    public static final SlimefunItemStack EXPLOSIVE_SHOVEL =
            new SlimefunItemStack("EXPLOSIVE_SHOVEL", Material.DIAMOND_SHOVEL, "& e Exploding shovels", "", "r allows you to dig up a lot of squares in a second.");
    public static final SlimefunItemStack PICKAXE_OF_THE_SEEKER = new SlimefunItemStack(
            "PICKAXE_OF_THE_SEEKER",
            Material.DIAMOND_PICKAXE,
            "& a search for a mine",
            "The minerals around you will be identified when &r is used.",
            "&r but it may be damaged.",
            "",
            "& 7&e right & 7 to find minerals around");
    public static final SlimefunItemStack COBALT_PICKAXE =
            new SlimefunItemStack("COBALT_PICKAXE", Material.IRON_PICKAXE, "& 9 Cobalt");
    public static final SlimefunItemStack PICKAXE_OF_VEIN_MINING = new SlimefunItemStack(
            "PICKAXE_OF_VEIN_MINING", Material.DIAMOND_PICKAXE, "& e Pulse", "", "We're going to dig up this thug.", "The minerals of the whole & r vein...");
    public static final SlimefunItemStack CLIMBING_PICK = new SlimefunItemStack(
            "CLIMBING_PICK", Material.IRON_PICKAXE, "& b. Rock climbing", "", "& f allows you to be right behind", "& f climb to the specified plane.", "The & f's going to climb faster when it's effective.");

    static {
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        COBALT_PICKAXE.addUnsafeEnchantment(VersionedEnchantment.EFFICIENCY, 6);
    }

    /*		 Armor 		*/
    public static final SlimefunItemStack GLOWSTONE_HELMET = new SlimefunItemStack(
            "GLOWSTONE_HELMET", Material.LEATHER_HELMET, Color.YELLOW, "& e & l Stone Helmets", "", "♪ The sun shines like the sun!", "", "& 9+ Night vision");
    public static final SlimefunItemStack GLOWSTONE_CHESTPLATE = new SlimefunItemStack(
            "GLOWSTONE_CHESTPLATE",
            Material.LEATHER_CHESTPLATE,
            Color.YELLOW,
            "& e & l flint bras",
            "",
            "♪ The sun shines like the sun!",
            "",
            "& 9+ Night vision");
    public static final SlimefunItemStack GLOWSTONE_LEGGINGS = new SlimefunItemStack(
            "GLOWSTONE_LEGGINGS",
            Material.LEATHER_LEGGINGS,
            Color.YELLOW,
            "& e & l flint for legs",
            "",
            "♪ The sun shines like the sun!",
            "",
            "& 9+ Night vision");
    public static final SlimefunItemStack GLOWSTONE_BOOTS = new SlimefunItemStack(
            "GLOWSTONE_BOOTS", Material.LEATHER_BOOTS, Color.YELLOW, "& e & l Glove boots", "", "♪ The sun shines like the sun!", "", "& 9+ Night vision");
    public static final SlimefunItemStack RAINBOW_LEATHER =
            new SlimefunItemStack("RAINBOW_LEATHER", Material.RABBIT_HIDE, Color.FUCHSIA, "& d Rainbow leather", "", "& f for synthetic rainbow equipment");
    public static final SlimefunItemStack RAINBOW_HELMET = new SlimefunItemStack(
            "RAINBOW_HELMET", Material.LEATHER_HELMET, Color.FUCHSIA, "& d&l Rainbow helmet", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CHESTPLATE = new SlimefunItemStack(
            "RAINBOW_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.FUCHSIA, "& d&l Rainbow bra", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_LEGGINGS = new SlimefunItemStack(
            "RAINBOW_LEGGINGS", Material.LEATHER_LEGGINGS, Color.FUCHSIA, "& d&l Rainbow leg protection", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_BOOTS = new SlimefunItemStack(
            "RAINBOW_BOOTS", Material.LEATHER_BOOTS, Color.FUCHSIA, "& d&l Rainbow boots", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack ENDER_HELMET = new SlimefunItemStack(
            "ENDER_HELMET", Material.LEATHER_HELMET, Color.fromRGB(28, 25, 112), "& 5 & l Shadow Helmet", "", "& a&o move at will");
    public static final SlimefunItemStack ENDER_CHESTPLATE = new SlimefunItemStack(
            "ENDER_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.fromRGB(28, 25, 112), "& 5-and-l-end chest armor", "", "& a&o move at will");
    public static final SlimefunItemStack ENDER_LEGGINGS = new SlimefunItemStack(
            "ENDER_LEGGINGS", Material.LEATHER_LEGGINGS, Color.fromRGB(28, 25, 112), "& 5 & l Surviving legs", "", "& a&o move at will");
    public static final SlimefunItemStack ENDER_BOOTS = new SlimefunItemStack(
            "ENDER_BOOTS",
            Material.LEATHER_BOOTS,
            Color.fromRGB(28, 25, 112),
            "& 5-and-l-end boots",
            "",
            "& a&o move at will",
            "",
            "& 9+ Unharmed use of the Oracle pearls");

    public static final SlimefunItemStack SLIME_HELMET =
            new SlimefunItemStack("SLIME_HELMET", Material.LEATHER_HELMET, Color.LIME, "& a & l Slem helmet", "", "& a & o feel flexible");
    public static final SlimefunItemStack SLIME_CHESTPLATE = new SlimefunItemStack(
            "SLIME_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.LIME, "& a & l Slem chest armor", "", "& a & o feel flexible");
    public static final SlimefunItemStack SLIME_LEGGINGS = new SlimefunItemStack(
            "SLIME_LEGGINGS", Material.LEATHER_LEGGINGS, Color.LIME, "& a & l Slam for legs", "", "& a & o feel flexible", "", "& 9+ Speed");
    public static final SlimefunItemStack SLIME_BOOTS = new SlimefunItemStack(
            "SLIME_BOOTS",
            Material.LEATHER_BOOTS,
            Color.LIME,
            "& a & l Shrem boots",
            "",
            "& a & o feel flexible",
            "",
            "& 9+ Jump Up",
            "& 9+ Falling injury relief");

    public static final SlimefunItemStack CACTUS_HELMET =
            new SlimefunItemStack("CACTUS_HELMET", Material.LEATHER_HELMET, Color.GREEN, "& 2 cactus helmets");
    public static final SlimefunItemStack CACTUS_CHESTPLATE =
            new SlimefunItemStack("CACTUS_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.GREEN, "& Cactus 2 chest armor");
    public static final SlimefunItemStack CACTUS_LEGGINGS =
            new SlimefunItemStack("CACTUS_LEGGINGS", Material.LEATHER_LEGGINGS, Color.GREEN, "& 2 Cactus for Legs");
    public static final SlimefunItemStack CACTUS_BOOTS =
            new SlimefunItemStack("CACTUS_BOOTS", Material.LEATHER_BOOTS, Color.GREEN, "& 2 Cactus boots");

    public static final SlimefunItemStack DAMASCUS_STEEL_HELMET =
            new SlimefunItemStack("DAMASCUS_STEEL_HELMET", Material.IRON_HELMET, "& 7 Damascus Steel Helmets");
    public static final SlimefunItemStack DAMASCUS_STEEL_CHESTPLATE =
            new SlimefunItemStack("DAMASCUS_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "& 7 Damascus steel bras");
    public static final SlimefunItemStack DAMASCUS_STEEL_LEGGINGS =
            new SlimefunItemStack("DAMASCUS_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "& 7 Damascus steel for legs");
    public static final SlimefunItemStack DAMASCUS_STEEL_BOOTS =
            new SlimefunItemStack("DAMASCUS_STEEL_BOOTS", Material.IRON_BOOTS, "& 7 Damascus steel boots");

    public static final SlimefunItemStack REINFORCED_ALLOY_HELMET =
            new SlimefunItemStack("REINFORCED_ALLOY_HELMET", Material.IRON_HELMET, "& b Strengthen alloy helmets");
    public static final SlimefunItemStack REINFORCED_ALLOY_CHESTPLATE =
            new SlimefunItemStack("REINFORCED_ALLOY_CHESTPLATE", Material.IRON_CHESTPLATE, "& b. Enhanced alloy bras");
    public static final SlimefunItemStack REINFORCED_ALLOY_LEGGINGS =
            new SlimefunItemStack("REINFORCED_ALLOY_LEGGINGS", Material.IRON_LEGGINGS, "& b. Enhanced leg protection");
    public static final SlimefunItemStack REINFORCED_ALLOY_BOOTS =
            new SlimefunItemStack("REINFORCED_ALLOY_BOOTS", Material.IRON_BOOTS, "& b. Enhanced alloy boots");

    private static final List<String> hazmatLore = new ArrayList<>();

    static {
        hazmatLore.add("");
        hazmatLore.add(ChatColor.GOLD + "Full set of effects:");
        hazmatLore.add(ChatColor.YELLOW + "- Immune radiation damage.");
        hazmatLore.add(ChatColor.YELLOW + "- immune bee bites.");
    }

    public static final SlimefunItemStack SCUBA_HELMET =
            new SlimefunItemStack("SCUBA_HELMET", Material.LEATHER_HELMET, Color.ORANGE, "& c Dive helmets", "", "7 allows you to breathe underwater.");
    public static final SlimefunItemStack HAZMAT_CHESTPLATE = new SlimefunItemStack(
            "HAZMAT_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.ORANGE, "& c Chemical protection suit", "", "7 allows you to walk in flames and magma.");
    public static final SlimefunItemStack HAZMAT_LEGGINGS = new SlimefunItemStack(
            "HAZMAT_LEGGINGS", Material.LEATHER_LEGGINGS, Color.ORANGE, "& c. Chemproof legs", hazmatLore.toArray(new String[0]));
    public static final SlimefunItemStack HAZMAT_BOOTS = new SlimefunItemStack(
            "RUBBER_BOOTS", Material.LEATHER_BOOTS, Color.BLACK, "&c chemical boots", hazmatLore.toArray(new String[0]));

    static {
        ItemMeta helmetMeta = SCUBA_HELMET.getItemMeta();
        List<String> helmetLore = helmetMeta.getLore();
        helmetLore.addAll(hazmatLore);
        helmetMeta.setLore(helmetLore);
        SCUBA_HELMET.setItemMeta(helmetMeta);

        ItemMeta chestplateMeta = HAZMAT_CHESTPLATE.getItemMeta();
        List<String> chestplateLore = chestplateMeta.getLore();
        chestplateLore.addAll(hazmatLore);
        chestplateMeta.setLore(chestplateLore);
        HAZMAT_CHESTPLATE.setItemMeta(chestplateMeta);
    }

    public static final SlimefunItemStack GILDED_IRON_HELMET =
            new SlimefunItemStack("GILDED_IRON_HELMET", Material.GOLDEN_HELMET, "& 6 gold-plated iron helmets");
    public static final SlimefunItemStack GILDED_IRON_CHESTPLATE =
            new SlimefunItemStack("GILDED_IRON_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "& 6 gold-plated bras");
    public static final SlimefunItemStack GILDED_IRON_LEGGINGS =
            new SlimefunItemStack("GILDED_IRON_LEGGINGS", Material.GOLDEN_LEGGINGS, "& 6 gold-plated iron for the leg");
    public static final SlimefunItemStack GILDED_IRON_BOOTS =
            new SlimefunItemStack("GILDED_IRON_BOOTS", Material.GOLDEN_BOOTS, "& 6 gold-plated boots");

    public static final SlimefunItemStack GOLDEN_HELMET_12K =
            new SlimefunItemStack("GOLD_12K_HELMET", Material.GOLDEN_HELMET, "& 6 Golden Helmets", "& 912 carats");
    public static final SlimefunItemStack GOLDEN_CHESTPLATE_12K =
            new SlimefunItemStack("GOLD_12K_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "& 6 gold bras", "& 912 carats");
    public static final SlimefunItemStack GOLDEN_LEGGINGS_12K =
            new SlimefunItemStack("GOLD_12K_LEGGINGS", Material.GOLDEN_LEGGINGS, "& 6 leg protection", "& 912 carats");
    public static final SlimefunItemStack GOLDEN_BOOTS_12K =
            new SlimefunItemStack("GOLD_12K_BOOTS", Material.GOLDEN_BOOTS, "& 6 gold boots", "& 912 carats");

    public static final SlimefunItemStack SLIME_HELMET_STEEL =
            new SlimefunItemStack("SLIME_STEEL_HELMET", Material.IRON_HELMET, "& a & l Slem helmet", "& 7/o enhanced", "", "& a & o feel flexible");
    public static final SlimefunItemStack SLIME_CHESTPLATE_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "& a & l Slem chest armor", "& 7/o enhanced", "", "& a & o feel flexible");
    public static final SlimefunItemStack SLIME_LEGGINGS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "& a & l Slam for legs", "& 7/o enhanced", "", "& a & o feel flexible", "", "& 9+ Speed");
    public static final SlimefunItemStack SLIME_BOOTS_STEEL = new SlimefunItemStack(
            "SLIME_STEEL_BOOTS",
            Material.IRON_BOOTS,
            "& a & l Shrem boots",
            "& 7/o enhanced",
            "",
            "& a & o feel flexible",
            "",
            "& 9+ Jump Up",
            "& 9+ Falling injury relief");

    public static final SlimefunItemStack BOOTS_OF_THE_STOMPER = new SlimefunItemStack(
            "BOOTS_OF_THE_STOMPER",
            Material.LEATHER_BOOTS,
            Color.AQUA,
            "Boots of the & b tramp",
            "",
            "♪ 9 All the falls you've suffered ♪",
            "& 9 will be transferred to nearby organisms/players",
            "",
            "& 9+ Falling injury relief");

    public static final SlimefunItemStack BEE_HELMET =
            new SlimefunItemStack("BEE_HELMET", Material.GOLDEN_HELMET, "& e & l Bee Helmets", " ", "♪ F buzz ♪");
    public static final SlimefunItemStack BEE_WINGS = new SlimefunItemStack(
            "BEE_WINGS", Material.ELYTRA, "& e & l Beehives", " ", "♪ F buzz ♪", " ", "& 9 As it approaches the ground", "& 9 will enable slow down mode", " ");
    public static final SlimefunItemStack BEE_LEGGINGS =
            new SlimefunItemStack("BEE_LEGGINGS", Material.GOLDEN_LEGGINGS, "& e & l Bee for Legs", " ", "♪ F buzz ♪");
    public static final SlimefunItemStack BEE_BOOTS = new SlimefunItemStack(
            "BEE_BOOTS",
            Material.GOLDEN_BOOTS,
            "& e & l Bee boots",
            "♪ F buzz ♪",
            "",
            "When & e ando take off again, it's absolutely fine.",
            "",
            "& 9+ Jump Up",
            "& 9+ Falling injury relief");

    static {
        Map<Enchantment, Integer> cactusEnchs = new HashMap<>();
        cactusEnchs.put(Enchantment.THORNS, 3);
        cactusEnchs.put(VersionedEnchantment.UNBREAKING, 6);

        CACTUS_HELMET.addUnsafeEnchantments(cactusEnchs);
        CACTUS_CHESTPLATE.addUnsafeEnchantments(cactusEnchs);
        CACTUS_LEGGINGS.addUnsafeEnchantments(cactusEnchs);
        CACTUS_BOOTS.addUnsafeEnchantments(cactusEnchs);

        Map<Enchantment, Integer> damascusEnchs = new HashMap<>();
        damascusEnchs.put(VersionedEnchantment.UNBREAKING, 5);
        damascusEnchs.put(VersionedEnchantment.PROTECTION, 5);

        DAMASCUS_STEEL_HELMET.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_CHESTPLATE.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_LEGGINGS.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_BOOTS.addUnsafeEnchantments(damascusEnchs);

        Map<Enchantment, Integer> reinforcedEnchs = new HashMap<>();
        reinforcedEnchs.put(VersionedEnchantment.UNBREAKING, 9);
        reinforcedEnchs.put(VersionedEnchantment.PROTECTION, 9);

        REINFORCED_ALLOY_HELMET.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_CHESTPLATE.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_LEGGINGS.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_BOOTS.addUnsafeEnchantments(reinforcedEnchs);

        Map<Enchantment, Integer> gildedEnchs = new HashMap<>();
        gildedEnchs.put(VersionedEnchantment.UNBREAKING, 6);
        gildedEnchs.put(VersionedEnchantment.PROTECTION, 8);

        GILDED_IRON_HELMET.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_CHESTPLATE.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_LEGGINGS.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_BOOTS.addUnsafeEnchantments(gildedEnchs);

        GOLDEN_HELMET_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_CHESTPLATE_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_LEGGINGS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);
        GOLDEN_BOOTS_12K.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 10);

        Map<Enchantment, Integer> slimeEnchs = new HashMap<>();
        slimeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        slimeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        SLIME_HELMET_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_CHESTPLATE_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_LEGGINGS_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_BOOTS_STEEL.addUnsafeEnchantments(slimeEnchs);

        Map<Enchantment, Integer> beeEnchs = new HashMap<>();
        beeEnchs.put(VersionedEnchantment.UNBREAKING, 4);
        beeEnchs.put(VersionedEnchantment.PROTECTION, 2);

        BEE_HELMET.addUnsafeEnchantments(beeEnchs);
        BEE_WINGS.addUnsafeEnchantments(beeEnchs);
        BEE_LEGGINGS.addUnsafeEnchantments(beeEnchs);
        BEE_BOOTS.addUnsafeEnchantments(beeEnchs);
    }

    /*		 Misc 		*/
    public static final SlimefunItemStack MAGIC_LUMP_1 =
            new SlimefunItemStack("MAGIC_LUMP_1", Material.GOLD_NUGGET, "& 6 Magic Crystals & 7- & eI", "", "& c&o Level: I");
    public static final SlimefunItemStack MAGIC_LUMP_2 =
            new SlimefunItemStack("MAGIC_LUMP_2", Material.GOLD_NUGGET, "& 6 Magic Crystals & 7- & eII", "", "& c&o Level: II");
    public static final SlimefunItemStack MAGIC_LUMP_3 =
            new SlimefunItemStack("MAGIC_LUMP_3", Material.GOLD_NUGGET, "& 6 Magic Crystals & 7- & eIII", "", "& c&o Level: III");
    public static final SlimefunItemStack ENDER_LUMP_1 =
            new SlimefunItemStack("ENDER_LUMP_1", Material.GOLD_NUGGET, "& 5 terminal crystals & 7- & eI", "", "& c&o Level: I");
    public static final SlimefunItemStack ENDER_LUMP_2 =
            new SlimefunItemStack("ENDER_LUMP_2", Material.GOLD_NUGGET, "& 5 terminal crystals & 7- & eII", "", "& c&o Level: II");
    public static final SlimefunItemStack ENDER_LUMP_3 =
            new SlimefunItemStack("ENDER_LUMP_3", Material.GOLD_NUGGET, "& 5 terminal crystals & 7- & eIII", "", "& c&o Level: III");
    public static final SlimefunItemStack MAGICAL_BOOK_COVER =
            new SlimefunItemStack("MAGICAL_BOOK_COVER", Material.PAPER, "& 6 Magical Books", "", "& a&o for various magic books");
    public static final SlimefunItemStack MAGICAL_GLASS =
            new SlimefunItemStack("MAGICAL_GLASS", Material.GLASS_PANE, "& 6 Magical Glass", "", "& a&o is used by a variety of magic props");
    public static final SlimefunItemStack SYNTHETIC_SHULKER_SHELL = new SlimefunItemStack(
            "SYNTHETIC_SHULKER_SHELL", Material.SHULKER_SHELL, "& d Artificial submersible", "", "& f can be used for workstation synthesis", "♪ f's like an ordinary suburb. ♪");
    public static final SlimefunItemStack BASIC_CIRCUIT_BOARD =
            new SlimefunItemStack("BASIC_CIRCUIT_BOARD", Material.ACTIVATOR_RAIL, "& b Basic circuit boards");
    public static final SlimefunItemStack ADVANCED_CIRCUIT_BOARD =
            new SlimefunItemStack("ADVANCED_CIRCUIT_BOARD", Material.POWERED_RAIL, "& b Advanced circuit boards");
    public static final SlimefunItemStack WHEAT_FLOUR = new SlimefunItemStack("WHEAT_FLOUR", Material.SUGAR, "& r Wheat powder");
    public static final SlimefunItemStack STEEL_PLATE = new SlimefunItemStack("STEEL_PLATE", Material.PAPER, "& 7&l steel plate");
    public static final SlimefunItemStack BATTERY = new SlimefunItemStack("BATTERY", HeadTexture.BATTERY, "& 6 Batteries");
    public static final SlimefunItemStack CARBON = new SlimefunItemStack("CARBON", HeadTexture.CARBON, "& e Carbon");
    public static final SlimefunItemStack COMPRESSED_CARBON =
            new SlimefunItemStack("COMPRESSED_CARBON", HeadTexture.COMPRESSED_CARBON, "& c Compressed Carbon");
    public static final SlimefunItemStack CARBON_CHUNK =
            new SlimefunItemStack("CARBON_CHUNK", HeadTexture.CARBON, "& 4 Carbon");
    public static final SlimefunItemStack STEEL_THRUSTER =
            new SlimefunItemStack("STEEL_THRUSTER", Material.BUCKET, "& 7&l Steel Propulsion");
    public static final SlimefunItemStack POWER_CRYSTAL =
            new SlimefunItemStack("POWER_CRYSTAL", HeadTexture.POWER_CRYSTAL, "& c&l Energy Crystals");
    public static final SlimefunItemStack CHAIN = new SlimefunItemStack("CHAIN", Material.STRING, "& b chain");
    public static final SlimefunItemStack HOOK = new SlimefunItemStack("HOOK", Material.FLINT, "& b hook");
    public static final SlimefunItemStack SIFTED_ORE = new SlimefunItemStack("SIFTED_ORE", Material.GUNPOWDER, "& 6 sift mines");
    public static final SlimefunItemStack STONE_CHUNK =
            new SlimefunItemStack("STONE_CHUNK", HeadTexture.STONE_CHUNK, "& 6 Stones");
    public static final SlimefunItemStack LAVA_CRYSTAL =
            new SlimefunItemStack("LAVA_CRYSTAL", HeadTexture.LAVA_CRYSTAL, "& 4 magma crystals");
    public static final SlimefunItemStack SALT = new SlimefunItemStack("SALT", Material.SUGAR, "& r salt");
    public static final SlimefunItemStack CHEESE = new SlimefunItemStack("CHEESE", HeadTexture.CHEESE, "& r Cheese");
    public static final SlimefunItemStack BUTTER = new SlimefunItemStack("BUTTER", HeadTexture.BUTTER, "& r butter");
    public static final SlimefunItemStack DUCT_TAPE =
            new SlimefunItemStack("DUCT_TAPE", HeadTexture.DUCT_TAPE, "& 8 Power tape", "", "This can be used by &r in the iron moor.", "& r Rehabilitate Items");
    public static final SlimefunItemStack HEAVY_CREAM =
            new SlimefunItemStack("HEAVY_CREAM", Material.SNOWBALL, "& r Cream");
    public static final SlimefunItemStack CRUSHED_ORE =
            new SlimefunItemStack("CRUSHED_ORE", Material.GUNPOWDER, "& 6 crushed ore");
    public static final SlimefunItemStack PULVERIZED_ORE =
            new SlimefunItemStack("PULVERIZED_ORE", Material.GUNPOWDER, "& 6 powdered ore");
    public static final SlimefunItemStack PURE_ORE_CLUSTER =
            new SlimefunItemStack("PURE_ORE_CLUSTER", Material.GUNPOWDER, "& 6 Pure deposits");
    public static final SlimefunItemStack SMALL_URANIUM = new SlimefunItemStack(
            "SMALL_URANIUM",
            HeadTexture.URANIUM,
            "A small piece of uranium in &c",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack TINY_URANIUM = new SlimefunItemStack(
            "TINY_URANIUM", HeadTexture.URANIUM, "A little bit of & c uranium.", "", LoreBuilder.radioactive(Radioactivity.LOW));

    public static final SlimefunItemStack MAGNET = new SlimefunItemStack("MAGNET", HeadTexture.MAGNET, "& c magnets");
    public static final SlimefunItemStack NECROTIC_SKULL =
            new SlimefunItemStack("NECROTIC_SKULL", HeadTexture.NECROTIC_SKULL, "& c. Bad skull.");
    public static final SlimefunItemStack ESSENCE_OF_AFTERLIFE =
            new SlimefunItemStack("ESSENCE_OF_AFTERLIFE", Material.GUNPOWDER, "& 4 Quality of the afterlife");
    public static final SlimefunItemStack STRANGE_NETHER_GOO = new SlimefunItemStack(
            "STRANGE_NETHER_GOO", Material.PURPLE_DYE, "♪ Five strange bottom slime ♪", "", "& f is a strange substance", "& f can be obtained in exchange for pigs");
    public static final SlimefunItemStack ELECTRO_MAGNET =
            new SlimefunItemStack("ELECTRO_MAGNET", HeadTexture.MAGNET, "& c Electromagnetic");
    public static final SlimefunItemStack HEATING_COIL =
            new SlimefunItemStack("HEATING_COIL", HeadTexture.HEATING_COIL, "& c-plus");
    public static final SlimefunItemStack COOLING_UNIT =
            new SlimefunItemStack("COOLING_UNIT", HeadTexture.COOLING_UNIT, "& b cooling units");
    public static final SlimefunItemStack ELECTRIC_MOTOR =
            new SlimefunItemStack("ELECTRIC_MOTOR", HeadTexture.MOTOR, "& c Electric motors");
    public static final SlimefunItemStack CARGO_MOTOR =
            new SlimefunItemStack("CARGO_MOTOR", HeadTexture.CARGO_MOTOR, "& 3 Cargo motors", "", "Important parts of & 7 freight network-related machinery");
    public static final SlimefunItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new SlimefunItemStack(
            "SCROLL_OF_DIMENSIONAL_TELEPOSITION",
            Material.PAPER,
            "& 6D transmission scrolls",
            "",
            "This & c scroll can be created with a hand.",
            "A temporary black hole in &c",
            "& c transmits all nearby entities to",
            "& c in another dimension",
            "Everything in & c has been reversed.",
            "",
            "& r means, let the entity turn 180 degrees.");
    public static final SlimefunItemStack TOME_OF_KNOWLEDGE_SHARING = new SlimefunItemStack(
            "TOME_OF_KNOWLEDGE_SHARING",
            Material.ENCHANTED_BOOK,
            "& 6 Academies",
            "& 7 Master: & bNone",
            "",
            "& e Right & 7 to bind all your research",
            "",
            "",
            "& e Right & 7 to obtain all previous master's studies");
    public static final SlimefunItemStack HARDENED_GLASS =
            new SlimefunItemStack("HARDENED_GLASS", Material.LIGHT_GRAY_STAINED_GLASS, "& 7 Steeled glass", "", "& r can resist explosion.");
    public static final SlimefunItemStack WITHER_PROOF_OBSIDIAN =
            new SlimefunItemStack("WITHER_PROOF_OBSIDIAN", Material.OBSIDIAN, "♪ 5 Shatter-proof black rock ♪", "", "& r can resist explosions and", "The & r spirit attack.");
    public static final SlimefunItemStack WITHER_PROOF_GLASS = new SlimefunItemStack(
            "WITHER_PROOF_GLASS", Material.PURPLE_STAINED_GLASS, "Shatterproof glass & 5", "", "& r can resist explosions and", "The & r spirit attack.");
    public static final SlimefunItemStack REINFORCED_PLATE =
            new SlimefunItemStack("REINFORCED_PLATE", Material.PAPER, "& 7 Cracks");
    public static final SlimefunItemStack ANCIENT_PEDESTAL =
            new SlimefunItemStack("ANCIENT_PEDESTAL", Material.DISPENSER, "& d Ancient Bases", "", "Part of the ancient altar");
    public static final SlimefunItemStack ANCIENT_ALTAR = new SlimefunItemStack(
            "ANCIENT_ALTAR", Material.ENCHANTING_TABLE, "& d Ancient altars", "", "#5 Build altars in the world #", "& 5 and synthesized with ancient rituals");
    public static final SlimefunItemStack COPPER_WIRE =
            new SlimefunItemStack("COPPER_WIRE", Material.STRING, "& 6 Copper Line", "", "Key components of & 6 electronic accessories");
    public static final SlimefunItemStack CRAFTING_MOTOR =
            new SlimefunItemStack("CRAFTING_MOTOR", HeadTexture.CRAFTING_MOTOR, "& 6 Synthetic motors", "", "Important parts of the & 7 Automated Synth");

    public static final SlimefunItemStack RAINBOW_WOOL =
            new SlimefunItemStack("RAINBOW_WOOL", Material.WHITE_WOOL, "& 5 Rainbow wool", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS =
            new SlimefunItemStack("RAINBOW_GLASS", Material.WHITE_STAINED_GLASS, "& 5 Rainbow Glass", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CLAY =
            new SlimefunItemStack("RAINBOW_CLAY", Material.WHITE_TERRACOTTA, "& 5 Rainbow clay blocks", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE", Material.WHITE_STAINED_GLASS_PANE, "& 5 Rainbow glassboards", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_CONCRETE =
            new SlimefunItemStack("RAINBOW_CONCRETE", Material.WHITE_CONCRETE, "& 5 Rainbow Concrete", "", LoreBuilder.RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA", Material.WHITE_GLAZED_TERRACOTTA, "& 5 Rainbow Ribbon Certava", "", LoreBuilder.RAINBOW);

    private static final String CHRISTMAS = ChatUtils.christmas("< Christmas edition >");

    public static final SlimefunItemStack RAINBOW_WOOL_XMAS =
            new SlimefunItemStack("RAINBOW_WOOL_XMAS", Material.WHITE_WOOL, "& 5 Rainbow wool & 7 (Christmas edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_XMAS =
            new SlimefunItemStack("RAINBOW_GLASS_XMAS", Material.WHITE_STAINED_GLASS, "& 5 Rainbow Glass & 7 (Christmas edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CLAY_XMAS =
            new SlimefunItemStack("RAINBOW_CLAY_XMAS", Material.WHITE_TERRACOTTA, "& 5 Rainbow clay blocks & 7 (Christmas edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_XMAS = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_XMAS", Material.WHITE_STAINED_GLASS_PANE, "& 5 Rainbow Glassboard & 7 (Christmas edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CONCRETE_XMAS =
            new SlimefunItemStack("RAINBOW_CONCRETE_XMAS", Material.WHITE_CONCRETE, "& 5 Rainbow Concrete & 7 (Christmas edition)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_XMAS = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_XMAS", Material.WHITE_GLAZED_TERRACOTTA, "& 5 Rainbow Ribbon & 7 (Christmas edition)", "", CHRISTMAS);

    private static final String VALENTINES_DAY = "&d< Valentine 's Day edition >";

    public static final SlimefunItemStack RAINBOW_WOOL_VALENTINE =
            new SlimefunItemStack("RAINBOW_WOOL_VALENTINE", Material.PINK_WOOL, "& 5 Rainbow wool & 7", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_VALENTINE", Material.PINK_STAINED_GLASS, "& 5 Rainbow Glass & 7 (The Valentine's Day edition)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CLAY_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CLAY_VALENTINE", Material.PINK_TERRACOTTA, "& 5 Rainbow clay blocks & 7 ( Valentine's Day edition)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_VALENTINE", Material.PINK_STAINED_GLASS_PANE, "& 5 Rainbow Glassboard & 7", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CONCRETE_VALENTINE = new SlimefunItemStack(
            "RAINBOW_CONCRETE_VALENTINE", Material.PINK_CONCRETE, "& 5 Rainbow Concrete & 7", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_VALENTINE = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_VALENTINE",
            Material.PINK_GLAZED_TERRACOTTA,
            "& 5 Rainbow Ribbon & 7 (Fest of Valentines)",
            "",
            VALENTINES_DAY);

    private static final String HALLOWEEN = "& 6 < Halloween >";

    public static final SlimefunItemStack RAINBOW_WOOL_HALLOWEEN =
            new SlimefunItemStack("RAINBOW_WOOL_HALLOWEEN", Material.ORANGE_WOOL, "& 5 Rainbow wool & 7 (Hallows Day edition)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_HALLOWEEN", Material.ORANGE_STAINED_GLASS, "& 5 Rainbow Glass & 7 (Hallows Festival)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CLAY_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CLAY_HALLOWEEN", Material.ORANGE_TERRACOTTA, "& 5 Rainbow clay blocks & 7 (Hallow Halloween edition)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLASS_PANE_HALLOWEEN", Material.ORANGE_STAINED_GLASS_PANE, "& 5 Rainbow Glassboard & 7 (Hallows Festival)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CONCRETE_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_CONCRETE_HALLOWEEN", Material.ORANGE_CONCRETE, "& 5 Rainbow Concrete & 7 (Hallows Festival)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN = new SlimefunItemStack(
            "RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN",
            Material.ORANGE_GLAZED_TERRACOTTA,
            "& 5 Rainbow Ribbon & 7 (Hallows Festival)",
            "",
            HALLOWEEN);

    /*		锭 		*/
    public static final SlimefunItemStack COPPER_INGOT = new SlimefunItemStack("COPPER_INGOT", Material.BRICK, "& bronze ingots");
    public static final SlimefunItemStack TIN_INGOT = new SlimefunItemStack("TIN_INGOT", Material.IRON_INGOT, "& b. Tinyon");
    public static final SlimefunItemStack SILVER_INGOT =
            new SlimefunItemStack("SILVER_INGOT", Material.IRON_INGOT, "& b. Silver Yoon");
    public static final SlimefunItemStack ALUMINUM_INGOT =
            new SlimefunItemStack("ALUMINUM_INGOT", Material.IRON_INGOT, "& b. Aluminium");
    public static final SlimefunItemStack LEAD_INGOT = new SlimefunItemStack("LEAD_INGOT", Material.IRON_INGOT, "& b. Lead sodium");
    public static final SlimefunItemStack ZINC_INGOT = new SlimefunItemStack("ZINC_INGOT", Material.IRON_INGOT, "& b. Zinc");
    public static final SlimefunItemStack MAGNESIUM_INGOT =
            new SlimefunItemStack("MAGNESIUM_INGOT", Material.IRON_INGOT, "& b)");

    /*		Alloy (Carbon + Iron)	*/
    public static final SlimefunItemStack STEEL_INGOT =
            new SlimefunItemStack("STEEL_INGOT", Material.IRON_INGOT, "& b steel ingots");
    /*		Alloy (Copper + Tin)	*/
    public static final SlimefunItemStack BRONZE_INGOT = new SlimefunItemStack("BRONZE_INGOT", Material.BRICK, "& b. bronze");
    /*		Alloy (Copper + Aluminum)	*/
    public static final SlimefunItemStack DURALUMIN_INGOT =
            new SlimefunItemStack("DURALUMIN_INGOT", Material.IRON_INGOT, "& b. Aluminium");
    /*		Alloy (Copper + Silver)	*/
    public static final SlimefunItemStack BILLON_INGOT =
            new SlimefunItemStack("BILLON_INGOT", Material.IRON_INGOT, "& b. Silver copper alloy");
    /*		Alloy (Copper + Zinc)	*/
    public static final SlimefunItemStack BRASS_INGOT =
            new SlimefunItemStack("BRASS_INGOT", Material.GOLD_INGOT, "& b. bronze");
    /*		Alloy (Aluminum + Brass)	*/
    public static final SlimefunItemStack ALUMINUM_BRASS_INGOT =
            new SlimefunItemStack("ALUMINUM_BRASS_INGOT", Material.GOLD_INGOT, "& b. Aluminium bronze");
    /*		Alloy (Aluminum + Bronze)	*/
    public static final SlimefunItemStack ALUMINUM_BRONZE_INGOT =
            new SlimefunItemStack("ALUMINUM_BRONZE_INGOT", Material.GOLD_INGOT, "& b. Aluminium bronze");
    /*		Alloy (Gold + Silver + Copper)	*/
    public static final SlimefunItemStack CORINTHIAN_BRONZE_INGOT =
            new SlimefunItemStack("CORINTHIAN_BRONZE_INGOT", Material.GOLD_INGOT, "& b. Corinth bronze");
    /*		Alloy (Lead + Tin)	*/
    public static final SlimefunItemStack SOLDER_INGOT =
            new SlimefunItemStack("SOLDER_INGOT", Material.IRON_INGOT, "& brysotine");
    /*		Alloy (Steel + Iron + Carbon)	*/
    public static final SlimefunItemStack DAMASCUS_STEEL_INGOT =
            new SlimefunItemStack("DAMASCUS_STEEL_INGOT", Material.IRON_INGOT, "& b. Damascus steel ingots");
    /*		Alloy (大马士革钢 + 硬铝 + Compressed Carbon + Aluminium Bronze)	*/
    public static final SlimefunItemStack HARDENED_METAL_INGOT =
            new SlimefunItemStack("HARDENED_METAL_INGOT", Material.IRON_INGOT, "& b&l hardened metal");
    /*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + 大马士革钢)	*/
    public static final SlimefunItemStack REINFORCED_ALLOY_INGOT =
            new SlimefunItemStack("REINFORCED_ALLOY_INGOT", Material.IRON_INGOT, "& b & l Enhanced alloy sun");
    /*		Alloy (Iron + Silicon)		*/
    public static final SlimefunItemStack FERROSILICON =
            new SlimefunItemStack("FERROSILICON", Material.IRON_INGOT, "& b silicon");
    /*		Alloy (Iron + Gold)			*/
    public static final SlimefunItemStack GILDED_IRON =
            new SlimefunItemStack("GILDED_IRON", Material.GOLD_INGOT, "& 6-and-l-plated golden ingots");
    /*		Alloy (Redstone + Ferrosilicon)	*/
    public static final SlimefunItemStack REDSTONE_ALLOY =
            new SlimefunItemStack("REDSTONE_ALLOY", Material.BRICK, "& c. Redstone alloyed sun");
    /*		Alloy (Iron + Copper)		*/
    public static final SlimefunItemStack NICKEL_INGOT =
            new SlimefunItemStack("NICKEL_INGOT", Material.IRON_INGOT, "& b. Nickel");
    /*		Alloy (Nickel + Iron + Copper)		*/
    public static final SlimefunItemStack COBALT_INGOT =
            new SlimefunItemStack("COBALT_INGOT", Material.IRON_INGOT, "& 9 Cobalt ant");

    /*		Gold		*/
    public static final SlimefunItemStack GOLD_4K =
            new SlimefunItemStack("GOLD_4K", Material.GOLD_INGOT, "& r Jinyan & 7 (4 carats)");
    public static final SlimefunItemStack GOLD_6K =
            new SlimefunItemStack("GOLD_6K", Material.GOLD_INGOT, "& r Jinyan & 7 (6 carats)");
    public static final SlimefunItemStack GOLD_8K =
            new SlimefunItemStack("GOLD_8K", Material.GOLD_INGOT, "& r Jinyan & 7 (8 carats)");
    public static final SlimefunItemStack GOLD_10K =
            new SlimefunItemStack("GOLD_10K", Material.GOLD_INGOT, "& r Jinyan & 7 (10 carats)");
    public static final SlimefunItemStack GOLD_12K =
            new SlimefunItemStack("GOLD_12K", Material.GOLD_INGOT, "& r Jinyan & 7 (12 carats)");
    public static final SlimefunItemStack GOLD_14K =
            new SlimefunItemStack("GOLD_14K", Material.GOLD_INGOT, "& r Jinyan & 7 (14 carats)");
    public static final SlimefunItemStack GOLD_16K =
            new SlimefunItemStack("GOLD_16K", Material.GOLD_INGOT, "& r Jinyan & 7 (16 carats)");
    public static final SlimefunItemStack GOLD_18K =
            new SlimefunItemStack("GOLD_18K", Material.GOLD_INGOT, "& r Jinyan & 7 (18 carats)");
    public static final SlimefunItemStack GOLD_20K =
            new SlimefunItemStack("GOLD_20K", Material.GOLD_INGOT, "& r Jinyan & 7 (20 carats)");
    public static final SlimefunItemStack GOLD_22K =
            new SlimefunItemStack("GOLD_22K", Material.GOLD_INGOT, "& r Jinyan & 7 (22 carats)");
    public static final SlimefunItemStack GOLD_24K =
            new SlimefunItemStack("GOLD_24K", Material.GOLD_INGOT, "& r Jinyan & 7 (24 carats)");

    /*		 Dusts 		*/
    public static final SlimefunItemStack IRON_DUST = new SlimefunItemStack("IRON_DUST", Material.GUNPOWDER, "& 6 iron powder");
    public static final SlimefunItemStack GOLD_DUST =
            new SlimefunItemStack("GOLD_DUST", Material.GLOWSTONE_DUST, "& 6 gold powder");
    public static final SlimefunItemStack TIN_DUST = new SlimefunItemStack("TIN_DUST", Material.SUGAR, "Tin powder & 6");
    public static final SlimefunItemStack COPPER_DUST =
            new SlimefunItemStack("COPPER_DUST", Material.GLOWSTONE_DUST, "& 6 copper powder");
    public static final SlimefunItemStack SILVER_DUST = new SlimefunItemStack("SILVER_DUST", Material.SUGAR, "& 6 silver powder");
    public static final SlimefunItemStack ALUMINUM_DUST =
            new SlimefunItemStack("ALUMINUM_DUST", Material.SUGAR, "& 6 Aluminium powder");
    public static final SlimefunItemStack LEAD_DUST = new SlimefunItemStack("LEAD_DUST", Material.GUNPOWDER, "& 6 Lead powder");
    public static final SlimefunItemStack SULFATE = new SlimefunItemStack("SULFATE", Material.GLOWSTONE_DUST, "& 6 sulfate");
    public static final SlimefunItemStack ZINC_DUST = new SlimefunItemStack("ZINC_DUST", Material.SUGAR, "& 6 Zinc powder");
    public static final SlimefunItemStack MAGNESIUM_DUST =
            new SlimefunItemStack("MAGNESIUM_DUST", Material.SUGAR, "& 6 Magnesium powder");
    public static final SlimefunItemStack SILICON = new SlimefunItemStack("SILICON", Material.FIREWORK_STAR, "& 6 silicon");
    public static final SlimefunItemStack GOLD_24K_BLOCK =
            new SlimefunItemStack("GOLD_24K_BLOCK", Material.GOLD_BLOCK, "& r gold & 7 (24 carats)");

    /*		 Gems 		*/
    public static final SlimefunItemStack SYNTHETIC_DIAMOND =
            new SlimefunItemStack("SYNTHETIC_DIAMOND", Material.DIAMOND, "& b Artisanal diamonds", "", "& r can be used as diamonds at workstations");
    public static final SlimefunItemStack SYNTHETIC_EMERALD =
            new SlimefunItemStack("SYNTHETIC_EMERALD", Material.EMERALD, "& b artificial emeralds", "", "& r can be used to trade with villagers");
    public static final SlimefunItemStack SYNTHETIC_SAPPHIRE =
            new SlimefunItemStack("SYNTHETIC_SAPPHIRE", HeadTexture.SAPPHIRE, "& b artificial sapphire", "", "& r can be used as a goldstone on a workstation");
    public static final SlimefunItemStack CARBONADO =
            new SlimefunItemStack("CARBONADO", HeadTexture.CARBONADO, "& b& l Black diamonds", "", "&7&o\"黑色钻石\"");
    public static final SlimefunItemStack RAW_CARBONADO =
            new SlimefunItemStack("RAW_CARBONADO", HeadTexture.RAW_CARBONADO, "& b. Black diamond mine");

    public static final SlimefunItemStack URANIUM = new SlimefunItemStack(
            "URANIUM",
            HeadTexture.URANIUM,
            "& 4 Uranium",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NEPTUNIUM = new SlimefunItemStack(
            "NEPTUNIUM",
            HeadTexture.NEPTUNIUM,
            "& americium",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack PLUTONIUM = new SlimefunItemStack(
            "PLUTONIUM",
            HeadTexture.PLUTONIUM,
            "& 7 Pu",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BOOSTED_URANIUM = new SlimefunItemStack(
            "BOOSTED_URANIUM",
            HeadTexture.BOOSTED_URANIUM,
            "& 2 Plutonium Uranium MOX Nuclear Fuel",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    /*		Talisman		*/
    public static final SlimefunItemStack COMMON_TALISMAN =
            new SlimefunItemStack("COMMON_TALISMAN", Material.EMERALD, "& 6 Common amulet");
    public static final SlimefunItemStack ENDER_TALISMAN =
            new SlimefunItemStack("ENDER_TALISMAN", Material.EMERALD, "& 5 amulet");

    public static final SlimefunItemStack TALISMAN_ANVIL = new SlimefunItemStack(
            "ANVIL_TALISMAN",
            Material.EMERALD,
            "& a Iron Valium",
            "",
            "& f Every amulet prevents",
            "& f tool damaged due to lack of durability",
            "& f will then be consumed",
            "",
            "& 4&l Warning:",
            "& 4 Due to the complexity of too powerful a tool",
            "& 4 amulet cannot fix too powerful a tool");
    public static final SlimefunItemStack TALISMAN_MINER = new SlimefunItemStack(
            "MINER_TALISMAN", Material.EMERALD, "& a miner's amulet", "", "♪ f When this amulet is in your backpack", "& f will double down 20% of the odds.", "♪ f You dig up minerals ♪");
    public static final SlimefunItemStack TALISMAN_FARMER = new SlimefunItemStack(
            "FARMER_TALISMAN", Material.EMERALD, "& a farmer's amulet", "", "♪ f When this amulet is in your backpack", "& f will double down 20% of the odds.", "♪ f Your harvest crops ♪");
    public static final SlimefunItemStack TALISMAN_HUNTER = new SlimefunItemStack(
            "HUNTER_TALISMAN", Material.EMERALD, "& a hunter's charm", "", "♪ f When this amulet is in your backpack", "& f will double down 20% of the odds.", "F. The fall of the creature you killed.");
    public static final SlimefunItemStack TALISMAN_LAVA = new SlimefunItemStack(
            "LAVA_TALISMAN",
            Material.EMERALD,
            "& a magma walker amulet",
            "",
            "♪ f When this amulet is in your backpack",
            "& f gets flame protection",
            "& f Only when you walk on magma",
            "& f will then be consumed");
    public static final SlimefunItemStack TALISMAN_WATER = new SlimefunItemStack(
            "WATER_TALISMAN",
            Material.EMERALD,
            "& a diver amulet",
            "",
            "♪ f When this amulet is in your backpack",
            "Once you're drowning,",
            "& f amulet will give you underwater breath.",
            "& f will then be consumed");
    public static final SlimefunItemStack TALISMAN_ANGEL = new SlimefunItemStack(
            "ANGEL_TALISMAN", Material.EMERALD, "&a angel charm", "", "♪ f When this amulet is in your backpack", "& f has a 75% chance of relieving your fall.");
    public static final SlimefunItemStack TALISMAN_FIRE = new SlimefunItemStack(
            "FIRE_TALISMAN", Material.EMERALD, "&a Firefighter amulet", "", "♪ f When this amulet is in your backpack", "♪ f When you're on fire ♪", "& f gives you fire protection", "& f will then be consumed");
    public static final SlimefunItemStack TALISMAN_MAGICIAN = new SlimefunItemStack(
            "MAGICIAN_TALISMAN", Material.EMERALD, "& a magician's charm", "", "♪ f When this amulet is in your backpack", "F has an 80% chance of being possessed.", "♪ f get an extra demon ♪");
    public static final SlimefunItemStack TALISMAN_TRAVELLER = new SlimefunItemStack(
            "TRAVELLER_TALISMAN",
            Material.EMERALD,
            "& a Traveler's amulet",
            "",
            "♪ f When this amulet is in your backpack",
            "& f has 60% chance when you start running.",
            "& f gives you speed effect");
    public static final SlimefunItemStack TALISMAN_WARRIOR = new SlimefunItemStack(
            "WARRIOR_TALISMAN", Material.EMERALD, "& a warrior charm", "", "♪ f When this amulet is in your backpack", "If you're attacked, you'll have power 3.", "& f will then be consumed");
    public static final SlimefunItemStack TALISMAN_KNIGHT = new SlimefunItemStack(
            "KNIGHT_TALISMAN",
            Material.EMERALD,
            "& a knight's charm",
            "",
            "♪ f When this amulet is in your backpack",
            "& f After you were attacked",
            "& f has 30% chance of five seconds of life recovery.",
            "& f will then be consumed");
    public static final SlimefunItemStack TALISMAN_WHIRLWIND = new SlimefunItemStack(
            "WHIRLWIND_TALISMAN", Material.EMERALD, "& a cyclone amulet", "", "♪ f When this amulet is in your backpack", "& f will have 60% chance", "The & f bounces all the ejectors coming at you.");
    public static final SlimefunItemStack TALISMAN_WIZARD = new SlimefunItemStack(
            "WIZARD_TALISMAN",
            Material.EMERALD,
            "& a wizard's charm",
            "",
            "♪ f When this amulet is in your backpack",
            "4/5 when you have access to it.",
            "& f It may also lower the item",
            "& f Other levels of demonization");
    public static final SlimefunItemStack TALISMAN_CAVEMAN = new SlimefunItemStack(
            "CAVEMAN_TALISMAN", Material.EMERALD, "& a Cave Man's amulet", "", "♪ f When this amulet is in your backpack", "& f has a 50% chance when you're digging.", "& f get a moment's immediate effect");
    public static final SlimefunItemStack TALISMAN_WISE = new SlimefunItemStack(
            "WISE_TALISMAN", Material.EMERALD, "A talisman for the wise.", "", "♪ f When this amulet is in your backpack", "& f's experience will double the 20% probability.");

    /*		Staves		*/
    public static final SlimefunItemStack STAFF_ELEMENTAL =
            new SlimefunItemStack("STAFF_ELEMENTAL", Material.STICK, "& 6 Element wands");
    public static final SlimefunItemStack STAFF_WIND = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WIND", Material.STICK, "& 6 Element Wand & 7- & b&o Wind", "", "& 7 Element: & b&o Wind", "", "& 7-E right to blow you away");
    public static final SlimefunItemStack STAFF_FIRE = new SlimefunItemStack(
            "STAFF_ELEMENTAL_FIRE", Material.STICK, "& 6 Element Wand & 7- & c&o Fire", "", "& 7 Element: & c&o Fire", "", "& c. Purify the flame!");
    public static final SlimefunItemStack STAFF_WATER = new SlimefunItemStack(
            "STAFF_ELEMENTAL_WATER", Material.STICK, "& 6 Element Wand & 7- & 1-O Water", "", "& 7 Element: & 1 & o Water", "", "& 7 and 7 to put out the fire on you.");
    public static final SlimefunItemStack STAFF_STORM = new SlimefunItemStack(
            "STAFF_ELEMENTAL_STORM",
            Material.STICK,
            "& 6 Element wand & 7- & 8-o-ray",
            "",
            "Element & 7: & 8 & o Ray",
            "",
            "& e Right & 7 Call a lightning",
            LoreBuilder.usesLeft(StormStaff.MAX_USES));

    static {
        STAFF_WIND.addUnsafeEnchantment(VersionedEnchantment.LUCK_OF_THE_SEA, 1);
        STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
        STAFF_WATER.addUnsafeEnchantment(VersionedEnchantment.AQUA_AFFINITY, 1);
        STAFF_STORM.addUnsafeEnchantment(VersionedEnchantment.UNBREAKING, 1);
    }

    /*		 Machines 		*/
    public static final SlimefunItemStack GRIND_STONE =
            new SlimefunItemStack("GRIND_STONE", Material.DISPENSER, "& b Mills", "", "More efficient grinding items for & a&o");
    public static final SlimefunItemStack ARMOR_FORGE =
            new SlimefunItemStack("ARMOR_FORGE", Material.ANVIL, "& 6 Armour Worker", "", "& a & o give you the power to create a powerful defense.");
    public static final SlimefunItemStack MAKESHIFT_SMELTERY = new SlimefunItemStack(
            "MAKESHIFT_SMELTERY", Material.BLAST_FURNACE, "& e Simple smelters", "", "& r Simple version of smelters", "&r can only melt mineral powder into ingots.");
    public static final SlimefunItemStack SMELTERY =
            new SlimefunItemStack("SMELTERY", Material.FURNACE, "& 6 smelters", "", "High-temperature furnaces where &a can smelt metals");
    public static final SlimefunItemStack IGNITION_CHAMBER = new SlimefunItemStack(
            "IGNITION_CHAMBER", Material.DROPPER, "& 4 ATM", "..in case your smelter loses the flame.", "& r put the flint in", "&r placed next to the launcher of the smelter");
    public static final SlimefunItemStack ORE_CRUSHER =
            new SlimefunItemStack("ORE_CRUSHER", Material.DISPENSER, "& b Ore shredder", "", "& a&o crush the ore and get double the powder");
    public static final SlimefunItemStack COMPRESSOR =
            new SlimefunItemStack("COMPRESSOR", Material.PISTON, "& b Compressors", "", "& a Compressed Items");
    public static final SlimefunItemStack PRESSURE_CHAMBER =
            new SlimefunItemStack("PRESSURE_CHAMBER", Material.GLASS, "& b Pressure machine", "", "& a Compressed More Items");
    public static final SlimefunItemStack MAGIC_WORKBENCH =
            new SlimefunItemStack("MAGIC_WORKBENCH", Material.CRAFTING_TABLE, "& 6 Magic Workstation", "", "& d Infuses objects with magic energy");
    public static final SlimefunItemStack ORE_WASHER =
            new SlimefunItemStack("ORE_WASHER", Material.CAULDRON, "& 6 Minewasher", "", "&a&o Purge Sift to Filter Ore", "& a & o and give you some little rocks");
    public static final SlimefunItemStack TABLE_SAW =
            new SlimefunItemStack("TABLE_SAW", Material.STONECUTTER, "& 6 saws", "", "& a&o gets eight boards from a log.", "& a&o (support all logs)");
    ;
    public static final SlimefunItemStack COMPOSTER =
            new SlimefunItemStack("COMPOSTER", Material.CAULDRON, "& a mixer", "", "&a&o can convert materials over time...");
    public static final SlimefunItemStack ENHANCED_CRAFTING_TABLE = new SlimefunItemStack(
            "ENHANCED_CRAFTING_TABLE", Material.CRAFTING_TABLE, "& e Enhancement Workstation", "", "& a & a &o original workstation", "& a ando can't bear the power...");
    public static final SlimefunItemStack CRUCIBLE =
            new SlimefunItemStack("CRUCIBLE", Material.CAULDRON, "& c)", "", "&a&o to turn things into liquids");
    public static final SlimefunItemStack JUICER =
            new SlimefunItemStack("JUICER", Material.GLASS_BOTTLE, "&a juicer", "", "&a lets you make delicious juice.");

    public static final SlimefunItemStack INDUSTRIAL_MINER = new SlimefunItemStack(
            "INDUSTRIAL_MINER",
            Material.GOLDEN_PICKAXE,
            "& b Industrial miner",
            "",
            "& r Industrial miner capable of extracting 7x7 below it",
            "All the minerals in the & r range.",
            "&r puts coal or other fuels in",
            "It's fueled in the box of the & r machine.");
    public static final SlimefunItemStack ADVANCED_INDUSTRIAL_MINER = new SlimefunItemStack(
            "ADVANCED_INDUSTRIAL_MINER",
            Material.DIAMOND_PICKAXE,
            "&c Step Industrial Miner",
            "",
            "& r Industrial Miner capable of extracting below 11x11",
            "All the minerals in & r's range.",
            "& r Place fuel or magma in machine boxes",
            "&r adds fuel to it.",
            "",
            "& a+ Precision Collection");

    static {
        ItemMeta meta = INDUSTRIAL_MINER.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        INDUSTRIAL_MINER.setItemMeta(meta);

        ItemMeta meta2 = ADVANCED_INDUSTRIAL_MINER.getItemMeta();
        meta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ADVANCED_INDUSTRIAL_MINER.setItemMeta(meta2);
    }

    public static final SlimefunItemStack SOLAR_PANEL =
            new SlimefunItemStack("SOLAR_PANEL", Material.DAYLIGHT_DETECTOR, "& b Photovoltage Batteries", "", "& 7 Key Parts for Synthetic & b Solar Generators & 7");

    public static final SlimefunItemStack AUTOMATED_PANNING_MACHINE =
            new SlimefunItemStack("AUTOMATED_PANNING_MACHINE", Material.BOWL, "&a ATM", "", "& a&o Upgrade Gold Sift");
    public static final SlimefunItemStack OUTPUT_CHEST = new SlimefunItemStack(
            "OUTPUT_CHEST", Material.CHEST, "& 4 Articles Output Box", "", "& c&o put it next to the launcher of the basic machine.", "The things & c&o make will be in the box.");
    public static final SlimefunItemStack HOLOGRAM_PROJECTOR =
            new SlimefunItemStack("HOLOGRAM_PROJECTOR", Material.QUARTZ_SLAB, "& b Hologram", "", "& r Slide Editable Holomatic Text");

    /*		 Enhanced Furnaces 		*/
    public static final SlimefunItemStack ENHANCED_FURNACE = new SlimefunItemStack(
            "ENHANCED_FURNACE", Material.FURNACE, "& 7 Strengthened Melt - & eI", "", "& 7 burning speed: & e1x", "& 7 Fuel efficiency: & e1x", "Multiply & 7 products: & e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_2 = new SlimefunItemStack(
            "ENHANCED_FURNACE_2",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eII",
            "",
            "& 7 burning speed: & e2x",
            "& 7 Fuel efficiency: & e1x",
            "Multiply & 7 products: & e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_3 = new SlimefunItemStack(
            "ENHANCED_FURNACE_3",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eIII",
            "",
            "& 7 burning speed: & e2x",
            "& 7 Fuel efficiency: & e2x",
            "Multiply & 7 products: & e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_4 = new SlimefunItemStack(
            "ENHANCED_FURNACE_4",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eIV",
            "",
            "& 7 burning speed: & e3x",
            "& 7 Fuel efficiency: & e2x",
            "Multiply & 7 products: & e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_5 = new SlimefunItemStack(
            "ENHANCED_FURNACE_5",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eV",
            "",
            "& 7 burning speed: & e3x",
            "& 7 Fuel efficiency: & e2x",
            "Multiply & 7 products: & e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_6 = new SlimefunItemStack(
            "ENHANCED_FURNACE_6",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eVI",
            "",
            "& 7 burning speed: & e3x",
            "& 7 Fuel efficiency: & e3x",
            "Multiply & 7 products: & e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_7 = new SlimefunItemStack(
            "ENHANCED_FURNACE_7",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eVII",
            "",
            "& 7 burning speed: & e4x",
            "& 7 Fuel efficiency: & e3x",
            "Multiply & 7 products: & e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_8 = new SlimefunItemStack(
            "ENHANCED_FURNACE_8",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eVIII",
            "",
            "& 7 burning speed: & e4x",
            "& 7 Fuel efficiency: & e4x",
            "Multiply & 7 products: & e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_9 = new SlimefunItemStack(
            "ENHANCED_FURNACE_9",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eIX",
            "",
            "& 7 burning speed: & e5x",
            "& 7 Fuel efficiency: & e4x",
            "Multiply & 7 products: & e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_10 = new SlimefunItemStack(
            "ENHANCED_FURNACE_10",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eX",
            "",
            "& 7 burning speed: & e5x",
            "& 7 Fuel efficiency: & e5x",
            "Multiply & 7 products: & e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_11 = new SlimefunItemStack(
            "ENHANCED_FURNACE_11",
            Material.FURNACE,
            "& 7 Strengthened Melt - & eXI",
            "",
            "& 7 burning speed: & e5x",
            "& 7 Fuel efficiency: & e5x",
            "Multiply & 7 products: & e3x");
    public static final SlimefunItemStack REINFORCED_FURNACE = new SlimefunItemStack(
            "REINFORCED_FURNACE", Material.FURNACE, "& 7 Enhanced alloy furnaces", "", "& 7 burning speed: & e10x", "& 7 Fuel efficiency: & e10x", "Multiply & 7 products: & e3x");
    public static final SlimefunItemStack CARBONADO_EDGED_FURNACE = new SlimefunItemStack(
            "CARBONADO_EDGED_FURNACE",
            Material.FURNACE,
            "& 7 Black diamond edge furnaces",
            "",
            "& 7 burning speed: & e20x",
            "& 7 Fuel efficiency: & e10x",
            "Multiply & 7 products: & e3x");

    public static final SlimefunItemStack BLOCK_PLACER =
            new SlimefunItemStack("BLOCK_PLACER", Material.DISPENSER, "& a square placement machine", "", "& r All the diamonds in this launcher", "& r will be automatically placed");

    /*		Soulbound Items		*/
    public static final SlimefunItemStack SOULBOUND_SWORD =
            new SlimefunItemStack("SOULBOUND_SWORD", Material.DIAMOND_SWORD, "& c Soul Sword");
    public static final SlimefunItemStack SOULBOUND_BOW =
            new SlimefunItemStack("SOULBOUND_BOW", Material.BOW, "& c Soul tied bow");
    public static final SlimefunItemStack SOULBOUND_PICKAXE =
            new SlimefunItemStack("SOULBOUND_PICKAXE", Material.DIAMOND_PICKAXE, "& c Soul tied up");
    public static final SlimefunItemStack SOULBOUND_AXE =
            new SlimefunItemStack("SOULBOUND_AXE", Material.DIAMOND_AXE, "& c Soulsed Axes");
    public static final SlimefunItemStack SOULBOUND_SHOVEL =
            new SlimefunItemStack("SOULBOUND_SHOVEL", Material.DIAMOND_SHOVEL, "& c Soul tied shovels");
    public static final SlimefunItemStack SOULBOUND_HOE =
            new SlimefunItemStack("SOULBOUND_HOE", Material.DIAMOND_HOE, "& c Soul tied hoes");

    public static final SlimefunItemStack SOULBOUND_HELMET =
            new SlimefunItemStack("SOULBOUND_HELMET", Material.DIAMOND_HELMET, "& C Souled Helmet");
    public static final SlimefunItemStack SOULBOUND_CHESTPLATE =
            new SlimefunItemStack("SOULBOUND_CHESTPLATE", Material.DIAMOND_CHESTPLATE, "& c Soul tied to chest armor");
    public static final SlimefunItemStack SOULBOUND_LEGGINGS =
            new SlimefunItemStack("SOULBOUND_LEGGINGS", Material.DIAMOND_LEGGINGS, "& c Soul tied legs");
    public static final SlimefunItemStack SOULBOUND_BOOTS =
            new SlimefunItemStack("SOULBOUND_BOOTS", Material.DIAMOND_BOOTS, "& c Soul tied boots");
    public static final SlimefunItemStack SOULBOUND_TRIDENT =
            new SlimefunItemStack("SOULBOUND_TRIDENT", Material.TRIDENT, "& c Soul tied to Trident");

    /* Runes */
    public static final SlimefunItemStack BLANK_RUNE =
            new SlimefunItemStack("BLANK_RUNE", new ColoredFireworkStar(Color.BLACK, "& 8 Blank Character"));

    public static final SlimefunItemStack AIR_RUNE =
            new SlimefunItemStack("ANCIENT_RUNE_AIR", new ColoredFireworkStar(Color.AQUA, "& 7 antiquity & 8 & l [ & b & l & 8 & l]"));
    public static final SlimefunItemStack WATER_RUNE =
            new SlimefunItemStack("ANCIENT_RUNE_WATER", new ColoredFireworkStar(Color.BLUE, "& 7 ancient symbols & 8 & l [& 1 & l Water & 8 & l]"));
    public static final SlimefunItemStack FIRE_RUNE =
            new SlimefunItemStack("ANCIENT_RUNE_FIRE", new ColoredFireworkStar(Color.RED, "& 7 ancient symbols & 8 & 1 [& 4 & 1 Fire & 8 & 1]"));
    public static final SlimefunItemStack EARTH_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_EARTH", new ColoredFireworkStar(Color.fromRGB(112, 47, 7), "& 7 antiquity & 8&l [and c&l & 8 & l]"));
    public static final SlimefunItemStack ENDER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENDER", new ColoredFireworkStar(Color.PURPLE, "& 7 ancient symbols & 8 & l [& 5 & l Last & 8 & l]"));

    public static final SlimefunItemStack RAINBOW_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_RAINBOW", new ColoredFireworkStar(Color.FUCHSIA, "& 7 ancient symbols & 8 & 1 [& d & l rainbow & 8 & 1]"));
    public static final SlimefunItemStack LIGHTNING_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_LIGHTNING", new ColoredFireworkStar(Color.fromRGB(255, 255, 95), "& 7 antiquity & 8 & l [ & e & lray & 8 & l]"));
    public static final SlimefunItemStack SOULBOUND_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_SOULBOUND",
            new ColoredFireworkStar(
                    Color.fromRGB(47, 0, 117),
                    "& 7 ancient symbols & 8 & l [& 5 & l soul tied & 8 & l]",
                    "& e throw your bindings on the floor first.",
                    "& e then toss this token to that object.",
                    "Five can bind the & e object.",
                    " ",
                    "& e suggests that you use & 6 important & e items.",
                    " ",
                    "The & e tied things don't fall when they're dead."));
    public static final SlimefunItemStack ENCHANTMENT_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_ENCHANTMENT",
            new ColoredFireworkStar(
                    Color.fromRGB(255, 217, 25),
                    "& 7 ancient symbols & 8 & l [and 6 & l possessed & 8 & l]",
                    "♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ the ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪ ♪",
                    "& e needs & 6 possessions & e",
                    "The & e object will acquire a random magic attribute."));
    public static final SlimefunItemStack VILLAGER_RUNE = new SlimefunItemStack(
            "ANCIENT_RUNE_VILLAGERS",
            new ColoredFireworkStar(
                    Color.fromRGB(160, 20, 5),
                    "& Ancient Sage & 8 & l [and 4 & l Villager & 8 & l]",
                    "& e right-key villagers clear",
                    "& e Its list of occupations and transactions.",
                    "♪ The villagers will be in time ♪",
                    "&e's looking for a new job."));

    /*		Electricity			*/
    public static final SlimefunItemStack SOLAR_GENERATOR = new SlimefunItemStack(
            "SOLAR_GENERATOR",
            Material.DAYLIGHT_DETECTOR,
            "& b Solar generators",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack SOLAR_GENERATOR_2 = new SlimefunItemStack(
            "SOLAR_GENERATOR_2",
            Material.DAYLIGHT_DETECTOR,
            "&c Advanced Solar Generators",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack SOLAR_GENERATOR_3 = new SlimefunItemStack(
            "SOLAR_GENERATOR_3",
            Material.DAYLIGHT_DETECTOR,
            "& 4 Black diamond solar generators",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(64));
    public static final SlimefunItemStack SOLAR_GENERATOR_4 = new SlimefunItemStack(
            "SOLAR_GENERATOR_4",
            Material.DAYLIGHT_DETECTOR,
            "& e-filled solar generators",
            "",
            "& 9 can work at night",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(0),
            LoreBuilder.powerPerSecond(256),
            "Daytime",
            LoreBuilder.powerPerSecond(128),
            "(Night)");

    public static final SlimefunItemStack COAL_GENERATOR = new SlimefunItemStack(
            "COAL_GENERATOR",
            HeadTexture.GENERATOR,
            "& c Coal generators",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack COAL_GENERATOR_2 = new SlimefunItemStack(
            "COAL_GENERATOR_2",
            HeadTexture.GENERATOR,
            "& c Coal Generator & 7 (&eII& 7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack LAVA_GENERATOR = new SlimefunItemStack(
            "LAVA_GENERATOR",
            HeadTexture.GENERATOR,
            "& 4 magma generators",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack LAVA_GENERATOR_2 = new SlimefunItemStack(
            "LAVA_GENERATOR_2",
            HeadTexture.GENERATOR,
            "& 4 magma generators & 7 (&eII& 7)",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_FURNACE = new SlimefunItemStack(
            "ELECTRIC_FURNACE",
            Material.FURNACE,
            "The & c furnace.",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_FURNACE_2 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_2",
            Material.FURNACE,
            "&c furnace & 7- & eII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 2x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_FURNACE_3 = new SlimefunItemStack(
            "ELECTRIC_FURNACE_3",
            Material.FURNACE,
            "&c furnace & 7- & eIII",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 4x",
            LoreBuilder.powerPerSecond(10));

    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER",
            Material.FURNACE,
            "&c Electric Miner",
            "",
            "The perfect combination of & r mineral shredders and mills",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(12));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_2 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_2",
            Material.FURNACE,
            "&c Electric Miner & 7 (&eII& 7)",
            "",
            "The perfect combination of & r mineral shredders and mills",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 4x",
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_3 = new SlimefunItemStack(
            "ELECTRIC_ORE_GRINDER_3",
            Material.FURNACE,
            "&c Electric Miner & 7 (&eIII& 7)",
            "",
            "The perfect combination of & f mineral shredders and mills",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(10),
            LoreBuilder.powerPerSecond(90));
    public static final SlimefunItemStack ELECTRIC_INGOT_PULVERIZER = new SlimefunItemStack(
            "ELECTRIC_INGOT_PULVERIZER",
            Material.FURNACE,
            "&c Power powdering machine",
            "",
            "& r turn the sun into powder",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack AUTO_DRIER = new SlimefunItemStack(
            "AUTO_DRIER",
            Material.SMOKER,
            "& e Autodryer",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack AUTO_ENCHANTER = new SlimefunItemStack(
            "AUTO_ENCHANTER",
            Material.ENCHANTING_TABLE,
            "& 5 Auto-Accelerator",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_ENCHANTER_2 = new SlimefunItemStack(
            "AUTO_ENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "& 5 Auto-Accelerator & 7- & eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_DISENCHANTER = new SlimefunItemStack(
            "AUTO_DISENCHANTER",
            Material.ENCHANTING_TABLE,
            "The & 5 machine.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_DISENCHANTER_2 = new SlimefunItemStack(
            "AUTO_DISENCHANTER_2",
            Material.ENCHANTING_TABLE,
            "& 5 Automated Magic Machine & 7- & eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_ANVIL = new SlimefunItemStack(
            "AUTO_ANVIL",
            Material.IRON_BLOCK,
            "& 7 Auto-iron",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "& 8\u21E8 & 7 repairable percentage: 10%",
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack AUTO_ANVIL_2 = new SlimefunItemStack(
            "AUTO_ANVIL_2",
            Material.IRON_BLOCK,
            "Mk.II.",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 repairable percentage: 25%",
            LoreBuilder.powerPerSecond(32));
    public static final SlimefunItemStack AUTO_BREWER = new SlimefunItemStack(
            "AUTO_BREWER",
            Material.SMOKER,
            "& e Autobrew machine",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(12));

    public static final SlimefunItemStack BOOK_BINDER = new SlimefunItemStack(
            "BOOK_BINDER",
            Material.BOOKSHELF,
            "& 6 Entangler",
            "",
            "& f tied all the magic books to one.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16));

    public static final SlimefunItemStack BIO_REACTOR = new SlimefunItemStack(
            "BIO_REACTOR",
            Material.LIME_TERRACOTTA,
            "& 2 Biological Generators",
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR),
            "& 8\u21E8 & e\u26A1 & 7128 J Storeable",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack MULTIMETER =
            new SlimefunItemStack("MULTIMETER", Material.CLOCK, "& e-list", "", "& r View the energy stored in the machine");

    public static final SlimefunItemStack SMALL_CAPACITOR = new SlimefunItemStack(
            "SMALL_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "Small storage capacitor &a",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.CAPACITOR),
            "& 8\u21E8 & e\u26A1 & 7128 J Storeable");
    public static final SlimefunItemStack MEDIUM_CAPACITOR = new SlimefunItemStack(
            "MEDIUM_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "Medium storage capacitor & a",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(512));
    public static final SlimefunItemStack BIG_CAPACITOR = new SlimefunItemStack(
            "BIG_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "Large storage capacitor & a",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(1024));
    public static final SlimefunItemStack LARGE_CAPACITOR = new SlimefunItemStack(
            "LARGE_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "& a mega-storage capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.GOOD, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(8192));
    public static final SlimefunItemStack CARBONADO_EDGED_CAPACITOR = new SlimefunItemStack(
            "CARBONADO_EDGED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "& a Black diamond-side storage capacitors",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(65536));
    public static final SlimefunItemStack ENERGIZED_CAPACITOR = new SlimefunItemStack(
            "ENERGIZED_CAPACITOR",
            HeadTexture.CAPACITOR_25,
            "& a terminal storage energy capacitor",
            LoreBuilder.range(6),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(524288));

    /*		Robots				*/
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "& c programming robot & 7 (general)",
            "",
            "& 8\u21E8 & 7: None",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "& c programming robot & 7 (farmers)",
            "",
            "& 8\u21E8 & 7: Farming",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_MINER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_MINER",
            HeadTexture.PROGRAMMABLE_ANDROID_MINER,
            "& c programming robot & 7 (miners)",
            "",
            "& 8\u21E8 & 7: Mining",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_WOODCUTTER",
            HeadTexture.PROGRAMMABLE_ANDROID_WOODCUTTER,
            "& c programming robots & 7 ()",
            "",
            "& 8\u21E8 & 7: Logging",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "& c programming robot & 7 (Protower)",
            "",
            "& 8\u21E8 & 7: Slaughter",
            "& 8\u21E8 & 7 Harm: 4",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "& c programming robot & 7 (fisher)",
            "",
            "& 8\u21E8 & 7: Fishing",
            "& 8\u21E8 & 7 Success: 10%",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.0x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "& c Advanced programming robot & 7 (general)",
            "",
            "& 8\u21E8 & 7: None",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "& c Advanced programming robot & 7 (fisher)",
            "",
            "& 8\u21E8 & 7: Fishing",
            "& 8\u21E8 & 7: 20%",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FARMER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_FARMER",
            HeadTexture.PROGRAMMABLE_ANDROID_FARMER,
            "& c Advanced programming robot & 7 (farmer)",
            "",
            "& 8\u21E8 & 7: Farming",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.5x",
            "& 8\u21E8 & 7 can harvest plants in exotic gardens");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_2_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "& c Advanced Programable Robots & 7 (Butcher)",
            "",
            "& 8\u21E8 & 7: Slaughter",
            "& 8\u21E8 & 7 Harm: 8",
            "& 8\u21E8 & 7 Fuel Efficiency: 1.5x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3 = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3",
            HeadTexture.PROGRAMMABLE_ANDROID,
            "& e-authorized programming robot & 7 (general)",
            "",
            "& 8\u21E8 & 7: None",
            "& 8\u21E8 & 7 Fuel Efficiency: 3.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_FISHERMAN",
            HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN,
            "& e-authorized programming robot & 7 (fisher)",
            "",
            "& 8\u21E8 & 7: Fishing",
            "& 8\u21E8 & 7: 30%",
            "& 8\u21E8 & 7 Fuel Efficiency: 8.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new SlimefunItemStack(
            "PROGRAMMABLE_ANDROID_3_BUTCHER",
            HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER,
            "& e-authorized programming robot & 7 (Protower)",
            "",
            "& 8\u21E8 & 7: Slaughter",
            "& 8\u21E8 & 7 Harm: 20",
            "& 8\u21E8 & 7 Fuel Efficiency: 8.0x");

    /*		       GPS		       */
    public static final SlimefunItemStack GPS_TRANSMITTER = new SlimefunItemStack(
            "GPS_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "& bGPS Launcher",
            "",
            LoreBuilder.powerBuffer(16),
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack GPS_TRANSMITTER_2 = new SlimefunItemStack(
            "GPS_TRANSMITTER_2",
            HeadTexture.GPS_TRANSMITTER,
            "& c Advanced GPS Launcher",
            "",
            LoreBuilder.powerBuffer(64),
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack GPS_TRANSMITTER_3 = new SlimefunItemStack(
            "GPS_TRANSMITTER_3",
            HeadTexture.GPS_TRANSMITTER,
            "& 4 Black Steel GPS Launcher",
            "",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(22));
    public static final SlimefunItemStack GPS_TRANSMITTER_4 = new SlimefunItemStack(
            "GPS_TRANSMITTER_4",
            HeadTexture.GPS_TRANSMITTER,
            "& e Capable GPS Launcher",
            "",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(92));

    public static final SlimefunItemStack GPS_MARKER_TOOL = new SlimefunItemStack(
            "GPS_MARKER_TOOL", Material.REDSTONE_TORCH, "& bGPS Set Path Point Tool", "", "& r allows you to place tag tools", "& r Set up a transmission point and name");
    public static final SlimefunItemStack GPS_CONTROL_PANEL = new SlimefunItemStack(
            "GPS_CONTROL_PANEL", HeadTexture.GPS_CONTROL_PANEL, "& bGPS Control Panel", "", "&r allows you to track your GPS satellite.", "& r and manage existing path points");
    public static final SlimefunItemStack GPS_EMERGENCY_TRANSMITTER = new SlimefunItemStack(
            "GPS_EMERGENCY_TRANSMITTER",
            HeadTexture.GPS_TRANSMITTER,
            "& cGPS Emergency Launcher",
            "",
            "♪ When you die ♪",
            "&r If an emergency launcher is in your backpack",
            "&r will automatically set your death as a path point");

    public static final SlimefunItemStack ANDROID_INTERFACE_FUEL = new SlimefunItemStack(
            "ANDROID_INTERFACE_FUEL",
            Material.DISPENSER,
            "& 7 Robotic Interface & c (Fuel)",
            "",
            "&r when the script tells it to do so",
            "Items &r stored in interactive interfaces",
            "&r will be put into robotic fuel tanks.");
    public static final SlimefunItemStack ANDROID_INTERFACE_ITEMS = new SlimefunItemStack(
            "ANDROID_INTERFACE_ITEMS",
            Material.DISPENSER,
            "& 7 Robotic Interface & 9 (objects)",
            "",
            "When the script tells it to do so,",
            "Items &r stored in robotic objects",
            "& r will be placed in an interactive interface");

    public static final SlimefunItemStack GPS_GEO_SCANNER = new SlimefunItemStack(
            "GPS_GEO_SCANNER", HeadTexture.GEO_SCANNER, "& bGPS Topography Scanner", "", "& r Scan how many natural resources in a block", "& r e.g. & 8 crude oil");
    public static final SlimefunItemStack PORTABLE_GEO_SCANNER = new SlimefunItemStack(
            "PORTABLE_GEO_SCANNER", Material.CLOCK, "& b Portable Resource Scanner", "", "&r scans natural resources out of blocks", "", "& e Right & 7 Scan");
    public static final SlimefunItemStack GEO_MINER = new SlimefunItemStack(
            "GEO_MINER",
            HeadTexture.GEO_MINER,
            "& 6 Natural resource extraction machines",
            "",
            "& e Exploited Resources from Blocks",
            "& e can extract resources that cannot be excavated by a mine.",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(48),
            "",
            "& c&l! & c Ensure you've done GEO terrain scans");
    public static final SlimefunItemStack OIL_PUMP = new SlimefunItemStack(
            "OIL_PUMP", HeadTexture.OIL_PUMP, "& r Crude Oil Pump", "", "& 7 pumped out the crude oil and put it in the bucket.", "", "& c&l! & c Please scan the block first.");
    public static final SlimefunItemStack OIL_BUCKET =
            new SlimefunItemStack("BUCKET_OF_OIL", HeadTexture.OIL_BUCKET, "& r Crude drums");
    public static final SlimefunItemStack FUEL_BUCKET =
            new SlimefunItemStack("BUCKET_OF_FUEL", HeadTexture.FUEL_BUCKET, "& r Fuel drums");

    public static final SlimefunItemStack REFINERY =
            new SlimefunItemStack("REFINERY", Material.PISTON, "& c Refineries", "", "& r Refine crude oil to fuel oil");
    public static final SlimefunItemStack COMBUSTION_REACTOR = new SlimefunItemStack(
            "COMBUSTION_REACTOR",
            HeadTexture.GENERATOR,
            "& c Incendiary reactor",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack ANDROID_MEMORY_CORE =
            new SlimefunItemStack("ANDROID_MEMORY_CORE", HeadTexture.ENERGY_REGULATOR, "& b Robot Memory Core");

    public static final SlimefunItemStack GPS_TELEPORTER_PYLON =
            new SlimefunItemStack("GPS_TELEPORTER_PYLON", Material.PURPLE_STAINED_GLASS, "& 5GPS signal tower", "", "& 7 transporter component");
    public static final SlimefunItemStack GPS_TELEPORTATION_MATRIX = new SlimefunItemStack(
            "GPS_TELEPORTATION_MATRIX",
            Material.IRON_BLOCK,
            "& bGPS Transfer Matrix",
            "",
            "This is the main part of GPS transmission.",
            "This & r matrix allows players to transmit to",
            "Pathpoints & r Set");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_SHARED = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_SHARED",
            Material.STONE_PRESSURE_PLATE,
            "& rGPS Activation Device & 3 (Public)",
            "",
            "& r put it on the transfer matrix",
            "& r and step on this pedal to choose",
            "Path point for &r to transmit");
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new SlimefunItemStack(
            "GPS_ACTIVATION_DEVICE_PERSONAL",
            Material.STONE_PRESSURE_PLATE,
            "& rGPS Activation Device & a (Personal)",
            "",
            "& r put it on the transfer matrix",
            "& r and step on this pedal to choose",
            "Path point for &r to transmit",
            "",
            "& r The activation is permitted only",
            "Use by the person who & r placed it");
    public static final SlimefunItemStack PORTABLE_TELEPORTER = new SlimefunItemStack(
            "PORTABLE_TELEPORTER",
            Material.COMPASS,
            "& b Portable transporter",
            "",
            "& f can get you anywhere you want.",
            "Transfer point & f to transmit",
            "",
            LoreBuilder.powerCharged(0, 50),
            "",
            "& e Right & 7 Use");

    public static final SlimefunItemStack ELEVATOR_PLATE = new SlimefunItemStack(
            "ELEVATOR_PLATE",
            Material.STONE_PRESSURE_PLATE,
            "& b elevator board",
            "",
            "& r Place elevator boards on each floor",
            "You'll be able to transmit between layers.",
            "",
            "& e right-key elevator board & 7 to name this layer");

    public static final SlimefunItemStack INFUSED_HOPPER =
            new SlimefunItemStack("INFUSED_HOPPER", Material.HOPPER, "& 5 Inhalation funnel", "", "& r Automatically inhaled near the funnel", "All items within & r7x7x7");

    public static final SlimefunItemStack PLASTIC_SHEET =
            new SlimefunItemStack("PLASTIC_SHEET", Material.PAPER, "& r Plastic paper");

    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "& c Heated Pressure Module",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER_2 = new SlimefunItemStack(
            "HEATED_PRESSURE_CHAMBER_2",
            Material.LIGHT_GRAY_STAINED_GLASS,
            "& c Heating Pressure Module & 7- & eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 5x",
            LoreBuilder.powerPerSecond(44));

    public static final SlimefunItemStack ELECTRIC_SMELTERY = new SlimefunItemStack(
            "ELECTRIC_SMELTERY",
            Material.FURNACE,
            "&c Electrical smelters",
            "",
            "& 4 only supports alloys, and cannot smelt powder into ingots.",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack ELECTRIC_SMELTERY_2 = new SlimefunItemStack(
            "ELECTRIC_SMELTERY_2",
            Material.FURNACE,
            "&c Electric Smelter & 7- & eII",
            "",
            "& 4 only supports alloys, and cannot smelt powder into ingots.",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_PRESS = new SlimefunItemStack(
            "ELECTRIC_PRESS",
            HeadTexture.ELECTRIC_PRESS,
            "& e Compressors",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack ELECTRIC_PRESS_2 = new SlimefunItemStack(
            "ELECTRIC_PRESS_2",
            HeadTexture.ELECTRIC_PRESS,
            "& e Compressor & 7- & eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7: 3x",
            LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE",
            Material.RED_TERRACOTTA,
            "& c Electrocution",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_2 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_2",
            Material.RED_TERRACOTTA,
            "& c Electric & 7- & eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 2x",
            "&8\u21E8 &e\u26A1 &780 J/s");
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_3 = new SlimefunItemStack(
            "ELECTRIFIED_CRUCIBLE_3",
            Material.RED_TERRACOTTA,
            "& c Electric & 7- & eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 4x",
            "&8\u21E8 &e\u26A1 &7120 J/s");

    public static final SlimefunItemStack CARBON_PRESS = new SlimefunItemStack(
            "CARBON_PRESS",
            Material.BLACK_STAINED_GLASS,
            "& c Carbon press",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack CARBON_PRESS_2 = new SlimefunItemStack(
            "CARBON_PRESS_2",
            Material.BLACK_STAINED_GLASS,
            "& c Carbon Pressure & 7- & eII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7: 3x",
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CARBON_PRESS_3 = new SlimefunItemStack(
            "CARBON_PRESS_3",
            Material.BLACK_STAINED_GLASS,
            "& c Carbon Pressure & 7- & eIII",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7: 15x",
            "&8\u21E8 &e\u26A1 &7180 J/s");

    public static final SlimefunItemStack BLISTERING_INGOT = new SlimefunItemStack(
            "BLISTERING_INGOT",
            Material.GOLD_INGOT,
            "& 6 blisters & 7 (33%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_2 = new SlimefunItemStack(
            "BLISTERING_INGOT_2",
            Material.GOLD_INGOT,
            "& 6 blisters & 7 (66%)",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_3 = new SlimefunItemStack(
            "BLISTERING_INGOT_3",
            Material.GOLD_INGOT,
            "& 6 zillions",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);

    public static final SlimefunItemStack ENERGY_REGULATOR =
            new SlimefunItemStack("ENERGY_REGULATOR", HeadTexture.ENERGY_REGULATOR, "& 6 Energy Regulator", "", "Core elements of &r energy network");
    public static final SlimefunItemStack ENERGY_CONNECTOR = new SlimefunItemStack(
            "ENERGY_CONNECTOR",
            HeadTexture.ENERGY_CONNECTOR,
            "&c Energy Connector",
            LoreBuilder.range(6),
            "",
            "& f for connecting machines and generators",
            "& f can connect to nearby energy networks");
    public static final SlimefunItemStack DEBUG_FISH = new SlimefunItemStack(
            "DEBUG_FISH",
            Material.SALMON,
            "How much for the fish?",
            "",
            "& e right & r any square to see its square data",
            "& e Left Key & r Destroying Squares",
            "& eShift + left key & r any square to remove its square data",
            "& eShift+Right Key & r Place a placeholder square");

    public static final SlimefunItemStack NETHER_ICE = new SlimefunItemStack(
            "NETHER_ICE",
            HeadTexture.NETHER_ICE,
            "Ice below & e",
            "",
            LoreBuilder.radioactive(Radioactivity.MODERATE),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack ENRICHED_NETHER_ICE = new SlimefunItemStack(
            "ENRICHED_NETHER_ICE",
            HeadTexture.ENRICHED_NETHER_ICE,
            "& e Enriched Submarine Ice",
            "",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NETHER_ICE_COOLANT_CELL =
            new SlimefunItemStack("NETHER_ICE_COOLANT_CELL", HeadTexture.NETHER_ICE_COOLANT_CELL, "Ice cooler below & 6");

    // Cargo
    public static final SlimefunItemStack CARGO_MANAGER =
            new SlimefunItemStack("CARGO_MANAGER", HeadTexture.CARGO_MANAGER, "& 6 Cargo Manager", "", "Core components of the & r articles transfer network");
    public static final SlimefunItemStack CARGO_CONNECTOR_NODE =
            new SlimefunItemStack("CARGO_NODE", HeadTexture.CARGO_CONNECTOR_NODE, "& 7 freight node & c (connector)", "", "&r freight connections");
    public static final SlimefunItemStack CARGO_INPUT_NODE =
            new SlimefunItemStack("CARGO_NODE_INPUT", HeadTexture.CARGO_INPUT_NODE, "& 7 Freight Node & c (Input)", "", "&r Cargo Input Pipe");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE =
            new SlimefunItemStack("CARGO_NODE_OUTPUT", HeadTexture.CARGO_OUTPUT_NODE, "& 7 Freight Node & c (output)", "", "&r Cargo Output Pipeline");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE_2 = new SlimefunItemStack(
            "CARGO_NODE_OUTPUT_ADVANCED", HeadTexture.CARGO_OUTPUT_NODE, "& 6 Advanced Freight Node & c (output)", "", "&r Cargo Output Pipeline");

    // Animal farm
    public static final SlimefunItemStack AUTO_BREEDER = new SlimefunItemStack(
            "AUTO_BREEDER",
            Material.HAY_BLOCK,
            "& e Auto Feeder",
            "",
            "&r needs &a organic food",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            "& 8\u21E8 & e\u26A1 & 760 J/ Animals");
    public static final SlimefunItemStack PRODUCE_COLLECTOR = new SlimefunItemStack(
            "PRODUCE_COLLECTOR",
            Material.HAY_BLOCK,
            "& b Full Auto Collector",
            "",
            "& f This machine can be automatically charged",
            "Animal products produced by animals near & f.",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(32));

    public static final SlimefunItemStack ORGANIC_FOOD =
            new SlimefunItemStack("ORGANIC_FOOD", HeadTexture.FILLED_CAN, "&a Organic food", "Does it contain & 9?");
    public static final SlimefunItemStack WHEAT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_WHEAT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 wheat");
    public static final SlimefunItemStack CARROT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_CARROT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 carrots");
    public static final SlimefunItemStack POTATO_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_POTATO", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 potatoes");
    public static final SlimefunItemStack SEEDS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEEDS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 wheat seeds");
    public static final SlimefunItemStack BEETROOT_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_BEETROOT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 beets");
    public static final SlimefunItemStack MELON_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_MELON", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 watermelon");
    public static final SlimefunItemStack APPLE_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_APPLE", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 apples");
    public static final SlimefunItemStack SWEET_BERRIES_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SWEET_BERRIES", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 berries");
    public static final SlimefunItemStack KELP_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_KELP", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 dry sea belts");
    public static final SlimefunItemStack COCOA_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_COCOA", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains & 9 cocoa beans");
    public static final SlimefunItemStack SEAGRASS_ORGANIC_FOOD = new SlimefunItemStack(
            "ORGANIC_FOOD_SEAGRASS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "& 7 contains: & 9 seagrass");

    public static final SlimefunItemStack FERTILIZER =
            new SlimefunItemStack("FERTILIZER", HeadTexture.FILLED_CAN, "&a organic fertilizer", "Does it contain & 9?");
    public static final SlimefunItemStack WHEAT_FERTILIZER =
            new SlimefunItemStack("FERTILIZER_WHEAT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 wheat");
    public static final SlimefunItemStack CARROT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_CARROT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 carrots");
    public static final SlimefunItemStack POTATO_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_POTATO", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 potatoes");
    public static final SlimefunItemStack SEEDS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEEDS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 wheat seeds");
    public static final SlimefunItemStack BEETROOT_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_BEETROOT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 beets");
    public static final SlimefunItemStack MELON_FERTILIZER =
            new SlimefunItemStack("FERTILIZER_MELON", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 watermelon");
    public static final SlimefunItemStack APPLE_FERTILIZER =
            new SlimefunItemStack("FERTILIZER_APPLE", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 apples");
    public static final SlimefunItemStack SWEET_BERRIES_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SWEET_BERRIES", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 berries");
    public static final SlimefunItemStack KELP_FERTILIZER =
            new SlimefunItemStack("FERTILIZER_KELP", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 dry sea belts");
    public static final SlimefunItemStack COCOA_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_COCOA", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains & 9 cocoa beans");
    public static final SlimefunItemStack SEAGRASS_FERTILIZER = new SlimefunItemStack(
            "FERTILIZER_SEAGRASS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "& 7 contains: & 9 seagrass");

    public static final SlimefunItemStack ANIMAL_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "ANIMAL_GROWTH_ACCELERATOR",
            Material.HAY_BLOCK,
            "& b Animal growth accelerator",
            "",
            "&r needs &a organic food",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(28));
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR",
            Material.LIME_TERRACOTTA,
            "&a Crop Growth Accelerator",
            "",
            "& r Need & a Organic Fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Radius: 7x7",
            "& 8\u21E8 & 7 Speed: & a3/",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &750 J/s");
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR_2 = new SlimefunItemStack(
            "CROP_GROWTH_ACCELERATOR_2",
            Material.LIME_TERRACOTTA,
            "&a Crop Growth Accelerator & 7 (&eII& 7)",
            "",
            "& r Need & a Organic Fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Radius: 9x9",
            "& 8\u21E8 & 7 speed: & a4/time",
            LoreBuilder.powerBuffer(1024),
            "&8\u21E8 &e\u26A1 &760 J/s");
    public static final SlimefunItemStack TREE_GROWTH_ACCELERATOR = new SlimefunItemStack(
            "TREE_GROWTH_ACCELERATOR",
            Material.BROWN_TERRACOTTA,
            "&a Tree Growth Accelerator",
            "",
            "& r Need & a Organic Fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Radius: 9x9",
            "& 8\u21E8 & 7 speed: & a4/time",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_FABRICATOR = new SlimefunItemStack(
            "FOOD_FABRICATOR",
            Material.GREEN_STAINED_GLASS,
            "&c Food Processor",
            "",
            "&r can make &a organic food",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack FOOD_FABRICATOR_2 = new SlimefunItemStack(
            "FOOD_FABRICATOR_2",
            Material.GREEN_STAINED_GLASS,
            "&c Food Processor & 7(&eII&7)",
            "",
            "&r can make &a organic food",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 6x",
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_COMPOSTER = new SlimefunItemStack(
            "FOOD_COMPOSTER",
            Material.GREEN_TERRACOTTA,
            "& c. Food composting",
            "",
            "&r can make &a organic fertilizer",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack FOOD_COMPOSTER_2 = new SlimefunItemStack(
            "FOOD_COMPOSTER_2",
            Material.GREEN_TERRACOTTA,
            "& c. Food composting & 7 (&eII& 7)",
            "",
            "&r can make &a organic fertilizer",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7: 10x",
            LoreBuilder.powerBuffer(512),
            "&8\u21E8 &e\u26A1 &752 J/s");

    public static final SlimefunItemStack EXP_COLLECTOR = new SlimefunItemStack(
            "XP_COLLECTOR",
            HeadTexture.EXP_COLLECTOR,
            "& a Experience Collector",
            "",
            "&r collects nearby experiences and stores them",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack REACTOR_COOLANT_CELL =
            new SlimefunItemStack("REACTOR_COLLANT_CELL", HeadTexture.COOLANT_CELL, "& b Reactor coolant");

    public static final SlimefunItemStack NUCLEAR_REACTOR = new SlimefunItemStack(
            "NUCLEAR_REACTOR",
            HeadTexture.NUCLEAR_REACTOR,
            "& 2 nuclear reactor",
            "",
            "& r needs coolant!",
            "& 8\u21E8 & b must be surrounded by water",
            "& 8\u21E8 & b must work with reactor coolers",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "& 8\u21E8 & e\u26A1 & 716384 J Storeable",
            "&8\u21E8 &e\u26A1 &7500 J/s");
    public static final SlimefunItemStack NETHER_STAR_REACTOR = new SlimefunItemStack(
            "NETHERSTAR_REACTOR",
            HeadTexture.NETHER_STAR_REACTOR,
            "Star reactor below & r",
            "",
            "& r needs the lower stars.",
            "& 8\u21E8 & b must be surrounded by water",
            "& 8\u21E8 & b must work with bottom ice coolers",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            "& 8\u21E8 & e\u26A1 & 732768 J Storeable",
            "&8\u21E8 &e\u26A1 &71024 J/s",
            "& 8\u21E8 & 4 can cause the nearby organisms to have zero effect");
    public static final SlimefunItemStack REACTOR_ACCESS_PORT = new SlimefunItemStack(
            "REACTOR_ACCESS_PORT",
            Material.CYAN_TERRACOTTA,
            "& 2 Reactor Access Interface",
            "",
            "&r allows you access to the reactor through the cargo node.",
            "& r can also be used for storage",
            "",
            "& 8\u21E8 &c & e must be placed at the third grid above the reactor");

    public static final SlimefunItemStack FREEZER = new SlimefunItemStack(
            "FREEZER",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "& b Refrigerator",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack FREEZER_2 = new SlimefunItemStack(
            "FREEZER_2",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "& b Refrigerator & 7 (&eII& 7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 2x",
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack FREEZER_3 = new SlimefunItemStack(
            "FREEZER_3",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "& b Refrigerator & 7 (&eIII& 7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(42));

    public static final SlimefunItemStack ELECTRIC_GOLD_PAN = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN",
            Material.BROWN_TERRACOTTA,
            "& 6 Electric gold miner",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_2 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_2",
            Material.BROWN_TERRACOTTA,
            "& 6 Electric Gold Gear & 7 (&eII& 7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "& 8\u21E8 & 7: 3x",
            LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_3 = new SlimefunItemStack(
            "ELECTRIC_GOLD_PAN_3",
            Material.BROWN_TERRACOTTA,
            "& 6 Electric Gold Gear & 7 (&eIII& 7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7: 10x",
            LoreBuilder.powerPerSecond(14));

    public static final SlimefunItemStack ELECTRIC_DUST_WASHER = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER",
            Material.BLUE_STAINED_GLASS,
            "& 3 Electric mine washing machines",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_2 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_2",
            Material.BLUE_STAINED_GLASS,
            "& 3 Electric Miner & 7 (&eII& 7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 2x",
            LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_3 = new SlimefunItemStack(
            "ELECTRIC_DUST_WASHER_3",
            Material.BLUE_STAINED_GLASS,
            "& 3 Electromagnetizer & 7 (&eIII& 7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7: 10x",
            LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY",
            Material.RED_TERRACOTTA,
            "& c Electrocution casting machines",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 1x",
            LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_2 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_2",
            Material.RED_TERRACOTTA,
            "& c Electrocution Ultron & 7 (&eII& 7)",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 2x",
            LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_3 = new SlimefunItemStack(
            "ELECTRIC_INGOT_FACTORY_3",
            Material.RED_TERRACOTTA,
            "& c Electrocuted Astronomer & 7 (& eIII& 7)",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 Speed: 8x",
            LoreBuilder.powerPerSecond(40));

    // @Deprecated
    // public static final SlimefunItemStack AUTOMATED_CRAFTING_CHAMBER = new
    // SlimefunItemStack ("AUTOMATED_CRAFTING_CHAMBER", Madrid.CRAFTING_TABLE, "&6 Automated Synths", ""
    // LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &710
    // J/O");

    public static final SlimefunItemStack FLUID_PUMP = new SlimefunItemStack(
            "FLUID_PUMP",
            Material.BLUE_TERRACOTTA,
            "& 9 fluid pumps",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "& 8\u21E8 & e\u26A1 & 732 J/ Square");
    public static final SlimefunItemStack CHARGING_BENCH = new SlimefunItemStack(
            "CHARGING_BENCH",
            Material.CRAFTING_TABLE,
            "Radio & 6",
            "",
            "&r can charge items like jet backpacks.",
            "",
            LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE),
            "& 8\u21E8 & e\u26A1 & 7128 J Storeable",
            "& 8\u21E8 & e\u26A1 & 7 Energy Loss Rate: &c 50%");

    public static final SlimefunItemStack VANILLA_AUTO_CRAFTER = new SlimefunItemStack(
            "VANILLA_AUTO_CRAFTER",
            HeadTexture.VANILLA_AUTO_CRAFTER,
            "& 2 Automated Synths & 8 (original)",
            "",
            "& f Place the machine on a square that can fit anything.",
            "& f can automatically synthesize anything!",
            "& f can synthesize & e general workstations & f can synthesize items",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "& 8\u21E8 & e\u26A1 & 7 Synthesis Consumption 16 J");
    public static final SlimefunItemStack ENHANCED_AUTO_CRAFTER = new SlimefunItemStack(
            "ENHANCED_AUTO_CRAFTER",
            HeadTexture.ENHANCED_AUTO_CRAFTER,
            "& 2 Automated Synths & 8 (Advanced)",
            "",
            "& f Place the machine on a square that can fit anything.",
            "& f can automatically synthesize anything!",
            "& f can synthesize & e advanced workstations & f can synthesize items",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "& 8\u21E8 & e\u26A1 & 7 Synthesis Consumption 16 J");
    public static final SlimefunItemStack ARMOR_AUTO_CRAFTER = new SlimefunItemStack(
            "ARMOR_AUTO_CRAFTER",
            HeadTexture.ARMOR_AUTO_CRAFTER,
            "& 2 Automated Synthetics & 8 (garpment)",
            "",
            "& f Place the machine on a square that can fit anything.",
            "& f can automatically synthesynthesize what the armor pads can synthesize.",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            "Consumption of & 8\u21E8 & e\u26A1 & 7 synthetic items 32 J");

    public static final SlimefunItemStack IRON_GOLEM_ASSEMBLER = new SlimefunItemStack(
            "IRON_GOLEM_ASSEMBLER",
            Material.IRON_BLOCK,
            "Puppet assembly machine & 6",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 cooling time: & b30 seconds",
            LoreBuilder.powerBuffer(4096),
            "& 2 1E8 & e 26A1 & 72048 J/Puppets");
    public static final SlimefunItemStack WITHER_ASSEMBLER = new SlimefunItemStack(
            "WITHER_ASSEMBLER",
            Material.OBSIDIAN,
            "The & 5 vertigo assembly machine",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            "& 8\u21E8 & 7 cooling time: & b30 seconds",
            "& 8\u21E8 & e\u26A1 & 74096 J Storeable",
            "& 8\u21E8 & e\u26A1 & 74096 J/Spill");

    public static final SlimefunItemStack TRASH_CAN =
            new SlimefunItemStack("TRASH_CAN_BLOCK", HeadTexture.TRASH_CAN, "& 3 Dumpster", "", "&r can put the unwanted items in here.");

    public static final SlimefunItemStack ELYTRA_SCALE =
            new SlimefunItemStack("ELYTRA_SCALE", Material.FEATHER, "The & b-wing scales.");
    public static final SlimefunItemStack INFUSED_ELYTRA =
            new SlimefunItemStack("INFUSED_ELYTRA", Material.ELYTRA, "♪ 5 wings (Empirical repair)");
    public static final SlimefunItemStack SOULBOUND_ELYTRA =
            new SlimefunItemStack("SOULBOUND_ELYTRA", Material.ELYTRA, "& c-wing (soul tied)");

    public static final SlimefunItemStack MAGNESIUM_SALT =
            new SlimefunItemStack("MAGNESIUM_SALT", Material.SUGAR, "& magnesium salt", "", "& 7 is a special fuel that can be used in magnesium generators");
    public static final SlimefunItemStack MAGNESIUM_GENERATOR = new SlimefunItemStack(
            "MAGNESIUM_GENERATOR",
            HeadTexture.GENERATOR,
            "& magnesium generators",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(128),
            LoreBuilder.powerPerSecond(36));

    // Don't delete it
    public static final SlimefunItemStack CRAFTER_SMART_PORT = new SlimefunItemStack(
            "CRAFTER_SMART_PORT", Material.LIME_STAINED_GLASS, "& a Synthetic Smart Interactive Interface", "", "& 5 may allocate the amount of input according to the amount of composite table material", "& 5 and has a specified output slot");

    static {
        INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
    }
}
