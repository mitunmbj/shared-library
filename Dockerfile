FROM ubuntu:18.04

USER root

RUN apt-get -y update && apt-get -y upgrade
