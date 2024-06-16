const fs = require("fs");
let input = Number(fs.readFileSync(0).toString())*30.48;
console.log(`${input.toFixed(1)}`);