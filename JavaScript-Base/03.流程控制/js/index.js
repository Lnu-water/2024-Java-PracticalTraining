/*
    流程控制
    1. 顺序流程
    2. 分支
    3. 循环

 */

// 分支
console.log("1. 分支")
let score = 80;
if (score < 60) {
    console.log("不及格");
} else if (score <= 70) {
    console.log("及格");
} else if (score <= 80) {
    console.log("良好");
} else {
    console.log("优秀");
}
console.log("\n--------------------------------")

// while 循环
console.log("2. while 循环")
let i = 1;
while (i <= 5) {
    console.log("while " + i);
    i++;
}
console.log("\n--------------------------------")

// do while 循环
console.log("3. do while 循环")
let j = 1;
do {
    console.log("do while " + j);
    j++;
} while (j <= 5)
console.log("\n--------------------------------")

// for 循环
console.log("4. for 循环")
for (let k = 1; k <= 5; k++) {
    console.log("for loop " + k);
}
console.log("\n--------------------------------")
