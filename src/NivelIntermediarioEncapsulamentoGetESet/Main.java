package NivelIntermediarioEncapsulamentoGetESet;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------Naruto Uzumaki------------");
        Uzumaki naruto = new Uzumaki("Naruto","Aldeia da Folha",17,30,1.67);

        System.out.println("Meu Nome é : " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki com nome alterado");
        System.out.println("Meu Nome é : " + naruto.getNome());


    }
}
