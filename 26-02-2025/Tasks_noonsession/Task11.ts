//11. Write a TypeScript program that creates a class called Shape with properties color and a method draw(). 
// This program prints a message indicating that the shape is being drawn. Then, create a derived class
//  Circle that extends Shape. Override the draw() method in the Circle class to provide a specific implementation 
// for drawing a circle
class Shape1 {
    color: string;

    constructor(color: string) {
        this.color = color;
    }

    draw(): void {
        console.log(`Drawing a shape with color ${this.color}.`);
    }
}

class Circle1 extends Shape1 {
    radius: number;

    constructor(color: string, radius: number) {
        super(color);
        this.radius = radius;
    }

    draw(): void {
        console.log(`Drawing a circle with color ${this.color} and radius ${this.radius}.`);
    }
}

// Example Usage
const shape = new Shape1("Blue");
shape.draw(); // Output: Drawing a shape with color Blue.

const circle = new Circle1("Red", 10);
circle.draw(); // Output: Drawing a circle with color Red and radius 10.
