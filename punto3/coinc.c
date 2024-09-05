#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[]) {
    if (argc != 3) {
        printf("Uso: %s archivo palabra_clave\n", argv[0]);
        return 1;
    }

    FILE *archivo = fopen(argv[1], "r");
    if (archivo == NULL) {
        printf("No se pudo abrir el archivo %s\n", argv[1]);
        return 1;
    }

    char palabra[256];
    int count = 0;
    while (fscanf(archivo, "%s", palabra) != EOF) {
        if (strcmp(palabra, argv[2]) == 0) {
            count++;
        }
    }

    fclose(archivo);

    printf("%s se repite %d veces en el texto.\n", argv[2], count);
    return 0;
}
