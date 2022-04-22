//variables

// let name = "Abhi";
// console.log(name, typeof name);

// name = "Monocept";
// console.log(name, typeof name);

// name = 100;
// console.log(name, typeof name);
// console.log(val);

// var val = 10;

//let email = "indiaismyiscountry@gmail.com";
// console.log(email.toUpperCase());
// console.log(email.indexOf('@'));
// console.log(email.substring(email.indexOf("@")+1));
// console.log(email.slice(email.indexOf("c"),email.indexOf("@")));

// let newStr = email.replace('is','IS');//replace first occurance
// console.log(newStr);

// let newStr1 = email.replaceAll('is','IS');//replaces all the occurances
// console.log(newStr1);

//Template String

// let title = "Indian Racing Video";
// let author = "Abhishek";
// let likes = 1000;

// let tempStr = `Blog on ${title} by ${author} has ${likes} likes on Twitter`;

// console.log(tempStr);

//Arrays

// let players = ['Dhoni', 'Sachin', 'Raina', 'Kohli'];
// console.log(players);
// console.log(players.length);

// console.log(players.join('-'));

// players.push('Pant', 'Dinesh');
// console.log(players);

// players.push('Ishan');
// console.log(players);

// players.pop();
// console.log(players);

//Undefined

// let age;
// console.log(age);
// console.log(age + 10);

//null

// let age = null;
// console.log(age);
// console.log(age + 10);

// let players = ['Dhoni', 'Sachin', 'Raina', 'Kohli'];

// console.log(players.includes('Dhoni'));

//loose comparison and strict comparison

// let age = 30;
// console.log(age==30);
// console.log(age=='30');//loose comparison

// console.log(age==='30');//strict comparison

//Type Conversion

// let score = '100';

// score = Number(score);
// console.log(score, typeof score);

// let result = Boolean("");
// console.log(result);

//Functions declaration

// function greet1(){
//     console.log("Declaration:Hello Monocept");
// };

// greet1();

// //function expression
// const greet = function(){
//     console.log("Expression: Hello Monocept");
// };
// greet();

// //function hoisting
// greet2();

// function greet2(){
//     console.log("Hoisting:Hello Monocept");
// };

//Function with arguements

// const greet = function(name="Abhi",time="Morning"){
//     console.log("Good" + time+ " "+name);
// };
// greet("Harsh","Night");
// greet();
// greet("Himanshu");

//returning values from function

// const mul = function(num1,num2){
//     return num1 * num2;
// };
// console.log(mul(10,2));

// //Arrow

// const mul1 = (num1,num2)=>num1 * num2;

// console.log(mul1(10,2));

//Day-2

//foreach method and method callback

// const myFunc = callback => {
//     let value = 80;
//     callback(value*10);
// };
// myFunc(value=> {
//     console.log(value);
// });

// let players = ['Dhoni', 'Sachin', 'Raina', 'Kohli'];

// players.forEach (player=>{
//     console.log(player);
// });

//object literals
// let user = {
//     name: "Jay",
//     email: "jay@gmail.com",
//     age: 30,
//     article: ['working with DOM', 'Using Eclipse effectively'],

//     login: function () {
//         console.log("USer Logged in.");
//     },
//     logout: function () {
//         console.log("User Logged out.");
//     },
//     logArticles : function(){
//         console.log("List Of Articles");
//         this.article.forEach(article=>{
//             console.log(article);
//         });
//     }
// };
// console.log(this);
// console.log(user);
// console.log(user.name);
// console.log(user.age);
// console.log(user.email);
// console.log(user.article);

// user.login();
// user.logout();
// console.log(user['name']);
//user.logArticles();

//Array OF Objects
// let articles = [
//     {
//     title: 'working with DOM',
//     likes: 100 
//     },
//     {
//         title:  'Using Eclipse effectively',
//         likes: 1000
//     },
//     {
//         title: 'Building Dynamic Webistes',
//         likes: 200
//     }
// ];
// articles.forEach(article=>{
// console.log(article.title+ " | Likes: "+article.likes);
// });


// let value = 20.1410;
// console.log(Math.round(value));//Round value
// console.log(Math.ceil(value));//Upper bound
// console.log(Math.floor(value));//Lower Bouund
// console.log(parseInt(value));//remove decimal value
// console.log( parseInt(Math.random() * 100 + 1));//generate any random number from (1 to 100)

//DOM
//Query Selector

