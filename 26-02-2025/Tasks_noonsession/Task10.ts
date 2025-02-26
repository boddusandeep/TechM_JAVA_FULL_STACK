///10. Write a TypeScript class called Person with properties name and age. Implement a 
// constructor that initializes these properties when a Person object is created. Then, create a derived class 
// Employee that extends Person. Override the constructor of the Employee class to include 
// an additional property employeeId.  
class Person {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    employeeId: number;

    constructor(name: string, age: number, employeeId: number) {
        super(name, age); // Call the base class constructor
        this.employeeId = employeeId;
    }

    printDetails(): void {
        console.log(`Employee - Name: ${this.name}, Age: ${this.age}, Employee ID: ${this.employeeId}`);
    }
}

// Example Usage
const employee1 = new Employee("sam", 30, 101);
employee1.printDetails();  
