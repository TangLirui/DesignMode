package com.gupaoedu.pattern.delegate.simple;

public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("employeeB, begining excute" + command);
    }
}
