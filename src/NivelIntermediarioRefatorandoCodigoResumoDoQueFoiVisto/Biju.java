package NivelIntermediarioRefatorandoCodigoResumoDoQueFoiVisto;

public enum Biju {

    // ENUMS eles são basicamente um saco cheio de Constantes
    // então usamos ENUM quando quisermos colocar valores que são constantes para nos
    // ENUM serve para colocar valores que a gente sabe que não havera alterações

    SHUKAKU ("Shukaku", "Gaara",  1),
    MATATABI ("Matatabi",  "Yugito Nii", 2),
    ISOBU ("Isobu","Yagura",3),
    SON_GOKU ("Son Goku", "Roshi",4),
    KOKU("Koko", "Han", 5),
    SATKEN("Saiken", "Utakata", 6),
    CHOMET("Chomei","Fuu", 7),
    GYUKI ("Gyuki","Killer Bee",  8),
    KURAMA ("Kurama", "Naruto Uzumaki",  9);

    String nomeBiju;
    String jinchuriki;
    int numeroDeCaldas;

    Biju() {
    }

    Biju(String nomeBiju, String jinchuriki, int numeroDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }
}
