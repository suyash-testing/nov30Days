PromisePolyFill.all = (promises) => {
    let fulfilledPromises = [],
      result = [];
  
    function executor(resolve, reject) {
      promises.forEach((promise, index) =>
        promise
          .then((val) => {
            fulfilledPromises.push(true);
            result[index] = val;
  
            if (fulfilledPromises.length === promises.length) {
              return resolve(result);
            }
          })
          .catch((error) => {
            return reject(error);
          })
      );
    }
    return new PromisePolyFill(executor);
  };
  