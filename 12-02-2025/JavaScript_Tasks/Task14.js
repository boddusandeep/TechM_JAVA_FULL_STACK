//Write a JavaScript conditional statement to sort three numbers. Display an alert box to show the results.
// Sample numbers : 0, -1, 4
// Output : 4, 0, -1

///Write a JavaScript conditional statement to find the sign of the product 
// of three numbers. Display an alert box with the specified sign.
// Sample numbers : 3, -7, 2
// Output : The sign is -
function sort() {
    const num1 = parseFloat(document.getElementById("num1").value);
    const num2 = parseFloat(document.getElementById("num2").value);
    const num3 = parseFloat(document.getElementById("num3").value);
    let result;

if (num1 >= num2 && num1 >= num3) {
  if (num2 >= num3) {
    result = `${num1}, ${num2}, ${num3}`;
  } else {
    result = `${num1}, ${num3}, ${num2}`;
  }
} else if (num2 >= num1 && num2 >= num3) {
  if (num1 >= num3) {
    result = `${num2}, ${num1}, ${num3}`;
  } else {
    result = `${num2}, ${num3}, ${num1}`;
  }
} else {
  if (num1 >= num2) {
    result = `${num3}, ${num1}, ${num2}`;
  } else {
    result = `${num3}, ${num2}, ${num1}`;
  }
}
 alert(" the  reverse sorted order is "+result)
}
sort();