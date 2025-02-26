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
// /4. Write a TypeScript class that defines a base class Car with properties like make, model, and year,
//  along with a start() method that prints a starting message. Now create a class called Engine with the 
// properties horsepower and fuelType. Modify the Car class to include an instance of the Engine class as a property
// Implement a method printCarDetails() in the Car class that prints both car and engine details
var Engine = /** @class */ (function () {
    function Engine(horsepower, fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
    return Engine;
}());
var Vehicle = /** @class */ (function () {
    function Vehicle(make, model, year, engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
    Vehicle.prototype.start1 = function () {
        console.log("".concat(this.year, " ").concat(this.make, " ").concat(this.model, " is starting..."));
    };
    Vehicle.prototype.printCarDetails1 = function () {
        console.log("".concat(this.year, " ").concat(this.make, " ").concat(this.model));
        console.log("Engine: ".concat(this.engine.horsepower, " HP, Fuel Type: ").concat(this.engine.fuelType));
    };
    return Vehicle;
}());
var OffRoadVehicle = /** @class */ (function (_super) {
    __extends(OffRoadVehicle, _super);
    function OffRoadVehicle(make, model, year, engine, offRoadCapability) {
        var _this = _super.call(this, make, model, year, engine) || this;
        _this.offRoadCapability = offRoadCapability;
        return _this;
    }
    OffRoadVehicle.prototype.toggleOffRoadCapability = function () {
        this.offRoadCapability = !this.offRoadCapability;
        console.log("Off-road capability is now ".concat(this.offRoadCapability ? 'enabled' : 'disabled', "."));
    };
    return OffRoadVehicle;
}(Vehicle));
// Example Usage
var myEngine = new Engine(300, "Petrol");
var mySUV1 = new OffRoadVehicle("Toyota", "Land Cruiser", 2023, myEngine, true);
mySUV1.start1();
mySUV1.printCarDetails1();
mySUV1.toggleOffRoadCapability();
