function media(...x) {
    let tt = 0
    for(let i = 0; i < x.length; i++) {
        tt += x[i]
    }
    let media = tt / x.length
    console.log(`A media do aluno é de ${media.toFixed(2)}\nO Aluno esta ${media > 7 ? "Aprovado" : "Reprovado"}`)
}

media(6.4, 7.5, 8.9, 2.5, 0)