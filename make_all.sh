#!/bin/bash

for i in gatkRunner licorice; do
  echo $i
  pushd $i
  mvn install
  popd
done

pushd GUI
mvn clean package
popd
