//7. Write a TypeScript program that creates type aliases for complex data types such as objects or custom types.
//  Use them to define variables and explain how they improve code readability.  

// Define a type alias for a complex object representing a person
type Person = {
    name: string;
    age: number;
    isStudent: boolean;
  };
  
  // Define a type alias for a custom union type
  type Status = "active" | "inactive" | "pending";
  
  // Use the type alias to declare a variable
  const user: Person = {
    name: "Alice",
    age: 25,
    isStudent: false,
  };
  
  // Function that takes a person and returns a status
  function getUserStatus(person: Person): Status {
    return person.age < 18 ? "pending" : "active";
  }
  
  // Example usage
  console.log(`${user.name} is ${getUserStatus(user)}.`);
  