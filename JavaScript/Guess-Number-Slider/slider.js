const randNumber = Math.floor((Math.random() * 10) + 1);
console.log(randNumber);
let countattempts = 0;
var boolean = true;
var lastValues = [0];

function numcheck() {
    let value = document.getElementById('slider').value;

    if (boolean > 0 && !lastValues.includes(value)) {
        countattempts++;
        document.querySelector('h1').innerHTML = `Total Attempts ${countattempts}`;


        let button = document.getElementById(`btn ${value}`);
        if (value > randNumber) 
            button.classList.add('brown');
            lastValues.push(value);
            
        if (value < randNumber) 
            button.classList.add('orange');
            lastValues.push(value);

        if (value == randNumber) {
            button.classList.add('green');
            document.querySelector('h1').innerHTML = `Hurray! you won the game in ${countattempts} attempt`;
            boolean = false;
        }
     

    }
}