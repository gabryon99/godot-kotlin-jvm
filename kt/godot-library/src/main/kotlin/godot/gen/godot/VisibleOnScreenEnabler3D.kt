// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * [VisibleOnScreenEnabler3D] contains a box-shaped region of 3D space and a target node. The target
 * node will be automatically enabled (via its [Node.processMode] property) when any part of this
 * region becomes visible on the screen, and automatically disabled otherwise. This can for example be
 * used to activate enemies only when the player approaches them.
 * See [VisibleOnScreenNotifier3D] if you only want to be notified when the region is visible on
 * screen.
 * **Note:** [VisibleOnScreenEnabler3D] uses an approximate heuristic that doesn't take walls and
 * other occlusion into account, unless occlusion culling is used. It also won't function unless
 * [Node3D.visible] is set to `true`.
 */
@GodotBaseType
public open class VisibleOnScreenEnabler3D : VisibleOnScreenNotifier3D() {
  /**
   * Determines how the target node is enabled. Corresponds to [Node.ProcessMode]. When the node is
   * disabled, it always uses [Node.PROCESS_MODE_DISABLED].
   */
  public var enableMode: EnableMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableModePtr, LONG)
      return VisibleOnScreenEnabler3D.EnableMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableModePtr, NIL)
    }

  /**
   * The path to the target node, relative to the [VisibleOnScreenEnabler3D]. The target node is
   * cached; it's only assigned when setting this property (if the [VisibleOnScreenEnabler3D] is inside
   * the scene tree) and every time the [VisibleOnScreenEnabler3D] enters the scene tree. If the path
   * is empty, no node will be affected. If the path is invalid, an error is also generated.
   */
  public var enableNodePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnableNodePathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnableNodePathPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISIBLEONSCREENENABLER3D, scriptIndex)
    return true
  }

  public enum class EnableMode(
    id: Long,
  ) {
    /**
     * Corresponds to [Node.PROCESS_MODE_INHERIT].
     */
    ENABLE_MODE_INHERIT(0),
    /**
     * Corresponds to [Node.PROCESS_MODE_ALWAYS].
     */
    ENABLE_MODE_ALWAYS(1),
    /**
     * Corresponds to [Node.PROCESS_MODE_WHEN_PAUSED].
     */
    ENABLE_MODE_WHEN_PAUSED(2),
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
    public val setEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "set_enable_mode")

    public val getEnableModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "get_enable_mode")

    public val setEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "set_enable_node_path")

    public val getEnableNodePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisibleOnScreenEnabler3D", "get_enable_node_path")
  }
}
