# OptimizeSendHttp
(it just Acronym from my name, osh)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

![](https://img.shields.io/badge/Maintained-yes-green.svg)
![](https://img.shields.io/website-up-down-green-red/http/monip.org.svg)
![](https://img.shields.io/badge/Ask%20me-anything-1abc9c.svg)

![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![](https://img.shields.io/badge/Amazon_AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white)
![](https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white)
![](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)

## 목차
[1. **프로젝트 소개**](#프로젝트-소개)

[2. **개발 환경**](#개발-환경)

[3. **설계 구조**](#설계-구조)

[4. **상세 기능**](#상세-기능)

[5. **업데이트 진행**](#업데이트-진행)


## 프로젝트 소개
* 해당 프로젝트는 스프링부트 기반 웹 어플리케이션이며, 다음 목표를 달성하기 위하여 제작되었습니다.  
  * 업무 및 일상생활에 있어서 다양한 생활정보를 실시간으로 제공하기 위한 목적
  * 분리 관리되던 일상생활 정보를 서버 기반 이벤트를 통하여 전광판처럼 전달하기 위한 목적
  * 서버 기반 이벤트 중심의 실시간 데이터 처리를 경험해보기 위한 학습 목적
* 개발 효율성을 향상시키기 위하여 다음과 같은 인프라가 활용, 구축되었습니다.  
  * Docker 를 이용한 컨테이너 어플리케이션 형식으로 구성되었습니다.  
  * Amazon Web Service 환경을 이용한 클라우딩 기술을 활용하여 구축하였습니다.  
* 해당 프로젝트는 [MIT 라이센스](https://choosealicense.com/licenses/mit/) 기반 배포 및 운영됩니다.  
  *  관련 의문사항이나 기타 2차 가공, 혹은 상업적 이용 등은 [이슈 생성](https://github.com/LucestDail/OptimizeSendHttp/issues)을 통하여 문의 및 진행하시길 바랍니다.



## 개발 환경

- 코드 작성 환경 구성
  * VSCode
    * 유료화 툴 사용을 가급적 배제 및 사용자 커스터마이징 포퍼먼스에 맞는 에디트 툴 선택
  * DBeaver
    * 이클립스 기반 무료 툴 중 가장 Reference 다수 보유한 DB 에디트 툴 선택

- 어플리케이션 환경 구성
  * OpenJDK17
    * Java 8 EOL 예정에 따라 이후 LTS 버전 중 가장 최신 버전을 선택
  * Spring Boot 3.x
    * 웹 프레임워크 초기 구축 효율화를 위해 SpringBoot 활용
    * 3.0 버전의 개발 및 운영 환경 확대에 따라 3.0 버전으로 소스 마이그레이션 및 개발 진행
  * Maven 4.0.0
    * 빌드 툴 안정성 및 하위 호환성 고려 최신 버전 4.0.0 선택
  * spring-boot-starter-data-jpa, lombok
    * Domain 단위 관리 및 데이터베이스 직접적 조작을 최소화 하기 위하여 코드 단위 관리에 최적화된 JPA 선택
    * 지연 저장 기능을 활용한 데이터 불시적인 트랜젝션 오류 최소화 위하여 활용
    * JPA 기능에 따른 코드 관리에 가장 적합한 라이브러리 Lombok 적용하여 코드 가독성 및 개발 효율성 도모
  * mariadb-java-client
    * Oracle 상업적 이용에 따른 유료 라이센스 상정, mysql 진영 무료 라이센스 데이터베이스 활용
    * Reference, Document 다수 보유한 MariaDB 선택
  
- 운영 환경 구성
  * Amazon Web Service (Ubuntu 22.04 LTS)
    * AWS EC2 인스턴스를 활용하여 서버 구축 및 어플리케이션 배포 
      * Local 환경에서 구축시 상시 서버 기기 구동이 필요하므로 클라우드 서버로 대체
      * GCP, Heroku, Naver Cloud, Gabia 등 여러 서비스 확인하였으나,  
         실제 운영 서버 구축시 추가적으로 발생할 인프라 확장성을 고려 AWS 기반 인프라로 선택
    * AWS RDS 를 활용하여 클라우딩 환경에서 데이터베이스 구축
  * Springboot Embded Apache Tomcat
    * 소규모 어플리케이션 구동시 가용성 및 추가적인 설정 고려 해당 WAS 선택

## 설계 구조

- 코드 구조  
  * 프로젝트 구조는 메이븐에서 제시하는 권장 템플릿 구조로 진행하였습니다.
  * .controller
    * Handler 에 대한 맵핑 컨트롤러를 구성과, RESTful 한 URL 입출입을 관리합니다.
  * .service
    * 메인 비지니스 로직을 통한 데이터 가공, 입출입을 통제합니다.
  * .util
    * 데이터 수집 및 데이터 처리에 있어서 필요한 기능이 포함됩니다.  
  
- 운영 환경 구조
  * 기본적으로 AWS IaaS 기반으로 구성되며 이를 통하여 어플리케이션을 설정하였습니다.  
  * 어플리케이션 서버는 Lightsail 기반으로 구성하였습니다.(Docker 기반 빌드 시 가용성 고려)  
  * HTTPS 적용하여 일반적인 사이트에서 제공하는 사용자 보안 편의성을 제공합니다.
  * 내부적으로 Spring MVC 구조를 채택하여 맵핑 후 RESTFul 한 서비스 URL 제공이 가능하도록 구성하였습니다.  
  * 서버에 접근 가능한 대상은 포트로 구분하여 AWS VPC 를 세팅, 구성하였습니다.   

## 상세 기능
- 작성중
  - 작성중

## 업데이트 진행
  - Ver 1.000(24.10.01)
    - 인스턴스 배포
      - IP URL 형식으로 최초 서버 구성이 완료되었습니다.
    - 테스트 랜딩 페이지 추가
    - SSE 기반 API 추가
