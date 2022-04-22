let DataService = (()=>{
    let obj ={};

    obj.doTask1 = function(){
        console.log("Doing task one");
    }
    obj.doTask2 = function(){
        console.log("Doing task two");
    }
    return obj;

})();//immediately invoked funciton expression(IVFE)
DataService.doTask1();
DataService.doTask2();

// const data = DataService();
// data.doTask1();
// data.doTask2();
// // console.log(data);