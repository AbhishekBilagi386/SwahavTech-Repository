const doSomething =()=>{
    return new Promise((resolve,reject)=>{  
        //resolve("data recieved");
        //reject("data could not be fetched");
    });
};
// doSomething().then((data)=>{
//     console.log(data);
// },(err)=>{
//     console.log(err);
// });

doSomething().then((data)=>{
    console.log(data);
}).catch((err)=>{
    console.log(err);
});