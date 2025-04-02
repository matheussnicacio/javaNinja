package NivelIntermediarioRecords;

public class Main {

    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto","naruto@email.com",999999999);
        System.out.println("cadastro: "+cadastro);
        System.out.println("cadastro: "+cadastro.getNome());


        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke","sasuke@email.com",999999999);
        System.out.println("cadastroRecord: "+cadastroRecord);
        System.out.println("cadastroRecord: "+cadastroRecord.nome());
        System.out.println("cadastroRecord: "+cadastroRecord.emailCaixaAlta());

    }


}
