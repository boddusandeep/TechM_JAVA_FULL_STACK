///Write a JavaScript conditional statement to find the sign of the product 
// of three numbers. Display an alert box with the specified sign.
// Sample numbers : 3, -7, 2
// Output : The sign is -
function calculate() {
    const num1 = parseFloat(document.getElementById("num1").value);
    const num2 = parseFloat(document.getElementById("num2").value);
    const num3 = parseFloat(document.getElementById("num3").value);
  
  
    if (isNaN(num1) || isNaN(num2)) {
      document.getElementById("result").textContent = "Invalid input";
      return;
    }
  
    const multiplication = num1 * num2 *num3;
    if(multiplication < 0){
        alert("hey this is a negative product");
    }else{
  
        document.getElementById("result").textContent = `Multiplication: ${multiplication}`;

    }
 
  }