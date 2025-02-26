// /4. Write a TypeScript class that defines a base class Car with properties like make, model, and year,
//  along with a start() method that prints a starting message. Now create a class called Engine with the 
// properties horsepower and fuelType. Modify the Car class to include an instance of the Engine class as a property
// Implement a method printCarDetails() in the Car class that prints both car and engine details
class Engine {
    horsepower: number;
    fuelType: string;

    constructor(horsepower: number, fuelType: string) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
}

class Vehicle {
    make: string;
    model: string;
    year: number;
    engine: Engine;

    constructor(make: string, model: string, year: number, engine: Engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    start1(): void {
        console.log(`${this.year} ${this.make} ${this.model} is starting...`);
    }

    printCarDetails1(): void {
        console.log(`${this.year} ${this.make} ${this.model}`);
        console.log(`Engine: ${this.engine.horsepower} HP, Fuel Type: ${this.engine.fuelType}`);
    }
}

class OffRoadVehicle extends Vehicle {
    offRoadCapability: boolean;

    constructor(make: string, model: string, year: number, engine: Engine, offRoadCapability: boolean) {
        super(make, model, year, engine);
        this.offRoadCapability = offRoadCapability;
    }

    toggleOffRoadCapability(): void {
        this.offRoadCapability = !this.offRoadCapability;
        console.log(`Off-road capability is now ${this.offRoadCapability ? 'enabled' : 'disabled'}.`);
    }
}

// Example Usage
const myEngine = new Engine(300, "Petrol");
const mySUV1 = new OffRoadVehicle("Toyota", "Land Cruiser", 2023, myEngine, true);
mySUV1.start1();
mySUV1.printCarDetails1();
mySUV1.toggleOffRoadCapability();
