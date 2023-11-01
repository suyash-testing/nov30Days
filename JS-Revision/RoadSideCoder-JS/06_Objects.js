/*
* Spread Operator
console.log([..."Lydia"]);

const user = { name: "Suyash", age: 20 };
const admin = { admin: true, ...user };
console.log(admin);

const settings = {
    name: "Suyash",
    level: 20,
    health: 60,
};

const data = JSON.stringify(settings, ["level", "health"]);
console.log(data);

const shape = {
    radius: 20,
  diameter: function () {
      return 2 * this.radius;
    },
    area: () => Math.PI * this.radius * this.radius,
};

// ! Getting NaN : Because 'this' doesn't work at arrow function, 'this' here point to window object.
console.log(shape.area());
 
* Destructuring

let user = {
    name: "Suyash",
    age: 20,
    fullName: {
        fName: "Er Suyash",
        lName: "Mishra",
    },
};

const { name: userValue = "defaultValue" } = user;
console.log(userValue);

const {
    fullName: { fName },
} = user;
console.log(fName);


* Object Referencing
let c = {
    greeting: "Heya",
};
let d;
d = c; // Not copying , we provide reference , on changing one , other will be affected.
c.greeting = "Hello";
console.log(d.greeting); 

let a = { a: 1 };
let b = a;

! Only objects with same ref , will be true.
console.log({ a: 1 } == { a: 1 });
console.log({ a: 1 } === { a: 1 });
console.log(a === b);


let person = {
    name: "Suyash",
};
const members = [person];
person = null;

// this will change the value of person.
person.name = null;
console.log(members);

! Hard 
const value = { number: 10 };
const multiply = (x = { ...value }) => {
    console.log((x.number *= 2));
};

multiply();
multiply();
multiply(value);
multiply(value);

! Medium
function changeAgeAndRef(p) {
  p.age = 23;
  p = {
      name: "Suyash",
      age: 30,
    };
    return p;
}

const p1 = {
    name: "Mishra",
    age: 20,
};

const p2 = changeAgeAndRef(p1);

console.log(p1);
console.log(p2);


! Shallow copy and Deep copy
Shallow copy in JavaScript creates a new object with references to the same memory locations as the original object. This means that both objects point to the same underlying data. As a result, any changes made to either object will also be reflected in the other object.

const originalObject = {
  name: "Alice",
  age: 25,
};

const shallowCopy = originalObject;
shallowCopy.name = "Bob";
console.log(originalObject.name); // "Bob"

Deep copy in JavaScript creates a new object with new memory locations for all of its properties and nested objects or arrays. This means that the new object is a completely independent copy of the original object, and any changes made to either object will not affect the other object.

const originalObject = {
  name: "Alice",
  age: 25,
};

const deepCopy = JSON.parse(JSON.stringify(originalObject));
deepCopy.name = "Bob";
console.log(originalObject.name); // "Alice"


const originalObject = {
  name: "Alice",
  age: 25,
};

const deepCopy = { ...originalObject };
console.log(deepCopy); // { name: "Alice", age: 25 }

const originalObject = {
  name: "Alice",
  age: 25,
};

const deepCopy = structuredClone(originalObject);

console.log(deepCopy); // { name: "Alice", age: 25 }

*/
