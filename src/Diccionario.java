import java.util.*;

public class Diccionario {
    public static void main (String[] args) {
        // Se crea el diccionario usando Hashmap
        HashMap<String, String> diccionario = new HashMap<>();
        // Palabras nivel B1/B2
        diccionario.put("desarrollar", "develop");
        diccionario.put("aplicar", "apply");
        diccionario.put("solicitar", "request");
        diccionario.put("mejorar", "improve");
        diccionario.put("considerar", "consider");
        diccionario.put("sugerir", "suggest");
        diccionario.put("alcanzar", "achieve");
        diccionario.put("lograr", "accomplish");
        diccionario.put("crecer", "grow");
        diccionario.put("aumentar", "increase");
        diccionario.put("reducir", "reduce");
        diccionario.put("predecir", "predict");
        diccionario.put("analizar", "analyze");
        diccionario.put("proporcionar", "provide");
        diccionario.put("evitar", "avoid");
        diccionario.put("discutir", "discuss");
        diccionario.put("apoyar", "support");
        diccionario.put("reconocer", "recognize");
        diccionario.put("ofrecer", "offer");
        diccionario.put("permitir", "allow");

        // Obtenemos las claves (español) del diccionario
        List<String> palabras = new ArrayList<>(diccionario.keySet());
        // Mezclar la lista para que esten en orden aleatorio
        Collections.shuffle(palabras);
        // Tomar las primeras 5 palabras de la lista ya mezclada
        List<String> palabrasSeleccionadas = palabras.subList(0, 5);

        // Mostrar las palabras seleccionadas
        /*System.out.println("Palabras seleccionadas al azar");
        for (String palabra : palabrasSeleccionadas) {
            System.out.println("_ " + palabra);
        } */

        // Se usa Scanner para leer las respuestas del usuario
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        System.out.println("Traduce las siguientes palabras al ingles: ");

        // Preguntamos al usuario y se comprueban las respuestas
        for (String palabra : palabrasSeleccionadas) {
            System.out.println("¿Como se traduce '" + palabra + "'?: ");
            // Leemos respuestas y se normalizan
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();
            // Traducimos de forma correcta
            String correcta = diccionario.get(palabra).toLowerCase();

            if (respuestaUsuario.equals(correcta)) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + correcta);
                incorrectas++;
            }
        }

        // Mostramos resultados finales
        System.out.println("\nResumen: ");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);

    }
}
