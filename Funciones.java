package aed;

import javax.swing.plaf.TreeUI;

class Funciones {
    int cuadrado(int x) {
        return x*x;
    }

    double distancia(double x, double y) {
        return Math.sqrt (x*x + y*y);
    }

        
    boolean esPar(int n) {
        return n % 2 == 0;
    }
    boolean divideA (int x, int y) {
        return x % y == 0;
    }
    boolean esBisiesto(int n) {
        return divideA(n,4) && !(divideA (n,100)) || divideA(n,400); 
    }

    int factorialIterativo(int n) {
        int original = n;
        int res = n;
        while (original != 0) {
            if (n != 0) {
            original = original -1;
            res = res * original;
            }else{
               break;
               return 1;
            }
        }
        return res;        
     

    }

    int factorialRecursivo(int n) {
        // COMPLETAR
        return 0;
    }

    boolean esPrimo(int n) {
        // COMPLETAR
        return false;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for (int i = 0; i < numeros.length; i++) {
            res = res + numeros [i];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros [i] != buscado) {
                contador += 1;
            } else {
            break;
            }

        } 
        return contador;  
    }

    boolean tienePrimo(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean todosPares(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }
}
