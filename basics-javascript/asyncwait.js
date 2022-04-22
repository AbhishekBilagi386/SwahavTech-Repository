//async and wait

const demofunc = async () => {
    const response = await fetch("abhishek.json");
    const data = await response.json();
    return data;
};
demofunc().then((data) => {
    console.log(data);
}).catch((err) => {
    console.log("Rejected: ", err.message);
});
