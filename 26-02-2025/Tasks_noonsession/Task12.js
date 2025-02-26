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
//12. Write a TypeScript program that defines a class called Vehicle with properties make and model. 
// Implement a constructor that initializes these properties when a Vehicle object is created. 
// Then, create a derived class Car that extends Vehicle. Finally, create a derived class SportsCar that extends Car.
//  Ensure that properties are inherited correctly and each class has its own constructor.  
var Vehicle11 = /** @class */ (function () {
    function Vehicle11(make, model) {
        this.make = make;
        this.model = model;
    }
    Vehicle11.prototype.printDetails = function () {
        console.log("Vehicle - Make: ".concat(this.make, ", Model: ").concat(this.model));
    };
    return Vehicle11;
}());
var Car11 = /** @class */ (function (_super) {
    __extends(Car11, _super);
    function Car11(make, model, numDoors) {
        var _this = _super.call(this, make, model) || this;
        _this.numDoors = numDoors;
        return _this;
    }
    Car11.prototype.printDetails = function () {
        console.log("Car - Make: ".concat(this.make, ", Model: ").concat(this.model, ", Doors: ").concat(this.numDoors));
    };
    return Car11;
}(Vehicle11));
var SportsCar = /** @class */ (function (_super) {
    __extends(SportsCar, _super);
    function SportsCar(make, model, numDoors, topSpeed) {
        var _this = _super.call(this, make, model, numDoors) || this;
        _this.topSpeed = topSpeed;
        return _this;
    }
    SportsCar.prototype.printDetails = function () {
        console.log("SportsCar - Make: ".concat(this.make, ", Model: ").concat(this.model, ", Doors: ").concat(this.numDoors, ", Top Speed: ").concat(this.topSpeed, " km/h"));
    };
    return SportsCar;
}(Car11));
// Example Usage
var myVehicle = new Vehicle11("Toyota", "Corolla");
myVehicle.printDetails();
var myCar = new Car11("Honda", "Civic", 4);
myCar.printDetails();
var mySportsCar = new SportsCar("Ferrari", "488", 2, 330);
mySportsCar.printDetails();
