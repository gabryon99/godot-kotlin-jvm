// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmName

/**
 * Contains a generic action which can be targeted from several types of inputs. Actions and their
 * events can be set in the **Input Map** tab in **Project > Project Settings**, or with the [InputMap]
 * class.
 * **Note:** Unlike the other [InputEvent] subclasses which map to unique physical events, this
 * virtual one is not emitted by the engine. This class is useful to emit actions manually with
 * [Input.parseInputEvent], which are then received in [Node.Input]. To check if a physical event
 * matches an action from the Input Map, use [InputEvent.isAction] and [InputEvent.isActionPressed].
 */
@GodotBaseType
public open class InputEventAction : InputEvent() {
  /**
   * The action's name. Actions are accessed via this [String].
   */
  public var action: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getActionPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActionPtr, NIL)
    }

  /**
   * If `true`, the action's state is pressed. If `false`, the action's state is released.
   */
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
    }

  /**
   * The action's strength between 0 and 1. This value is considered as equal to 0 if pressed is
   * `false`. The event strength allows faking analog joypad motion events, by specifying how strongly
   * the joypad axis is bent or pressed.
   */
  public var strength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStrengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setStrengthPtr, NIL)
    }

  /**
   * The real event index in action this event corresponds to (from events defined for this action
   * in the [InputMap]). If `-1`, a unique ID will be used and actions pressed with this ID will need
   * to be released with another [InputEventAction].
   */
  public var eventIndex: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEventIndexPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setEventIndexPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_INPUTEVENTACTION, scriptIndex)
    return true
  }

  public companion object

  internal object MethodBindings {
    public val setActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_action")

    public val getActionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "get_action")

    public val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_pressed")

    public val setStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_strength")

    public val getStrengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "get_strength")

    public val setEventIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "set_event_index")

    public val getEventIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventAction", "get_event_index")
  }
}
