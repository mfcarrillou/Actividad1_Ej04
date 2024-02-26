package actividad1_ej04;

public class Act1_Ejercicio04 {

    public static void main(String[] args) {
        int edjuan = 9;
        int edana, edalber, edmama;
        edalber = (edjuan/3) * 2;
        edana = (edjuan/3) * 4;
        edmama = edjuan + edalber + edana;
        System.out.println("Las edades son:");
        System.out.println("Alberto: " + edalber);
        System.out.println("Juan: " + edjuan);
        System.out.println("Ana: " + edana);
        System.out.println("Mama: " + edmama);
    }
    
}
