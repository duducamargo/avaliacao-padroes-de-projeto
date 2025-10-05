# 🧩 Design Patterns – Avaliação Prática

Este repositório contém a implementação completa das **5 questões da avaliação prática de Padrões de Projeto (Design Patterns)**.  
Cada questão aplica **um ou mais padrões clássicos de projeto**, com foco na clareza, extensibilidade e reutilização de código.

---

## 🧠 Objetivo Geral

Demonstrar o uso correto dos principais **Design Patterns de criação e estrutura**, utilizando **Java puro**, sem frameworks externos, com foco em código limpo, comentado e de fácil manutenção.

---

## ⚙️ Estrutura do Projeto

```
design-patterns-avaliacao/
├── README.md
└── src/
    └── main/
        └── java/
            └── br/com/avaliacao/
                ├── questao1/   → Factory Method + Singleton
                ├── questao2/   → Abstract Factory + Singleton
                ├── questao3/   → Observer + Singleton
                ├── questao4/   → Decorator + Factory Method
                └── questao5/   → Prototype + Singleton
```

Cada pasta (`questaoX`) contém:
- `AppQuestaoX.java` → Classe principal executável com `main()`
- Pacotes organizados (`servico`, `transporte`, `pagamentos`, `noticias`, `relatorios`, `documentos`, etc.)

---

## 🧩 Questão 1 — Sistema de Cálculo de Tarifas

**Padrões aplicados:**

- 🏭 Factory Method
- 🔁 Singleton

**Justificativa:**  
O padrão *Factory Method* foi escolhido porque permite criar diferentes tipos de transporte sem utilizar condicionais no código principal, facilitando a manutenção e a extensão futura (ex: inclusão de transporte ferroviário).  
O *Singleton* foi utilizado para centralizar o cálculo de tarifas em uma única instância global (`CalculadoraTarifas`), garantindo consistência e evitando múltiplos pontos de cálculo espalhados no sistema.

**Classe principal:**  
`br.com.avaliacao.questao1.AppQuestao1`

---


## 💳 Questão 2 — Plataforma de Pagamentos

**Padrões aplicados:**

- 🏗️ Abstract Factory
- 🔁 Singleton

**Justificativa:**  
O padrão *Abstract Factory* foi escolhido porque permite a criação de famílias de objetos relacionados (processador, validador e recibo) de maneira coesa e independente do meio de pagamento.  
O *Singleton* foi implementado no `PaymentGateway` para garantir um único ponto central de processamento e controle de transações, evitando inconsistências e duplicações de lógica.

**Classe principal:**  
`br.com.avaliacao.questao2.AppQuestao2`

---


## 📰 Questão 3 — Sistema de Assinaturas de Notícias

**Padrões aplicados:**

- 👀 Observer
- 🔁 Singleton

**Justificativa:**  
O *Observer* foi aplicado para permitir que os leitores (observers) se inscrevam em tópicos de interesse e recebam automaticamente notificações quando novas notícias forem publicadas.  
O *Singleton* foi usado no `NewsServer` para garantir um único ponto de controle de publicação, centralizando a distribuição de notícias para todos os tópicos e leitores.

**Classe principal:**  
`br.com.avaliacao.questao3.AppQuestao3`

---


## 📊 Questão 4 — Relatórios Extensíveis de Vendas

**Padrões aplicados:**

- 🎨 Decorator
- 🏭 Factory Method

**Justificativa:**  
O padrão *Decorator* foi escolhido para adicionar funcionalidades opcionais (estatísticas, gráficos, exportação em PDF) ao relatório básico sem modificar sua estrutura original, respeitando o princípio *Open/Closed*.  
O *Factory Method* foi usado para criar diferentes tipos de relatórios básicos antes da aplicação dos decoradores, permitindo a criação dinâmica e extensível de novos relatórios no futuro.

**Classe principal:**  
`br.com.avaliacao.questao4.AppQuestao4`

---


## 🧾 Questão 5 — Modelos de Documentos Personalizáveis

**Padrões aplicados:**

- 🧬 Prototype
- 🔁 Singleton

**Justificativa:**  
O *Prototype* foi implementado para possibilitar a criação rápida de novos documentos personalizados (currículos, propostas, relatórios) a partir de modelos existentes, evitando duplicação de código e simplificando o processo de customização.  
O *Singleton* foi aplicado no `PrototypeRegistry` para manter um registro único de protótipos disponíveis, garantindo consistência no gerenciamento e acesso centralizado aos modelos.

**Classe principal:**  
`br.com.avaliacao.questao5.AppQuestao5`

---

## 🧰 Como Executar

### 1️⃣ Compilar o projeto:
```bash
cd design-patterns-avaliacao
javac src/main/java/br/com/avaliacao/**/**/*.java
```

### 2️⃣ Executar uma questão específica:
```bash
java -cp src/main/java br.com.avaliacao.questao1.AppQuestao1
java -cp src/main/java br.com.avaliacao.questao2.AppQuestao2
java -cp src/main/java br.com.avaliacao.questao3.AppQuestao3
java -cp src/main/java br.com.avaliacao.questao4.AppQuestao4
java -cp src/main/java br.com.avaliacao.questao5.AppQuestao5
```

---

## 🧱 Requisitos Técnicos

- Linguagem: **Java 17+**
- Estrutura de diretórios compatível com Maven/Gradle
- Código comentado e modular
- Nenhuma biblioteca externa utilizada

---

## 🧩 Design Patterns Utilizados

| Questão | Padrões Aplicados | Objetivo |
|----------|-------------------|-----------|
| **1** | Factory Method, Singleton | Criação polimórfica e controle global da calculadora |
| **2** | Abstract Factory, Singleton | Criação de famílias de objetos para meios de pagamento |
| **3** | Observer, Singleton | Notificações automáticas de leitores em tópicos |
| **4** | Decorator, Factory Method | Extensões opcionais em relatórios de forma modular |
| **5** | Prototype, Singleton | Clonagem e personalização de modelos de documentos |

---

## 🏁 Conclusão

Este projeto demonstra a aplicação prática dos principais **padrões de projeto GOF** em cenários reais, com foco em:
- Reutilização de código  
- Extensibilidade sem alteração de classes base  
- Baixo acoplamento e alta coesão  

Cada questão exemplifica boas práticas de **arquitetura orientada a objetos** em Java.

---

## ✅ Autor

**Nome:** *Eduardo Farias Camargo*  
**Disciplina:** Padrões de Projeto
<br/>
**Data de entrega:** 05/10/2025  

---

### 💬 Mensagens de Commit Utilizadas

| Questão | Mensagem de Commit |
|----------|--------------------|
| 1 | feat: complete Question 1 - implemented Factory Method and Singleton patterns for transport fare calculation |
| 2 | feat: complete Question 2 - implemented Abstract Factory and Singleton patterns for dynamic payment integration |
| 3 | feat: complete Question 3 - implemented Observer and Singleton patterns for topic-based news subscription and notification system |
| 4 | feat: complete Question 4 - implemented Decorator and Factory Method patterns for extensible sales report generation |
| 5 | feat: complete Question 5 - implemented Prototype and Singleton patterns for customizable document templates |
