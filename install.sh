#!/bin/bash
#
COMPILER_PATH="./compiler"
BIN_PATH="/data/data/com.termux/files/usr/bin/"

chmod +x $COMPILER_PATH/ccleo $COMPILER_PATH/gta3sc
cp $COMPILER_PATH/* $BIN_PATH  -rf
