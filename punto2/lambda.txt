%{
#include <stdio.h>
int valid = 0;

int yywrap() {
    return 1;
}
%}

%%

[ \t\n]+                           

[a-zA-Z_][a-zA-Z_0-9]*[ \t]*=[ \t]*lambda[ \t]+[a-zA-Z_][a-zA-Z_0-9]*[ \t]*:[ \t]*.+ {
    valid = 1;
}

print[ \t]*\([^)]+\) {
    valid = 1;
}

. {
    /* No hacer nada aquí */
}

%%

int main(int argc, char *argv[]) {
    if (argc > 1) {
        FILE *archivo = fopen(argv[1], "r");
        if (!archivo) {
            printf("Error abriendo el archivo.\n");
            return 1;
        }
        yyin = archivo;
        yylex();
        fclose(archivo);
        if (valid) {
            printf("ACEPTA\n");
        } else {
            printf("NO ACEPTA\n");
        }
    } else {
        printf("Uso: %s archivo.txt\n", argv[0]);
    }
    return 0;
}
