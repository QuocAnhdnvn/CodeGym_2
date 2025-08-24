package com.dto;

import java.io.*;

public class DatabaseCustom {
    private File file;

    public DatabaseCustom(String fileName) {
        this.file = new File(fileName);
    }



    public void writeData (String newData) throws IOException {
        String oldListData = readData();

        String newListData = oldListData + newData;
        FileWriter fileWriter = new FileWriter(this.file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(newListData);
        bufferedWriter.close();
    }

    public String readData() throws IOException {
        FileReader fileReader = new FileReader(this.file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        String output = "";
        while ((line = bufferedReader.readLine()) != null){
            output += line  + "\n";
        }
        bufferedReader.close();
        return output;
    }

}
