// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.google.android.diskusage.proto;

@SuppressWarnings("hiding")
public final class StringValueProto extends
    com.google.protobuf.nano.MessageNano {

  private static volatile StringValueProto[] _emptyArray;
  public static StringValueProto[] emptyArray() {
    // Lazily initializes the empty array
    if (_emptyArray == null) {
      synchronized (
          com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
        if (_emptyArray == null) {
          _emptyArray = new StringValueProto[0];
        }
      }
    }
    return _emptyArray;
  }

  // optional string value = 1;
  public java.lang.String value;

  public StringValueProto() {
    clear();
  }

  public StringValueProto clear() {
    value = "";
    cachedSize = -1;
    return this;
  }

  @Override
  public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
      throws java.io.IOException {
    if (!this.value.equals("")) {
      output.writeString(1, this.value);
    }
    super.writeTo(output);
  }

  @Override
  protected int computeSerializedSize() {
    int size = super.computeSerializedSize();
    if (!this.value.equals("")) {
      size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeStringSize(1, this.value);
    }
    return size;
  }

  @Override
  public StringValueProto mergeFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    while (true) {
      int tag = input.readTag();
      switch (tag) {
        case 0:
          return this;
        default: {
          if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
            return this;
          }
          break;
        }
        case 10: {
          this.value = input.readString();
          break;
        }
      }
    }
  }

  public static StringValueProto parseFrom(byte[] data)
      throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
    return com.google.protobuf.nano.MessageNano.mergeFrom(new StringValueProto(), data);
  }

  public static StringValueProto parseFrom(
          com.google.protobuf.nano.CodedInputByteBufferNano input)
      throws java.io.IOException {
    return new StringValueProto().mergeFrom(input);
  }
}
