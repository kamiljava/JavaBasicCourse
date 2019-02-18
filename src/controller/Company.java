package controller;

import OOPbasic.model.Employee;

public class Company {
    Employee employees[] = new Employee[10];
    int index = 0;

    public void addEmployee(String name, String lastname, String PESEL,
                            String birth_date, String empl_date, Double salary_net) {
        //utworzenie obiektu pracownika
        Employee employee_1 = new Employee(name, lastname, PESEL, birth_date, empl_date, salary_net);

        //zapisanie pracownika do listy pracownikow
        employees[index] = employee_1;
        //wyswietlene danych zapisanego pracownika
        System.out.println("Dodano pracownika: " + employee_1);
    }


    public static void main(String[] args) {
        Company c = new Company();
        c.addEmployee("Janusz", "Kowalski","222665565", "12-12-1987","02-02.2019",2000.00);
        c.addEmployee("Grażyna", "Kowalski","555665565", "01-12-1980","02-02.2019",3000.00);
        c.addEmployee("Brajan", "Kowalski","777665565", "06-12-1981","02-02.2019",4000.00);
        
    }

}