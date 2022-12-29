let nome = "Paloma"
let concatenacao = `Ola${nome}!`
console.log(concatenacao)
console.log(`1 + 1 = ${1 + 1}`)

function calc(a, b, algo){
    switch (algo) {
        case "+":
            return a + b;
            break;
        case "-":
            return a - b;
            break;
        case "*":
            return a * b;
            break;
        case "/":
            return a / b;
            break;
    }
}

console.log(calc(1, 2, '/'))

let nome1 = 'Carlos'
let nome2 = 'Carlos'

console.log(nome1 == nome2)