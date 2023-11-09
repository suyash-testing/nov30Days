/*

q1 

console.log("Start");
const p1 = new Promise((res, rej) => {
  console.log(1);
  res(2);
});
p1.then((v) => {
  console.log(v);
});

console.log("End");


q2

console.log("Start");
const p1 = new Promise((res, rej) => {
  console.log(1);
  res(2);
  console.log(3);
});
p1.then((v) => {
  console.log(v);
});

console.log("End");


q3


console.log("Start");
const p1 = new Promise((res, rej) => {
  console.log(1);
  console.log(3);
});
p1.then((v) => {
  console.log(v);
});

console.log("End");


q4 

console.log("Start");
const p1 = () =>
  new Promise((res, rej) => {
    console.log(1);
    res("Success");
  });
console.log("middle");
p1().then((v) => {
  console.log(v);
});

console.log("function is called after middle");


q5 : 

console.log("Start");

function job() {
  return new Promise((res, rej) => {
    rej();
  });
}

let promise = job();
promise
  .then(() => {
    console.log("Success 1");
  })
  .then(() => {
    console.log("Success 2");
  })
  .then(() => {
    console.log("Success 3");
  })
  .catch(() => {
    console.log("Error 1");
  })
  .then(() => {
    console.log("Success 4");
  });

console.log("Promise chaining");


q6 : 
function job(state) {
    return new Promise((resolve, reject) => {
      if (state) resolve("Success");
      else reject("Error");
    });
  }
  
  let promise = job(true);
  promise
    .then((data) => {
      console.log(data);
      return job(false);
    })
    .catch((err) => {
      console.log(err);
      return "Error Caught";
    })
    .then((data) => {
      console.log(data);
      return job(true);
    })
    .catch((err) => {
      console.log(err);
    })
  

    !q7
    
function job(state) {
  return new Promise((resolve, reject) => {
    if (state) resolve("Success");
    else reject("Error");
  });
}

let promise = job(true);
promise
  .then((data) => {
    console.log(data);
    return job(true);
  })
  .then((data) => {
    console.log(data);
    if (data !== "victory") {
      throw "Defeat";
    }
    return job(true);
  })
  .then((data) => {
    console.log(data);
  })
  .catch((err) => {
    console.log(err);
    return job(false);
  })
  .then((data) => {
    console.log(data);
  })
  .catch((err) => {
    console.log(err);
    return "Error Caught";
  })
  .then((data) => {
    console.log(data);
    return new Error("test");
  })
  .then((data) => {
    console.log("Success : ", data.message);
  })
  .catch((err) => {
    console.log("Error : ", err.message);
  });


  ! q8

  const firstPromise = new Promise((resolve, reject) => {
    resolve("First");
  });
  
  const secondPromise = new Promise((resolve, reject) => {
    resolve(firstPromise);
  });
  
  secondPromise
    .then((res) => {
      return res;
    })
    .then((res) => {
      console.log(res);
    });
  
    What is a Promise in JavaScript and how does it work?
    Explain the states of a Promise
    Explain how to chain multiple Promises together and the syntax for doing so
    How can you convert a callback-based function to a Promise-based function?
    What is a race condition and how can you prevent it when using Promises?
    Explain the concept of async/await and how it relates to Promises
*/
