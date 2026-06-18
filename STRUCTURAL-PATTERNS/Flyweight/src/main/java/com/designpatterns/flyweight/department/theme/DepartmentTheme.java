package com.designpatterns.flyweight.department.theme;

// The Flyweight
// This holds the INTRINSIC state. It is shared and immutable.
public class DepartmentTheme {

    private final String departmentName;
    private final String heavyBackgroundImage; // Imagine this is a 5MB byte array
    private final String colorHex;

    public DepartmentTheme(String departmentName, String heavyBackgroundImage, String colorHex) {
        this.departmentName = departmentName;
        this.heavyBackgroundImage = heavyBackgroundImage;
        this.colorHex = colorHex;
    }

    // The method takes the EXTRINSIC state as parameters
    public void renderBadge(String employeeName, String role, int x, int y) {
        System.out.println("Rendering at [" + x + "," + y + "] -> "
                + employeeName + " (" + role + ") "
                + " | Theme: " + departmentName + " [" + colorHex + "] ");
    }
}
