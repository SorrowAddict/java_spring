# 자바란 ?

## 자바 표준 스펙

### 자바 표준 스펙과 구현

자바는 **표준 스펙**과 **구현**으로 나눌 수 있다
- 자바 표준 스펙
  - 자바는 이렇게 만들어야 한다는 설계도이며, 문서
  - 이 표준 스펙을 기반으로 여러 회사에서 실제 작동하는 서버를 만든다.
  - 자바 표준 스펙은 자바 커뮤니티 프로세스(JCP)를 통해 관리된다.
- 다양한 자바 구현
  - 여러 회사에서 자바 표준 스펙에 맞추어 실제 작동하는 자바 프로그램을 개발한다.
  - 각각 장단점이 있다. 예를 들어 Amazon Correotto는 AWS에 최적화 되어 있다.
  - 각 회사들은 대부분 윈도우, Mac, 리눅스 같이 다양한 OS에서 작동하는 버전의 자바도 함께 제공한다.

- 자바 구현들은 모두 표준 스펙에 맞도록 개발되어있다. 따라서 오라클 Open JDK를 사용하다가 Amazon Corretto로 변경해도 대부분 문제 없이 동작한다.
<br>

### 컴파일과 실행

자바 프로그램은 컴파일과 실행 단계를 거친다.
- `Hello.java` 코드를 작성
- 자바 컴파일러를 사용해서 소스 코드를 컴파일 한다.
  - 자바가 제공하는 `javac`라는 프로그램을 사용한다.
  - `.java` -> `class` 파일이 생성된다.
  - 자바 소스 코드를 바이트 코드로 변환하며 자바 가상 머신에서 더 빠르게 실행될 수 있게 최적화하고 문법 오류도 검출한다.
- 자바 프로그램을 실행한다.
  - 자바가 제공하는 `java`라는 프로그램을 사용한다.
  - 자바 가상 머신(JVM)이 실행되면서 프로그램이 작동한다.
<br>

### IDE와 자바

- 인텔리제이는 내부에 자바를 편하게 설치하고 관리할 수 있다.
<br>

### 인텔리제이를 통한 자바 컴파일, 실행 과정

- **컴파일**
  - `javac` 프로그램을 자동으로 실행해주어 컴파일을 해줌
  - 예) `javac Hello.java`
  - `out/` 폴더에 가보면 컴파일된 `.class`파일이 있는 것을 확인 가능
- **실행**
  - `java`프로그램을 자동으로 실행
  - 예) `java Hello` , 참고로 확장자는 제외한다.
<br>

