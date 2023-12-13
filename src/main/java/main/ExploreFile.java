package main;

import main.CopyFile;

import java.io.File;

public class ExploreFile {
    public ExploreFile(String pathFolder, String destFolder) {
        File dir = new File(pathFolder);
        File[] liste = dir.listFiles();
        for (File item : liste) {
            if (item.isFile()) {
                System.out.format("Nom du fichier: %s%n", item.getName());
                if(item.getName().endsWith("pdf")){
                    new CopyFile(pathFolder+"\\"+item.getName().trim(), destFolder+"\\"+item.getName().trim());
                }

            } else if (item.isDirectory()) {
                System.out.format("Nom du répertoir: %s%n", item.getName());
            }
        }
    }
}
