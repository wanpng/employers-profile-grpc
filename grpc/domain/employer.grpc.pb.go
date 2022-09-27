// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.19.4
// source: protos/domain/employer.grpc.proto

package domain

import (
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

type EmployerGrpc struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id                 string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	CompanyName        string `protobuf:"bytes,2,opt,name=company_name,json=companyName,proto3" json:"company_name,omitempty"`
	WebsiteUrl         string `protobuf:"bytes,3,opt,name=website_url,json=websiteUrl,proto3" json:"website_url,omitempty"`
	Industry           string `protobuf:"bytes,4,opt,name=industry,proto3" json:"industry,omitempty"`
	PhotoUrl           string `protobuf:"bytes,5,opt,name=photo_url,json=photoUrl,proto3" json:"photo_url,omitempty"`
	CompanyPhoneNumber string `protobuf:"bytes,6,opt,name=company_phone_number,json=companyPhoneNumber,proto3" json:"company_phone_number,omitempty"`
	CompanyAddress     string `protobuf:"bytes,7,opt,name=company_address,json=companyAddress,proto3" json:"company_address,omitempty"`
	CompanyInformation string `protobuf:"bytes,8,opt,name=company_information,json=companyInformation,proto3" json:"company_information,omitempty"`
	IsLanco            bool   `protobuf:"varint,9,opt,name=is_lanco,json=isLanco,proto3" json:"is_lanco,omitempty"`
}

func (x *EmployerGrpc) Reset() {
	*x = EmployerGrpc{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_employer_grpc_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *EmployerGrpc) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*EmployerGrpc) ProtoMessage() {}

func (x *EmployerGrpc) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_employer_grpc_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use EmployerGrpc.ProtoReflect.Descriptor instead.
func (*EmployerGrpc) Descriptor() ([]byte, []int) {
	return file_protos_domain_employer_grpc_proto_rawDescGZIP(), []int{0}
}

func (x *EmployerGrpc) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *EmployerGrpc) GetCompanyName() string {
	if x != nil {
		return x.CompanyName
	}
	return ""
}

func (x *EmployerGrpc) GetWebsiteUrl() string {
	if x != nil {
		return x.WebsiteUrl
	}
	return ""
}

func (x *EmployerGrpc) GetIndustry() string {
	if x != nil {
		return x.Industry
	}
	return ""
}

func (x *EmployerGrpc) GetPhotoUrl() string {
	if x != nil {
		return x.PhotoUrl
	}
	return ""
}

func (x *EmployerGrpc) GetCompanyPhoneNumber() string {
	if x != nil {
		return x.CompanyPhoneNumber
	}
	return ""
}

func (x *EmployerGrpc) GetCompanyAddress() string {
	if x != nil {
		return x.CompanyAddress
	}
	return ""
}

func (x *EmployerGrpc) GetCompanyInformation() string {
	if x != nil {
		return x.CompanyInformation
	}
	return ""
}

func (x *EmployerGrpc) GetIsLanco() bool {
	if x != nil {
		return x.IsLanco
	}
	return false
}

var File_protos_domain_employer_grpc_proto protoreflect.FileDescriptor

