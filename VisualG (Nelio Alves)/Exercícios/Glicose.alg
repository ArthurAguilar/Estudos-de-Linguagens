algoritmo "Glicose"
var
medida : real
classificacao : caractere
inicio
   escreval("Digite a medida da glicose do paciente:")
   leia(medida)
   
   se medida <= 100 entao
      classificacao <- "Normal"
   senao
        se medida <= 140 entao
           classificacao <- "Elevado"
        senao
             se medida > 140 entao
                classificacao <- "Diabetes"
             fimse
        fimse
   fimse

   
   escreval("A classifica��o do paciente �: ", classificacao)


fimalgoritmo
