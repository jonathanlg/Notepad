package notepad;

public class Funciones {

    static String palabras;
    static String ruta;

    public static boolean buscarPalabra(String texto, String palabra) {
        boolean encontrado = texto.contains(palabra);
        String res = null;
        if (palabra.equalsIgnoreCase(texto)) {
            res = texto;
        }
        if (encontrado) {
            System.out.println("Encontrado la palabra " + true + " y la palabra es  " + res);
        } else {
            System.out.println("No encontrado");
        }
        return encontrado;
    }

}
