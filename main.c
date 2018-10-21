int disaddemble(unsigned char *codebuffer, int pc) {
    unsigned char *code = &codebuffer[pc];    
    int opbytes = 1;    
    printf ("%04x ", pc);
    switch (*code)    
    {    
        case 0x00: printf("NOP"); break;
        case 0x07: printf("RLC"); break;    
        case 0x08: printf("NOP"); break;
    }    
    return opbytes;    
}
