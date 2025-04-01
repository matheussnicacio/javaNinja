package NivelIntermediarioGenerics;

public class Main {
    public static void main(String[] args) {

//        Kunai kunai1 = new Kunai("Kunai");
//        Kunai kunai2 = new Kunai("Kunai explosiva");
//        Kunai kunai3 = new Kunai("Kunai de agua");
//
//        BolsaKunai bolsaKunai = new BolsaKunai();
//        bolsaKunai.adicionarKunai(kunai1);
//        bolsaKunai.adicionarKunai(kunai2);
//        bolsaKunai.adicionarKunai(kunai3);
//
//        System.out.println(bolsaKunai);

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de Ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);

    }
}
