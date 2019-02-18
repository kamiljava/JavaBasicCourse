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
        // inkrementacja pracownika
        index++;
        //wyswietlene danych zapisanego pracownika
        System.out.println("Dodano pracownika: " + employee_1);
    }
    public void getAllEmployee(){
        System.out.println("Lista pracowników: ");
        for (int i = 0; i< index; i++){
            System.out.println(employees[i]);
        }
    }
    public Employee getEmployeeByPESEL(String PESEL_search){
        for (int i = 0; i< index; i++){
            if (employees[i].PESEL.equals(PESEL_search)){
                return employees[i];
            }
        }
        return null;
    }

    public void setSallary(String PESEL_search,double newSalary){
        for (int i = 0; i< index; i++){
            if (employees[i].PESEL.equals(PESEL_search)){
                employees[i].salary_net = newSalary;
            }
        }


    }


    public static void main(String[] args) {
        Company c = new Company();
        c.addEmployee("Janusz", "Kowalski","1111", "12-12-1981","02-02.2019",2000.00);
        c.addEmployee("Grażyna", "Kowalski","2222", "01-12-1980","02-02.2019",3000.00);
        c.addEmployee("Brajan", "Kowalski","3333", "06-12-2000","02-02.2019",4000.00);
        c.getAllEmployee();
        System.out.println("Wyszukano: " + c.getEmployeeByPESEL("1111"));
        System.out.println("Wyszukano: " + c.getEmployeeByPESEL("4444"));
        c.setSallary("3333", 20000);
        System.out.println("Brajanek dostał podwyżkę: " + c.getEmployeeByPESEL("3333"));
        c.getAllEmployee();

    }

}