import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrigMain {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Uso: java TrigMain <archivo>");
            return;
        }

        File archivo = new File(args[0]);
        try (Scanner scanner = new Scanner(archivo)) {
            while (scanner.hasNextLine()) {
                String expr = scanner.nextLine();
                CharStream input = CharStreams.fromString(expr);
                TrigLexer lexer = new TrigLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                TrigParser parser = new TrigParser(tokens);
                ParseTree tree = parser.expr();

                String func = tree.getChild(0).getText();
                double number = Double.parseDouble(tree.getChild(2).getText());

                switch (func) {
                    case "Sin":
                        System.out.println(Math.round(Math.sin(Math.toRadians(number)) * 10.0) / 10.0);
                        break;
                    case "Cos":
                        System.out.println(Math.round(Math.cos(Math.toRadians(number)) * 10.0) / 10.0);
                        break;
                    case "Tan":
                        System.out.println(Math.round(Math.tan(Math.toRadians(number)) * 10.0) / 10.0);
                        break;
                    default:
                        System.out.println("Función no reconocida.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + args[0]);
        }
    }
}
