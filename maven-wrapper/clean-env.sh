#!/usr/bin/env bash
set -euox pipefail

docker run -it -v `pwd`:/project -w /project ibm-semeru-runtimes:open-17-jre