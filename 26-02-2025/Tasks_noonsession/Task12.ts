//12. Write a TypeScript program that defines a class called Vehicle with properties make and model. 
// Implement a constructor that initializes these properties when a Vehicle object is created. 
// Then, create a derived class Car that extends Vehicle. Finally, create a derived class SportsCar that extends Car.
//  Ensure that properties are inherited correctly and each class has its own constructor.  
class Vehicle11 {
    make: string;
    model: string;

    constructor(make: string, model: string) {
        this.make = make;
        this.model = model;
    }

    printDetails(): void {
        console.log(`Vehicle - Make: ${this.make}, Model: ${this.model}`);
    }
}

class Car11 extends Vehicle11{
    numDoors: number;

    constructor(make: string, model: string, numDoors: number) {
        super(make, model);
        this.numDoors = numDoors;
    }

    printDetails(): void {
        console.log(`Car - Make: ${this.make}, Model: ${this.model}, Doors: ${this.numDoors}`);
    }
}

class SportsCar extends Car11 {
    topSpeed: number;

    constructor(make: string, model: string, numDoors: number, topSpeed: number) {
        super(make, model, numDoors);
        this.topSpeed = topSpeed;
    }

    printDetails(): void {
        console.log(`SportsCar - Make: ${this.make}, Model: ${this.model}, Doors: ${this.numDoors}, Top Speed: ${this.topSpeed} km/h`);
    }
}

// Example Usage
const myVehicle = new Vehicle11("Toyota", "Corolla");
myVehicle.printDetails();  

const myCar = new Car11("Honda", "Civic", 4);
myCar.printDetails(); 

const mySportsCar = new SportsCar("Ferrari", "488", 2, 330);
mySportsCar.printDetails(); 