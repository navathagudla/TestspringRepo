FROM ubuntu:latest
LABEL authors="navathag"

ENTRYPOINT ["top", "-b"]