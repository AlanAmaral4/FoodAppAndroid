# FoodApp

App Android de cardápio de comida, feito em **Kotlin** e **Jetpack Compose** (Material 3) como projeto de estudo nas aulas da disciplina **Desenvolvimento para Dispositivos Móveis 1**.
## Funcionalidades

- **Home com seções** (Promoções, Doces, Bebidas), cada uma com uma lista horizontal de produtos.
- **Busca** por nome ou descrição do produto, com os resultados em cards de largura total.
- **Descrição expansível**: tocar em um card da busca mostra ou esconde a descrição completa.
- **Imagens remotas** carregadas da internet com Coil.

## Tecnologias

- Kotlin 2.4
- Jetpack Compose + Material 3 (Compose BOM 2026.02)
- [Coil 3](https://coil-kt.github.io/coil/) para carregar imagens
- Android Gradle Plugin 9.3, com as dependências no version catalog (`gradle/libs.versions.toml`)
- `minSdk` 24 · `targetSdk` 37

## Como executar

Pré-requisitos: Android Studio recente e um emulador ou dispositivo com Android 7.0 (API 24) ou superior.

1. Clone o repositório:
   ```bash
   git clone <url-deste-repositório>
   ```
2. Abra a pasta no Android Studio e aguarde o Gradle sincronizar.
3. Rode a configuração **app** (▶) no emulador ou no dispositivo.

Também dá para usar a linha de comando, na raiz do projeto:

```bash
./gradlew assembleDebug   # gera o APK de debug
./gradlew installDebug    # instala no emulador/dispositivo conectado
```

## Estrutura

```
app/src/main/java/br/com/foodapp/
├── MainActivity.kt        # ponto de entrada: tema + Scaffold
├── model/Product.kt       # data class do produto
├── sampledata/            # dados de exemplo (listas em memória)
└── ui/
    ├── screens/           # HomeScreen: busca + seções
    ├── component/         # ProductSection, ProductItem, ProductItemCard, SearchTextField
    └── theme/             # cores, tipografia e tema
```

Os dados são estáticos (não há backend). A busca usa *state hoisting*: o estado do texto fica na `HomeScreen` e é passado ao `SearchTextField`.

## Créditos

Projeto desenvolvido nas aulas de Desenvolvimento para Dispositivos Móveis 1, acompanhando o repositório de referência [ivanrmoura/FoodAppAndroid](https://github.com/ivanrmoura/FoodAppAndroid). Imagens dos produtos: [Pexels](https://www.pexels.com/).
