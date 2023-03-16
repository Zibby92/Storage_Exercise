public class Mainn {
    public static void main(String[] args) {
        String a = "asdsg";
        String[] split = a.split("d");
        System.out.println(split[0]+ " " +split[1]);
//        double positiveNumber = 123.456789;
//        System.out.printf("%+.2f%n", positiveNumber); //+123.46
//
//        double negativeNumber = -1.234;
//        System.out.printf("%(010.2f%n", negativeNumber); //(00001.23)
//
//        int bigNumber = 123456789;
//        System.out.printf("%,d%n", bigNumber); //zależne od lokalizacji, np. 123,456,789
//
//        String name1 = "Anna";
//        String name2 = "Kazimierz";
//        int age1 = 22;
//        int age2 = 33;
//        System.out.printf("%-20s%s%n", "Imię", "Wiek");
//        System.out.printf("%-20s%d%n", name1, age1);
//        System.out.printf("%-20s%d%n", name2, age2);
        double procent = (13/28.0) * 100;
        System.out.println(procent);
        double round = Math.round(procent * 100)/ 100.00;
        System.out.println(round);
    }
}
