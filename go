#!/usr/bin/env bash

run() {
    clj -m euler.main
}

runtest() {
    ./bin/kaocha
}

help() {
    echo "Usage: ./go <command>"
    echo ""
    echo "Available commands:"
    echo "  run      runs the application"
    echo "  test     runs all tests"
    echo ""
}

case $1 in
    run) run;;
    test) runtest;;
    *) help;;
esac

exit 0

