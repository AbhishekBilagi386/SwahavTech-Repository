//wrap the variables and functions in one scope

function makeCustomer(){
    let customer = {};
    let _id, _name;
    customer.setId = function(id){
    _id = id;
    }
    customer.setName = function(name){
        _name = name;
    }
    customer.getdetails = function(){
        return `Customer_Name: "${_name}" and Custoemr_id is: ${_id}`;
    }
    return customer;
}
let customer = makeCustomer();
customer.setId(101);
customer.setName("Abhishek");
console.log(customer.getdetails());
