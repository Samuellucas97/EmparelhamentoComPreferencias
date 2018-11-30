# Emparelhamento com prefêrencias
## Introdução
Neste repositório encontra-se a implementação em Java do algoritmo _Top Trade Cycles Chains_ (**TTC Chains**) voltado para o problema de troca de rins cruzadas referente ao 3º trabalho da disciplina de ***Grafos***.

### Organização do Repositório  
  
* `src`: Implementação das classes.   
* `data`: Arquivos contendo dados para caso de teste. 
* `bin`: Arquivos binários.


## Top Trading Cycles Chains 
  
### Descrição do Algoritmo

Agora estamos prontos para descrever o mecanismo do TTCC em sua forma geral. Considerando a preferências dos agentes, o mecanismo do TTCC encontra o resultado do problema de correspondência 
através do seguinte procedimento:
1. Em cada rodada do algoritmo TTCC:
	- (i) com base nas suas preferências declaradas, cada agente a que não tenha recebido um item aponta para o melhor item restante não atribuído em IP ∪ IA, 
	- (ii) cada agente remanescente que tenha recebido um item continua apontando para ela
atribuição e 
	- (iii) cada item restante não atribuído em pontos de IP para seu proprietário
  

2. Dado o apontamento no Passo 1, existe um ciclo ou uma cadeia; ou ambos. Nesta etapa (Etapa2), alocações associadas a ciclos são feitas: 
	- (i) Prosseguir para o Passo 3 se não houver ciclos. Caso contrário, localize um ciclo e atribua a cada agente no ciclo, o item para o qual ela aponta. A tarefa é final para esses Agentes Remova todos os agentes e itens no ciclo do sistema.
	- (ii) Se todo agente tiver recebido um item, vá para a Etapa 4. Caso contrário, volte para Passo 1.
   

 3. Cada par item-agente restante inicia uma cadeia. Como várias cadeias podem coexistir:
	- (i) Selecione apenas uma das cadeias com uma regra de seleção de cadeia predefinida. A atribuição é final para os agentes na cadeia selecionada. Além de selecionar uma cadeia, a cadeia regra de seleção também determina se a cadeia selecionada é removida imediatamente
ou permanece no procedimento.
	- (ii) Se todo agente tiver recebido um item, vá para a Etapa 4. Caso contrário, volte para a Etapa 1 para iniciar a próxima rodada de alocação.
4. Remova todas as correntes (se houver alguma). O algoritmo termina


### Caso de teste


**Entradas do algoritmo:**  
  

- Conjunto de doador-receptor
- Preferencias de cada doador-receptor que depende:
	⋅⋅⋅Tipos de sangue(**A+/-**, **B+/-**, **O+/-**, **AB+/-**)⋅⋅⋅ 
	⋅⋅⋅Grupos de HLA (A, B, DR)⋅⋅⋅

Sequência para definir as preferências:
1. Compara-se o grupo sangüíneo do doador com o do
receptor, que devem ser compatíveis;
3. Realiza-se a prova-cruzada (cross-match) para avaliar
se existem anticorpos no receptor dirigidos contra
os antígenos do doador, que possam causar rejeição
imediata;
4.Verifica-se a compatibilidade (HLA), semelhança entre
o receptor e o doador;

## Referência 

<img src="https://junit.org/junit5/.." data-canonical-src="https://cdn-images-1.medium.com/max/982/1*AiTBjfsoj3emarTpaeNgKQ.png" width="200" height="240" />

:link: <https://www.sciencedirect.com/science/article/pii/S0022053105001663>  
:link: <http://econcs.seas.harvard.edu/files/econcs/files/toulis-ec11.pdf>  
:link: <http://econcs.seas.harvard.edu/files/econcs/files/toulis_gamesecon15.pdf>  
:link: <https://www.tayfunsonmez.net/wp-content/uploads/2013/10/Kidneyexchange.pdf>

## Autores :smiley:
Candinho Luiz Dalla Brida Junior (<candinholuiz@gmail.com>)  
Samuel Lucas de Moura Ferino (<samuel1797@gmail.com>)  



