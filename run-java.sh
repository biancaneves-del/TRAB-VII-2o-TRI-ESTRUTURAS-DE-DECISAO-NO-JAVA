#!/usr/bin/env bash
set -euo pipefail

source_file="main.java"
if [[ ! -s "$source_file" ]]; then
  echo "main.java is empty; add Java code before running." >&2
  exit 1
fi

build_dir="$(mktemp -d)"
trap 'rm -rf "$build_dir"' EXIT

javac -d "$build_dir" "$source_file"
java -cp "$build_dir" main
