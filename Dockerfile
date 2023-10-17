FROM amazonlinux:2 as amazonlinux2

RUN yum update -y
RUN yum install -y wget tar gzip \
   glibc-devel zlib-devel zlib gcc libstdc++-static

RUN mkdir /graalvm
RUN wget https://download.oracle.com/graalvm/21/latest/graalvm-jdk-21_linux-x64_bin.tar.gz
RUN tar -zxvf graalvm-jdk-21_linux-x64_bin.tar.gz -C /graalvm
RUN cd /graalvm

COPY . /tmp/dist
WORKDIR /tmp/dist

ENV JAVA_HOME /graalvm/graalvm-jdk-21+35.1
RUN export JAVA_HOME

RUN ./mvnw -Pnative native:compile

ENTRYPOINT ["./app"]