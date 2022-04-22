const todos = (resource, callback) => {
    const req = new XMLHttpRequest();

    req.addEventListener('readystatechange', () => {
        if (req.readyState == 4 && req.status == 200) {
            //console.log(req, req.readyState);
            const data = JSON.parse(req.responseText); //Converting JSON type Javscript Object
            callback(undefined, data);
        } else if (req.readyState == 4) {
            //console.log("Data could not be fetched")
            callback("Could not fetch the Data.", undefined);
        }

    });
    //req.open("GET", "https://jsonplaceholder.typicode.com/todos/");
    req.open("GET", resource);
    req.send();
};

todos("Himanshu.json", (err, data) => {
    console.log("Himnahshu's callback is fired");
    console.log(data);
    todos("abhishek.json", (err, data) => {
        console.log("Abhishek's callback is fired");
        console.log(data);
        todos("sagar.json", (err, data) => {
            console.log("Sagar's callback is fired");
            console.log(data);
        })
    })
});
