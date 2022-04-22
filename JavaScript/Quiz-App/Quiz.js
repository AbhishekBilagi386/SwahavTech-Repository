let currentQuestion = 0;
let currentScore = 0;
let resultContainer = document.querySelector('#result-container');
const questionContainer = document.querySelector('#question-container');
const choiceContainer = document.querySelector('#choice-container');
const answerContainer = document.querySelector('#answer-container');

function startQuiz() {
    document.getElementById('btn').style.visibility = "hidden";
    document.getElementById('rules').style.visibility = "hidden";
    countdown(3);
    return displayQuestion();
}

var questions = [
    {
        question: "1. If there are 6 apples and you take away 4, how many do you have?",
        choices: ["A. 4",
            "B. 2",
            "C. 6",
            "D. None of the above"],
        answer: "A. 4"
    },
    {
        question: "2. How Many Bones Does An Adult Human Have?",
        choices: ["A. 310",
            "B. 257",
            "C. 167",
            "D. 206"],
        answer: "D. 206"
    },
    {
        question: "3. Which Country Does The Sport Football Come From?",
        choices: ["A. Italy",
            "B. France",
            "C. England",
            "D. Portugal"],
        answer: "C. England"
    },
    {
        question: "4. How Many Sides Do Three Triangles And Three Rectangles Have In Total?",
        choices: ["A. 20",
            "B. 21",
            "C. 22",
            "D. 23"],
        answer: "B. 21"
    }

];

function displayQuestion() {
    if (currentQuestion === questions.length) {
        endQuiz();
    } else {
        questionContainer.innerHTML = '';
        choiceContainer.innerHTML = '';
        document.body.style.background = 'transparent';
        let h5Question = document.createElement('h5');
        h5Question.className = 'list-group-item list-group-item-action list-group-item-warning .disabled';
        h5Question.innerHTML = questions[currentQuestion].question;
        questionContainer.appendChild(h5Question);

        for (let i = 0; i < questions[currentQuestion].choices.length; i++) {
            var btnChoices = document.createElement('button');
            btnChoices.innerHTML = '';
            btnChoices.className = 'list-group-item list-group-item-action';
            btnChoices.innerHTML = questions[currentQuestion].choices[i];
            choiceContainer.appendChild(btnChoices);
            btnChoices.onclick = checkAnswer;
        }
    }
}

function checkAnswer() {
    if (this.textContent !== questions[currentQuestion].answer) {
        this.style.backgroundColor = '#DF5E6B';
        setTimeout(nextQuestion, 500);
    } else {
        currentScore = currentScore + 1;
        this.style.backgroundColor = '#499F68';
        setTimeout(nextQuestion, 500);
    }
}

function nextQuestion() {
    ++currentQuestion;
    displayQuestion();
}

function endQuiz() {
    clearInterval(timeinterval);
    questionContainer.innerHTML = '';
    choiceContainer.innerHTML = '';
    document.body.style.background = 'transparent';
    let retakeBtn = document.createElement('button');
    let saveBtn = document.createElement('button');
    let inputName = document.createElement('input');
    let displayResult = document.createElement('div');

    inputName.setAttribute("placeholder", " Please enter your name here...");

    inputName.className = 'm-3 lg pt-2 pb-2';
    saveBtn.className = 'btn btn-outline-dark mr-3 ml-3 mb-3';
    saveBtn.innerHTML = 'Save Result';
    retakeBtn.className = 'btn btn-outline-dark mr-3 ml-3 mb-3';
    retakeBtn.id = "retakeButton";
    retakeBtn.innerHTML = 'Retake Quiz';
    displayResult.className = 'card-body text-center';
    
    displayResult.innerHTML = `You got ${currentScore} out of ${questions.length} questions correct!`;
    if (currentScore == questions.length) {
        resultContainer.appendChild(displayResult);
        resultContainer.appendChild(inputName);
        resultContainer.appendChild(saveBtn);
        resultContainer.appendChild(retakeBtn);
    } else {
        resultContainer.appendChild(displayResult);
        resultContainer.appendChild(inputName);
        resultContainer.appendChild(saveBtn);
        resultContainer.appendChild(retakeBtn);
    }

    saveBtn.addEventListener("click", function () {
        localStorage.setItem(inputName.value, currentScore);
        confirm("Your result has been saved. Thank you for taking my quiz!")
    });


}

document.addEventListener('click', function (e) {
    if (e.target && e.target.id == 'retakeButton') {
        reloadApp();
    }
});

function reloadApp() {
    window.location.reload();
}

var timeinterval;
function countdown(minutes) {
    var seconds = 60;
    var mins = minutes;
    function tick() {
        var counter = document.getElementById("time-container");
        var current_minutes = mins - 1;
        seconds--;
        counter.innerHTML = `<span>${current_minutes.toString() + ":" + (seconds < 10 ? "0" : "") + String(seconds)}</span>`;
        counter.className = 'btn btn-dark';
        if (seconds > 0) {
            timeinterval = setTimeout(tick, 1000);
        } else {
            if (mins > 1) {
                countdown(mins - 1);
            }
        }
    }
    tick();
}