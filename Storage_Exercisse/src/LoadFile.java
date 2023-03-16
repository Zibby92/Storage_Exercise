import java.io.*;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadFile {
    private String fileName;
   private File file;
   private ArrayList<Items> compliteData = new ArrayList<>();


    void createAndPrepareFile() {
        loadFile();
        createNewFile();
        createBufferReader();

    }
    void loadFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do pliku: ");
        this.fileName = scanner.nextLine();
        scanner.close();
    }
    void createNewFile () {
        file = new File(this.fileName);
        boolean fileExist = file.exists();
        if(fileExist) System.out.println("Plik został poprawnie wczytany.");
        else System.out.println("Coś poszło nie tak z wczytaniem pliku.");
    }
    void createBufferReader (){
        String nextLine = null;
        boolean check = true;
        try (
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);)
        {
                while (((nextLine = bufferedReader.readLine()) != null) && check) {
                    Items items = lineFromStringToArray(nextLine);
                    this.compliteData.add(items);
                    if(this.compliteData.size() >= 100) {check = false;};
                }
        }
        catch (IOException e) {
            createNewFile();
            System.err.println("Coś poszlo nie tak na etapie tworzenia Buffer Reader'a");
            throw new RuntimeException(e);
        }

    }

     Items lineFromStringToArray(String currentLine) {
        int placeWhereSpaceis = currentLine.indexOf(";", 0);
        String nameOfItem = currentLine.substring(0,placeWhereSpaceis);
        double numberOfItem = Integer.parseInt(currentLine.substring(placeWhereSpaceis +1, currentLine.length()));
        return new Items(nameOfItem,numberOfItem);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public ArrayList<Items> getCompliteData() {
        return compliteData;
    }

    public void setCompliteData(ArrayList<Items> compliteData) {
        this.compliteData = compliteData;
    }
}
