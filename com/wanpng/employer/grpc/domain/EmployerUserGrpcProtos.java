// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/employer_user.grpc.proto

package com.wanpng.employer.grpc.domain;

public final class EmployerUserGrpcProtos {
  private EmployerUserGrpcProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_EmployerUserGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_EmployerUserGrpc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&protos/domain/employer_user.grpc.proto" +
      "\022\rprotos.domain\"\206\001\n\020EmployerUserGrpc\022\n\n\002" +
      "id\030\001 \001(\t\022\023\n\013employer_id\030\002 \001(\t\022\027\n\017user_fi" +
      "rst_name\030\003 \001(\t\022\026\n\016user_last_name\030\004 \001(\t\022\r" +
      "\n\005email\030\005 \001(\t\022\021\n\tphoto_url\030\006 \001(\tBq\n\037com." +
      "wanpng.employer.grpc.domainB\026EmployerUse" +
      "rGrpcProtosP\001Z4github.com/wanpng/employe" +
      "rs-profile-grpc/grpc/domainb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protos_domain_EmployerUserGrpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_EmployerUserGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_EmployerUserGrpc_descriptor,
        new java.lang.String[] { "Id", "EmployerId", "UserFirstName", "UserLastName", "Email", "PhotoUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
