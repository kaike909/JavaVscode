const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)

pontinhos('Usando Var 1!')

{ 
    { 
        { 
            { 
                var sera = 'Sera???'
            }
        }
    }
}

console.log(sera)

function teste() {
    var a = 123
    console.log(a)
}

teste()
// console.log(a)

pontinhos('Usando Var 2!')

var numero = 1
{
    var numero = 2
    console.log('dentro =', numero)
}
console.log('fora =', numero)