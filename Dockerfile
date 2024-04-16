FROM openjdk:17-jdk-alpine
ARG TEST_SCRIPT=build_test.sh
COPY ./build_test.sh build_test.sh
ENTRYPOINT ["./build_test.sh"]