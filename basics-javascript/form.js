const form = document.querySelector('form');

const validateEmail = () => {
    const email = document.getElementById('email').value;
    var emailRe = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (emailRe.test(email)) {

    } else {
        alert("Invalid Email");
    }
    
const validateUsername = () => {
    const userName = document.getElementById('userName').value;
    var usernameRe = /^[a-zA-Z0-9]+$/;
    if (usernameRe.test(userName)) {
        // return true;
    } else {
        alert("Invalid USername");
    };
}

const validatePassword = () => {
    const password = document.getElementByIdAll('psw').value;
    var passwordRe = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
    if (passwordRe.test(password)) {

    } else {
        alert("Invalid Password.");
    };

}

form.addEventListener('submit', () => {
    validateEmail();
    validateUsername();
    validatePassword();
})