var file_protos_domain_employer_grpc_proto_rawDesc = []byte{
	0x0a, 0x21, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f,
	0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61,
	0x69, 0x6e, 0x22, 0xc2, 0x02, 0x0a, 0x0c, 0x45, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x47,
	0x72, 0x70, 0x63, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x02, 0x69, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x63, 0x6f, 0x6d, 0x70, 0x61, 0x6e, 0x79, 0x5f, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x63, 0x6f, 0x6d, 0x70, 0x61,
	0x6e, 0x79, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x77, 0x65, 0x62, 0x73, 0x69, 0x74,
	0x65, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x77, 0x65, 0x62,
	0x73, 0x69, 0x74, 0x65, 0x55, 0x72, 0x6c, 0x12, 0x1a, 0x0a, 0x08, 0x69, 0x6e, 0x64, 0x75, 0x73,
	0x74, 0x72, 0x79, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x69, 0x6e, 0x64, 0x75, 0x73,
	0x74, 0x72, 0x79, 0x12, 0x1b, 0x0a, 0x09, 0x70, 0x68, 0x6f, 0x74, 0x6f, 0x5f, 0x75, 0x72, 0x6c,
	0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x68, 0x6f, 0x74, 0x6f, 0x55, 0x72, 0x6c,
	0x12, 0x30, 0x0a, 0x14, 0x63, 0x6f, 0x6d, 0x70, 0x61, 0x6e, 0x79, 0x5f, 0x70, 0x68, 0x6f, 0x6e,
	0x65, 0x5f, 0x6e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x12,
	0x63, 0x6f, 0x6d, 0x70, 0x61, 0x6e, 0x79, 0x50, 0x68, 0x6f, 0x6e, 0x65, 0x4e, 0x75, 0x6d, 0x62,
	0x65, 0x72, 0x12, 0x27, 0x0a, 0x0f, 0x63, 0x6f, 0x6d, 0x70, 0x61, 0x6e, 0x79, 0x5f, 0x61, 0x64,
	0x64, 0x72, 0x65, 0x73, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x63, 0x6f, 0x6d,
	0x70, 0x61, 0x6e, 0x79, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x12, 0x2f, 0x0a, 0x13, 0x63,
	0x6f, 0x6d, 0x70, 0x61, 0x6e, 0x79, 0x5f, 0x69, 0x6e, 0x66, 0x6f, 0x72, 0x6d, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x12, 0x63, 0x6f, 0x6d, 0x70, 0x61, 0x6e,
	0x79, 0x49, 0x6e, 0x66, 0x6f, 0x72, 0x6d, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x19, 0x0a, 0x08,
	0x69, 0x73, 0x5f, 0x6c, 0x61, 0x6e, 0x63, 0x6f, 0x18, 0x09, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07,
	0x69, 0x73, 0x4c, 0x61, 0x6e, 0x63, 0x6f, 0x42, 0x6d, 0x0a, 0x1f, 0x63, 0x6f, 0x6d, 0x2e, 0x77,
	0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2e, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x2e, 0x67,
	0x72, 0x70, 0x63, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x42, 0x12, 0x45, 0x6d, 0x70, 0x6c,
	0x6f, 0x79, 0x65, 0x72, 0x47, 0x72, 0x70, 0x63, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x50, 0x01,
	0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x61, 0x6e,
	0x70, 0x6e, 0x67, 0x2f, 0x65, 0x6d, 0x70, 0x6c, 0x6f, 0x79, 0x65, 0x72, 0x73, 0x2d, 0x70, 0x72,
	0x6f, 0x66, 0x69, 0x6c, 0x65, 0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x67, 0x72, 0x70, 0x63, 0x2f,
	0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_protos_domain_employer_grpc_proto_rawDescOnce sync.Once
	file_protos_domain_employer_grpc_proto_rawDescData = file_protos_domain_employer_grpc_proto_rawDesc
)

func file_protos_domain_employer_grpc_proto_rawDescGZIP() []byte {
	file_protos_domain_employer_grpc_proto_rawDescOnce.Do(func() {
		file_protos_domain_employer_grpc_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_domain_employer_grpc_proto_rawDescData)
	})
	return file_protos_domain_employer_grpc_proto_rawDescData
}

var file_protos_domain_employer_grpc_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_protos_domain_employer_grpc_proto_goTypes = []interface{}{
	(*EmployerGrpc)(nil), // 0: protos.domain.EmployerGrpc
}
var file_protos_domain_employer_grpc_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_protos_domain_employer_grpc_proto_init() }
func file_protos_domain_employer_grpc_proto_init() {
	if File_protos_domain_employer_grpc_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_domain_employer_grpc_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*EmployerGrpc); i {
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
			RawDescriptor: file_protos_domain_employer_grpc_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_protos_domain_employer_grpc_proto_goTypes,
		DependencyIndexes: file_protos_domain_employer_grpc_proto_depIdxs,
		MessageInfos:      file_protos_domain_employer_grpc_proto_msgTypes,
	}.Build()
	File_protos_domain_employer_grpc_proto = out.File
	file_protos_domain_employer_grpc_proto_rawDesc = nil
	file_protos_domain_employer_grpc_proto_goTypes = nil
	file_protos_domain_employer_grpc_proto_depIdxs = nil
}
