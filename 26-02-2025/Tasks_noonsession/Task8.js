//8. Write a TypeScript class called Student with properties name and age. 
// Implement a constructor that initializes these properties when a Student object is created.
//  Additionally, add validation to ensure that the age provided is a positive number. 
// If the age is not positive, set it to a default value of 0.  
var Student1 = /** @class */ (function () {
    function Student1(name, age) {
        this.name = name;
        this.age = age > 0 ? age : 0; // Ensure age is positive, otherwise set to 0
    }
    Student1.prototype.printDetails = function () {
        console.log("Student - Name: ".concat(this.name, ", Age: ").concat(this.age));
    };
    return Student1;
}());
// Example Usage
var student11 = new Student1("Alice", 20);
var student22 = new Student1("Bob", -5); // Invalid age, will be set to 0
student11.printDetails(); // Output: Student - Name: Alice, Age: 20
student22.printDetails(); // Output: Student - Name: Bob, Age: 0
