///2. Write a TypeScript class called Bus with the properties make, model, and year. 
// Add a method start() that prints a message indicating that the Bus is starting.
var bus = /** @class */ (function () {
    function bus(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    bus.prototype.start = function () {
        console.log(this.make, this.model, this.year);
    };
    return bus;
}());
// Example usage:
var obj = new bus("Mercedes", "Sprinter", 2022);
obj.start();
