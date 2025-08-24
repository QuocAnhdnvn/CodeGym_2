package com.management;

import com.dto.CategoryDatabase;
import com.model.Category;

import java.util.List;
import java.util.Objects;

public class CategoryManagement implements IManagement<Category> {
    private List<Category> list;
    private CategoryDatabase categoryDatabase = new CategoryDatabase();

    public CategoryManagement(){
        this.list = categoryDatabase.readData();
    }

    @Override
    public void add(Category category) {
        this.list.add(category);
        categoryDatabase.writeData(this.list);
    }

    @Override
    public void delete(Long id) throws Exception {
        int index = this.findIndexById(id);
        this.list.remove(index);
        categoryDatabase.writeData(this.list);
    }

    @Override
    public void update(Long id) throws Exception {

    }

    @Override
    public void update(Long id, Category newcategory) throws Exception {
        int index = this.findIndexById(id);
        Category oldData = this.findByID(id);
        newcategory.setId(oldData.getId());
        this.list.set(index, newcategory);
        categoryDatabase.writeData(this.list);
    }

    @Override
    public Category findByID(Long id) throws Exception {
        int index = this.findIndexById(id);
        return this.list.get(index);
    }

    @Override
    public List<Category> findAll() {
        return this.list;
    }

    @Override
    public int findIndexById(Long id) throws Exception {
        for (int i = 0; i < this.list.size(); i++) {
            Category category = this.list.get(i);
            if (Objects.equals(category.getId(), id)) {
                return i;
            }
        }
        throw new Exception("Data not found");
    }

}
