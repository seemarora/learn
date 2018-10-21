#include <inttypes.h>


int disassemble8080Op(unsigned char *code, int pc);
int emulate8080(State8080* state);
void generateInterrupt(State8080 *state, int interrupt_num);
