export GOPATH=$(go env GOPATH)
export PATH=$PATH:$GOPATH/bin

SRC_DIR=$(pwd)
DST_DIR=$(pwd)

echo "OS:" $OSTYPE "[compiling protocol buffers]"

protoc -I=$SRC_DIR --go_out=$GOPATH/src --java_out=$DST_DIR $SRC_DIR/protos/domain/*.proto
protoc -I=$SRC_DIR --go_out=$GOPATH/src $SRC_DIR/protos/service/*.proto

if [ $OSTYPE = msys ]
then
protoc -I=$SRC_DIR --plugin=protoc-gen-grpc-java=$DST_DIR/build/protoc-gen-grpc-java.exe --java_out=$DST_DIR $SRC_DIR/protos/service/*.proto
else
protoc -I=$SRC_DIR --plugin=protoc-gen-grpc-java=$DST_DIR/build/protoc-gen-grpc-java --java_out=$DST_DIR $SRC_DIR/protos/service/*.proto
fi