// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.TypeManager
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Class that can be inherited to implement custom multiplayer API networking layers via GDExtension.
 *
 * This class is designed to be inherited from a GDExtension plugin to implement custom networking layers for the multiplayer API (such as WebRTC). All the methods below **must** be implemented to have a working custom multiplayer implementation. See also [godot.MultiplayerAPI].
 */
@GodotBaseType
public open class MultiplayerPeerExtension : MultiplayerPeer() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_MULTIPLAYERPEEREXTENSION, scriptIndex)
    return true
  }

  /**
   * Called when the available packet count is internally requested by the [godot.MultiplayerAPI].
   */
  public open fun _getAvailablePacketCount(): Int {
    throw NotImplementedError("_get_available_packet_count is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the maximum allowed packet size (in bytes) is requested by the [godot.MultiplayerAPI].
   */
  public open fun _getMaxPacketSize(): Int {
    throw NotImplementedError("_get_max_packet_size is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when a packet needs to be received by the [godot.MultiplayerAPI], if [_getPacket] isn't implemented. Use this when extending this class via GDScript.
   */
  public open fun _getPacketScript(): PackedByteArray {
    throw NotImplementedError("_get_packet_script is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when a packet needs to be sent by the [godot.MultiplayerAPI], if [_putPacket] isn't implemented. Use this when extending this class via GDScript.
   */
  public open fun _putPacketScript(pBuffer: PackedByteArray): GodotError {
    throw NotImplementedError("_put_packet_script is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called to get the channel over which the next available packet was received. See [godot.MultiplayerPeer.getPacketChannel].
   */
  public open fun _getPacketChannel(): Int {
    throw NotImplementedError("_get_packet_channel is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called to get the [enum MultiplayerPeer.TransferMode] the remote peer used to send the next available packet. See [godot.MultiplayerPeer.getPacketMode].
   */
  public open fun _getPacketMode(): MultiplayerPeer.TransferMode {
    throw NotImplementedError("_get_packet_mode is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the channel to use is set for this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.transferChannel]).
   */
  public open fun _setTransferChannel(pChannel: Int): Unit {
  }

  /**
   * Called when the transfer channel to use is read on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.transferChannel]).
   */
  public open fun _getTransferChannel(): Int {
    throw NotImplementedError("_get_transfer_channel is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the transfer mode is set on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.transferMode]).
   */
  public open fun _setTransferMode(pMode: MultiplayerPeer.TransferMode): Unit {
  }

  /**
   * Called when the transfer mode to use is read on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.transferMode]).
   */
  public open fun _getTransferMode(): MultiplayerPeer.TransferMode {
    throw NotImplementedError("_get_transfer_mode is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the target peer to use is set for this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.setTargetPeer]).
   */
  public open fun _setTargetPeer(pPeer: Int): Unit {
  }

  /**
   * Called when the ID of the [godot.MultiplayerPeer] who sent the most recent packet is requested (see [godot.MultiplayerPeer.getPacketPeer]).
   */
  public open fun _getPacketPeer(): Int {
    throw NotImplementedError("_get_packet_peer is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the "is server" status is requested on the [godot.MultiplayerAPI]. See [godot.MultiplayerAPI.isServer].
   */
  public open fun _isServer(): Boolean {
    throw NotImplementedError("_is_server is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the [godot.MultiplayerAPI] is polled. See [godot.MultiplayerAPI.poll].
   */
  public open fun _poll(): Unit {
  }

  /**
   * Called when the multiplayer peer should be immediately closed (see [godot.MultiplayerPeer.close]).
   */
  public open fun _close(): Unit {
  }

  /**
   * Called when the connected [pPeer] should be forcibly disconnected (see [godot.MultiplayerPeer.disconnectPeer]).
   */
  public open fun _disconnectPeer(pPeer: Int, pForce: Boolean): Unit {
  }

  /**
   * Called when the unique ID of this [godot.MultiplayerPeer] is requested (see [godot.MultiplayerPeer.getUniqueId]). The value must be between `1` and `2147483647`.
   */
  public open fun _getUniqueId(): Int {
    throw NotImplementedError("_get_unique_id is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the "refuse new connections" status is set on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.refuseNewConnections]).
   */
  public open fun _setRefuseNewConnections(pEnable: Boolean): Unit {
  }

  /**
   * Called when the "refuse new connections" status is requested on this [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.refuseNewConnections]).
   */
  public open fun _isRefusingNewConnections(): Boolean {
    throw NotImplementedError("_is_refusing_new_connections is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called to check if the server can act as a relay in the current configuration. See [godot.MultiplayerPeer.isServerRelaySupported].
   */
  public open fun _isServerRelaySupported(): Boolean {
    throw NotImplementedError("_is_server_relay_supported is not implemented for MultiplayerPeerExtension")
  }

  /**
   * Called when the connection status is requested on the [godot.MultiplayerPeer] (see [godot.MultiplayerPeer.getConnectionStatus]).
   */
  public open fun _getConnectionStatus(): MultiplayerPeer.ConnectionStatus {
    throw NotImplementedError("_get_connection_status is not implemented for MultiplayerPeerExtension")
  }

  public companion object

  internal object MethodBindings {
    public val _getPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet")

    public val _putPacketPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_put_packet")

    public val _getAvailablePacketCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_available_packet_count")

    public val _getMaxPacketSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_max_packet_size")

    public val _getPacketScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet_script")

    public val _putPacketScriptPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_put_packet_script")

    public val _getPacketChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet_channel")

    public val _getPacketModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet_mode")

    public val _setTransferChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_set_transfer_channel")

    public val _getTransferChannelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_transfer_channel")

    public val _setTransferModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_set_transfer_mode")

    public val _getTransferModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_transfer_mode")

    public val _setTargetPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_set_target_peer")

    public val _getPacketPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_packet_peer")

    public val _isServerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_is_server")

    public val _pollPtr: VoidPtr = TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_poll")

    public val _closePtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_close")

    public val _disconnectPeerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_disconnect_peer")

    public val _getUniqueIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_unique_id")

    public val _setRefuseNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_set_refuse_new_connections")

    public val _isRefusingNewConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_is_refusing_new_connections")

    public val _isServerRelaySupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_is_server_relay_supported")

    public val _getConnectionStatusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("MultiplayerPeerExtension", "_get_connection_status")
  }
}
