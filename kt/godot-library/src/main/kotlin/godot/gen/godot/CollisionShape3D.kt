// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A node that provides a [Shape3D] to a [CollisionObject3D] parent and allows to edit it. This can
 * give a detection shape to an [Area3D] or turn a [PhysicsBody3D] into a solid object.
 * **Warning:** A non-uniformly scaled [CollisionShape3D] will likely not behave as expected. Make
 * sure to keep its scale the same on all axes and adjust its [shape] resource instead.
 */
@GodotBaseType
public open class CollisionShape3D : Node3D() {
  /**
   * The actual shape owned by this collision shape.
   */
  public final inline var shape: Shape3D?
    @JvmName("shapeProperty")
    get() = getShape()
    @JvmName("shapeProperty")
    set(`value`) {
      setShape(value)
    }

  /**
   * A disabled collision shape has no effect in the world.
   */
  public final inline var disabled: Boolean
    @JvmName("disabledProperty")
    get() = isDisabled()
    @JvmName("disabledProperty")
    set(`value`) {
      setDisabled(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_COLLISIONSHAPE3D, scriptIndex)
  }

  /**
   * This method does nothing.
   */
  public final fun resourceChanged(resource: Resource?): Unit {
    TransferContext.writeArguments(OBJECT to resource)
    TransferContext.callMethod(rawPtr, MethodBindings.resourceChangedPtr, NIL)
  }

  public final fun setShape(shape: Shape3D?): Unit {
    TransferContext.writeArguments(OBJECT to shape)
    TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
  }

  public final fun getShape(): Shape3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Shape3D?)
  }

  public final fun setDisabled(enable: Boolean): Unit {
    TransferContext.writeArguments(BOOL to enable)
    TransferContext.callMethod(rawPtr, MethodBindings.setDisabledPtr, NIL)
  }

  public final fun isDisabled(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isDisabledPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Sets the collision shape's shape to the addition of all its convexed [MeshInstance3D] siblings
   * geometry.
   */
  public final fun makeConvexFromSiblings(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.makeConvexFromSiblingsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val resourceChangedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "resource_changed", 968641751)

    public val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "set_shape", 1549710052)

    public val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "get_shape", 3214262478)

    public val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "set_disabled", 2586408642)

    public val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "is_disabled", 36873697)

    public val makeConvexFromSiblingsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape3D", "make_convex_from_siblings", 3218959716)
  }
}
