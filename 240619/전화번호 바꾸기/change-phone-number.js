const fs = require("fs");
input = fs.readFileSync(0).toString().split("-");

let a = input[0];
let b = input[1];
let c = input[2];

console.log(`${a}-${c}-${b}`);