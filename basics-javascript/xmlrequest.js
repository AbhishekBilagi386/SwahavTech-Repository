const todos = (callback) => {
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
    req.open("GET","abhishek.json");
    req.send();
};
console.log(1);
console.log(2);
todos((err, data) => {
    console.log("callback is fired");
    if (err) {
        console.log(err);
    } else {
        console.log(data);
    }
});
