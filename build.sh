#builds a app binary
docker build  -t spring-graal .

#copy from the docker container to host
containerId=$(docker create -ti spring-graal bash)

#builds function zip
mkdir native
cp ./bootstrap ./native/bootstrap
docker cp ${containerId}:/tmp/dist/target/spring ./native/spring

cd native
chmod +x bootstrap
chmod +x spring
zip -j function.zip bootstrap spring

