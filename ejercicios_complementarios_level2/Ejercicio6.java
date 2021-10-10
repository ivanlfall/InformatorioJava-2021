// package ejercicios_complementarios_level2;

import java.util.*;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Set<Empleado> employees = new HashSet<>();

        try {
            System.out.println("Loading Employees...");
            Thread.sleep(2500);

            System.out.println("--- Employees ---");
            fillEmployees(employees);
            printList(employees);

            System.out.println("\nCalculating Salaries...");
            Thread.sleep(3000);
            Map<Integer, Integer> salaries = calculateSalary(employees);
            for (Map.Entry<Integer, Integer> employee : salaries.entrySet()) {
                System.out.println(String.format(
                    "DNI: %d | Salary: $%d", 
                    employee.getKey(), employee.getValue())
                );
            }
        } catch (InterruptedException e) {
            System.err.println("Something went wrong. :(");
        }

    }

    public static void fillEmployees(Set<Empleado> set) {
        set.add(new Empleado("Falleau Ivan", 12345678, 8, 650));
        set.add(new Empleado("Falleau Joel", 87654321, 10, 400));
        set.add(new Empleado("Juan Carlos", 56123789, 8, 300));
        set.add(new Empleado("Cosme Fulanito", 32165487, 4, 650));
        set.add(new Empleado("Federico Mercurio", 45678123, 5, 800));
    }

    public static Map<Integer, Integer> calculateSalary(Set<Empleado> set) {
        Map<Integer, Integer> salaries = new HashMap<>();
        set.forEach(emp ->{
            int salary = emp.getPricePerHour()*emp.getWorkedhours();
            salaries.put(emp.getDni(), salary);
        });

        return salaries;
    }

    public static void printList(Set<Empleado> set) {
        for (Empleado empleado : set) {
            System.out.println(empleado);
        }
    }
}

class Empleado{

    private String fullName;
    private int dni;
    private int workedhours;
    private int pricePerHour;

    public Empleado(String fullName, int dni, int workedhours, int pricePerHour) {
        this.fullName = fullName;
        this.dni = dni;
        this.workedhours = workedhours;
        this.pricePerHour = pricePerHour;
    }


    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getWorkedhours() {
        return this.workedhours;
    }

    public void setWorkedhours(int workedhours) {
        this.workedhours = workedhours;
    }

    public int getPricePerHour() {
        return this.pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    @Override
    public String toString() {
        return String.format(
            "%s | dni: %d | WH: %d | PPH: $%d", 
            getFullName(), getDni(), getWorkedhours(), getPricePerHour()
        );
    }


}
