//Storing data in LocalStorage

// localStorage.setItem("name:","Abhishek");
// localStorage.setItem("age",15);
// localStorage.setItem("isAdult",false);

// localStorage.removeItem("name:");
// localStorage.clear();

//data is always stored as String in localStorage either it be key or value

const players = [
    { name: "Sachin", topScore: 200 },
    { name: "Rishab", topScore: 200 },
    { name: "Virat", topScore: 200 },
    { name: "Dravid", topScore: 200 }
];

localStorage.setItem("players",JSON.stringify(players));

const data = localStorage.getItem("players");
const playersData = JSON.parse(data);
console.log(playersData);