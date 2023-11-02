// function Person(name) {
//   this.name = name;
// }

// const person1 = new Person("John Doe");
// const person2 = new Person("Jane Doe");

// console.log(this.name);

// function Person(name) {
//   this.name = name;

//   function getName() {
//     return this.name;
//   }

//   return getName;
// }

// const person1 = new Person("John Doe");
// const getName = person1();

// console.log(getName()); // What will be logged?

// const obj = {
//   name: "John Doe",
//   getName() {
//     return this.name;
//   },
// };

// const getName = obj.getName;

// console.log(getName()); // What will be logged?

// const obj = {
//   name: "John Doe",
//   getName() {
//     return this.name;
//   },
// };

// const getNameArrow = () => this.name;

// console.log(getNameArrow()); // What will be logged?
