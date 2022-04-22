let counter = (()=>{
    let privateCounter = 0;
    function changeBy(value){
        privateCounter += value;
    }
    return {
        increment: function(){
            changeBy(1);
        },
        decrement: function(){
            changeBy(-1);
        },
        value: function(){
            return privateCounter;
        }
    }
})();

console.log(counter.value());

counter.increment();
counter.increment();
counter.increment();
counter.increment();
console.log(counter.value());

counter.decrement();
counter.decrement();
counter.decrement();
console.log(counter.value());
