export GOPATH=$(go env GOPATH)
export PATH=$PATH:$GOPATH/bin

protoc --go_out=$GOPATH/src protos/domain/*.proto
# protoc-go-inject-tag -input=grpc/domain/jobseeker.grpc.pb.go
# protoc-go-inject-tag -input=grpc/domain/employment_type.grpc.pb.go
# protoc-go-inject-tag -input=grpc/domain/skill.grpc.pb.go

protoc --go_out=$GOPATH/src protos/service/*.proto

protoc --go-grpc_out=$GOPATH/src protos/service/*.proto

export SRC_DIR=$(pwd)
export DST_DIR=$(pwd)

protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/protos/domain/*.proto
protoc -I=$SRC_DIR --plugin=protoc-gen-grpc-java=$DST_DIR/build/protoc-gen-grpc-java --java_out=$DST_DIR --grpc-java_out=$DST_DIR $SRC_DIR/protos/service/*.proto