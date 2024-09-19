Inflearn 의 박재성 님 강의 '비전공자도 이해할 수 있는 Docker 입문/실전' 를 수강하면서 실습 및 개선시킨 프로젝트입니다.

AWS 배포 관련 내용은 반영하지 않았습니다.

1. 이미지 이름
$ docker compose up -d --build
위 명령어 실행 시 생성되는 이미지 이름은 .env 의 COMPOSE_PROJECT_NAME 와 compose.yml 의 빌드한 서비스의 이름(식별자) 의 조합으로 생성됩니다.

2. 타임존 설정 추가

3. mysql 에서 mariadb 로 변경 및 encoding 커스텀(utf8mb4)

4. nginx 추가 및 백엔드와 맵핑 설정

5. docker swarm 사용

6. spring profile 분리
- Dockerfile 에 별도로 프로필이 존재하는 건 아니고, 그냥 파일 이름을 명시하여 구분한다. 별도의 Dockerfile 에서 내부적으로 실행시킬 프로필 값을 별도로 명시하면 된다.
$ docker compose -f compose-v5.yml up -d --build

- swarm 모드에서는 사용할 이미지를 미리 빌드해야 하는데, 이 이미지를 빌드할 때 ENTRYPOINT 에서 실행시킬 프로필 값을 별도로 명시한 Dockerfile 로 빌드하면 된다.
$ docker stack deploy -c compose-v6.yml project
