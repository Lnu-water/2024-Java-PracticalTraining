/*
    JSON
    使用 JavaScript 的一个子集，也是 JavaScript 的一个对象
    对象：封装数据
 */

// 1. 创建一个 json 对象(标准的 JavaScript 对象)
var goods = {};
console.log("1. 创建一个 json 对象(标准的 JavaScript 对象)")
console.log(goods);
console.log(typeof goods);
console.log("\n--------------------------------");

// 1.1 JavaScript 设置语法，可以直接为一个对象设置任何数据(属性)
console.log("1.1 JavaScript 设置语法，可以直接为一个对象设置任何数据(属性)")
goods.name = "巧克力";
goods.code = 10234353123;
goods.price = 3.5;
goods.desc = "德芙，纵享丝滑";
console.log(goods);
console.log("\n--------------------------------");

// 1.2 获取对象的数据
console.log("1.2 获取对象的数据")
var goodsName = goods.name;
console.log(goodsName);
console.log("\n--------------------------------");

// 2. 创建一个有数据的 json 对象
console.log("2. 创建一个有数据的 json 对象")
var stu1 = {"name": "张三", "age": 20, "gender": "男", "hobbies": ["篮球", "足球", "游泳"]}
console.log(stu1);
console.log("\n--------------------------------");

// 2.1 获取对象的属性数据
console.log("2.1 获取对象的属性数据")
var hobbys = stu1.hobbies;
console.log(hobbys);
for (var index in hobbys) {
    console.log(index, hobbys[index]);
}
console.log("\n--------------------------------");

// 3. 创建一个数组，数组中的元素是 json 对象
console.log("3. 创建一个数组，数组中的元素是 json 对象");
var stu_a = {"name": "李四", "age": 21, "gender": "男", "hobbies": ["篮球", "足球", "游泳"], "id": "202108384100"}
var stu_b = {"name": "王五", "age": 22, "gender": "男", "hobbies": ["篮球", "足球", "游泳"], "id": "202108384101"};

var students = [stu_a, stu_b];
console.log(students);
console.log("\n--------------------------------");