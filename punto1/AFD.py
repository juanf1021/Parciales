import sys


def afd(input_string):
    state = 0
    for char in input_string:
        if state == 0:
            if char == '+':
                state = 1
            elif char.isdigit():
                state = 3
            else:
                return "NO ACEPTA"
        elif state == 1:
            if char == '+':
                state = 2
            elif char.isdigit():
                state = 3
            else:
                return "NO ACEPTA"
        elif state == 2:
            return "NO ACEPTA"
        elif state == 3:
            if char.isdigit():
                state = 3
            elif char == '.':
                state = 4
            else:
                return "NO ACEPTA"
        elif state == 4:
            if char.isdigit():
                state = 5
            else:
                return "NO ACEPTA"
        elif state == 5:
            if char.isdigit():
                state = 5
            else:
                return "NO ACEPTA"

    if state == 1:
        return "SUMA"
    elif state == 2:
        return "INCREMENTO"
    elif state == 3:
        return "ENTERO"
    elif state == 5:
        return "REAL"
    else:
        return "NO ACEPTA"


if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Uso: python AFD.py <expresion>")
        sys.exit(1)

    input_expression = sys.argv[1]
    result = afd(input_expression)
    print(result)
