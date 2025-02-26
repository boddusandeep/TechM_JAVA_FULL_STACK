// Write a TypeScript program that creates a class called Student with properties name and roll number.
//  Add constructor overloading to support multiple ways of initializing a Student object.
//  Implement one constructor that takes both name and roll number as parameters and another
//  constructor that takes only name, assuming the roll number is unknown. 

class Student {
    name: string;
    rollNumber?: number;

    constructor(name: string);
    constructor(name: string, rollNumber: number);
    constructor(name: string, rollNumber?: number) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    printDetails(): void {
        console.log(`Name: ${this.name}, Roll Number: ${this.rollNumber ?? "Unknown"}`);
    }
}

// Example Usage
const student1 = new Student("Alice", 101);
const student2 = new Student("Bob");

student1.printDetails(); // Output: Name: Alice, Roll Number: 101
student2.printDetails(); // Output: Name: Bob, Roll Number: Unknown
