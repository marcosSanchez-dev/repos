package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        PolimorfismoFile arrPolimorfismo[] = new PolimorfismoFile[4];

        arrPolimorfismo[0] = new PolimorfismoFile(5,"hola", true);
        arrPolimorfismo[1] = new Hijo1(666,5,"hola", true);
        arrPolimorfismo[2] = new Hijo2("Chao Marico", 5,"hola", true);


        for (PolimorfismoFile polimorfismoFile : arrPolimorfismo) {
            if (polimorfismoFile != null) {
                polimorfismoFile.getInfo();
            }
        }
    }
}
