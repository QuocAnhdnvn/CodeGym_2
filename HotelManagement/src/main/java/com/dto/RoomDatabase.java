package com.dto;

import com.model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDatabase {
    private File file;

    public RoomDatabase() {
        this.file = new File("database/rooms.csv");
    }

    public void writeData (List<Room> listRoom) {
        try {
            String newListData = "";
            for (Room room : listRoom) {
                newListData += room.getId() + "," + room.getName() + "," + room.getPrice() + "," + room.getCategoryId() + "\n";
            }
            FileWriter fileWriter = new FileWriter(this.file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(newListData);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeData (Room room) throws IOException {
        String oldListData = getStringData();

        String newLine = room.getId() + "," + room.getName() + "," + room.getPrice() + "," + room.getCategoryId();
        String newListData = oldListData + newLine;
        FileWriter fileWriter = new FileWriter(this.file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(newListData);
        bufferedWriter.close();
    }

    public List<Room> readData() {
        try {
            FileReader fileReader = new FileReader(this.file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            List<Room> list =new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null){
                String[] arr = line.split(",");
                String name = arr[1];
                int price = Integer.parseInt(arr[2]);
                Long categoryId = Long.valueOf(arr[3]);
                Room room = new Room(name, price, categoryId);
                list.add(room);
            }
            bufferedReader.close();
            return list;
        } catch (IOException e){
            System.out.println(e);
        }
        return null;
    }

    public String getStringData() throws IOException {
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
