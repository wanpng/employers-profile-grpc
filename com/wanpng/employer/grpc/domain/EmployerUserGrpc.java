// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/employer_user.grpc.proto

package com.wanpng.employer.grpc.domain;

/**
 * Protobuf type {@code protos.domain.EmployerUserGrpc}
 */
public final class EmployerUserGrpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.domain.EmployerUserGrpc)
    EmployerUserGrpcOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmployerUserGrpc.newBuilder() to construct.
  private EmployerUserGrpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmployerUserGrpc() {
    id_ = "";
    employerId_ = "";
    userFirstName_ = "";
    userLastName_ = "";
    email_ = "";
    photoUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmployerUserGrpc();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EmployerUserGrpc(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            employerId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userFirstName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            userLastName_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            email_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            photoUrl_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanpng.employer.grpc.domain.EmployerUserGrpcProtos.internal_static_protos_domain_EmployerUserGrpc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.employer.grpc.domain.EmployerUserGrpcProtos.internal_static_protos_domain_EmployerUserGrpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.employer.grpc.domain.EmployerUserGrpc.class, com.wanpng.employer.grpc.domain.EmployerUserGrpc.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMPLOYER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object employerId_;
  /**
   * <code>string employer_id = 2;</code>
   * @return The employerId.
   */
  @java.lang.Override
  public java.lang.String getEmployerId() {
    java.lang.Object ref = employerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      employerId_ = s;
      return s;
    }
  }
  /**
   * <code>string employer_id = 2;</code>
   * @return The bytes for employerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmployerIdBytes() {
    java.lang.Object ref = employerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      employerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_FIRST_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object userFirstName_;
  /**
   * <code>string user_first_name = 3;</code>
   * @return The userFirstName.
   */
  @java.lang.Override
  public java.lang.String getUserFirstName() {
    java.lang.Object ref = userFirstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userFirstName_ = s;
      return s;
    }
  }
  /**
   * <code>string user_first_name = 3;</code>
   * @return The bytes for userFirstName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserFirstNameBytes() {
    java.lang.Object ref = userFirstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userFirstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_LAST_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object userLastName_;
  /**
   * <code>string user_last_name = 4;</code>
   * @return The userLastName.
   */
  @java.lang.Override
  public java.lang.String getUserLastName() {
    java.lang.Object ref = userLastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userLastName_ = s;
      return s;
    }
  }
  /**
   * <code>string user_last_name = 4;</code>
   * @return The bytes for userLastName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserLastNameBytes() {
    java.lang.Object ref = userLastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userLastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 5;
  private volatile java.lang.Object email_;
  /**
   * <code>string email = 5;</code>
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <code>string email = 5;</code>
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PHOTO_URL_FIELD_NUMBER = 6;
  private volatile java.lang.Object photoUrl_;
  /**
   * <code>string photo_url = 6;</code>
   * @return The photoUrl.
   */
  @java.lang.Override
  public java.lang.String getPhotoUrl() {
    java.lang.Object ref = photoUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      photoUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string photo_url = 6;</code>
   * @return The bytes for photoUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhotoUrlBytes() {
    java.lang.Object ref = photoUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      photoUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(employerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, employerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userFirstName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userFirstName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userLastName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, userLastName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(photoUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, photoUrl_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(employerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, employerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userFirstName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userFirstName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userLastName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, userLastName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, email_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(photoUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, photoUrl_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wanpng.employer.grpc.domain.EmployerUserGrpc)) {
      return super.equals(obj);
    }
    com.wanpng.employer.grpc.domain.EmployerUserGrpc other = (com.wanpng.employer.grpc.domain.EmployerUserGrpc) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getEmployerId()
        .equals(other.getEmployerId())) return false;
    if (!getUserFirstName()
        .equals(other.getUserFirstName())) return false;
    if (!getUserLastName()
        .equals(other.getUserLastName())) return false;
    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (!getPhotoUrl()
        .equals(other.getPhotoUrl())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + EMPLOYER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEmployerId().hashCode();
    hash = (37 * hash) + USER_FIRST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserFirstName().hashCode();
    hash = (37 * hash) + USER_LAST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserLastName().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (37 * hash) + PHOTO_URL_FIELD_NUMBER;
    hash = (53 * hash) + getPhotoUrl().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wanpng.employer.grpc.domain.EmployerUserGrpc prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code protos.domain.EmployerUserGrpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.domain.EmployerUserGrpc)
      com.wanpng.employer.grpc.domain.EmployerUserGrpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.employer.grpc.domain.EmployerUserGrpcProtos.internal_static_protos_domain_EmployerUserGrpc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.employer.grpc.domain.EmployerUserGrpcProtos.internal_static_protos_domain_EmployerUserGrpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.employer.grpc.domain.EmployerUserGrpc.class, com.wanpng.employer.grpc.domain.EmployerUserGrpc.Builder.class);
    }

    // Construct using com.wanpng.employer.grpc.domain.EmployerUserGrpc.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      employerId_ = "";

      userFirstName_ = "";

      userLastName_ = "";

      email_ = "";

      photoUrl_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.employer.grpc.domain.EmployerUserGrpcProtos.internal_static_protos_domain_EmployerUserGrpc_descriptor;
    }

    @java.lang.Override
    public com.wanpng.employer.grpc.domain.EmployerUserGrpc getDefaultInstanceForType() {
      return com.wanpng.employer.grpc.domain.EmployerUserGrpc.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.employer.grpc.domain.EmployerUserGrpc build() {
      com.wanpng.employer.grpc.domain.EmployerUserGrpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.employer.grpc.domain.EmployerUserGrpc buildPartial() {
      com.wanpng.employer.grpc.domain.EmployerUserGrpc result = new com.wanpng.employer.grpc.domain.EmployerUserGrpc(this);
      result.id_ = id_;
      result.employerId_ = employerId_;
      result.userFirstName_ = userFirstName_;
      result.userLastName_ = userLastName_;
      result.email_ = email_;
      result.photoUrl_ = photoUrl_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wanpng.employer.grpc.domain.EmployerUserGrpc) {
        return mergeFrom((com.wanpng.employer.grpc.domain.EmployerUserGrpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.employer.grpc.domain.EmployerUserGrpc other) {
      if (other == com.wanpng.employer.grpc.domain.EmployerUserGrpc.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getEmployerId().isEmpty()) {
        employerId_ = other.employerId_;
        onChanged();
      }
      if (!other.getUserFirstName().isEmpty()) {
        userFirstName_ = other.userFirstName_;
        onChanged();
      }
      if (!other.getUserLastName().isEmpty()) {
        userLastName_ = other.userLastName_;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        onChanged();
      }
      if (!other.getPhotoUrl().isEmpty()) {
        photoUrl_ = other.photoUrl_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wanpng.employer.grpc.domain.EmployerUserGrpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.employer.grpc.domain.EmployerUserGrpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object employerId_ = "";
    /**
     * <code>string employer_id = 2;</code>
     * @return The employerId.
     */
    public java.lang.String getEmployerId() {
      java.lang.Object ref = employerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        employerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string employer_id = 2;</code>
     * @return The bytes for employerId.
     */
    public com.google.protobuf.ByteString
        getEmployerIdBytes() {
      java.lang.Object ref = employerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        employerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string employer_id = 2;</code>
     * @param value The employerId to set.
     * @return This builder for chaining.
     */
    public Builder setEmployerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      employerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string employer_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmployerId() {
      
      employerId_ = getDefaultInstance().getEmployerId();
      onChanged();
      return this;
    }
    /**
     * <code>string employer_id = 2;</code>
     * @param value The bytes for employerId to set.
     * @return This builder for chaining.
     */
    public Builder setEmployerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      employerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userFirstName_ = "";
    /**
     * <code>string user_first_name = 3;</code>
     * @return The userFirstName.
     */
    public java.lang.String getUserFirstName() {
      java.lang.Object ref = userFirstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userFirstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_first_name = 3;</code>
     * @return The bytes for userFirstName.
     */
    public com.google.protobuf.ByteString
        getUserFirstNameBytes() {
      java.lang.Object ref = userFirstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userFirstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_first_name = 3;</code>
     * @param value The userFirstName to set.
     * @return This builder for chaining.
     */
    public Builder setUserFirstName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userFirstName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_first_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserFirstName() {
      
      userFirstName_ = getDefaultInstance().getUserFirstName();
      onChanged();
      return this;
    }
    /**
     * <code>string user_first_name = 3;</code>
     * @param value The bytes for userFirstName to set.
     * @return This builder for chaining.
     */
    public Builder setUserFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userFirstName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userLastName_ = "";
    /**
     * <code>string user_last_name = 4;</code>
     * @return The userLastName.
     */
    public java.lang.String getUserLastName() {
      java.lang.Object ref = userLastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userLastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_last_name = 4;</code>
     * @return The bytes for userLastName.
     */
    public com.google.protobuf.ByteString
        getUserLastNameBytes() {
      java.lang.Object ref = userLastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userLastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_last_name = 4;</code>
     * @param value The userLastName to set.
     * @return This builder for chaining.
     */
    public Builder setUserLastName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userLastName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_last_name = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserLastName() {
      
      userLastName_ = getDefaultInstance().getUserLastName();
      onChanged();
      return this;
    }
    /**
     * <code>string user_last_name = 4;</code>
     * @param value The bytes for userLastName to set.
     * @return This builder for chaining.
     */
    public Builder setUserLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userLastName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <code>string email = 5;</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string email = 5;</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string email = 5;</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      email_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string email = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      
      email_ = getDefaultInstance().getEmail();
      onChanged();
      return this;
    }
    /**
     * <code>string email = 5;</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      email_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object photoUrl_ = "";
    /**
     * <code>string photo_url = 6;</code>
     * @return The photoUrl.
     */
    public java.lang.String getPhotoUrl() {
      java.lang.Object ref = photoUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        photoUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string photo_url = 6;</code>
     * @return The bytes for photoUrl.
     */
    public com.google.protobuf.ByteString
        getPhotoUrlBytes() {
      java.lang.Object ref = photoUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        photoUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string photo_url = 6;</code>
     * @param value The photoUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPhotoUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      photoUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string photo_url = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhotoUrl() {
      
      photoUrl_ = getDefaultInstance().getPhotoUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string photo_url = 6;</code>
     * @param value The bytes for photoUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPhotoUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      photoUrl_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:protos.domain.EmployerUserGrpc)
  }

  // @@protoc_insertion_point(class_scope:protos.domain.EmployerUserGrpc)
  private static final com.wanpng.employer.grpc.domain.EmployerUserGrpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.employer.grpc.domain.EmployerUserGrpc();
  }

  public static com.wanpng.employer.grpc.domain.EmployerUserGrpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmployerUserGrpc>
      PARSER = new com.google.protobuf.AbstractParser<EmployerUserGrpc>() {
    @java.lang.Override
    public EmployerUserGrpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EmployerUserGrpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmployerUserGrpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmployerUserGrpc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.employer.grpc.domain.EmployerUserGrpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

