// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 *
 */
@GodotBaseType
public open class AudioEffectSpectrumAnalyzerInstance internal constructor() : AudioEffectInstance()
    {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_AUDIOEFFECTSPECTRUMANALYZERINSTANCE, scriptIndex)
    return true
  }

  /**
   *
   */
  @JvmOverloads
  public fun getMagnitudeForFrequencyRange(
    fromHz: Float,
    toHz: Float,
    mode: MagnitudeMode = AudioEffectSpectrumAnalyzerInstance.MagnitudeMode.MAGNITUDE_MAX,
  ): Vector2 {
    TransferContext.writeArguments(DOUBLE to fromHz.toDouble(), DOUBLE to toHz.toDouble(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getMagnitudeForFrequencyRangePtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  public enum class MagnitudeMode(
    id: Long,
  ) {
    /**
     * Use the average value as magnitude.
     */
    MAGNITUDE_AVERAGE(0),
    /**
     * Use the maximum value as magnitude.
     */
    MAGNITUDE_MAX(1),
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
    public val getMagnitudeForFrequencyRangePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectSpectrumAnalyzerInstance", "get_magnitude_for_frequency_range")
  }
}
