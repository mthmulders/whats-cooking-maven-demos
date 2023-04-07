#!/usr/bin/env bash
set -euox pipefail

mvn -N wrapper:wrapper -Dmaven=3.8.6
