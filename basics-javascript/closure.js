//closures
// let name = "Shikhar";

// function printName(){
//     console.log(name);
// }
// name = "abhishek";
// name = "Himanshu";
// printName();

const outerFunc = (outerVariable =>{
    const outerName = "Hello Monocept";
    return (innerVariable => {
        console.log("Outer Variable "+outerVariable);
        console.log("Inner Variable "+innerVariable);
        console.log("Outer function local Variable " +outerName);
    });
});

const myFunction = outerFunc("Outside");
myFunction("inside");
//console.log(myFunction);