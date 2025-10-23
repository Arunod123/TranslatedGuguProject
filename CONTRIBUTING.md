# Contribution Guide

Before contributing any code to the **Slimefun Chinese Localization Edition**, you must read this contribution guide.

---

## Setting Up the Environment

We provide an automated formatting check system. Please use the following command to initialize your environment:

```bash
mvn install
```

This project already includes an `.editorconfig` file to enforce the project’s code style.
If you have your own code style preferences, please switch to this repository’s configuration before making any contributions.

---

## Commit Message Guidelines

This project **strictly enforces** the [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/) specification.

> In short, your commit message must contain the following structure:
>
> ```
> <type>[optional scope]: <description>
> ```
>
> For example, a commit that adds a new feature should look like this:
>
> ```
> feat(item): add new item to Slimefun
> ```

If your commit addresses or resolves an issue listed in the repository, you should explicitly reference it in the main commit message:

> For example: `resolves #114514`, `fix #114514`, etc.

If it’s a bug fix, you can include the issue reference directly in the main commit message — there’s no need to repeat it elsewhere.

The supported commit type prefixes are defined by the following regular expression:
`(feat(ure)?|fix|docs|style|refactor|ci|chore|perf|build|test|revert|trans)`

Additionally, if your commit is **related to translations**, the commit type should be `trans`.

---

## Code Style Guidelines

**!! This project uses 4-space indentation !!**

Please do **not** excessively shorten or compress your code — fewer spaces won’t make Slimefun run any faster.

We use **Spotless** as the code formatting tool.
Before submitting your code, you **must** run:

```bash
mvn spotless:check spotless:apply
```

This will automatically format your code.
If your code does not pass the format check, your Pull Request will be blocked by the format validator.

---

## Types of Code Contributions

You may contribute code that falls into the following categories:

* Bug fixes
* New features
* API-related contributions

Downstream projects are now allowed to submit API-related code.
Developers can depend on the localized version of Slimefun via **JitPack**.
