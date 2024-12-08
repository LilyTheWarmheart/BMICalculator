public class Main {

    public static void main(String[] args) {
        double weight = 80;
        double height = 1.58;

        if (weight < 0 || height < 0){
            System.out.println("Cislo nesmi byt zaporne");
        }

        double result = weight / (height * height);

        System.out.println(result);

        if (result < 16.5) {
            System.out.println("tezka podvyziva");
        } else if (result >= 16.5 && result < 18.5) {
            System.out.println("podvaha");
        } else if (result >= 18.5 && result < 25) {
            System.out.println("idealni (zdrava) vaha");
        } else if (result >= 25 && result < 30) {
            System.out.println("nadvaha");
        } else if (result >= 30 && result < 35) {
            System.out.println("obezita prvniho stupne");
        } else if (result >= 35 && result < 40) {
            System.out.println("obezita druheho stupne");
        } else if (result > 40) {
            System.out.println("obezita tretiho stupne (tez morbidni obezita)");
        }
    }

}

