package NivelIntermediarioCriandoObjetos;

public class Main {
    public static void main(String[] args) {

        // CRIANDO OBJETOS

        // Criar o ninja Naruto - Naruto é um OBJETO
        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;

        // Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Voce tem: "+ Sasuke.idade + " entao falta no minimo : " + quantoTempoFalta + " anos para ser hokage ");


        // Aplicando metodos aos meus objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);



    }
}
