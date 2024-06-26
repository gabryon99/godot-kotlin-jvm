// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

@GodotBaseType
public open class UPNP : RefCounted() {
  public var discoverMulticastIf: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDiscoverMulticastIfPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDiscoverMulticastIfPtr, NIL)
    }

  public var discoverLocalPort: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDiscoverLocalPortPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDiscoverLocalPortPtr, NIL)
    }

  public var discoverIpv6: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDiscoverIpv6Ptr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDiscoverIpv6Ptr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_UPNP, scriptIndex)
    return true
  }

  public fun getDeviceCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDeviceCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun getDevice(index: Int): UPNPDevice? {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getDevicePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as UPNPDevice?)
  }

  public fun addDevice(device: UPNPDevice): Unit {
    TransferContext.writeArguments(OBJECT to device)
    TransferContext.callMethod(rawPtr, MethodBindings.addDevicePtr, NIL)
  }

  public fun setDevice(index: Int, device: UPNPDevice): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), OBJECT to device)
    TransferContext.callMethod(rawPtr, MethodBindings.setDevicePtr, NIL)
  }

  public fun removeDevice(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removeDevicePtr, NIL)
  }

  public fun clearDevices(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearDevicesPtr, NIL)
  }

  public fun getGateway(): UPNPDevice? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getGatewayPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as UPNPDevice?)
  }

  @JvmOverloads
  public fun discover(
    timeout: Int = 2000,
    ttl: Int = 2,
    deviceFilter: String = "InternetGatewayDevice",
  ): Int {
    TransferContext.writeArguments(LONG to timeout.toLong(), LONG to ttl.toLong(), STRING to deviceFilter)
    TransferContext.callMethod(rawPtr, MethodBindings.discoverPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public fun queryExternalAddress(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.queryExternalAddressPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  @JvmOverloads
  public fun addPortMapping(
    port: Int,
    portInternal: Int = 0,
    desc: String = "",
    proto: String = "UDP",
    duration: Int = 0,
  ): Int {
    TransferContext.writeArguments(LONG to port.toLong(), LONG to portInternal.toLong(), STRING to desc, STRING to proto, LONG to duration.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.addPortMappingPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  @JvmOverloads
  public fun deletePortMapping(port: Int, proto: String = "UDP"): Int {
    TransferContext.writeArguments(LONG to port.toLong(), STRING to proto)
    TransferContext.callMethod(rawPtr, MethodBindings.deletePortMappingPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  public enum class UPNPResult(
    id: Long,
  ) {
    UPNP_RESULT_SUCCESS(0),
    UPNP_RESULT_NOT_AUTHORIZED(1),
    UPNP_RESULT_PORT_MAPPING_NOT_FOUND(2),
    UPNP_RESULT_INCONSISTENT_PARAMETERS(3),
    UPNP_RESULT_NO_SUCH_ENTRY_IN_ARRAY(4),
    UPNP_RESULT_ACTION_FAILED(5),
    UPNP_RESULT_SRC_IP_WILDCARD_NOT_PERMITTED(6),
    UPNP_RESULT_EXT_PORT_WILDCARD_NOT_PERMITTED(7),
    UPNP_RESULT_INT_PORT_WILDCARD_NOT_PERMITTED(8),
    UPNP_RESULT_REMOTE_HOST_MUST_BE_WILDCARD(9),
    UPNP_RESULT_EXT_PORT_MUST_BE_WILDCARD(10),
    UPNP_RESULT_NO_PORT_MAPS_AVAILABLE(11),
    UPNP_RESULT_CONFLICT_WITH_OTHER_MECHANISM(12),
    UPNP_RESULT_CONFLICT_WITH_OTHER_MAPPING(13),
    UPNP_RESULT_SAME_PORT_VALUES_REQUIRED(14),
    UPNP_RESULT_ONLY_PERMANENT_LEASE_SUPPORTED(15),
    UPNP_RESULT_INVALID_GATEWAY(16),
    UPNP_RESULT_INVALID_PORT(17),
    UPNP_RESULT_INVALID_PROTOCOL(18),
    UPNP_RESULT_INVALID_DURATION(19),
    UPNP_RESULT_INVALID_ARGS(20),
    UPNP_RESULT_INVALID_RESPONSE(21),
    UPNP_RESULT_INVALID_PARAM(22),
    UPNP_RESULT_HTTP_ERROR(23),
    UPNP_RESULT_SOCKET_ERROR(24),
    UPNP_RESULT_MEM_ALLOC_ERROR(25),
    UPNP_RESULT_NO_GATEWAY(26),
    UPNP_RESULT_NO_DEVICES(27),
    UPNP_RESULT_UNKNOWN_ERROR(28),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getDeviceCountPtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "get_device_count")

    public val getDevicePtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "get_device")

    public val addDevicePtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "add_device")

    public val setDevicePtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "set_device")

    public val removeDevicePtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "remove_device")

    public val clearDevicesPtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "clear_devices")

    public val getGatewayPtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "get_gateway")

    public val discoverPtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "discover")

    public val queryExternalAddressPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "query_external_address")

    public val addPortMappingPtr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "add_port_mapping")

    public val deletePortMappingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "delete_port_mapping")

    public val setDiscoverMulticastIfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "set_discover_multicast_if")

    public val getDiscoverMulticastIfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "get_discover_multicast_if")

    public val setDiscoverLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "set_discover_local_port")

    public val getDiscoverLocalPortPtr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "get_discover_local_port")

    public val setDiscoverIpv6Ptr: VoidPtr =
        TypeManager.getMethodBindPtr("UPNP", "set_discover_ipv6")

    public val isDiscoverIpv6Ptr: VoidPtr = TypeManager.getMethodBindPtr("UPNP", "is_discover_ipv6")
  }
}
