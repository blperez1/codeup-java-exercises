package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesLecture {
    public static void main(String[] args) {
        String directoryName = "data";
        String fileName = "grocery_list.txt";

        Path directoryPath = Paths.get(directoryName);
        Path dataFilePath = Paths.get(directoryName, fileName);

        //Create a direcgtory first before creating file
        try{
            if(Files.notExists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }
            if(!Files.exists(dataFilePath)) {
                Files.createFile(dataFilePath);
            }
            List<String> grocerList = Arrays.asList("milk", "eggs", "bacon");
            Files.write(dataFilePath, grocerList);

            List<String> fileContents = Files.readAllLines(dataFilePath);
            for(int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s%n", i + 1, fileContents.get(i));
            }

            //Append to the file
            Files.write(dataFilePath,Arrays.asList("cereal", "bread"), StandardOpenOption.APPEND);
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            for(int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s%n", i + 1, fileContents.get(i));
            }

            //Replace a line in the file.
            fileContents = Files.readAllLines(dataFilePath);
            List<String> modifiedList = new ArrayList<>();
            System.out.println();
            for(String item: fileContents) {
                if(item.equals("milk")) {
                    modifiedList.add("whole milk");
                }else{
                    modifiedList.add(item);
                }
            }

            //Remove a line from file
            fileContents = Files.readAllLines(dataFilePath);
            System.out.println();
            modifiedList = new ArrayList<>();

            for(String item: fileContents) {
                if(!item.equals("bread")) {
                    modifiedList.add(item);
                }
            }
            Files.write(dataFilePath, modifiedList);
            for(int i = 0; i < fileContents.size(); i++) {
                System.out.printf("%d: %s%n", i + 1, fileContents.get(i));
            }

        }catch(IOException ex) {
            System.out.println("cannot create the file.");
            ex.printStackTrace();
        }

    }
}