//9. Write a TypeScript program that defines an enumeration 'Color' with values 
// 'Red', 'Green', 'White' and Blue. Create a variable 'selectedColor' of type 'Color'
//  and assign it one of the enumeration values.  
var color;
(function (color) {
    color[color["Green"] = 0] = "Green";
    color[color["Red"] = 1] = "Red";
    color[color["White"] = 2] = "White";
    color[color["blue"] = 3] = "blue";
})(color || (color = {}));
var c = color.Green;
// logs 0
console.log(c);
console.log(color[3]);
console.log(color);
