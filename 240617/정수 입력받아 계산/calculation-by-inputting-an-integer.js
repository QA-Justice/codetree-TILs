const fs = require("fs");
let input = Number(fs.readFileSync(0).toString());
let result = (input*2)+3;

console.log(result);