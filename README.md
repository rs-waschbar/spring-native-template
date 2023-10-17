# spring-lambda-native


## Getting started - Lambda

You need a Docker installed and running

then run

```
./build.sh
```

it creates a "native" package with function.zip, for the amazonlinux

that can be uploaded to S3 bucket and then deployed to the native lambda

## Getting started - native local image

[Install GraalVM](https://www.graalvm.org/latest/docs/getting-started/)
then run
```
./build-local.sh
```
The result native app will be compiled for the current system.

## Resources and Reflection support
Native Image has partial support for the reflection

Resources and Reflection classes should be registered in
[RuntimeHints.java](src/main/java/com/example/demo/config/RuntimeHints.java)
as a runtime hints - [Spring documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/native-image.html#native-image.advanced.custom-hints)

or as a json registered file
[GraalVM documentation](https://www.graalvm.org/jdk17/reference-manual/native-image/dynamic-features/Reflection/)
