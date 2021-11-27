package ejercicios_complementarios_level3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {

        final LocalDate NOW = LocalDate.now();
        List<Student> students = new ArrayList<>();
        fillList(students);

        Map<String, Integer> resultMap = students.stream()
                            .collect(Collectors.toMap(s -> s.getLastName()+" "+s.getName(), 
                            s -> Period.between(s.getDateOfBirth(), NOW).getYears()));
        
        System.out.println("Students List: ");
        students.forEach(s -> System.out.println(s));
        System.out.println("Age of Students: ");
        resultMap.forEach((k,v) -> System.out.println(k +": " + v + " años"));
    }

    public static void fillList(List<Student> list) {
        list.add(new Student("Toyoda", "Sakichi", LocalDate.of(1867, 2, 14)));
        list.add(new Student("Ford", "Henry", LocalDate.of(1863, 6, 30)));
        list.add(new Student("Einstein", "Albert", LocalDate.of(1879, 3, 14)));
        list.add(new Student("Musk", "Elon", LocalDate.of(1971, 6, 28)));
        list.add(new Student("Bezos", "Jeff", LocalDate.of(1964, 1, 12)));
        list.add(new Student("Salvatto", "Mateo", LocalDate.of(1999, 1, 10)));
        list.add(new Student("Fulanito", "Cosme", LocalDate.of(2021, 1, 10)));
    }
}

class Student{
    private String lastName;
    private String name;
    private LocalDate dateOfBirth;

    
    public Student(){ }

    public Student(String lastName, String name, LocalDate dateOfBirth) {
        this.lastName = lastName;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "{ "+ lastName + ", " + name + " | Date of Birth: " + dateOfBirth + " }";
    }

    
        
}