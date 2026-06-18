package com.designpatterns.flyweight.department.theme;

import java.util.HashMap;
import java.util.Map;

// The Flyweight Factory
// It manages a pool of existing flyweight.
public class ThemeFactory {

    private static final Map<String, DepartmentTheme> themes = new HashMap<>();

    public static DepartmentTheme getTheme(String departmentName) {

        // If the theme doesn't exist. we create it and save it.
        if (!themes.containsKey(departmentName)) {
            System.out.println("--- ⌛ Loading heavy graphics for: " + departmentName + " ---");
            // Mocking the heavy image loading
            String mockImage = "Heavy_Image_Data_For_" + departmentName;
            String color = departmentName.equals("IT") ? "#00FF00" : "#FF0000";

            themes.put(departmentName, new DepartmentTheme(departmentName, mockImage, color));
        }

        // Return the cached theme!
        return themes.get(departmentName);
    }
}
