public class ejercicio3 {
  
    public void ejercicio3fp() {
        System.out.println("------------------TABLA DEL 81------------------");
        System.out.println("");

        int n = 81;

        for (int i = 1; i <=10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
    public static void main(String[] args) {
        new ejercicio3().ejercicio3fp();

}
}

