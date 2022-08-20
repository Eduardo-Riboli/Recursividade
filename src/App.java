public class App {
    public static int cont = 0;
    public static String palavra = "";
    public static void main(String[] args) {
        String n = "123";
        int k = 3;
        int s = 10;
        System.out.println("O valor do super digito de " + n + " sendo repetido " + k + " vezes é: " + superDigit(n, k));
        System.out.println("O somatorio do numero " + s + " é: " + somatorio(s));
        System.out.println("A palavra ao contrario é: " + inverteString("Olha o prédio azul"));
    }

    public static int somatorio(int n){

        if (n == 0){
            return cont;
        } else {
            cont += n;
            somatorio(n - 1);
            return cont;
        }
    }

    public static String inverteString(String s){

        if (s.length() == 0){
            return palavra;
        } else {
            palavra += s.charAt(s.length() - 1);
            s = s.substring(0, s.length() - 1);
            inverteString(s);
            return palavra;
        }
    }

    public static int superDigit(String n, int k) {
        String number = repeatString(n, k);
        int p = digit(number);

        return p;
    }

    public static int digit(String number){
        if (number.length() <= 1){
            return cont;
        }
        long numberz = Long.parseLong(number);
        cont = extrairDigitos(numberz);
        String contz = Integer.toString(cont);
        digit(contz);
        return cont;
    } 

    public static int extrairDigitos(long numero){
        int soma = 0;
        while (numero > 0){
            soma += (numero % 10);
            numero /= 10;
        }
        return soma;
    }

    public static String repeatString(String n, int k){
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < k; i++) {
            r.append(n);
        }
        return r.toString();
    }
   
}
