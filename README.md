# hexagonal-multi-module

Hexagonal Architecture로 application 을 만들때 domain, application, adater 영역은 패키지로 구분한다. 
패키지로 구분하는것 보다는 모듈로 각 영역을 분리시키고, 종속성의 방향이 도메인 방향으로 흐르게 강제할 수 있다.

또한 도메인 모듈에 대해 POJO 테스트가 가능하여, 순수한 비즈니스에 테스트가 집중될 수 있고 견고한 비즈니스 로직을 유지할 수 있다.
