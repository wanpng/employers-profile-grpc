protoc --go_out=$GOPATH/src protos/domain/*.proto
# protoc-go-inject-tag -input=grpc/domain/jobseeker.grpc.pb.go
# protoc-go-inject-tag -input=grpc/domain/employment_type.grpc.pb.go
# protoc-go-inject-tag -input=grpc/domain/skill.grpc.pb.go

protoc --go_out=$GOPATH/src protos/service/*.proto

protoc --go-grpc_out=$GOPATH/src protos/service/*.proto
