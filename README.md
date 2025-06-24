# Interface Grafica - IDE Eclipse - WindowBuilder

Este projeto está relacionado a um trabalho de avaliação da FACULDADE sobre Interfaces Gráficas. Para o desenvolvimento desse trabalho foi necessário, exclusivamente, o uso do WindowBuilder e a IDE Eclipse. 
Nele também está tratando de todo conteudo estudado em classe, como metodos, classes, tratamento de exceção, uso de String etc

## QUESTÃO A: 
Faça seguinte interface gráfica: 
![image](https://github.com/user-attachments/assets/7e38ea55-04ff-43fc-9a5f-dfafea9908e5)
Adicione conteúdo ao actionPerformed de cada botão, onde:  
- Botão Perfeito verifica se um número de entrada é perfeito. Na matemática um número perfeito é um número natural para o qual a soma de todos os seus divisores naturais próprios (excluindo ele mesmo) é igual ao próprio 
número. Por exemplo: o número 28 é perfeito pois 28 = 1+2+4+7+14 
![image](https://github.com/user-attachments/assets/b84fb138-01db-4a4f-ae7c-7c671becbd2d)
- Botão DSU exibe um número de acordo a seguinte especificação: o número de leitura deve estar no intervalo de 10 à 99. Em seguida será necessário calcular e imprimir um resultado sendo um único número inteiro tendo a 
seguinte estrutura DSU, onde D é o dígito da dezena do número original, U é o dígito da unidade do número original e S é a soma dos dígitos da dezena e unidade. Veja os exemplos: 
Para o valor 12 deverá imprimir 132 
Para o valor 55 deverá imprimir 5105 
Para o valor 99 deverá imprimir 9189 
Obs: assim, para um valor de entrada válido seu programa deve exibir as mensagens abaixo.
![image](https://github.com/user-attachments/assets/9477d242-a7d1-40ae-bde8-f24cd82b5dc5)

## Questão B:
Elaborar um enunciado/situação em que será necessário o uso de no mínimo 2 interfaces gráficas, sendo que a primeira interface gráfica deve ser uma tela de Login (com o login definido por admin 
e senha definido por 123456). Na(s) interface(s) seguinte(s) “resolva” o enunciado/situação criado. Utilize botões com métodos implementados.  
#### Enunciado: 
Sua faculdade  deseja informatizar o controle de cadastro de livros na sua biblioteca. O sistema será dividido em duas interfaces gráficas:

Tela 1 – Login: Somente o administrador pode entrar no sistema (com o login definido por admin e senha definido por 123456). Se o login for correto, o usuário acessa o sistema de biblioteca. Caso contrário, uma mensagem de erro deve ser exibida. 

Tela 2 – Sistema de Biblioteca: Nesta tela o administrador pode cadastrar livros, informando o Título do Livro e o Autor do Livro. Ao clicar no botão "Adicionar Livro", o sistema salva os dados e atualiza uma área de texto que exibe a lista completa de livros cadastrados. 

Obs: Devem ser exibidos livros de exemplo previamente cadastrados. 

## Questão C
Elaborar uma interface gráfica que faça uso de outros componentes que não sejam apenas JLabel, JTextField e JButton. Elabore um enunciado/situação que faça uso de sua(s) interface(s) gráfica(s).
#### Enunciado: 
A coordenação da sua faculdade está organizando um sistema para realizar o cadastro dos alunos nos cursos e turnos disponíveis. 

O sistema deve conter uma interface gráfica com a opção de seleção do curso desejado (ex: Análise e Desenvolvimento de Sistemas, Logística, etc) e a opção de escolha do turno (Manhã, Tarde ou Noite). De ter uma área exibindo todos os cadastros já realizados. 

Botões Funcionais: 

  - Cadastrar:  Salva o curso e turno escolhidos e exibe o resultado na área de texto. 

  - Limpar: Limpa todos os cadastros já realizados. 

O sistema deve exibir mensagens de confirmação após o cadastro, e alertas caso o usuário tente cadastrar sem selecionar o turno. 
