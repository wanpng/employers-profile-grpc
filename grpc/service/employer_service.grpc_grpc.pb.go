// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package service

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// EmployerServiceClient is the client API for EmployerService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type EmployerServiceClient interface {
	GetEmployer(ctx context.Context, in *GetEmployerRequest, opts ...grpc.CallOption) (*GetEmployerResponse, error)
}

type employerServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewEmployerServiceClient(cc grpc.ClientConnInterface) EmployerServiceClient {
	return &employerServiceClient{cc}
}

func (c *employerServiceClient) GetEmployer(ctx context.Context, in *GetEmployerRequest, opts ...grpc.CallOption) (*GetEmployerResponse, error) {
	out := new(GetEmployerResponse)
	err := c.cc.Invoke(ctx, "/protos.service.EmployerService/GetEmployer", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// EmployerServiceServer is the server API for EmployerService service.
// All implementations must embed UnimplementedEmployerServiceServer
// for forward compatibility
type EmployerServiceServer interface {
	GetEmployer(context.Context, *GetEmployerRequest) (*GetEmployerResponse, error)
	mustEmbedUnimplementedEmployerServiceServer()
}

// UnimplementedEmployerServiceServer must be embedded to have forward compatible implementations.
type UnimplementedEmployerServiceServer struct {
}

func (UnimplementedEmployerServiceServer) GetEmployer(context.Context, *GetEmployerRequest) (*GetEmployerResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetEmployer not implemented")
}
func (UnimplementedEmployerServiceServer) mustEmbedUnimplementedEmployerServiceServer() {}

// UnsafeEmployerServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to EmployerServiceServer will
// result in compilation errors.
type UnsafeEmployerServiceServer interface {
	mustEmbedUnimplementedEmployerServiceServer()
}

func RegisterEmployerServiceServer(s grpc.ServiceRegistrar, srv EmployerServiceServer) {
	s.RegisterService(&EmployerService_ServiceDesc, srv)
}

func _EmployerService_GetEmployer_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetEmployerRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(EmployerServiceServer).GetEmployer(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/protos.service.EmployerService/GetEmployer",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(EmployerServiceServer).GetEmployer(ctx, req.(*GetEmployerRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// EmployerService_ServiceDesc is the grpc.ServiceDesc for EmployerService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var EmployerService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "protos.service.EmployerService",
	HandlerType: (*EmployerServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetEmployer",
			Handler:    _EmployerService_GetEmployer_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "protos/service/employer_service.grpc.proto",
}