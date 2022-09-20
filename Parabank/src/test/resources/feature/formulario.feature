#language:pt
#Author: your.email@your.domain.com

@formulario @smoke
Funcionalidade: Validando o formulario Forgot e Register
   Como usuario 
   Quero poder clicar na opcao Forgot e Register
   Para acessar o formulario 

Contexto: Acessar o site
   Dado que eu esteja no site "https://parabank.parasoft.com/parabank/index.htm"

@positivo @formularioRegister
    Cenario: Validando o formulario register
    Quando clicar na opcao Register
    E preencher todos os dados cadastrais
    Entao valido se o formulario foi cadastrado
    
    @positivo @formularioForgot @BUG
   Cenario: Validando formulario de esqueci o login
   Quando clicar na opcao esqueci login
   E preencher todas o meus dados cadastrais
   Entao valido mensagem de conclusao
   
   @positivo @login
 Cenario: Validando o Customer Login
    Quando clicar na opcao Username e Password
    E preencher com o meus dados cadastrais
    Entao valido se o login foi efetuado