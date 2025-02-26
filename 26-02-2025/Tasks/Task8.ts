//8. Write a TypeScript program that declares an array of a specific data type. 
// It will demonstrates common array operations like adding elements,
//  removing elements, and iterating through the array.  
var tuple=[1,2,3,4,5,6,7];
tuple.push(100);
console.log(tuple);
tuple.pop();
tuple.push(5000);
console.log(tuple);

 for(var t of tuple){
    if( t % 2 == 0){
        console.log(t);
    }
 }
