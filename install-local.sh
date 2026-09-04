#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
DEST="${HOME}/.m2/repository/it/upwardtechnology/gestionale/upward-plugin-api/1.1.1"
mkdir -p "$DEST"
cp "$ROOT/upward-plugin-api-1.1.1.jar" "$DEST/upward-plugin-api-1.1.1.jar"
cp "$ROOT/upward-plugin-api-1.1.1.pom" "$DEST/upward-plugin-api-1.1.1.pom"
printf 'Upward Plugin API 1.1.1 installata in %s\n' "$DEST"
