// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * An input animation for an [godot.AnimationNodeBlendTree].
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree]. Only has one output port using the [animation] property. Used as an input for [godot.AnimationNode]s that blend animations together.
 */
@GodotBaseType
public open class AnimationNodeAnimation : AnimationRootNode() {
  /**
   * Animation to use as an output. It is one of the animations provided by [godot.AnimationTree.animPlayer].
   */
  public var animation: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAnimationPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAnimationPtr, NIL)
    }

  /**
   * Determines the playback direction of the animation.
   */
  public var playMode: PlayMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPlayModePtr, LONG)
      return AnimationNodeAnimation.PlayMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPlayModePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEANIMATION, scriptIndex)
    return true
  }

  public enum class PlayMode(
    id: Long,
  ) {
    /**
     * Plays animation in forward direction.
     */
    PLAY_MODE_FORWARD(0),
    /**
     * Plays animation in backward direction.
     */
    PLAY_MODE_BACKWARD(1),
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
    public val setAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_animation")

    public val getAnimationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_animation")

    public val setPlayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "set_play_mode")

    public val getPlayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AnimationNodeAnimation", "get_play_mode")
  }
}
