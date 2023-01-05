const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('Usando Var em Loop 1!')

for (var i = 0; i < 10; i++){
    console.log(i)
}

console.log('i =', i)

for (i = 10;i > 0;i--){
    console.log(i)
}

console.log('i =', i)

pontinhos('Usando Var em Loop 2!')

const funcs = []

for (var i = 0; i < 10; i++){
    funcs.push(function(){
        console.log(i)
    })
}

funcs[2]()
funcs[8]()