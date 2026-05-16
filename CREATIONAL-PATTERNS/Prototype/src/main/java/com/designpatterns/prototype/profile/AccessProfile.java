package com.designpatterns.prototype.profile;

import java.util.ArrayList;
import java.util.List;

public class AccessProfile implements ProfilePrototype<AccessProfile> {

    private String roleName;
    private List<String> permissions;

    public AccessProfile(String roleName, List<String> permissions) {
        this.roleName = roleName;
        this.permissions = permissions;
    }

    // Copy Constructor
    public AccessProfile(AccessProfile target) {
        if (target != null) {
            this.roleName = target.roleName;

            // Making a deep copy of the list
            this.permissions = new ArrayList<>(target.permissions);
        }
    }

    @Override
    public AccessProfile cloneProfile() {
        return new AccessProfile(this);
    }

    public void addPermission(String newPermission) {
        permissions.add(newPermission);
    }

    public void printProfile() {
        System.out.println("Role: " + roleName + " | Permissions: " + permissions);
    }
}
