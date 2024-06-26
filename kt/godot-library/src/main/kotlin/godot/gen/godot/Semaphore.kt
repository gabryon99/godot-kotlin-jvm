// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A synchronization mechanism used to control access to a shared resource by [godot.Thread]s.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/performance/thread_safe_apis.html]($DOCS_URL/tutorials/performance/thread_safe_apis.html)
 *
 * A synchronization semaphore that can be used to synchronize multiple [godot.Thread]s. Initialized to zero on creation. For a binary version, see [godot.Mutex].
 *
 * **Warning:** Semaphores must be used carefully to avoid deadlocks.
 *
 * **Warning:** To guarantee that the operating system is able to perform proper cleanup (no crashes, no deadlocks), these conditions must be met:
 *
 * - When a [godot.Semaphore]'s reference count reaches zero and it is therefore destroyed, no threads must be waiting on it.
 *
 * - When a [godot.Thread]'s reference count reaches zero and it is therefore destroyed, it must not be waiting on any semaphore.
 */
@GodotBaseType
public open class Semaphore : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SEMAPHORE, scriptIndex)
    return true
  }

  /**
   * Waits for the [godot.Semaphore], if its value is zero, blocks until non-zero.
   */
  @JvmName("semaphoreWait")
  public fun wait(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.waitPtr, NIL)
  }

  /**
   * Like [wait], but won't block, so if the value is zero, fails immediately and returns `false`. If non-zero, it returns `true` to report success.
   */
  public fun tryWait(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.tryWaitPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Lowers the [godot.Semaphore], allowing one more thread in.
   */
  public fun post(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.postPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val waitPtr: VoidPtr = TypeManager.getMethodBindPtr("Semaphore", "wait")

    public val tryWaitPtr: VoidPtr = TypeManager.getMethodBindPtr("Semaphore", "try_wait")

    public val postPtr: VoidPtr = TypeManager.getMethodBindPtr("Semaphore", "post")
  }
}
