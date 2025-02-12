//Write a JavaScript program where the program takes a random integer between 1 and 10,
//  and the user is then prompted to input a guess number. The program displays a message 
// "Good Work" if the input matches the guess number otherwise "Not matched".  
let min = 1;
let max = 10;
let num = Math.floor(Math.random() * (max - min + 1)) + min;
console.log(num);
 const g = prompt('Guess the number between 1 and 10 inclusive');
 if (g == num)
   document.write('Matched');
  else
   document.write('Not matched, the number was '+g);