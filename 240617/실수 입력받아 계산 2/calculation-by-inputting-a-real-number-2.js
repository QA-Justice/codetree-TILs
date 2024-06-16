const fs = require("fs");
let input = Number(fs.readFileSync(0).toString()) + 1.5;
console.log(`${input.toFixed(2)}`);