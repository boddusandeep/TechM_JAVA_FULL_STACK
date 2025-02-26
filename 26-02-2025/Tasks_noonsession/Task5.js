//5. Write a TypeScript program that creates a class called Student with properties name and class.
//  Implement a constructor that initializes these properties when a Student object is created.  
var student = /** @class */ (function () {
    function student(name, class1) {
        this.name = name;
        this.class1 = class1;
    }
    return student;
}());
var obj1 = new student("sandy", "ece");
console.log(obj1.name, obj1.class1);
