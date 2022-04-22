const randNumber = Math.floor((Math.random() * 50) + 1);
console.log(randNumber);

let boolean = true;
let countAttempts = 10;

var btn = document.querySelector('#container');

btn.addEventListener('click', (element) => {
    if (element.target.id < 51 && boolean && countAttempts > 0) {
        countAttempts -= 1;

        if (element.target.id < randNumber)
            element.target.classList.add("orange");
        if (element.target.id > randNumber)
            element.target.classList.add("brown");

        if (element.target.id == randNumber) {
            element.target.classList.add("green");
            document.getElementById("outputNumber").innerHTML = `Woohhoo...You won the game..Total attempts ${countAttempts}`;
            boolean = false;
        }
        if (boolean == true) {
            document.getElementById("outputNumber").innerHTML = `you have ${countAttempts} attempts left`;
        }
    }
});