algoritmo "semnome"
var

 salario, novoSalario, aumento, porcentagem : real
 
inicio

   escreva("Digite o salário do funcionário: R$")
   leia(salario)

   se salario <= 1000.00 entao
     novoSalario <- salario + (20*salario)/100
     porcentagem <- 20
   senao
      se salario <= 3000.00 entao
         novoSalario <- salario + (15*salario)/100
         porcentagem <- 15
      senao
         se salario <= 8000.00 entao
            novoSalario <- salario + (10*salario)/100
            porcentagem <- 10
         senao
            se salario > 8000.00 entao
               novoSalario <- salario + (5*salario)/100
               porcentagem <- 5
            fimse
         fimse
      fimse
   fimse
   
   escreval("Novo salário: R$", novoSalario:4:2)
   escreval("Aumento de: R$", porcentagem*salario / 100:4:2)
   escreva("Porcentagem de aumento foi:", porcentagem, "%")

fimalgoritmo
