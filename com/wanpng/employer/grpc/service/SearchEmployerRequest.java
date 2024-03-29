// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/employer_service.grpc.proto

package com.wanpng.employer.grpc.service;

/**
 * Protobuf type {@code protos.service.SearchEmployerRequest}
 */
public final class SearchEmployerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.service.SearchEmployerRequest)
    SearchEmployerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchEmployerRequest.newBuilder() to construct.
  private SearchEmployerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchEmployerRequest() {
    employerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    keyword_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchEmployerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchEmployerRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              employerIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            employerIds_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            keyword_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        employerIds_ = employerIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanpng.employer.grpc.service.EmployerServiceProtos.internal_static_protos_service_SearchEmployerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.employer.grpc.service.EmployerServiceProtos.internal_static_protos_service_SearchEmployerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.employer.grpc.service.SearchEmployerRequest.class, com.wanpng.employer.grpc.service.SearchEmployerRequest.Builder.class);
  }

  public static final int EMPLOYER_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList employerIds_;
  /**
   * <code>repeated string employer_ids = 1;</code>
   * @return A list containing the employerIds.
   */
  public com.google.protobuf.ProtocolStringList
      getEmployerIdsList() {
    return employerIds_;
  }
  /**
   * <code>repeated string employer_ids = 1;</code>
   * @return The count of employerIds.
   */
  public int getEmployerIdsCount() {
    return employerIds_.size();
  }
  /**
   * <code>repeated string employer_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The employerIds at the given index.
   */
  public java.lang.String getEmployerIds(int index) {
    return employerIds_.get(index);
  }
  /**
   * <code>repeated string employer_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the employerIds at the given index.
   */
  public com.google.protobuf.ByteString
      getEmployerIdsBytes(int index) {
    return employerIds_.getByteString(index);
  }

  public static final int KEYWORD_FIELD_NUMBER = 2;
  private volatile java.lang.Object keyword_;
  /**
   * <code>string keyword = 2;</code>
   * @return The keyword.
   */
  @java.lang.Override
  public java.lang.String getKeyword() {
    java.lang.Object ref = keyword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyword_ = s;
      return s;
    }
  }
  /**
   * <code>string keyword = 2;</code>
   * @return The bytes for keyword.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeywordBytes() {
    java.lang.Object ref = keyword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyword_ = b;
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
    for (int i = 0; i < employerIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, employerIds_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyword_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyword_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < employerIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(employerIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEmployerIdsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyword_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyword_);
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
    if (!(obj instanceof com.wanpng.employer.grpc.service.SearchEmployerRequest)) {
      return super.equals(obj);
    }
    com.wanpng.employer.grpc.service.SearchEmployerRequest other = (com.wanpng.employer.grpc.service.SearchEmployerRequest) obj;

    if (!getEmployerIdsList()
        .equals(other.getEmployerIdsList())) return false;
    if (!getKeyword()
        .equals(other.getKeyword())) return false;
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
    if (getEmployerIdsCount() > 0) {
      hash = (37 * hash) + EMPLOYER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getEmployerIdsList().hashCode();
    }
    hash = (37 * hash) + KEYWORD_FIELD_NUMBER;
    hash = (53 * hash) + getKeyword().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.employer.grpc.service.SearchEmployerRequest parseFrom(
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
  public static Builder newBuilder(com.wanpng.employer.grpc.service.SearchEmployerRequest prototype) {
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
   * Protobuf type {@code protos.service.SearchEmployerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.service.SearchEmployerRequest)
      com.wanpng.employer.grpc.service.SearchEmployerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.employer.grpc.service.EmployerServiceProtos.internal_static_protos_service_SearchEmployerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.employer.grpc.service.EmployerServiceProtos.internal_static_protos_service_SearchEmployerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.employer.grpc.service.SearchEmployerRequest.class, com.wanpng.employer.grpc.service.SearchEmployerRequest.Builder.class);
    }

    // Construct using com.wanpng.employer.grpc.service.SearchEmployerRequest.newBuilder()
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
      employerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      keyword_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.employer.grpc.service.EmployerServiceProtos.internal_static_protos_service_SearchEmployerRequest_descriptor;
    }

    @java.lang.Override
    public com.wanpng.employer.grpc.service.SearchEmployerRequest getDefaultInstanceForType() {
      return com.wanpng.employer.grpc.service.SearchEmployerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.employer.grpc.service.SearchEmployerRequest build() {
      com.wanpng.employer.grpc.service.SearchEmployerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.employer.grpc.service.SearchEmployerRequest buildPartial() {
      com.wanpng.employer.grpc.service.SearchEmployerRequest result = new com.wanpng.employer.grpc.service.SearchEmployerRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        employerIds_ = employerIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.employerIds_ = employerIds_;
      result.keyword_ = keyword_;
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
      if (other instanceof com.wanpng.employer.grpc.service.SearchEmployerRequest) {
        return mergeFrom((com.wanpng.employer.grpc.service.SearchEmployerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.employer.grpc.service.SearchEmployerRequest other) {
      if (other == com.wanpng.employer.grpc.service.SearchEmployerRequest.getDefaultInstance()) return this;
      if (!other.employerIds_.isEmpty()) {
        if (employerIds_.isEmpty()) {
          employerIds_ = other.employerIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEmployerIdsIsMutable();
          employerIds_.addAll(other.employerIds_);
        }
        onChanged();
      }
      if (!other.getKeyword().isEmpty()) {
        keyword_ = other.keyword_;
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
      com.wanpng.employer.grpc.service.SearchEmployerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.employer.grpc.service.SearchEmployerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList employerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEmployerIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        employerIds_ = new com.google.protobuf.LazyStringArrayList(employerIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string employer_ids = 1;</code>
     * @return A list containing the employerIds.
     */
    public com.google.protobuf.ProtocolStringList
        getEmployerIdsList() {
      return employerIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string employer_ids = 1;</code>
     * @return The count of employerIds.
     */
    public int getEmployerIdsCount() {
      return employerIds_.size();
    }
    /**
     * <code>repeated string employer_ids = 1;</code>
     * @param index The index of the element to return.
     * @return The employerIds at the given index.
     */
    public java.lang.String getEmployerIds(int index) {
      return employerIds_.get(index);
    }
    /**
     * <code>repeated string employer_ids = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the employerIds at the given index.
     */
    public com.google.protobuf.ByteString
        getEmployerIdsBytes(int index) {
      return employerIds_.getByteString(index);
    }
    /**
     * <code>repeated string employer_ids = 1;</code>
     * @param index The index to set the value at.
     * @param value The employerIds to set.
     * @return This builder for chaining.
     */
    public Builder setEmployerIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEmployerIdsIsMutable();
      employerIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string employer_ids = 1;</code>
     * @param value The employerIds to add.
     * @return This builder for chaining.
     */
    public Builder addEmployerIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEmployerIdsIsMutable();
      employerIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string employer_ids = 1;</code>
     * @param values The employerIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllEmployerIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureEmployerIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, employerIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string employer_ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmployerIds() {
      employerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string employer_ids = 1;</code>
     * @param value The bytes of the employerIds to add.
     * @return This builder for chaining.
     */
    public Builder addEmployerIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEmployerIdsIsMutable();
      employerIds_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object keyword_ = "";
    /**
     * <code>string keyword = 2;</code>
     * @return The keyword.
     */
    public java.lang.String getKeyword() {
      java.lang.Object ref = keyword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string keyword = 2;</code>
     * @return The bytes for keyword.
     */
    public com.google.protobuf.ByteString
        getKeywordBytes() {
      java.lang.Object ref = keyword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string keyword = 2;</code>
     * @param value The keyword to set.
     * @return This builder for chaining.
     */
    public Builder setKeyword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      keyword_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string keyword = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyword() {
      
      keyword_ = getDefaultInstance().getKeyword();
      onChanged();
      return this;
    }
    /**
     * <code>string keyword = 2;</code>
     * @param value The bytes for keyword to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      keyword_ = value;
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


    // @@protoc_insertion_point(builder_scope:protos.service.SearchEmployerRequest)
  }

  // @@protoc_insertion_point(class_scope:protos.service.SearchEmployerRequest)
  private static final com.wanpng.employer.grpc.service.SearchEmployerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.employer.grpc.service.SearchEmployerRequest();
  }

  public static com.wanpng.employer.grpc.service.SearchEmployerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchEmployerRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchEmployerRequest>() {
    @java.lang.Override
    public SearchEmployerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchEmployerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchEmployerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchEmployerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.employer.grpc.service.SearchEmployerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

