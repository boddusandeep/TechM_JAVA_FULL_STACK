//9. Write a TypeScript program that defines an enumeration 'Color' with values 
// 'Red', 'Green', 'White' and Blue. Create a variable 'selectedColor' of type 'Color'
//  and assign it one of the enumeration values.  

enum color {
    Green,
    Red,
    White,
    blue
  }
  let c = color.Green;
  // logs 0
  console.log(c);
  console.log(color[3])
  console.log(color);