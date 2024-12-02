Nova Sistemas - MVC
## Arquitetura MVC do Projeto

A estrutura do projeto segue o padrão MVC (Model-View-Controller). Abaixo está a estrutura de diretórios e arquivos do projeto:

```
/src/main/java/br/com/sistema_nova/mvc
├── MvcApplication.java
├── controller
│   └── PedidoController.java
└── model
    ├── Cliente.java
    ├── Estoque.java
    ├── Pedido.java
    ├── Produto.java
    ├── repository
    │   ├── ClienteRepository.java
    │   ├── EstoqueRepository.java
    │   ├── PedidoRepository.java
    │   └── ProdutoRepository.java
    └── service
        ├── ClienteService.java
        ├── EstoqueService.java
        ├── PedidoService.java
        └── ProdutoService.java
```

## Instruções Básicas para Rodar o Projeto Spring

1. Certifique-se de ter o JDK instalado (versão 17 ou superior).
2. Instale o Maven.
3. Navegue até o diretório raiz do projeto.
4. Execute o comando `mvn clean install` para construir o projeto.
5. Execute o comando `mvn spring-boot:run` para iniciar a aplicação.
6. Acesse a aplicação em `http://localhost:8080`.
