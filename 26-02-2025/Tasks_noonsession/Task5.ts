//5. Write a TypeScript program that creates a class called Student with properties name and class.
//  Implement a constructor that initializes these properties when a Student object is created.  

class student{
    name:String;
    class1:String;


    constructor(name:String,class1:String){
            this.name=name;
            this.class1=class1;
    }
}

var obj1=new student("sandy","ece")
console.log(obj1.name,obj1.class1);