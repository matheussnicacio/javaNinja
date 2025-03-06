package NivelBasico;

public class Array {
    public static void main(String[] args) {


        // Arrays sao tipo de referencia!

        // String inicializam como null
        String[] ninja = new String[5];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[4]);

        // Redeclarar
        String nomeNinja = "Naruto Uzumaki";
        nomeNinja = "Boruto Uzumaki";
        System.out.println(nomeNinja);

        // Redeclarar o ARRAY
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        System.out.println(ninja[3]);

        // For para fazer um Loop no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        // Array de idade
        // int inicializam como 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        // boolean inicializam como FALSE
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // Doubles inicializam como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);


    }
}
