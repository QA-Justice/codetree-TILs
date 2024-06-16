const fs = require("fs");
let a = fs.readFileSync(0).toString();
let arr = a.split(" ");
let n = Number(arr[0]);
let m = Number(arr[1]);

console.log(n * m);

/*const fs = require("fs");
let a = fs.readFileSync(0).toString();
let arr = a.split(" ");
let n = Number(arr[0]);
let m = Number(arr[1]);

console.log(n)
console.log(m)
console.log(n * m)*/