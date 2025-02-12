///Write a JavaScript program to get the current date.  
// Expected Output :
// mm-dd-yyyy, mm/dd/yyyy or dd-mm-yyyy, dd/mm/yyyy
var today = new Date();
var day=today.getDate();
var mon=today.getMonth()+1;
var year=today.getFullYear();

console.log(day+"/"+mon+"/"+year);
console.log(mon+"/"+day+"/"+year);
console.log(year+"/"+mon+"/"+day);
