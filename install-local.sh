#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
DEST="${HOME}/.m2/repository/it/upwardtechnology/gestionale/upward-plugin-api/1.0.0"
mkdir -p "$DEST"
cp "$ROOT/upward-plugin-api-1.0.0.jar" "$DEST/upward-plugin-api-1.0.0.jar"
cp "$ROOT/upward-plugin-api-1.0.0.pom" "$DEST/upward-plugin-api-1.0.0.pom"
printf 'Upward Plugin API 1.0.0 installata in %s\n' "$DEST"
