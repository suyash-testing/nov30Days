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
  


/*
let o = {
    name : 'Suyash'
}
function f(age='20',state='UP') {
    console.log(`hello ${this.name} ${age} , ${state}`);
}
let bi = f.bind(o);
bi();

const person = {
    name : "Suyash"
}

function sayHi(age) {
    return `hello ${this.name} : ${age}`;
}

console.log(sayHi.call(person,20));
console.log(sayHi.bind(person,22));

const age = 20;
let person = {
    name : "Suyash",
    age : 30,
    getAge : function (params) {
        return this.age;
    }
}

const person2  ={age : 40};
console.log(person.getAge.apply(person2));

const animals = [
    {type : "Lion" , name : "King"},
    {type : "Whale" , name : "Queen"}
]

function printAnimals(i){
    this.print = function(){
        console.log(` ${i} => ${this.type} , ${this.name}`);
    }
    this.print();
}
for (let index = 0; index < animals.length; index++) {
    printAnimals.call(animals[index],index)
}
// ! Append a array to another array
const arr = [1,2,3];
const ele = [10 , 20 , 30];

arr.push.apply(arr,ele)
console.log(arr);


// ! Find min/max number of the array
const numbers = [1,2,3,242,4,2,0];

console.log(Math.min(...numbers))
console.log(Math.max.apply(null,numbers))


function f(){
    console.log(this)
}

let user = {
    f : f.bind(null)
}

user.f();

// ! Bind chaning doesnot exits.
function f(params) {
    console.log(this.name);
}

f = f.bind({name : "john"}).bind({name:"Joh"});

f();

function checkPass(success , failed) {
    let password = "value";
    if(password === 'value') success();
    else failed();
}

let user = {
    name : "Suyash Mishra",
    loggedIn : function(){
        console.log(`${this.name} is loggedIn`);
    },
    failedLoggedIn : function () {
        console.log(`${this.name} is failed to logged In.`)
    }
}

checkPass(user.loggedIn.bind(user),user.failedLoggedIn.bind(user))


// ! Partial Application

function checkPass(login) {
    let password = "value";
    if(password === 'value') login(true);
    else login(false);
}

let user = {
    name : "Suyash Mishra",
    login : function(result){
        console.log(this.name+ " --> " + (result === true ? "Logged In" : "LoggedIn Failed"));
    }
 }
 
checkPass(user.login.bind(user))

let age = 10;

let person = {
    name : "Suyash",
    age : 20 , 
    getAgeArrow : ()=> {console.log(this.age)},
    getAge: function () {
        console.log(this.age);
    }
}
let p2 = {
    age : 30
};
person.getAgeArrow.call(person);
person.getAgeArrow.call(p2);

*/