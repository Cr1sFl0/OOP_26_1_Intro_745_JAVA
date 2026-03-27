import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Workshop {

    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    public int mayorDeTresNumeros(int a, int b, int c) {
        int tmp = (a > b) ? a : b;
        return (c > tmp) ? c : tmp;
    }

    public int[] tablaMultiplicar(int numero, int limite) {
        int[] arr = new int[limite];
        for (int i = 0; i < limite; i++) {
            arr[i] = numero * (i + 1);
        }
        return arr;
    }

    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("No puede ser negativo");
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;
        // Optimización: hasta la raíz cuadrada
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public int[] serieFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n no puede ser negativo");
        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) fib[0] = 0;
            else if (i == 1) fib[1] = 1;
            else fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public int sumaElementos(int[] arreglo) {
        int total = 0;
        for (int x : arreglo) total += x;
        return total;
    }

    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0;
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("Arreglo vacío");
        int max = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > max) max = arreglo[i];
        }
        return max;
    }

    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("Arreglo vacío");
        int min = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < min) min = arreglo[i];
        }
        return min;
    }

    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int x : arreglo) {
            if (x == elemento) return true;
        }
        return false;
    }

    public int[] invertirArreglo(int[] arreglo) {
        int n = arreglo.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) res[i] = arreglo[n - 1 - i];
        return res;
    }

    public int[] ordenarArreglo(int[] arreglo) {
        int[] copia = arreglo.clone();
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] > copia[j + 1]) {
                    int aux = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = aux;
                }
            }
        }
        return copia;
    }

    public int[] eliminarDuplicados(int[] arreglo) {
        List<Integer> lista = new ArrayList<>();
        for (int x : arreglo) {
            if (!lista.contains(x)) lista.add(x);
        }
        int[] resultado = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) resultado[i] = lista.get(i);
        return resultado;
    }

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] nuevo = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, nuevo, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, nuevo, arreglo1.length, arreglo2.length);
        return nuevo;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        if (n == 0) return arreglo;
        int rot = ((posiciones % n) + n) % n;
        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) rotado[(i + rot) % n] = arreglo[i];
        return rotado;
    }

    public int contarCaracteres(String cadena) {
        return (cadena == null) ? 0 : cadena.length();
    }

    public String invertirCadena(String cadena) {
        if (cadena == null) return null;
        return new StringBuilder(cadena).reverse().toString();
    }

    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String s = cadena.toLowerCase().replaceAll("[^a-z0-9]", "");
        String invertida = new StringBuilder(s).reverse().toString();
        return s.equals(invertida);
    }

    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    public String convertirAMayusculas(String cadena) {
        return (cadena == null) ? null : cadena.toUpperCase();
    }

    public String convertirAMinusculas(String cadena) {
        return (cadena == null) ? null : cadena.toLowerCase();
    }

    public String reemplazarSubcadena(String cadena, String vieja, String nueva) {
        return cadena.replace(vieja, nueva);
    }

    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    public boolean validarCorreoElectronico(String correo) {
        if (correo == null) return false;
        return correo.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9.\\-]+\\.[a-zA-Z]{2,}$");
    }

    public double promedioLista(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        long suma = 0;
        for (int num : lista) suma += num;
        return (double) suma / lista.size();
    }

    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    private String letraAJugada(String entrada) {
        if (entrada == null) return "";
        String s = entrada.toLowerCase().trim();
        switch (s) {
            case "r": return "piedra";
            case "p": return "papel";
            case "s": return "tijera";
            case "l": return "lagarto";
            case "v": return "spock";
            default: return s;
        }
    }

    private boolean gana(String a, String b) {
        return (a.equals("piedra") && (b.equals("tijera") || b.equals("lagarto"))) ||
               (a.equals("papel") && (b.equals("piedra") || b.equals("spock"))) ||
               (a.equals("tijera") && (b.equals("papel") || b.equals("lagarto"))) ||
               (a.equals("lagarto") && (b.equals("papel") || b.equals("spock"))) ||
               (a.equals("spock") && (b.equals("piedra") || b.equals("tijera")));
    }

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccion) {
        String[] jugadas = {"piedra", "papel", "tijera", "lagarto", "spock"};
        String maquina = jugadas[new Random().nextInt(jugadas.length)];
        String e = letraAJugada(eleccion);
        if (e.equals(maquina)) return "Empate";
        return gana(e, maquina) ? "Ganaste" : "Perdiste";
    }

    public String pptls2(String[] game) {
        String jug1 = letraAJugada(game[0]);
        String jug2 = letraAJugada(game[1]);
        if (jug1.equals(jug2)) return "Empate";
        return gana(jug1, jug2) ? "Player 1" : "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public String zoodiac(int day, int month) {
        if (month < 1 || month > 12 || day < 1) return "Invalid Date";
        int[] diasPorMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (day > diasPorMes[month - 1]) return "Invalid Date";
        
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Tauro";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Escorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagitario";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricornio";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Acuario";
        if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Piscis";
        return "Invalid Date";
    }
}