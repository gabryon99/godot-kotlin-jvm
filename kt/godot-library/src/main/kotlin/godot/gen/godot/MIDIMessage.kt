// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class MIDIMessage(
  id: Long,
) {
  MIDI_MESSAGE_NONE(0),
  MIDI_MESSAGE_NOTE_OFF(8),
  MIDI_MESSAGE_NOTE_ON(9),
  MIDI_MESSAGE_AFTERTOUCH(10),
  MIDI_MESSAGE_CONTROL_CHANGE(11),
  MIDI_MESSAGE_PROGRAM_CHANGE(12),
  MIDI_MESSAGE_CHANNEL_PRESSURE(13),
  MIDI_MESSAGE_PITCH_BEND(14),
  MIDI_MESSAGE_SYSTEM_EXCLUSIVE(240),
  MIDI_MESSAGE_QUARTER_FRAME(241),
  MIDI_MESSAGE_SONG_POSITION_POINTER(242),
  MIDI_MESSAGE_SONG_SELECT(243),
  MIDI_MESSAGE_TUNE_REQUEST(246),
  MIDI_MESSAGE_TIMING_CLOCK(248),
  MIDI_MESSAGE_START(250),
  MIDI_MESSAGE_CONTINUE(251),
  MIDI_MESSAGE_STOP(252),
  MIDI_MESSAGE_ACTIVE_SENSING(254),
  MIDI_MESSAGE_SYSTEM_RESET(255),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = entries.single { it.id == `value` }
  }
}
