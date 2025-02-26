var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
///10. Write a TypeScript class called Person with properties name and age. Implement a 
// constructor that initializes these properties when a Person object is created. Then, create a derived class 
// Employee that extends Person. Override the constructor of the Employee class to include 
// an additional property employeeId.  
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var Employee = /** @class */ (function (_super) {
    __extends(Employee, _super);
    function Employee(name, age, employeeId) {
        var _this = _super.call(this, name, age) || this; // Call the base class constructor
        _this.employeeId = employeeId;
        return _this;
    }
    Employee.prototype.printDetails = function () {
        console.log("Employee - Name: ".concat(this.name, ", Age: ").concat(this.age, ", Employee ID: ").concat(this.employeeId));
    };
    return Employee;
}(Person));
// Example Usage
var employee1 = new Employee("sam", 30, 101);
employee1.printDetails();
