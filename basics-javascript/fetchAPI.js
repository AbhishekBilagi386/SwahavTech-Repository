fetch("http://gsmktg.azurewebsites.net:80/api/v1/techlabs/test/students").then((response)=>{
    //console.log("Request resolved",response.json());
    console.log("Request resolved",response);
    return response.json();
}).then((data)=>{
    console.log(data);
}).catch((err)=>{
    console.log("Request rejected",err);
});