package com.designpatterns.flyweight.employee;

import com.designpatterns.flyweight.department.theme.DepartmentTheme;
import com.designpatterns.flyweight.department.theme.ThemeFactory;

// The Context
// This holds the EXTRINSIC state.
public class EmployeeBadge {

    private String name;
    private String role;
    private int x, y;

    // Reference to the shared flyweight
    private DepartmentTheme theme;

    public EmployeeBadge(String name, String role, int x, int y, String department) {
        this.name = name;
        this.role = role;
        this.x = x;
        this.y = y;
        // We get the theme from the factory!
        this.theme = ThemeFactory.getTheme(department);
    }

    public void draw() {
        // We pass the unique data to the shared theme object
        theme.renderBadge(name, role, x, y);
    }
}
