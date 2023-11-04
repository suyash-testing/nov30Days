// const obj = { num: 2 };
// function addNum(a, b) {
//   return this.num + a + b;
// }
// const result = addNum.call(obj, 3, 4);
// console.log(result);

// const person = {
//     fullName: function() {
//       return this.firstName + " " + this.lastName;
//     }
//   }
//   const person1 = {
//     firstName: 'John',
//     lastName: 'Doe'
//   }
//   const person2 = {
//     firstName: 'Jane',
//     lastName: 'Doe'
//   }
//   const result1 = person.fullName.call(person1);
//   const result2 = person.fullName.call(person2);
//   console.log(result1);
//   console.log(result2);

// const obj = { num: 5 };
// function multiplyNum(a, b) {
//   return this.num * a * b;
// }
// const boundFunc = multiplyNum.bind(obj);
// const result = boundFunc(2, 3);
// console.log(result);

// function introduce(language) {
//     console.log(`I can speak ${language} fluently.`);
//   }
//   const person = {
//     name: 'Alice'
//   };
//   introduce.call(person, 'French');


// const car = {
//     brand: 'Toyota',
//     displayBrand: function() {
//       console.log(this.brand);
//     }
//   };
//   const brandDisplay = car.displayBrand;
//   brandDisplay();
  