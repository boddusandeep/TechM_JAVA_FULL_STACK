//Write a JavaScript program to rotate the string 'digiterati' in the right direction. 
// This is done by periodically removing one letter from the string end and attaching it to the front.  

var s1="digiterati";
var s2="";
s2=s2+s1[s1.length-1];

for(var k=0;k<s1.length-1;k++){
    s2=s2+s1[k];
}
console.log(s2);
 