const fs = require("fs");
let input = fs.readFileSync(0).toString().split(" ");
let a = Number(input[0]);
let b = Number(input[1]);

console.log(
    `${a} * ${b} = ${a * b}\n` +  // 문자열 끝에 백틱을 올바르게 위치
    `${a} / ${b} = ${a / b}`      // 여기에서도 마찬가지
);