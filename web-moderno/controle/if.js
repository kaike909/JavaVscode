const pontinhos = a => console.log(`${'-'.repeat(10)} ${a} ${'-'.repeat(10)}`)
pontinhos('If 1!')

function soBoaNoticia(nota){
    if(nota >= 7){
        console.log('Aprovado com ' + nota)
    }
}

function seForVerdade(valor){
    if(valor){
        console.log('É verdade...' + valor)
    }
}

soBoaNoticia(8.1)
soBoaNoticia(6.1)

seForVerdade()
seForVerdade(null)
seForVerdade(undefined)
seForVerdade(NaN)
seForVerdade('')
seForVerdade(0)
seForVerdade(-1)
seForVerdade(' ')
seForVerdade('?')
seForVerdade([])
seForVerdade([1, 2])
seForVerdade({})

pontinhos('If 2!')

function teste1(num){
    if(num > 7)
        console.log(num)
    console.log('Final')
}

teste1(6)
teste1(8)

function teste2(num){
    if(num > 7); {
        console.log(num)
    }
}

teste2(6)
teste2(8)