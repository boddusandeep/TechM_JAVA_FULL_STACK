//2. Write a TypeScript program that declares variables using let, 
// const, and var. Then, describe how each declaration type behaves
//  with respect to scoping and mutability.  
var n1 = 10;
var n2 = 25;
scope();
function scope() {
    var n3 = 100;
    var s2 = 250;
    var number = 280;
    console.log(n3);
    console.log(s2);
    console.log(n1);
    console.log(n2);
    console.log(number);
}
//console.log(n3); cant be accesed
//console.log(s2);cant be accesed
//console.log(number); cant be accesed
console.log(n1);
console.log(n2);
