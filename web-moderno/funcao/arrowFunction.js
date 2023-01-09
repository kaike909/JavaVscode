const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('Arrow Function 1!')

let dobro = function (a){
    return 2 * a
}

console.log(dobro(2))

dobro = (a) => {
    return 2 * a
}

dobro = a => 2 * a

pontinhos('Arrow Function 2!')

function Pessoa() {
    this.idade = 0

    setInterval(() => {
        this.idade++
        console.log(this.idade)
    }, 1000)
}

// new Pessoa

pontinhos('Arrow Function 3!')

let comparaComThis = function(param) {
    console.log(this === param)
}

comparaComThis(global)

const obj = {}
comparaComThis = comparaComThis.bind(obj)
comparaComThis(global)
comparaComThis(obj)

let comparaComThisArrow = param => console.log(this === param)

comparaComThisArrow(global)
comparaComThisArrow(module.exports)

comparaComThisArrow = comparaComThisArrow.bind(obj)
comparaComThisArrow(global)
