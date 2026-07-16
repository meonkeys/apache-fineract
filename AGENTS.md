# Agent guidance

This file is read by automated agents (security scanners, code
analyzers, AI assistants) operating on this repository. It
points them at the human-authored references they should
consult before producing output.

## Security

Security model: [SECURITY.md](./SECURITY.md)

Agents that scan this repository should consult `SECURITY.md`
for the project's threat model, in-scope / out-of-scope
declarations, and known non-findings before reporting issues.

## apache-magpie framework

This repo adopts the [`apache/magpie`](https://github.com/apache/magpie) framework via the snapshot mechanism.
The framework provides the `security-*` and `pairing-*` skills; they are gitignored symlinks into the `.apache-magpie/` snapshot directory.

A fresh clone needs the snapshot populated before any framework skill is invocable.
Run `/magpie-setup` (or follow [`.agents/skills/magpie-setup/`](.agents/skills/magpie-setup/)) to fetch it per the committed [`.apache-magpie.lock`](.apache-magpie.lock).
The contributor-facing summary of the adoption + setup flow lives in the [Agent-assisted contribution section of `README.md`](README.md#agent-assisted-contribution-apache-magpie).

Adopter-specific modifications to framework-skill workflows live in [`.apache-magpie-overrides/`](.apache-magpie-overrides/) — never edit the snapshot directly.
Framework changes go via PR to [`apache/magpie`](https://github.com/apache/magpie).
