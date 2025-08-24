package com.menu;

import com.lib.Input;
import com.management.CategoryManagement;
import com.management.RoomManagement;
import com.model.Category;
import com.model.Room;

import java.util.List;

public class MainMenu {
    private RoomManagement roomManagement;
    private CategoryManagement categoryManagement;

    public MainMenu() {
        this.roomManagement = new RoomManagement();
        this.categoryManagement = new CategoryManagement();
    }

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("------------------------Menu------------------------");
            System.out.println("1. Quản lý phòng");
            System.out.println("2. Quản lý loại phòng");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng nhập lựa chọn của bạn");
            choice = Input.inputInt();
            switch (choice) {
                case 1:
                    showRoomMenu();
                    break;
                case 2:
                    this.showCategoryMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        } while (choice != 0);
    }

    // ======================= Category Feature ====================
    public void showCategoryMenu() {
        int choice;
        do {
            System.out.println("------------------------Category Menu------------------------");
            System.out.println("1. Thêm loại");
            System.out.println("2. Hiển thị tất cả");
            System.out.println("3. Show chi tiết");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng nhập lựa chọn của bạn");
            choice = Input.inputInt();
            switch (choice) {
                case 1:
                    showFormAddCategory();
                    break;
                case 2:
                    showAllCategories();
                    break;
            }
        } while (choice != 0);
    }

    public void showAllCategories() {
        System.out.println("---------- List Category Menu --------");
        List<Category> list = this.categoryManagement.findAll();
        for (Category category : list) {
            System.out.println(category);
        }
    }

    public void showFormAddCategory() {
        System.out.println("---------- Add Category Menu --------");
        System.out.println("Nhập id: ");
        Long id = (long) Input.inputInt();
        System.out.println("Nhập tên: ");
        String name = Input.inputString();
        System.out.println("Nhập số lượng phòng: ");
        int total = Input.inputInt();
        System.out.println("Nhập mô tả: ");
        String description = Input.inputString();
        Category newCategory = new Category(id, name, total, description);
        this.categoryManagement.add(newCategory);
        System.out.println("Thêm loại thành công");
    }

    // ======================= Room Feature ====================
    public void showRoomMenu() {
        int choice;
        do {
            System.out.println("------------------------Room Menu------------------------");
            System.out.println("1. Thêm phòng");
            System.out.println("2. Hiển thị tất cả");
            System.out.println("3. Chi tiết phòng");
            System.out.println("4. Xoá phòng");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng nhập lựa chọn của bạn");
            choice = Input.inputInt();
            switch (choice) {
                case 1:
                    showFormAddRoom();
                    break;
                case 2:
                    showAllRoom();
                    break;
            }
        } while (choice != 0);
    }

    public void showAllRoom() {
        System.out.println("---------- List Room Menu --------");
        List<Room> list = this.roomManagement.findAll();
        for (Room room : list) {
            Category category = this.getCategoryById(room.getCategoryId());
            String categotyName = "";
            if (category != null) {
                categotyName = category.getName();
            }
            System.out.println("Id: " + room.getId() + " Name: " + room.getName() + " Category " + categotyName);
        }
    }

    private Category getCategoryById(Long id) {
        try {
            Category category = this.categoryManagement.findByID(id);
            return category;
        } catch (Exception e) {
            // System.out.println("");
        }
        return null;
    }

    public void showFormAddRoom() {
        System.out.println("---------- Add Room Menu --------");
        System.out.println("Nhập tên: ");
        String name = Input.inputString();
        System.out.println("Nhập giá: ");
        int price = Input.inputInt();
        // Show list option for categories;
        List<Category> categories = categoryManagement.findAll();
        System.out.println("Danh sách category");
        for (Category category : categories) {
            System.out.println(category);
        }
        System.out.println("Vui lòng nhập ID loại phòng");
        Long categoryId = (long) Input.inputInt();
        // Kiểm tra category người dùng nhập vào có tồn tại hay không
        Room room = new Room(name, price, categoryId);
        roomManagement.add(room);
        System.out.println("Thêm thành công");
    }
}
