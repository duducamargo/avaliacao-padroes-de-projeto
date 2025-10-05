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

**Classe principal:**  
`br.com.avaliacao.questao1.AppQuestao1`

---

## 💳 Questão 2 — Plataforma de Pagamentos

**Padrões aplicados:**

- 🏗️ Abstract Factory
- 🔁 Singleton

**Classe principal:**  
`br.com.avaliacao.questao2.AppQuestao2`

---

## 📰 Questão 3 — Sistema de Assinaturas de Notícias

**Padrões aplicados:**

- 👀 Observer
- 🔁 Singleton

**Classe principal:**  
`br.com.avaliacao.questao3.AppQuestao3`

---

## 📊 Questão 4 — Relatórios Extensíveis de Vendas

**Padrões aplicados:**

- 🎨 Decorator
- 🏭 Factory Method

**Classe principal:**  
`br.com.avaliacao.questao4.AppQuestao4`

---

## 🧾 Questão 5 — Modelos de Documentos Personalizáveis

**Padrões aplicados:**

- 🧬 Prototype
- 🔁 Singleton

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

| Questão | Padrões Aplicados           | Objetivo                                               |
| ------- | --------------------------- | ------------------------------------------------------ |
| **1**   | Factory Method, Singleton   | Criação polimórfica e controle global da calculadora   |
| **2**   | Abstract Factory, Singleton | Criação de famílias de objetos para meios de pagamento |
| **3**   | Observer, Singleton         | Notificações automáticas de leitores em tópicos        |
| **4**   | Decorator, Factory Method   | Extensões opcionais em relatórios de forma modular     |
| **5**   | Prototype, Singleton        | Clonagem e personalização de modelos de documentos     |

---

## 🏁 Conclusão

Este projeto demonstra a aplicação prática dos principais **padrões de projeto GOF** em cenários reais, com foco em:

- Reutilização de código
- Extensibilidade sem alteração de classes base
- Baixo acoplamento e alta coesão

Cada questão exemplifica boas práticas de **arquitetura orientada a objetos** em Java.

---

## ✅ Autor

**Nome:** _Eduardo Farias Camargo_  
**Disciplina:** Padrões de Projeto
<br/>
**Data de entrega:** 05/10/2025

---

### 💬 Mensagens de Commit Utilizadas

| Questão | Mensagem de Commit                                                                                                                |
| ------- | --------------------------------------------------------------------------------------------------------------------------------- |
| 1       | feat: complete Question 1 - implemented Factory Method and Singleton patterns for transport fare calculation                      |
| 2       | feat: complete Question 2 - implemented Abstract Factory and Singleton patterns for dynamic payment integration                   |
| 3       | feat: complete Question 3 - implemented Observer and Singleton patterns for topic-based news subscription and notification system |
| 4       | feat: complete Question 4 - implemented Decorator and Factory Method patterns for extensible sales report generation              |
| 5       | feat: complete Question 5 - implemented Prototype and Singleton patterns for customizable document templates                      |
