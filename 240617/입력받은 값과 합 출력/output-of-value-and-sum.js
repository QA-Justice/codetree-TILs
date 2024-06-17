const fs = require("fs");
let a = fs.readFileSync(0).toString();
let arr = a.split(" ");

let n = Number(arr[0]);
let m = Number(arr[1]);
let sum = n+m;

console.log(`${n} ${m} ${sum}`);