let a = 7;
let b = 94;
let t = a;
a = b;
b = t;

console.log(a,b);

function isEven(number) {
    return number % 2 === 0;
}

console.log(isEven(2));

for (let i = 10; i > 0; i--) {
    console.log(i);
}