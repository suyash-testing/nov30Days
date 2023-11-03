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

/*
! https://roadsidecoder.hashnode.dev/javascript-interview-questions-this-keyword-output-based-scope-implicit-binding-etc
this.a = 10 ;
console.log(this.a);

this.a = 10 ;

const f =()=> {
    console.log(this.a);
}

function f(params) {
    console.log(this.a);
}

f();


this.name = 'Suyash Global';
this.newName = "Suyash Global";

let user = {
    name : "Suyash User" , 
    age : 25 ,
    cld : {
        // name : "Suyash Cld",
        newName : "Suyash cld",
        getD(){
            console.log(this.newName , " and " , this.name);
        },
        getd2(){
            const f= () => {console.log(this.name)};
            f();
        }
    },
    newName : "Suysh",
    cldAr : {
        name : "Suyash Cld",
        newName : "Suyash cld",
        getD : () =>  {
            console.log(this.newName , " and " , this.name);
        }
    }
}

user.cld.getd2();
user.cldAr.getD();


class User {
    constructor(N){
        this.name = N ;
    }
    getName(){ console.log(this.name) }
}

let u = new User('Suyash Class');
u.getName()


const user = {
    name : "Suyash !",
    getName(){
        let name = 'Suyash';
        return this.name;
    }
}

console.log(user.getName())
function makeUser() {
    return {
        name: "John",
        ref: this
    };
}
let user = makeUser();

console.log( user.ref.name); // What's the result?


const user = {
    name : "Suyash Mishra",
    log(){
        console.log(this.name);
    }
}
setTimeout(user.log, 1000);

const user = {
    name : "Suyash",
    greet(){ //
        return `Hello ${this.name}`;
    },
    farewell : ()=> {
        return `Goodbey ${this.name}`;
    }
}


console.log(user.greet())
console.log(user.farewell())


let len = 5 ;

function  callback(params) {
    console.log(this.len);
}

const obj = {
    len : 10 ,
    method(fn){
        fn();
    }
}

obj.method(callback);

*/
