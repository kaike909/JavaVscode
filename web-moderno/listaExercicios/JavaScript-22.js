function boleto(mes, valor){
    if(mes > 0 && mes < 13){
        let atraso = mes - 1
        console.log(`Valor a ser pago: R$${(valor * ((1 + (5/100)) ** atraso)).toFixed(2).replace('.', ',')}`)
    } else {
        console.log('Mes invalido')
    }
}

boleto(4, 100)