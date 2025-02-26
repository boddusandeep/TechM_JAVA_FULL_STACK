//
//3. Write a TypeScript class called SUV (Sports Utility Vehicle) that extends the Car class.
//  Add a property to represent whether the SUV is suitable for off-road driving. 
// Implement a method that toggles off-road capability and prints a message accordingly.  
class Car {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    displayInfo(): void {
        console.log(`${this.year} ${this.make} ${this.model}`);
    }
}

class SUV extends Car {
    offRoadCapability: boolean;

    constructor(make: string, model: string, year: number, offRoadCapability: boolean) {
        super(make, model, year);
        this.offRoadCapability = offRoadCapability;
    }

    toggleOffRoadCapability(): void {
        this.offRoadCapability = !this.offRoadCapability;
        console.log(`Off-road capability is now ${this.offRoadCapability ? 'enabled' : 'disabled'}.`);
    }
}
 
const mySUV = new SUV("Toyota", "LandCruiser", 2023, true);
mySUV.displayInfo();
mySUV.toggleOffRoadCapability();
