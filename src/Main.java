import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenidx a ScreenMatch");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                Es la mejor película del fin del milenio
                Fué lanzada en:                 
                """ + fechaDeLanzamiento +
                """
                . Además, la pelicula fue aclamada por la crítica
                obetiendo una calificación de 
                """ + media;
        System.out.println(sinopsis);

        int clasificacion = (int) media / 2;
        System.out.println(clasificacion);

        }
    }