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
//11. Write a TypeScript program that creates a class called Shape with properties color and a method draw(). 
// This program prints a message indicating that the shape is being drawn. Then, create a derived class
//  Circle that extends Shape. Override the draw() method in the Circle class to provide a specific implementation 
// for drawing a circle
var Shape1 = /** @class */ (function () {
    function Shape1(color) {
        this.color = color;
    }
    Shape1.prototype.draw = function () {
        console.log("Drawing a shape with color ".concat(this.color, "."));
    };
    return Shape1;
}());
var Circle1 = /** @class */ (function (_super) {
    __extends(Circle1, _super);
    function Circle1(color, radius) {
        var _this = _super.call(this, color) || this;
        _this.radius = radius;
        return _this;
    }
    Circle1.prototype.draw = function () {
        console.log("Drawing a circle with color ".concat(this.color, " and radius ").concat(this.radius, "."));
    };
    return Circle1;
}(Shape1));
// Example Usage
var shape = new Shape1("Blue");
shape.draw(); // Output: Drawing a shape with color Blue.
var circle = new Circle1("Red", 10);
circle.draw(); // Output: Drawing a circle with color Red and radius 10.
