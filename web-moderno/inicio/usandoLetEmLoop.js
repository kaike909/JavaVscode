const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('Usando Let em Loop 1!')

for (let i = 0; i < 10; i++){
    console.log(i)
}

// console.log('i =', i)

pontinhos('Usando Let em Loop 2!')

const funcs = []

for (let i = 0; i < 10; i++){
    funcs.push(function(){
        console.log(i)
    })
}

funcs[2]()
funcs[8]()

for (let i = 0; i < funcs.length; i++) {
    console.log(funcs[i]())
}