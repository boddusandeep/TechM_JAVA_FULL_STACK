//7. Write a TypeScript program that creates type aliases for complex data types such as objects or custom types.
//  Use them to define variables and explain how they improve code readability.  
// Use the type alias to declare a variable
var user = {
    name: "Alice",
    age: 25,
    isStudent: false,
};
// Function that takes a person and returns a status
function getUserStatus(person) {
    return person.age < 18 ? "pending" : "active";
}
// Example usage
console.log("".concat(user.name, " is ").concat(getUserStatus(user), "."));
