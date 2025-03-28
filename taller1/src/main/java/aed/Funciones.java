package aed;

class Funciones {
    int cuadrado(int x) {
        int res = x*x;
        return res;
    }

    double distancia(double x, double y) {
        double res = Math.sqrt(x*x+y*y);
        return res;
    }

    boolean esPar(int n) {
        return n % 2 ==0;
    }

    boolean esBisiesto(int n) {
        return ((n % 4 == 0)&&((n % 100!=0)||(n % 400 ==0)));
    }

    int factorialIterativo(int n) {
        int res = 1;    
        for(int i=1;i<=n;i++){
              res *= i;
            }  return res;
    }
      
    int factorialRecursivo(int n) {
        int res = 1;
        if (n==0){
            return res;
        } else {
          while(n>=1){
            res *= n;
            n--;
          }
        return res;
        }
    }

    boolean esPrimo(int n) {
        boolean res = true;
        if(n==2){
            res = true;
        }else if((n==0)||(n==1)){
            res = false;
        }else{
            for(int i=2;i<n;i++){
              if(n % i==0){
                res = false;
              }
            }
        }
        return res;
    }

    int sumatoria(int[] numeros) {
        int sumatoria = 0;
        for(int i=0;i<numeros.length;i++){
          sumatoria += numeros[i];
        }
        return sumatoria;
    }

    int busqueda(int[] numeros, int buscado) {
        // COMPLETAR
        return 0;
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
