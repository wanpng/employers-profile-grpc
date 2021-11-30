// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.17.3
// source: protos/service/employer_service.grpc.proto

package service

import (
	domain "github.com/wanpng/employers-profile-grpc/grpc/domain"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type GetEmployerRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	EmployerId string `protobuf:"bytes,1,opt,name=employer_id,json=employerId,proto3" json:"employer_id,omitempty"`
}

func (x *GetEmployerRequest) Reset() {
	*x = GetEmployerRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_employer_service_grpc_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetEmployerRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetEmployerRequest) ProtoMessage() {}

func (x *GetEmployerRequest) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_employer_service_grpc_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetEmployerRequest.ProtoReflect.Descriptor instead.
func (*GetEmployerRequest) Descriptor() ([]byte, []int) {
	return file_protos_service_employer_service_grpc_proto_rawDescGZIP(), []int{0}
}

func (x *GetEmployerRequest) GetEmployerId() string {
	if x != nil {
		return x.EmployerId
	}
	return ""
}

type GetEmployerResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Employer *domain.EmployerGrpc `protobuf:"bytes,1,opt,name=employer,proto3" json:"employer,omitempty"`
}

func (x *GetEmployerResponse) Reset() {
	*x = GetEmployerResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_employer_service_grpc_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetEmployerResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetEmployerResponse) ProtoMessage() {}

func (x *GetEmployerResponse) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_employer_service_grpc_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetEmployerResponse.ProtoReflect.Descriptor instead.
func (*GetEmployerResponse) Descriptor() ([]byte, []int) {
	return file_protos_service_employer_service_grpc_proto_rawDescGZIP(), []int{1}
}

func (x *GetEmployerResponse) GetEmployer() *domain.EmployerGrpc {
	if x != nil {
		return x.Employer
	}
	return nil
}

type SearchEmployerRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	EmployerIds []string `protobuf:"bytes,1,rep,name=employer_ids,json=employerIds,proto3" json:"employer_ids,omitempty"`
	Keyword     string   `protobuf:"bytes,2,opt,name=keyword,proto3" json:"keyword,omitempty"`
}

func (x *SearchEmployerRequest) Reset() {
	*x = SearchEmployerRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_employer_service_grpc_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SearchEmployerRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SearchEmployerRequest) ProtoMessage() {}

func (x *SearchEmployerRequest) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_employer_service_grpc_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SearchEmployerRequest.ProtoReflect.Descriptor instead.
func (*SearchEmployerRequest) Descriptor() ([]byte, []int) {
	return file_protos_service_employer_service_grpc_proto_rawDescGZIP(), []int{2}
}

func (x *SearchEmployerRequest) GetEmployerIds() []string {
	if x != nil {
		return x.EmployerIds
	}
	return nil
}

func (x *SearchEmployerRequest) GetKeyword() string {
	if x != nil {
		return x.Keyword
	}
	return ""
}

type SearchEmployerResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	EmployerIds []string `protobuf:"bytes,1,rep,name=employer_ids,json=employerIds,proto3" json:"employer_ids,omitempty"`
}

func (x *SearchEmployerResponse) Reset() {
	*x = SearchEmployerResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_employer_service_grpc_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SearchEmployerResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SearchEmployerResponse) ProtoMessage() {}

func (x *SearchEmployerResponse) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_employer_service_grpc_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SearchEmployerResponse.ProtoReflect.Descriptor instead.
func (*SearchEmployerResponse) Descriptor() ([]byte, []int) {
	return file_protos_service_employer_service_grpc_proto_rawDescGZIP(), []int{3}
}

func (x *SearchEmployerResponse) GetEmployerIds() []string {
	if x != nil {
		return x.EmployerIds
	}
	return nil
}

type GetEmployerUserRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId     string `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	EmployerId string `protobuf:"bytes,2,opt,name=employer_id,json=employerId,proto3" json:"employer_id,omitempty"`
}

func (x *GetEmployerUserRequest) Reset() {
	*x = GetEmployerUserRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_employer_service_grpc_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetEmployerUserRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetEmployerUserRequest) ProtoMessage() {}

func (x *GetEmployerUserRequest) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_employer_service_grpc_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetEmployerUserRequest.ProtoReflect.Descriptor instead.
func (*GetEmployerUserRequest) Descriptor() ([]byte, []int) {
	return file_protos_service_employer_service_grpc_proto_rawDescGZIP(), []int{4}
}

func (x *GetEmployerUserRequest) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *GetEmployerUserRequest) GetEmployerId() string {
	if x != nil {
		return x.EmployerId
	}
	return ""
}

type GetEmployerUserResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	EmployerUser *domain.EmployerUserGrpc `protobuf:"bytes,1,opt,name=employer_user,json=employerUser,proto3" json:"employer_user,omitempty"`
}

func (x *GetEmployerUserResponse) Reset() {
	*x = GetEmployerUserResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_employer_service_grpc_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetEmployerUserResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetEmployerUserResponse) ProtoMessage() {}

func (x *GetEmployerUserResponse) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_employer_service_grpc_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetEmployerUserResponse.ProtoReflect.Descriptor instead.
func (*GetEmployerUserResponse) Descriptor() ([]byte, []int) {
	return file_protos_service_employer_service_grpc_proto_rawDescGZIP(), []int{5}
}

func (x *GetEmployerUserResponse) GetEmployerUser() *domain.EmployerUserGrpc {
	if x != nil {
		return x.EmployerUser
	}
	return nil
}

var File_protos_service_employer_service_grpc_proto protoreflect.FileDescriptor

var file_protos_service_employer_service_grpc_proto_rawDesc = []byte{
	0x0a, 0x2a, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2f, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x1a, 0x21, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f, 0x65, 0x6d, 0x70, 0x6c,
	0x6f, 0x79, 0x65, 0x72, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x26, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f, 0x65,
	0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x5f, 0x75, 0x73, 0x65, 0x72, 0x2e, 0x67, 0x72, 0x70,
	0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x35, 0x0a, 0x12, 0x47, 0x65, 0x74, 0x45, 0x6d,
	0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a,
	0x0b, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0a, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x49, 0x64, 0x22, 0x4e,
	0x0a, 0x13, 0x47, 0x65, 0x74, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x37, 0x0a, 0x08, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65,
	0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73,
	0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72,
	0x47, 0x72, 0x70, 0x63, 0x52, 0x08, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x22, 0x54,
	0x0a, 0x15, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x21, 0x0a, 0x0c, 0x65, 0x6d, 0x70, 0x6c, 0x6f,
	0x79, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x52, 0x0b, 0x65,
	0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x49, 0x64, 0x73, 0x12, 0x18, 0x0a, 0x07, 0x6b, 0x65,
	0x79, 0x77, 0x6f, 0x72, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6b, 0x65, 0x79,
	0x77, 0x6f, 0x72, 0x64, 0x22, 0x3b, 0x0a, 0x16, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x45, 0x6d,
	0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x21,
	0x0a, 0x0c, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x01,
	0x20, 0x03, 0x28, 0x09, 0x52, 0x0b, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x49, 0x64,
	0x73, 0x22, 0x52, 0x0a, 0x16, 0x47, 0x65, 0x74, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72,
	0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x17, 0x0a, 0x07, 0x75,
	0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x75, 0x73,
	0x65, 0x72, 0x49, 0x64, 0x12, 0x1f, 0x0a, 0x0b, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72,
	0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x65, 0x6d, 0x70, 0x6c, 0x6f,
	0x79, 0x65, 0x72, 0x49, 0x64, 0x22, 0x5f, 0x0a, 0x17, 0x47, 0x65, 0x74, 0x45, 0x6d, 0x70, 0x6c,
	0x6f, 0x79, 0x65, 0x72, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x12, 0x44, 0x0a, 0x0d, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x5f, 0x75, 0x73, 0x65,
	0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73,
	0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72,
	0x55, 0x73, 0x65, 0x72, 0x47, 0x72, 0x70, 0x63, 0x52, 0x0c, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79,
	0x65, 0x72, 0x55, 0x73, 0x65, 0x72, 0x32, 0xae, 0x02, 0x0a, 0x0f, 0x45, 0x6d, 0x70, 0x6c, 0x6f,
	0x79, 0x65, 0x72, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x56, 0x0a, 0x0b, 0x47, 0x65,
	0x74, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x12, 0x22, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x45, 0x6d,
	0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x23, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x47,
	0x65, 0x74, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x5f, 0x0a, 0x0e, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x45, 0x6d, 0x70, 0x6c,
	0x6f, 0x79, 0x65, 0x72, 0x12, 0x25, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x53, 0x65, 0x61, 0x72, 0x63, 0x68, 0x45, 0x6d, 0x70, 0x6c,
	0x6f, 0x79, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x26, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x53, 0x65, 0x61,
	0x72, 0x63, 0x68, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x12, 0x62, 0x0a, 0x0f, 0x47, 0x65, 0x74, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79,
	0x65, 0x72, 0x55, 0x73, 0x65, 0x72, 0x12, 0x26, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x45, 0x6d, 0x70, 0x6c, 0x6f,
	0x79, 0x65, 0x72, 0x55, 0x73, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x27,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e,
	0x47, 0x65, 0x74, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x55, 0x73, 0x65, 0x72, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x72, 0x0a, 0x20, 0x63, 0x6f, 0x6d, 0x2e, 0x77,
	0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2e, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x2e, 0x67,
	0x72, 0x70, 0x63, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x42, 0x15, 0x45, 0x6d, 0x70,
	0x6c, 0x6f, 0x79, 0x65, 0x72, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x72, 0x6f, 0x74,
	0x6f, 0x73, 0x50, 0x01, 0x5a, 0x35, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2f, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72,
	0x73, 0x2d, 0x70, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x67,
	0x72, 0x70, 0x63, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_protos_service_employer_service_grpc_proto_rawDescOnce sync.Once
	file_protos_service_employer_service_grpc_proto_rawDescData = file_protos_service_employer_service_grpc_proto_rawDesc
)

func file_protos_service_employer_service_grpc_proto_rawDescGZIP() []byte {
	file_protos_service_employer_service_grpc_proto_rawDescOnce.Do(func() {
		file_protos_service_employer_service_grpc_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_service_employer_service_grpc_proto_rawDescData)
	})
	return file_protos_service_employer_service_grpc_proto_rawDescData
}

var file_protos_service_employer_service_grpc_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_protos_service_employer_service_grpc_proto_goTypes = []interface{}{
	(*GetEmployerRequest)(nil),      // 0: protos.service.GetEmployerRequest
	(*GetEmployerResponse)(nil),     // 1: protos.service.GetEmployerResponse
	(*SearchEmployerRequest)(nil),   // 2: protos.service.SearchEmployerRequest
	(*SearchEmployerResponse)(nil),  // 3: protos.service.SearchEmployerResponse
	(*GetEmployerUserRequest)(nil),  // 4: protos.service.GetEmployerUserRequest
	(*GetEmployerUserResponse)(nil), // 5: protos.service.GetEmployerUserResponse
	(*domain.EmployerGrpc)(nil),     // 6: protos.domain.EmployerGrpc
	(*domain.EmployerUserGrpc)(nil), // 7: protos.domain.EmployerUserGrpc
}
var file_protos_service_employer_service_grpc_proto_depIdxs = []int32{
	6, // 0: protos.service.GetEmployerResponse.employer:type_name -> protos.domain.EmployerGrpc
	7, // 1: protos.service.GetEmployerUserResponse.employer_user:type_name -> protos.domain.EmployerUserGrpc
	0, // 2: protos.service.EmployerService.GetEmployer:input_type -> protos.service.GetEmployerRequest
	2, // 3: protos.service.EmployerService.SearchEmployer:input_type -> protos.service.SearchEmployerRequest
	4, // 4: protos.service.EmployerService.GetEmployerUser:input_type -> protos.service.GetEmployerUserRequest
	1, // 5: protos.service.EmployerService.GetEmployer:output_type -> protos.service.GetEmployerResponse
	3, // 6: protos.service.EmployerService.SearchEmployer:output_type -> protos.service.SearchEmployerResponse
	5, // 7: protos.service.EmployerService.GetEmployerUser:output_type -> protos.service.GetEmployerUserResponse
	5, // [5:8] is the sub-list for method output_type
	2, // [2:5] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_protos_service_employer_service_grpc_proto_init() }
func file_protos_service_employer_service_grpc_proto_init() {
	if File_protos_service_employer_service_grpc_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_service_employer_service_grpc_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetEmployerRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_service_employer_service_grpc_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetEmployerResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_service_employer_service_grpc_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SearchEmployerRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_service_employer_service_grpc_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SearchEmployerResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_service_employer_service_grpc_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetEmployerUserRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_service_employer_service_grpc_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetEmployerUserResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_protos_service_employer_service_grpc_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_protos_service_employer_service_grpc_proto_goTypes,
		DependencyIndexes: file_protos_service_employer_service_grpc_proto_depIdxs,
		MessageInfos:      file_protos_service_employer_service_grpc_proto_msgTypes,
	}.Build()
	File_protos_service_employer_service_grpc_proto = out.File
	file_protos_service_employer_service_grpc_proto_rawDesc = nil
	file_protos_service_employer_service_grpc_proto_goTypes = nil
	file_protos_service_employer_service_grpc_proto_depIdxs = nil
}
