package godot.codegen.models.enriched

import godot.codegen.models.Constant
import godot.codegen.traits.TypedTrait

class EnrichedConstant(val internal: Constant) : TypedTrait {
    override val type = internal.type ?: "int"
}

fun List<Constant>.toEnriched() = map { EnrichedConstant(it) }