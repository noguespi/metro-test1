#!/usr/bin/env bash

cd $(dirname "$0")

if [ -z "$GRADLE_USER_HOME" ]; then
  echo "\$GRADLE_USER_HOME not defined"
  exit 1
fi

rm -rf $GRADLE_USER_HOME/caches/build-cache-* \
  && rm -rf ./.gradle && ./gradlew clean && ./gradlew -p buildSrc clean && ./gradlew --stop
