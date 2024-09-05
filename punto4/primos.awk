#!/usr/bin/awk -f

function es_primo(num) {
    if (num < 2) return 0;
    for (i = 2; i <= sqrt(num); i++) {
        if (num % i == 0) return 0;
    }
    return 1;
}

{
    if (es_primo($1)) {
        print $1 " es primo.";
    }
}
