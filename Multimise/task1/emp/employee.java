package org.emp;

public class employee {

    static void empdetails(){
        int empId = 111;
        String empName = "Sivabala";
        String empDob = "31.10.2003";
        String empPhone = "9487535967";
        String empEmail = "balathefriendsba@gmail.com";
        String empAddress = "Dubai main road, Dubai kuruku santhu, Dubai";
        System.out.println(empId+"\n"+empName+"\n"+empDob+"\n"+empPhone+"\n"+empEmail+"\n"+empAddress);

        employee empdet = new employee();

    }

    public static void main(String[] args) {
        // write your code here
        employee.empdetails();
    }
}
