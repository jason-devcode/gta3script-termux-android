SCRIPT_START
{
  NOP

  /*
   * By jason-devcode
   *
   * This is a basic example of 
   * use of basic text commands.
   * */

  main:
  WAIT 0
  //  Opcode 0x3f0
  USE_TEXT_COMMANDS 1
  // Opcode 0x33f
  SET_TEXT_SCALE 2.0 2.0
  // Opcode 0x343
  SET_TEXT_WRAPX 640.0
  // Opcode 0x45A
  DISPLAY_TEXT_WITH_NUMBER 100.0 100.0 NUMBER 123456789
  USE_TEXT_COMMANDS 0
  GOTO main
}
SCRIPT_END
