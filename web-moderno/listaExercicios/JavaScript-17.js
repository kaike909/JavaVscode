function plano(x, sal = 3500){
    switch (x) {
        case 'a':
            return `Novo Salario com o plano A R$${(sal * (1 + 0.1)).toFixed(2)}`
            break
        case 'b':
            return `Novo Salario com o plano B R$${(sal * (1 + 0.15)).toFixed(2)}`
            break
        case 'c':
            return `Novo Salario com o plano C R$${(sal * (1 + 0.2)).toFixed(2)}`
            break
        default:
            return 'Plano Invalido'
            break
    }
}

console.log(plano('a'))
console.log(plano('b'))
console.log(plano('c'))