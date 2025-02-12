function ToF(celsius) 
{
  var cTemp = celsius;
  var cToFahr = cTemp * 9 / 5 + 32;
  var message = cTemp+'C is ' + cToFahr + '  F';
    console.log(message);
}

function ToC(fahrenheit) 
{
  var fTemp = fahrenheit;
  var fToCel = (fTemp - 32) * 5 / 9;
  var message = fTemp+' F is ' + fToCel + ' C';
    console.log(message);
} 
ToF(65);
ToC(45);