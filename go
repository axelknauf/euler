#!/usr/bin/env bash

run() {
    clj -m euler.main
}

help() {
    echo "Usage: ./go <command>"
    echo ""
    echo "Available commands:"
    echo "  run      runs the application"
    echo ""
}

case $1 in
    run) run;;
    *) help;;
esac

exit 0