//const h1Ref = document.querySelectorAll("h1");
// console.log(h1Ref);
// console.log(h1Ref.textContent);

// h1Ref.textContent = "Hello Abhishek";

// console.log(h1Ref);
// h1Ref.forEach(heading => {
//     heading.textContent += "  Hyderabad";
//     heading.innerText +=  "  | Mumbai";
// console.log(heading.textContent + " Hyderabad.");
// console.log(heading.innerText + " Mumbai.");
// });

// const playerList = document.querySelector('ul');

// console.log(playerList);

// let players = ['Dhoni', 'Sachin', 'Raina', 'Kohli'];

// let html = ``;
// players.forEach(player => {
//     html += `<li>  ${player} </li>`;
// });
// playerList.innerHTML += html;

// const links = document.querySelector('div');

// let websites = [
//     ["Google", "https://www.google.co.in/"],
//     ["Facebook", "https://www.facebook.com/"],
//     ["W3schools", "https://www.w3schools.com/"],
//     ["JavaPoint", "https://www.javatpoint.com/"]
// ];

// let html = ``;
// websites.forEach(website => {
//     html += `<a href= ${website[1]}> 
//                             ${website[0]}</a>`;
// });

// links.innerHTML += html;

// const para = document.querySelector('p');
// console.log(para.innerText);

////JS event task
// const Div = document.querySelector('div');

// var button1 = document.createElement('button');
// var button2 = document.createElement('button');
// var text1 = document.createTextNode("Red");
// var text2 = document.createTextNode("Yellow");

// button1.appendChild(text1);
// button2.appendChild(text2);

// Div.appendChild(button1);
// Div.appendChild(button2);

// button1.onclick = function(){
//     document.body.style.backgroundColor = "red";
// };
// button2.onclick = function(){
//     document.body.style.backgroundColor = "yellow";
// };

//Day-3

// let players = [
//     {
//         name: "Sachin", age: 30, runs: 10000, wickets: 30
//     },
//     {
//         name: "Dhoni", age: 35, runs: 20000, wickets: 100
//     },
//     {
//         name: "Ishan", age: 25, runs: 1000, wickets: 3
//     },
//     {
//         name: "Rishab", age: 28, runs: 8000, wickets: 25
//     },
//     {
//         name: "kohli", age: 33, runs: 15000, wickets: 3
//     }

// ];

// let html = '';
// players.forEach((players)=>{
//     html += 
// })

//getAttribute and setAttribute

// const link = document.querySelector('a');

// console.log(link.getAttribute('href'));

// link.setAttribute("href","http://www.facebook.com");
// link.innerText = "Facebook";

//Adding and Removing classes

// const para = document.querySelectorAll('p');
// para.forEach(p => {
//     if (p.innerText.includes("success")) {
//         p.classList.add('success');
//     }
//     if (p.innerText.includes("error")) {
//         p.classList.add('error');
//     }
// });

// const title = document.querySelector('h1');

// title.addEventListener('click',()=>{
//     title.classList.toggle('success');
// })

// const para = document.querySelector('p');
// const inputText = document.querySelector('input');

// para.addEventListener("input",()=> {
//     var specialChar = /^[A-Z a-z]+$/;
//     if (inputText.value.match(specialChar))
//     para.innerText = inputText.value;
// })

// const article1 = document.querySelector("article");
// console.log(article1.children);

// Array.from(article1.children).forEach(child => {
//     console.log(Element);
// });
// const para = document.querySelector('p');

// console.log(para.parentElement);
// console.log(para.parentElement.parentElement);
// console.log(para.parentElement.parentElement.parentElement);

// console.log(para.nextElementSibling);
// console.log(para.previousElementSibling);

//Day-4
//filtermethod

// const scores=[10,30,40,20,25,50,35];

// const filteredArray = scores.filter((score)=>{
//     return score >=30;
// });
// console.log(filteredArray);
// console.log(scores);

// const users=[
// 	{name:"Jay",premium:true},
// 	{name:"Roy",premium:false},
// 	{name:"Lee",premium:true},
// 	{name:"Jan",premium:false},
// 	{name:"Tim",premium:true}
// ];

// const premiumUsers = users.filter(user => user.premium);
//     console.log(premiumUsers);

//map() method

// const prices=[100,300,400,200,250,500,350];

// // let discprices = [];

// // prices.forEach(price =>
// //     discprices.push(price/2));
// // console.log(discprices);

