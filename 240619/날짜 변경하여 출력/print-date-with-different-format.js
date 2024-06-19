const fs = require("fs");
let input = fs.readFileSync(0).toString().split(".");
let mm = input[1];
let dd = input[2];
let yy = input[0];

console.log(`${mm}-${dd}-${yy}`);