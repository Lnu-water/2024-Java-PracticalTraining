var age = 20;
// 重新赋值不同数据类型
// age = '小明'

var height = 1.75;

// js 中没有字符类型，字符串类型不区分单双引号

var name = "张三";
var gender = '男';
var isVip = true;

// 控制台输出数据
console.log(age, height, name, gender, isVip);
// console.warn(name, height, name, gender, isVip);
// console.error(name, height, name, gender, isVip);

// 输出数据类型 type 变量
console.log(typeof age, typeof height, typeof name, typeof gender, typeof isVip);

/*
 * js 中数据的比较
 * == : 值比较
 * === : 值和数据类型都相同才为真
 */
var num1 = 10;
var num2 = "10";

console.log(num1 == num2);
console.log(num1 === num2);
