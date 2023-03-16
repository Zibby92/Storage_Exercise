import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    LoadFile loadfile = new LoadFile();
    Data data = new Data();
    loadfile.createAndPrepareFile();
        double i = data.sumOfItems(loadfile.getCompliteData());
        data.printAllItemsAndNumbers(loadfile.getCompliteData());
    }
}