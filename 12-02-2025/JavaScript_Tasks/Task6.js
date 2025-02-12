///Write a JavaScript program to determine whether a given year is a leap year in the Gregorian calendar
function isLeapYear(year) {
    if (year % 400 === 0) {
      return true;
    } else if (year % 100 === 0) {
      return false;
    } else if (year % 4 === 0) {
      return true;
    } else {
      return false;
    }
  }
  console.log(isLeapYear(2004));
  console.log(isLeapYear(2024));
  console.log(isLeapYear(2019));