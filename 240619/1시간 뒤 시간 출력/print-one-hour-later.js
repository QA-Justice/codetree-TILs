const fs = require("fs");
let input = fs.readFileSync(0).toString().trim();
let ab = input.split(":");
let c = Number(ab[0]);
let d = ab[1];
console.log(`${c+1}:${d}`);