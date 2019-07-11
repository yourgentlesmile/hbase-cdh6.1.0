// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test_rpc_service.proto

package org.apache.hadoop.hbase.shaded.ipc.protobuf.generated;

public final class TestRpcServiceProtos {
  private TestRpcServiceProtos() {}
  public static void registerAllExtensions(
      org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   **
   * A protobuf service for use in tests
   * </pre>
   *
   * Protobuf service {@code TestProtobufRpcProto}
   */
  public static abstract class TestProtobufRpcProto
      implements org.apache.hbase.thirdparty.com.google.protobuf.Service {
    protected TestProtobufRpcProto() {}

    public interface Interface {
      /**
       * <code>rpc ping(.EmptyRequestProto) returns (.EmptyResponseProto);</code>
       */
      public abstract void ping(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);

      /**
       * <code>rpc echo(.EchoRequestProto) returns (.EchoResponseProto);</code>
       */
      public abstract void echo(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto> done);

      /**
       * <code>rpc error(.EmptyRequestProto) returns (.EmptyResponseProto);</code>
       */
      public abstract void error(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);

      /**
       * <code>rpc pause(.PauseRequestProto) returns (.EmptyResponseProto);</code>
       */
      public abstract void pause(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);

      /**
       * <code>rpc addr(.EmptyRequestProto) returns (.AddrResponseProto);</code>
       */
      public abstract void addr(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto> done);

    }

    public static org.apache.hbase.thirdparty.com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new TestProtobufRpcProto() {
        @java.lang.Override
        public  void ping(
            org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
          impl.ping(controller, request, done);
        }

        @java.lang.Override
        public  void echo(
            org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto> done) {
          impl.echo(controller, request, done);
        }

        @java.lang.Override
        public  void error(
            org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
          impl.error(controller, request, done);
        }

        @java.lang.Override
        public  void pause(
            org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
          impl.pause(controller, request, done);
        }

        @java.lang.Override
        public  void addr(
            org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto> done) {
          impl.addr(controller, request, done);
        }

      };
    }

    public static org.apache.hbase.thirdparty.com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new org.apache.hbase.thirdparty.com.google.protobuf.BlockingService() {
        public final org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final org.apache.hbase.thirdparty.com.google.protobuf.Message callBlockingMethod(
            org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.MethodDescriptor method,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
            org.apache.hbase.thirdparty.com.google.protobuf.Message request)
            throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.ping(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request);
            case 1:
              return impl.echo(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto)request);
            case 2:
              return impl.error(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request);
            case 3:
              return impl.pause(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto)request);
            case 4:
              return impl.addr(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final org.apache.hbase.thirdparty.com.google.protobuf.Message
            getRequestPrototype(
            org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto.getDefaultInstance();
            case 4:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final org.apache.hbase.thirdparty.com.google.protobuf.Message
            getResponsePrototype(
            org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
            case 4:
              return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc ping(.EmptyRequestProto) returns (.EmptyResponseProto);</code>
     */
    public abstract void ping(
        org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
        org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
        org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);

    /**
     * <code>rpc echo(.EchoRequestProto) returns (.EchoResponseProto);</code>
     */
    public abstract void echo(
        org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
        org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto request,
        org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto> done);

    /**
     * <code>rpc error(.EmptyRequestProto) returns (.EmptyResponseProto);</code>
     */
    public abstract void error(
        org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
        org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
        org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);

    /**
     * <code>rpc pause(.PauseRequestProto) returns (.EmptyResponseProto);</code>
     */
    public abstract void pause(
        org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
        org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto request,
        org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done);

    /**
     * <code>rpc addr(.EmptyRequestProto) returns (.AddrResponseProto);</code>
     */
    public abstract void addr(
        org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
        org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
        org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto> done);

    public static final
        org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestRpcServiceProtos.getDescriptor().getServices().get(0);
    }
    public final org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.MethodDescriptor method,
        org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
        org.apache.hbase.thirdparty.com.google.protobuf.Message request,
        org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<
          org.apache.hbase.thirdparty.com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.ping(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.echo(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto)request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.error(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto>specializeCallback(
              done));
          return;
        case 3:
          this.pause(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto)request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto>specializeCallback(
              done));
          return;
        case 4:
          this.addr(controller, (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto)request,
            org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final org.apache.hbase.thirdparty.com.google.protobuf.Message
        getRequestPrototype(
        org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto.getDefaultInstance();
        case 4:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final org.apache.hbase.thirdparty.com.google.protobuf.Message
        getResponsePrototype(
        org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance();
        case 4:
          return org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        org.apache.hbase.thirdparty.com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestRpcServiceProtos.TestProtobufRpcProto implements Interface {
      private Stub(org.apache.hbase.thirdparty.com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hbase.thirdparty.com.google.protobuf.RpcChannel channel;

      public org.apache.hbase.thirdparty.com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void ping(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance(),
          org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.class,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance()));
      }

      public  void echo(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance(),
          org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto.class,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance()));
      }

      public  void error(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance(),
          org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.class,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance()));
      }

      public  void pause(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance(),
          org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.class,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance()));
      }

      public  void addr(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request,
          org.apache.hbase.thirdparty.com.google.protobuf.RpcCallback<org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto.getDefaultInstance(),
          org.apache.hbase.thirdparty.com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto.class,
            org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        org.apache.hbase.thirdparty.com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto ping(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException;

      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto echo(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException;

      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto error(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException;

      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto pause(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException;

      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto addr(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(org.apache.hbase.thirdparty.com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final org.apache.hbase.thirdparty.com.google.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto ping(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto echo(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EchoResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto error(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto pause(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.PauseRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto addr(
          org.apache.hbase.thirdparty.com.google.protobuf.RpcController controller,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.EmptyRequestProto request)
          throws org.apache.hbase.thirdparty.com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.AddrResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:TestProtobufRpcProto)
  }


  public static org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026test_rpc_service.proto\032\ntest.proto2\212\002\n" +
      "\024TestProtobufRpcProto\022/\n\004ping\022\022.EmptyReq" +
      "uestProto\032\023.EmptyResponseProto\022-\n\004echo\022\021" +
      ".EchoRequestProto\032\022.EchoResponseProto\0220\n" +
      "\005error\022\022.EmptyRequestProto\032\023.EmptyRespon" +
      "seProto\0220\n\005pause\022\022.PauseRequestProto\032\023.E" +
      "mptyResponseProto\022.\n\004addr\022\022.EmptyRequest" +
      "Proto\032\022.AddrResponseProtoBS\n5org.apache." +
      "hadoop.hbase.shaded.ipc.protobuf.generat" +
      "edB\024TestRpcServiceProtos\210\001\001\240\001\001"
    };
    org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.getDescriptor(),
        }, assigner);
    org.apache.hadoop.hbase.shaded.ipc.protobuf.generated.TestProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
