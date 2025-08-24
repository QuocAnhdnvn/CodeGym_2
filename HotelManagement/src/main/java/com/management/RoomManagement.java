package com.management;

import com.dto.RoomDatabase;
import com.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomManagement implements IManagement<Room> {
    private List<Room> list;
    private RoomDatabase roomDatabase = new RoomDatabase();


    public RoomManagement(){
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Room room) {
        this.list.add(room);
    }

    @Override
    public void delete(Long id) throws Exception {
        int index = this.findIndexById(id);
        this.list.remove(index);
    }

    @Override
    public void update(Long id) throws Exception {
    }

    @Override
    public void update(Long id, Room newRoom) throws Exception {
        int index = this.findIndexById(id);
        Room oldData = this.findByID(id);
        newRoom.setId(oldData.getId());
        this.list.set(index, newRoom);
    }

    @Override
    public Room findByID(Long id) throws Exception {
        int index = this.findIndexById(id);
        return this.list.get(index);
    }

    @Override
    public List<Room> findAll() {
        return this.list;
    }

    @Override
    public int findIndexById(Long id) throws Exception {
        for (int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).getId() == id){
                return i;
            }
        }
        throw new Exception("Data not found");
    }
}
