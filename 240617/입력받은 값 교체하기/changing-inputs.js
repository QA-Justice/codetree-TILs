const fs = require("fs");
let a = (fs.readFileSync(0).toString());
    b = a.split(" ");
let c = Number(b[0]);
let d = Number(b[1]);

console.log (`${d} ${c}`);