package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

  /*
   * Dados nao primitivos: String, Array, Class, enum
   * Objetivo : Criar um ninja, e atribuir metodos a ele.
   */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase =  nome.toUpperCase(); // ToUppercase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto esta normal" + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase(); // ToLowercase vai colocar tudo em caixa baixa/ minusculo
        System.out.println(aldeiaLowerCase);

    }
}
