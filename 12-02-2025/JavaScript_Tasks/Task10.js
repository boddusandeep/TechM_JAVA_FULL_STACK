function calculate() {
    const num1 = parseFloat(document.getElementById("num1").value);
    const num2 = parseFloat(document.getElementById("num2").value);
  
    if (isNaN(num1) || isNaN(num2)) {
      document.getElementById("result").textContent = "Invalid input";
      return;
    }
  
    const multiplication = num1 * num2;
    const division = num2 === 0 ? "Cannot divide by zero" : num1 / num2;
  
    document.getElementById("result").textContent = `Multiplication: ${multiplication}, Division: ${division}`;
  }