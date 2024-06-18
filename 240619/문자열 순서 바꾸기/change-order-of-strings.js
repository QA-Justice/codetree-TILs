const fs = require("fs");
let input = fs.readFileSync(0).toString().split("\n");
let a = input[1];
let b = input[0];

console.log(`${a}\n${b}`);