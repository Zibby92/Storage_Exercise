import java.util.ArrayList;
import java.util.Map;

public class Data {
    StringBuilder stringbuilder;

    LoadFile loadfile = new LoadFile();

    double sumOfItems (ArrayList<Items> list) {
        double sumOfItems = 0;
        for (Items item: list) {
            sumOfItems += item.amount;
        }
        return sumOfItems;
    }
    void printAllItemsAndNumbers (ArrayList<Items> list) {
        for (Items item: list) {
            System.out.printf("%-20s(%.0f)%-3s",item.name,item.amount,(printStars(sumOfItems(list),item.amount)).toString() );
            System.out.println();
            printStars(sumOfItems(list),item.amount);

        }
    }
    StringBuilder printStars(double sum,double part) {
        StringBuilder stringBuilder = new StringBuilder();
        double procent = Math.round((part/ sum) *100)/100.00;
        int procentAsInt = (int)(procent * 100);
        if(procentAsInt%10 >=5) procentAsInt = procentAsInt +(procentAsInt%10);
        if(procentAsInt%10 <5) procentAsInt = procentAsInt - (procentAsInt%10);
        for (int i = 0; i <procentAsInt/10 ; i++) {
            stringBuilder.append("*");
        }
        return stringBuilder;
    }


}
