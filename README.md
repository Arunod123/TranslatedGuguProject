# Slimefun (Chinese Edition)

Looking for the English (original) version? [**Click here**](https://github.com/Slimefun/Slimefun4/)

Want to download it directly? [**Click here**](https://github.com/SlimefunGuguProject/Slimefun4/blob/master/README.md#floppy_disk-download-slimefun4)

Join our QQ group: **807302496**

Download [**SlimeGlue**](https://github.com/Xzavier0722/SlimeGlue/) to ensure compatibility between Slimefun and protection plugins.

---

## ⚡ Subscription Plan

Translation isn’t easy — feel free to support us via [Afdian](https://afdian.net/a/nora1ncity)!

By joining our Afdian subscription, you’ll get **early access** to the latest Slimefun builds and **higher priority** for issue handling.

> Note: **Non-annual plan users** can access automatically synced source code 15+ days after each public update.  
> The project is **not closed-source** and fully adheres to the **GPLv3 License**.

Learn more: [Subscription Plan](https://builds.guizhanss.com/sf-subscription)

![Latest Release](https://img.shields.io/github/v/release/SlimefunGuguProject/Slimefun4?include_prereleases)
![Build Status](https://builds.guizhanss.com/SlimefunGuguProject/Slimefun4/master/badge.svg)
[![Issues](https://img.shields.io/github/issues/SlimefunGuguProject/Slimefun4.svg?style=popout)](https://github.com/SlimefunGuguProject/Slimefun4/issues)
![Downloads](https://img.shields.io/github/downloads/SlimefunGuguProject/Slimefun4/total)

---

After switching to this Chinese edition, **do not** report issues to the official tracker using the Chinese version.  
If you insist, please use the **official development build** and submit issues in **English**.  
Otherwise, report problems [here](https://github.com/SlimefunGuguProject/Slimefun4/issues) or join the QQ group discussion.

---

## 🧪 What is Slimefun?

**Slimefun** is a plugin designed to bring a **mod-like experience** to Minecraft — offering everything from **jetpacks** to **magic altars**!

It lets players choose whether to advance through **technology** or **magic**.  
From wands to nuclear reactors — we’ve got it all.  
It even includes magical altars, energy networks, and item transport systems.

Started back in **2013**, the project has grown from a small independent plugin into a community with **thousands of participants** and **hundreds of contributors**.  
Slimefun now adds **500+ new items and recipes**!  
([Read the History of Slimefun](https://slimefun-wiki.guizhanss.cn/Slimefun-in-a-nutshell))

There are also tons of **addon plugins** available — check the [Addon List](https://slimefun-wiki.guizhanss.cn/Addons) to find what you need!

---

## 🧭 Navigation

* **[Download Slimefun 4](#floppy_disk-download-slimefun4)**
* **[Discord Server](#discord)**
* **[Bug Reports](https://github.com/SlimefunGuguProject/Slimefun4/issues)**
* **[Official Wiki](https://github.com/Slimefun/Slimefun4/wiki)**
* **[Unofficial Chinese Wiki](https://slimefun-wiki.guizhanss.cn/)**
* **[FAQ](https://slimefun-wiki.guizhanss.cn/FAQ)**

---

## 💾 Download Slimefun 4

(See: [How to Install Slimefun](https://slimefun-wiki.guizhanss.cn/Installing-Slimefun))

You can **download Slimefun 4 for free** from the [Guizhan Build Server](https://builds.guizhanss.com/SlimefunGuguProject/Slimefun4).

Here’s a comparison between the two available builds:

|                        | Testing Build (Latest)                                                                         | “Stable” Release                                                                    |
|------------------------|-----------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| **Supported Minecraft** | 🎮 1.19.X – 1.21.X                                                                              | 🎮 1.16.X – 1.21.4                                                                   |
| **Java Version**        | 💻 **Java 17+**                                                                                | 💻 **Java 17+**                                                                      |
| **Auto-Update System**  | ✔️                                                                                             | ✔️                                                                                   |
| **Frequent Updates**    | ✔️                                                                                             | ❌                                                                                   |
| **Latest Features**     | ✔️                                                                                             | ❌                                                                                   |
| **Bug Reporting**       | ✔️                                                                                             | ❌                                                                                   |
| **Download Link**       | 📦 [Download Latest](https://builds.guizhanss.com/SlimefunGuguProject/Slimefun4/master)        | 📦 [Download “Stable”](https://builds.guizhanss.com/SlimefunGuguProject/Slimefun4/release) |

> **Note:** The listed supported versions are for reference only — they may include historical compatibility ranges.  
> **Recommendation:** Use the **latest testing build** for the newest content and bug fixes!

---

## ⚙️ (For Developers) Add as Dependency

<details>
<summary>How to add Slimefun 4 as a dependency</summary>

Add our private Maven repository first:

**Maven:**

Release builds:
```xml
<repository>
    <id>gugu-maven-repo</id>
    <url>https://maven.norain.city/releases</url>
</repository>
````

Development builds (Slimefun Insider / DEV branch):

```xml
<repository>
    <id>gugu-maven-repo</id>
    <url>https://maven.norain.city/snapshots</url>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```

**Gradle (build.gradle):**

Release:

```groovy
repositories {
    maven {
        url "https://maven.norain.city/releases"
    }
}
```

Development:

```groovy
repositories {
    maven {
        url "https://maven.norain.city/snapshots"
    }
}
```

Then add Slimefun 4 as a dependency:

**Maven:**

```xml
<dependency>
    <groupId>com.github.SlimefunGuguProject</groupId>
    <artifactId>Slimefun4</artifactId>
    <version>DEV-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

**Gradle:**

```groovy
dependencies {
    compileOnly 'com.github.SlimefunGuguProject:Slimefun4:DEV-SNAPSHOT'
}
```

</details>

---

## 🧰 Building Slimefun from Source

You’ll need [Git](https://git-scm.com/) installed.

Open a terminal in the folder where you want to store the code, and run:

```bash
git clone https://github.com/SlimefunGuguProject/Slimefun4.git --depth=1
```

Then open the `Slimefun4` folder and run:

* On Windows: `.\mvnw.cmd package`
* On macOS/Linux: `./mvnw package`

The compiled plugin file will appear in the `Slimefun4/target` directory.

---

## 🖼️ Screenshots

Here’s what Slimefun looks like in action!
Screenshots provided by members of the Discord community:

|                                      Reactors & Power                                     |                                     Automation Factory                                    |                                      Magic Laboratory                                     |
| :---------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------: |
| ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase1.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase6.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase5.png) |
|                                     *by HamtaBot#0001*                                    |                                  *by Piͭxͪeͤl (mnb)#5049*                                 |                                     *by Kilaruna#4981*                                    |
| ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase4.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase3.png) | ![](https://raw.githubusercontent.com/Slimefun/Slimefun-Wiki/master/images/showcase2.png) |
|                                   *by GalaxyKat11#3816*                                   |                                     *by TamThan#7987*                                     |                                     *by Kilaruna#4981*                                    |

---

## 🎧 Community

### Chinese Edition QQ Groups

* Slimefun Chinese Community: **807302496**
* Addon Development & Updates: **205679802**

### KOOK (Chinese Discord-like Platform)

Join the KOOK server: [Slimefun Simplified Chinese Community](https://kook.top/oqZwh8)

### Official Discord

Join the **official Slimefun Discord** to chat with **7,000+ members worldwide**.
Click to join discussions, share feedback, or participate in community events.

> ⚠️ Note: The official Discord **does not** accept bug reports — please use the [Issue Tracker](https://github.com/SlimefunGuguProject/Slimefun4/issues) for that.

Before joining, please review the [Discord Rules](https://github.com/Slimefun/Slimefun4/wiki/Discord-Rules).
Failure to comply may result in removal or bans.

<p align="center">
  <a href="https://discord.gg/slimefun">
    <img src="https://discordapp.com/api/guilds/565557184348422174/widget.png?style=banner3" alt="Discord Invite"/>
  </a>
</p>

---

## 📖 Wiki

The Wiki is detailed, beginner-friendly, and regularly updated.
You can also help expand or translate it!

* Official Wiki: [https://github.com/Slimefun/Slimefun4/wiki](https://github.com/Slimefun/Slimefun4/wiki)
* Unofficial Chinese Wiki: [https://slimefun-wiki.guizhanss.cn/](https://slimefun-wiki.guizhanss.cn/)

#### 🌟 Useful Chinese Documentation

* [What is Slimefun?](https://slimefun-wiki.guizhanss.cn/Slimefun-in-a-nutshell)
* [How to Install Slimefun](https://slimefun-wiki.guizhanss.cn/Installing-Slimefun)
* [Slimefun 4 Addon List](https://slimefun-wiki.guizhanss.cn/Addons)
* [Developer Guide (Addon Creation)](https://slimefun-wiki.guizhanss.cn/Developer-Guide)
* [Getting Started](https://slimefun-wiki.guizhanss.cn/Getting-Started)
* [FAQ](https://slimefun-wiki.guizhanss.cn/FAQ)
* [Common Issues](https://slimefun-wiki.guizhanss.cn/Common-Issues)
* [Help Expand the Wiki](https://slimefun-wiki.guizhanss.cn/Expanding-the-Wiki)
* [Help Translate Slimefun](https://slimefun-wiki.guizhanss.cn/Translating-Slimefun)

---

## 🤝 Contributing

Slimefun 4 is an **open-source project** licensed under **GNU GPLv3**.
Over **100+ contributors** have helped shape this project.
We welcome contributions via pull requests — your help keeps the project alive ❤️.

---

## ⚠️ Disclaimer

Slimefun 4 uses several systems for plugin telemetry and automatic updates.
The plugin **does not** collect any personal or identifying information.

You can disable both telemetry and auto-updates at any time.

<details>
  <summary>Auto-Update</summary>

The Chinese Edition uses the GitHub API + GuizhanBuild API to check and download updates.
Auto-updating is **enabled by default**, but can be disabled in `/plugins/Slimefun/config.yml`.
We recommend keeping it enabled to stay up-to-date.

</details>

<details>
  <summary>Anonymous Server Data</summary>

Slimefun 4 uses [bStats](https://bstats.org/plugin/bukkit/Slimefun/4574) to collect anonymous usage statistics.
All data is **fully anonymized** and **publicly accessible**:
[https://bstats.org/plugin/bukkit/Slimefun/4574](https://bstats.org/plugin/bukkit/Slimefun/4574)

You can disable this in `/plugins/bStats/config.yml`.
See [bStats Privacy Policy](https://bstats.org/privacy-policy) for details.

</details>

<details>
  <summary>GitHub Data</summary>

Slimefun 4 uses the [GitHub API](https://api.github.com/) to gather open-source project data.
No Minecraft server data is ever transmitted to GitHub.

Collected info includes (but is not limited to):

* List of contributors, usernames, and profile links
* Number of open issues
* Pending pull requests
* Stars, branches, repository size
* Last commit date

</details>

The plugin also uses [textures.minecraft.net](https://www.minecraft.net/en-us) to fetch player skins.
Please note: **Slimefun is not affiliated with Mojang Studios or Minecraft.**

