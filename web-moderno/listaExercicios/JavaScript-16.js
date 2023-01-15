function calc(x, o, y) {
    if (o == '/' && y == 0) {
        return `Nao divisivel por ${y}`
    } else {
        switch (o) {
            case '+':
                return `${x} + ${y} = ${x + y}`
                break
            case '-':
                return `${x} - ${y} = ${x - y}`
                break
            case '*':
                return `${x} x ${y} = ${x * y}`
                break
            case '/':
                return `${x} / ${y} = ${(x / y).toFixed(2)}`
                break
        }
    }
}

console.log(calc(2, '+', 4))
console.log(calc(6, '-', 4))
console.log(calc(8, '*', 4))
console.log(calc(2, '/', 3))