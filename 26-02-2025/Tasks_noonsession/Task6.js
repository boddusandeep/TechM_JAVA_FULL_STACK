// Write a TypeScript program that creates a class called Student with properties name and roll number.
//  Add constructor overloading to support multiple ways of initializing a Student object.
//  Implement one constructor that takes both name and roll number as parameters and another
//  constructor that takes only name, assuming the roll number is unknown. 
var Student = /** @class */ (function () {
    function Student(name, rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    Student.prototype.printDetails = function () {
        var _a;
        console.log("Name: ".concat(this.name, ", Roll Number: ").concat((_a = this.rollNumber) !== null && _a !== void 0 ? _a : "Unknown"));
    };
    return Student;
}());
// Example Usage
var student1 = new Student("Alice", 101);
var student2 = new Student("Bob");
student1.printDetails(); // Output: Name: Alice, Roll Number: 101
student2.printDetails(); // Output: Name: Bob, Roll Number: Unknown
