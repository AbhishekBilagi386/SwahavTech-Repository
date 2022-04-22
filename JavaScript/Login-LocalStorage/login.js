function saveData() {
    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let psw = document.getElementById("psw").value;
    
    let user_records = new Array();
    user_records = JSON.parse(localStorage.getItem("users")) ? JSON.parse(localStorage.getItem("users")) : []
    if (user_records.some((v) => { return v.email == email })) {
        alert("duplicate data");
    }
    else {
        user_records.push({
            "name": name,
            "email": email,
            "psw": psw
        })
        localStorage.setItem("users", JSON.stringify(user_records));
        confirm("Registration Complete");
    }
}

function check(){
    let storedName = localStorage.getItem("name");
    let storedEmail = localStorage.getItem("email");
    let storedPw = localStorage.getItem("psw");
    
    var userName = document.getElementById('Username');
    var userEmail = document.getElementById('Useremail');
    var userPw = document.getElementById('Userpsw');

    if(userName.value == storedName && userEmail.value == storedEmail && userPw.value == storedPw){
        alert('You are logged in.');
    }else{
        alert('Error on login');
    }
}

