public class Decisiones {

    public static void main(String[] args){
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //código que prueba los operadores relacionales
        if (fechaDeLanzamiento > 2022) {
            System.out.println("Películas más populares");
        } else {
            System.out.println("Películas Retro que vale la pena ver ;)");
        }

        if (incluidoEnElPlan || tipoPlan.equals("Plus")) {
            System.out.printf("Disfrute de su película");
        } else {
            System.out.println("Película no disponible para su plan actual");
        }

    }

}
