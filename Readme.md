# Spring Boot コマンドラインツール の Template

## 概要

Spring Boot でコマンドラインツールを作るためのテンプレートプロジェクト

## 予めインストールが必要なアプリケーション

* Java 1.8 以上
* Docker
* Docker Compose

## 新しいプロジェクトを作るときに必要な作業

1. プロジェクト名の設定

    下記のファイルのプロジェクト名を修正する
    
    * settings.gradle ファイルの rootProject.name プロパティ
    * src/main/resources/config/application.yml の spring.application.name プロパティ

2. 依存ライブラリの修正

3. サンプルプロジェクトの削除

## ビルド方法

### アプリケーションの起動

    ```./gradlew bootRun```

### アプリケーションのテスト

    ```./gradlew test```

### アプリケーションのビルド

    ```./gradlew clean build```

### Dockerイメージの作成

    buildタスクでjarファイルを作成してから、dockerタスクを実行。
    

    ```./gradle build docker```

### Dockerイメージからアプリケーションを起動
    
    ```docker -it --rm プロジェクト名```
