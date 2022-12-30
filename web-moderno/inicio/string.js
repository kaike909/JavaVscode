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

const up = s => s.toUpperCase();

console.log(up("cuidado"))

let isAtivo = 1;

console.log(!isAtivo)

console.log(`O valor de !!3 é ${!!3}`)
console.log(`O valor de !!' ' é ${!!' '}`)
console.log(`O valor de !!'texto' é ${!!'texto'}`)
console.log(`O valor de !![] é ${!![]}`)
console.log(`O valor de !!{} é ${!!{}}`)
console.log(`O valor de !!infinity é ${!!Infinity}`)
console.log(`O valor de !!isAtivo = true é ${!!(isAtivo = true)}`)

console.log(`O valor de !!0 é ${!!0}`)
console.log(`O valor de !!'' é ${!!''}`)
console.log(`O valor de !!null é ${!!null}`)
console.log(`O valor de !!NaN é ${!!NaN}`)
console.log(`O valor de !!undefined é ${!!undefined}`)
console.log(`O valor de !!isAtivo = true é ${!!(isAtivo = false)}`)

console.log('' || null || undefined || 'opa' || 123)