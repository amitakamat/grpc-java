// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: load_balancer.proto

package io.grpc.grpclb;

public interface ServerListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.lb.v1.ServerList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Contains a list of servers selected by the load balancer. The list will
   * be updated when server resolutions change or as needed to balance load
   * across more servers. The client should consume the server list in order
   * unless instructed otherwise via the client_config.
   * </pre>
   *
   * <code>repeated .grpc.lb.v1.Server servers = 1;</code>
   */
  java.util.List<io.grpc.grpclb.Server> 
      getServersList();
  /**
   * <pre>
   * Contains a list of servers selected by the load balancer. The list will
   * be updated when server resolutions change or as needed to balance load
   * across more servers. The client should consume the server list in order
   * unless instructed otherwise via the client_config.
   * </pre>
   *
   * <code>repeated .grpc.lb.v1.Server servers = 1;</code>
   */
  io.grpc.grpclb.Server getServers(int index);
  /**
   * <pre>
   * Contains a list of servers selected by the load balancer. The list will
   * be updated when server resolutions change or as needed to balance load
   * across more servers. The client should consume the server list in order
   * unless instructed otherwise via the client_config.
   * </pre>
   *
   * <code>repeated .grpc.lb.v1.Server servers = 1;</code>
   */
  int getServersCount();
  /**
   * <pre>
   * Contains a list of servers selected by the load balancer. The list will
   * be updated when server resolutions change or as needed to balance load
   * across more servers. The client should consume the server list in order
   * unless instructed otherwise via the client_config.
   * </pre>
   *
   * <code>repeated .grpc.lb.v1.Server servers = 1;</code>
   */
  java.util.List<? extends io.grpc.grpclb.ServerOrBuilder> 
      getServersOrBuilderList();
  /**
   * <pre>
   * Contains a list of servers selected by the load balancer. The list will
   * be updated when server resolutions change or as needed to balance load
   * across more servers. The client should consume the server list in order
   * unless instructed otherwise via the client_config.
   * </pre>
   *
   * <code>repeated .grpc.lb.v1.Server servers = 1;</code>
   */
  io.grpc.grpclb.ServerOrBuilder getServersOrBuilder(
      int index);
}
