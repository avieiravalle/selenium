#Author: Samuca_rds@yahoo.com.br


Feature:  Validar Produtos carreforu


  @tag1
  Scenario: Teste Carrefour
  Given que o usuario acesse o "https://www.carrefour.com.br"
  When preencher o campo de busca com o Produto "Pneu"
  Then valido retorno do produto

 