// const discprices = prices.map(price=>price*0.5);
// console.log(discprices);
// console.log(prices);

// const products=[
// 	{name:"Good night",price:350},
// 	{name:"Maggi",price:70},
// 	{name:"Rice",price:560},
// 	{name:"Biscuit",price:50},
// 	{name:"Shoe",price:900}
// ];

// const discproduct = products.map((product)=>{
//     if(product.price>=500){
//         return {name:product.name,price:product.price*(.7)};
//     }
//     else{
//         return product;
//     }
// });
// console.log(discproduct);
// console.log(products);

//sort

// const prices=[2,50,5,12,34,23,19,45,65,42];
// // prices.sort((a,b)=>{
// //     return a-b;
// // });
// prices.slice().sort();
// console.log(prices);

// const products = [
// 	{name:"Good night",price:350},
// 	{name:"Maggi",price:70},
// 	{name:"Rice",price:560},
// 	{name:"Biscuit",price:50},
// 	{name:"Shoe",price:900}
// ];
// products.sort((a,b)=>{
//     return a.price-b.price;
// });
// console.log(products);

// products.sort((a,b)=>{
//     if(a.name.toLowerCase()<b.name.toLowerCase()){
//         return -1;
//     }else if(a.name.toLowerCase()<b.name.toLowerCase())
//         return 1;
//     )else {
//         return 0;
//     }
// });
// console.log(products);

//reduce() function

// const scores=[2,50,5,12,34,23,19,45,65,42];

// const result = scores.reduce((accum,score)=>{
//     if(score>=30){
//         accum++;
//     }
//     return accum;
// },0);

// console.log(result);

//Day-5

//Date and Time
//1.Date Constructor

 //const now = new Date();
// console.log(typeof now);

// console.log("Full Year: "+now.getFullYear);

// console.log("Get Month"+now.getMonth());
// console.log("get Date: "+now.getDate());
// console.log("get Hours: "+now.getHours());
// console.log("get minutes: "+now.getMinutes());
// console.log("get Seconds: "+now.getSeconds());

// //Todays date: 06-04-2022
// console.log("Todays Date: "+now.getDate()+"-"+(now.getMonth()+1)+"-"+now.getFullYear());

// console.log(now.getTime());
// console.log(now);
// console.log(now.toDateString());
// console.log(now.toTimeString());
// console.log(now.toLocaleDateString());
// console.log(now.toISOString());

// const before = new Date("Feb 20 2022 7:30:50");
// // console.log(before);

// const Date1 = Math.ceil(now - before)/(1000*60*60*24);
// console.log(Date1);


const clockChange = ()=>{
    var hour = document.getElementById('hrs');
    var minutes = document.getElementById('mins');
    var second = document.getElementById('secs');

    var h = new Date().getHours();
    var m = new Date().getMinutes();
    var s = new Date().getUTCSeconds();

    hour.innerHTML = h;
    minutes.innerHTML = m;
    second.innerHTML = s;
}
setInterval(clockChange,1000);

// console.log(moment().format('MMMM Do YYYY, h:mm:ss a')); 

// console.log(moment("20111031", "YYYYMMDD").fromNow());
// const now = new Date();
// const before = new Date("April 01 2022 7:30:50");

// console.log(dateFns.isToday(now));
// console.log(dateFns.format(now,'dddd Do MMMM YYYY'));
// console.log(dateFns.distanceInWords(before,now,{addSufix:true}));

//Asynchronous javascript

// console.log(1);
// console.log(2);
// console.log(3);

// setTimeout(()=>{
//     console.log('callback Function is called');
// },4000);

// console.log(4);
// console.log(5);
// console.log(6);
// console.log(7);
// console.log(8);
// console.log(9);
// console.log(10);

// const btn1 = document.querySelector('#button1');
// const btn2 = document.querySelector('#button2');

// const wait = () => {
//     const now = new Date();
//     const stop = now.getTime() + 5000;
//     while (true) {
//         if (now.getTime() > stop) return;
//     }
// }

// button1.addEventListener('click', wait());

// button2.addEventListener('click', () => {
//     console.log("Button 2 clicked.");
// });

// const greet =()=>{
//     console.log("HI");
// };

// const showAlert=()=>{
//     alert("Danger");
// };

// setTimeout(showAlert,2000);
// greet();
// greet();
// greet();
// greet();
// greet();
// greet();
// greet();
// greet();
// greet();
// greet();

//Day-6

