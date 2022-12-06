#language:pt

Funcionalidade: Cadastro
Cenário:        Cadastrar Novo Usuario
    Quando      Acessar :"http://www.AppTeste.com"
    Dado        Tela Carregada
    E           Verifica Descrição :"Texto exibido na Descrição"
    E           Preenche :"Nome","Email","Senha" 
    E           Verifica Mensagem de Confirmação:"Texto a ser validado"
    

