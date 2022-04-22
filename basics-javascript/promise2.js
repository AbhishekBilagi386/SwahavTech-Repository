const todos = (resource) => {
    return new Promise((resolve, reject) => {
        const req = new XMLHttpRequest();

        req.addEventListener('readystatechange', () => {
            if (req.readyState == 4 && req.status == 200) {
                const data = JSON.parse(req.responseText); //Converting JSON type Javscript Object
                resolve(data);
            } else if (req.readyState == 4) {
                reject("Could not fetch the data");
            }
        });
        //req.open("GET", "https://jsonplaceholder.typicode.com/todos/");
        req.open("GET", resource);
        req.send();
    });
};

todos('http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students/').then((data) => {
    console.log("Abhishek's data")
    console.log(data);
    // return todos('Himanshu.json');
})
// .then((data) => {
//     console.log("Himanshu's data")
//     console.log(data);
//     return todos('sagar.json');
// }).then((data) => {
//     console.log("Sagar's data")
//     console.log(data);
// })
.catch((err) => {
    console.log(err);
})