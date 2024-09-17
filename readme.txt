Inflearn 의 박재성 님 강의 '비전공자도 이해할 수 있는 Docker 입문/실전' 를 수강하면서 실습 및 개선시킨 프로젝트입니다.

AWS 배포 관련 내용은 반영하지 않았습니다.

1. 이미지 이름
$ docker compose up -d --build
위 명령어 실행 시 생성되는 이미지 이름은 .env 의 COMPOSE_PROJECT_NAME 와 compose.yml 의 빌드한 서비스의 이름(식별자) 의 조합으로 생성됩니다.

2. 타임존 설정 추가

3. mysql 에서 mariadb 로 변경 및 encoding 커스텀(utf8mb4)
