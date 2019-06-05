package com.jakob.designpatterns.composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu allMenus = new Menu("All menus", "All menus combined");

        Menu pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        Menu dinerMenu = new Menu("DINER MENU", "Launch");
        Menu cafeMenu = new Menu("CAFE MENU", "Dinner");
        Menu dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));

        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Hotdog", "A hotdog with saukraut, relish, onions, topped with cheese", false, 3.05));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));

        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day,with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A cup of the soup of the day,with a side salad", false, 3.69));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenus();
//        waitress.printVegetarianMenu();
    }
}
