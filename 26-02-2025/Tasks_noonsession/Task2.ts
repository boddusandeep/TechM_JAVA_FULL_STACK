///2. Write a TypeScript class called Bus with the properties make, model, and year. 
// Add a method start() that prints a message indicating that the Bus is starting.
class bus {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    start(){
        console.log(this.make,this.model,this.year);
    }
}

// Example usage:
const obj = new bus("Mercedes", "Sprinter", 2022);
obj.start();
