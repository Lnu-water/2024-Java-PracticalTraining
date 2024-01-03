/*
    函数（方法）：封装了特殊功能的代码段，可以重复利用
    js 中函数，相当于 C 语言函数，相当于 java 语言方法

    语法

    function 函数名称([参数1...参数n]){
        // 程序逻辑代码
        [return 返回值]
    }

    注意：
        1. 函数的形参是不能添加 var，直接写参数名称
        2. 函数有返回值直接 return 数据即可，没有返回类型，使用直接接收返回结果即可
 */

// 1. 无参数无返回值
function fun1() {
    console.log("这是一个无参数无返回值的函数");
    console.log("\n--------------------------------")
}

fun1()

// 2. 有参数无返回值
function fun2(name, age) {
    console.log("这是一个有参数无返回值的函数");
    console.log("姓名：" + name + "，年龄：" + age);
    console.log("\n--------------------------------")
}

fun2("张三", 20)

// 3. 有参数有返回值
// 需求：求三个数最大值
function fun3(num1, num2, num3) {
    console.log("这是一个有参数有返回值的函数");
    console.log("最大值是：")
    return Math.max(num1, num2, num3);
}

console.log(fun3(10, 20, 30));
