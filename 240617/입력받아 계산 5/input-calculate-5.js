const fs = require("fs");
let a = (fs.readFileSync(0).toString());
let b = a.split(" ");
let c = Number(b[0]);
let d = Number(b[1]);
console.log(c+d);