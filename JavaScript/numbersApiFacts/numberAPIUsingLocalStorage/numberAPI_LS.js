document.querySelector('#btn').onclick = () => {
    if (document.querySelector('#container2 input').value.length == 0) {
        alert("Please Enter a Number")
    }

    else {
        var addData = " ";
        var numberfact = document.querySelector('#container2 input').value;

        const request = new XMLHttpRequest();
        request.onload = () => {

            // Process our returned data
            if (request.status >= 200 && request.status < 300) {
                console.log(request.responseText);

                document.querySelector('#results').innerHTML += `
                <center>
                    <div class="factresult">
                        <span id="factresult">
                        ${request.responseText}
                        </span>
                        <button class="delete">
                            <i class="fa-fa-solid fa fa-trash"></i> 
                        </button>
                </center>        
                    </div>`;
                    const now = new Date;
                    addData = dateFns.format(now, 'MMMM D YYYY HH:mm:ss');
                var current_tasks = document.querySelectorAll(".delete");
                for (var i = 0; i < current_tasks.length; i++) {
                    current_tasks[i].onclick = function () {
                        this.parentNode.remove();
                    }
                }

            } else {
                alert("Could not fetch the data")
            }

        };
        request.open("GET", `http://numbersapi.com/${numberfact}`);
        request.send();
    }
}

