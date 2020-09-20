package com.gupaoedu.pattern.delegate.simple;

public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("employeeA, begining excute" + command);
    }
}
