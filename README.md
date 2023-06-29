# 유형테스트.zip

![logo_main](https://user-images.githubusercontent.com/77378559/147445274-b4dd9612-7f86-44a0-b2ef-cc20560e0d86.png)

특정 상황에서의 성격 유형 테스트와 유머스러운 소재로 만든 유머 테스트, 찐 성격 테스트에서 나의 성격 유형과 어울리는 성격 유형 궁합까지
지루한 시간을 즐겁게 해주는 유형 테스트 모음집 어플입니다!

***

# 개요

- 프로젝트 이름 : 유형테스트.zip
- 개발 기간 : 11월 8일 ~ 12월 16일
- 리팩토링 기간 : 3월 8일 ~ 5월 27일(2023년)
- 어플 다운로드 링크 : https://play.google.com/store/apps/details?id=com.mk.personality_style_test

***

# 설명

✔ Main

![유형테스트1](https://user-images.githubusercontent.com/77378559/147445996-441abaa5-faeb-4065-b0ef-690fcd6bd388.jpg)

- 어플 첫 시작시 로고가 몇 초간 보여지고 메인 화면으로 이동합니다
- 위의 이미지가 어플 메인화면입니다

***

✔ 유형테스트

![유형테스트2](https://user-images.githubusercontent.com/77378559/147446193-a4895374-05f7-4c2c-97c9-5a835075d968.jpg)

- 메인화면에서 유형테스트 버튼을 누르면 나오는 화면입니다
- 각각의 상황에 따라 유형 테스트를 할 수 있습니다

***

✔ 유형테스트 결과

![KakaoTalk_20211227_163614443](https://user-images.githubusercontent.com/77378559/147448077-033de70e-a985-48bc-bcb2-15ef63f7e323.jpg)

- 모든 테스트에 대한 결과화면은 위와 비슷한 느낌으로 나옵니다
- 결과화면에서는 다시하기 버튼과 목록으로 돌아가는 버튼이 있어 사용자가 사용하기 쉽게 구현을 했습니다

***

✔ 유머 테스트

![유형테스트3](https://user-images.githubusercontent.com/77378559/147446385-8ec305a9-d4b0-4769-8810-c12a370bdbfd.jpg)

- 메인화면에서 유머테스트 버튼을 누르면 나오는 화면입니다
- 기존의 성격 테스트나 유형테스트보다는 유머스러운 소재를 가지고 있는 테스트들 입니다

***

✔ 성격유형 테스트

<img src="https://user-images.githubusercontent.com/77378559/147446610-cd5f8f8a-6c39-4b48-b76b-c9ab05236ab1.jpg" width="320" /> &nbsp;&nbsp; <img src="https://user-images.githubusercontent.com/77378559/147446618-8d597f92-bebf-4a54-8db2-3dffe8d805f8.jpg" width="320" />

- 메인화면에서 찐테스트 버튼을 누르면 나오는 화면입니다.
- 성격유형테스트에서 시작하기 버튼을 누르면 2번째 이미지처럼 성격유형테스트를 할 수 있습니다

***

✔ 궁합 테스트

![유형테스트4](https://user-images.githubusercontent.com/77378559/147446764-a81b3c44-98ee-4094-9d32-d150ab984f82.jpg)

- 메인화면에서 궁합 버튼을 누르면 나오는 화면입니다.
- 찐테스트에서 성격유형테스트를 하고 나온 결과를 입력하면 다른 유형들과 궁합을 보여주는 기능을 가지고 있습니다


# 추가된 기능 설명

- 플레이스토어에 추가된 기능 설명 부분 입니다.

![플레이스토어 기능 추가](https://github.com/MK-SideProject/personality-style-test-release2/assets/77378559/0c3abe79-d780-4de7-8257-434154f86948)

✔ 다시하기, 목록, 공유 버튼

![다시하기, 목록, sns 버튼 공유](https://github.com/MK-SideProject/personality-style-test-release2/assets/77378559/de210bad-6d1f-4178-93a7-585eb7cc6b74)

<br>
- 다시하기 버튼 클릭시 테스트 첫 화면으로 옮겨집니다.
- 목록 버튼 클릭시 선택했던 유형테스트 목록 모음집으로 옮겨집니다.
- sns 버튼 공유 클릭시 공유창이 나타납니다

***
 - sns 공유버튼 클릭시 나오는 화면

![sns 공유 버튼 클릭](https://github.com/MK-SideProject/personality-style-test-release2/assets/77378559/cf573739-d01f-4d2d-97e3-67bbe1d96d50)


***

# 주요 코드 설명

<details>
<summary>리스트 코드 설명</summary>
<div markdown="1">       
  - 각 리스트뷰는 아이템리스트와 아이템 어댑터로 이루어져 있습니다
</div>
<div markdown="2">       
  - 아이템 리스트는 아래 코드와 같습니다
    
    <pre><code> 
    public PersonalityItem(String title_resource1, String description_resource1, String time_resource1, int img_resource1){
       this.title_resource1 = title_resource1;
       this.description_resource1 = description_resource1;
       this.time_resource1 = time_resource1;
       this.img_resource1 = img_resource1;
     }
   
   </code></pre>
   
</div>
<div markdown="3">       
  - 어댑터를 사용해 아이템 리스트를 가져왔습니다. 주요 코드는 아래와 같습니다.

  <pre><code>
    @Override
        public View getView(int position, View convertView, ViewGroup parent){
            PersonalityItemView personalityItemView = null;
            if(convertView ==null){
                personalityItemView = new PersonalityItemView(getApplicationContext());

            }else{
                personalityItemView = (PersonalityItemView)convertView;
            }
            PersonalityItem item = items.get(position);
            personalityItemView.setTitle_resource1(item.getTitle_resource1());
            personalityItemView.setDescription_resource1(item.getDescription_resource1());
            personalityItemView.setTime_resource1(item.getTime_resource1());
            personalityItemView.setImg_resource1(item.getImg_resource1());
            return personalityItemView;
        }
  </code></pre>
</div>
</details>

<details>
<summary>테스트 코드 설명</summary>
<div markdown="1">       
  - 테스트는 질문에 대한 버튼을 눌러 다음 프래그먼트로 값을 넘겨주는게 중요했습니다.
</div>
<div markdown="2">       
  - 번들에 값을 담아 다음 프래그먼트로 데이터를 넘겨주는 코드는 다음과 같습니다.
  - FragmentTransaction의 replace 함수를 사용해 다음 프래그먼트로 교체합니다.

  <pre><code>
bankingTest3_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //번틀 값 설정
                    bundleNext.putString("bankingTestResult1",bankingTestResult1);
                    bundleNext.putString("bankingTestResult2",bankingTestResult2);
                    bundleNext.putString("bankingTestResult3",bankingTestResult3);
                    //다음 프래그먼트로 값 이동
                    bankingTest4.setArguments(bundleNext);

                    //이동
                    transaction.replace(R.id.bankingtest_start_fragment, bankingTest4);

                    transaction.addToBackStack(null).commit();
                }
            });
   </code></pre>
  </div>
</details>

<details>
<summary>테스트 결과 코드 설명</summary>
<div markdown="1">       
  - 마지막으로 값을 넘겨받은 마지막 프래그먼트에서 테스트 결과를 어떻게 마무리했는지 설명해드리겠습니다
</div>
<div markdown="2">       
  - 위에서 설명한 것과 같이 버튼에 대한 값을 넘겨 받고 마지막에 if문으로 조건에 대한 처리를 했습니다.
    <br>
    <pre><code>
bankingTest6_an1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if(bankingTestResult3 != null && bankingTestResult3.equals("result3") ){
                        //이동
                        transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult3Fg);
                        transaction.addToBackStack(null).commit();

                    }
                    else if(bankingTestResult1 != null && bankingTestResult1.equals("result1")){


                        transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult1Fg);
                        transaction.addToBackStack(null).commit();
                    }
                    else{

                        transaction.replace(R.id.bankingtest_start_fragment, bankingTestResult2Fg);
                        transaction.addToBackStack(null).commit();

                    }


                }
            });
   </code></pre>
</div>
  <div markdown="3">       
  - 안드로이드에서 if문에 아무 처리가 없다면 null값 등 충돌이 있기에 if문의 코드를 아래와 같이 작성했습니다.
    <br>
    <pre><code>
    if(bankingTestResult3 != null && bankingTestResult3.equals("result3") )
    </code></pre>
    - 그냥 ==을 사용하면 값을 읽어오지 못하기 때문에 equals를 사용해야하는 점이 이 코드의 주의할 점 입니다.
</div>
</details>

<details>
<summary>다시하기, 목록, sns 공유 버튼</summary>
<div markdown="1">       
  - 새로 추가한 다시하기, 목록, sns 공유 버튼 코드에 대해서 설명하도록 하겠습니다.
</div>
<div markdown="2">       
  -  다시 하기 버튼을 클릭시 현재 액티비티가 null이 아니라면 현재 프래그먼트가 실행되고 있는 액티비티를 종료하고
			해당 테스트 액티비티를 실행 시켜줍니다.
    <br>
    <pre><code>
    //다시하기 버튼
      bankingTestRestart.setOnClickListener(new View.OnClickListener() {
      @Override
        public void onClick(View view) {
          if (thisActivity != null) {
              //현재 액티비티가 null이 아니라면 액티비티 실행후
              startActivity(new Intent(thisActivity, BankingTestActivity.class));
             //지금껀 종료
              thisActivity.finish();
            }
        }
    });
    </code></pre>
</div>
<div markdown="3"> 
	- 목록 버튼 클릭시 현재 실행되고 있는 액티비티를 종료하면 그전에 테스트를 진행하기 앞서 실행 되었던 목록 액티비티가 나오게 됩니다.
		<br>
    <pre><code>
bankingTestList.setOnClickListener(new View.OnClickListener() {
        @Override
      public void onClick(View view) {
          //현재 액티비를 가져온다
          if (thisActivity != null) {
          //지금껀 종료
          thisActivity.finish();
          }
      }
  });
	</code></pre>
</div>
<div markdown="4"> 
	- sns 공유 버튼 클릭시 해당 결과에 대해 공유와 함께 플레이스토어 링크로 연결 될 수 있게끔 설정 되어 있습니다.
	<br>
  <pre><code>
bankingTestShare.setOnClickListener(new View.OnClickListener() {
     @Override
      public void onClick(View view) {
      Intent sharingIntent = new Intent(Intent.ACTION_SEND);
      sharingIntent.setType("text/plain");
      //결과 내용 + 어플링크
      sharingIntent.putExtra(Intent.EXTRA_TEXT, "금융테스트 결과 - 완벽한 재테크 고목인 당신! \n" + "https://play.google.com/store/apps/details?id=com.mk.personality_style_test&hl=ko");
      startActivity(Intent.createChooser(sharingIntent, "결과를 공유할 앱을 선택해주세요"));

      }
  });    
</code></pre>
</div> 
</details>

***
# ✍ 개선사항

- 액티비티 창이 여러개 쌓여있는 형태라 마지막 결과창에서 목록이나 다시하기 버튼을 누르지 않는다면 이용하는 데 조금 불편함이 있다는걸 인지하고 있습니다
- 이에 대해선 프래그먼트 형식으로 바꾸거나 뒤로가기 버튼을 눌렀을 때 모든 액티비티 종료가 되는 기능을 추가해 개선해보는 것을 고려하고 있습니다.

*** 

# ✍ 리팩토링

- 위에 개선 사항을 반영하여 리팩토링을 하였습니다.
- 먼저, 테스트 창이 액티비티로 구성되어 테스트를 진행 할 수 록 액티비티가 쌓이는 형태를 하나의 액티비티에 프래그먼트를 여러개 사용 할 수 있게끔 개선을 하였습니다.
- 위와 같이 변경한 이유는 액티비티가 여러개 실행되는 점을 줄이고, 다시하기 버튼 클릭 또는 목록 버튼을 클릭시 해당 기능을 수행하는데 있어서 하나의 액티비티만 관리할 수 있게끔 하기 위해서 입니다.

- 아래는 프래그먼트로 바꾼 코드 일부분 입니다.
```java
public class BankingTest3 extends Fragment {
    //결과값 이동
    private String bankingTestResult1;
    private String bankingTestResult2;
    private String bankingTestResult3;
    public BankingTest3() {
    }
    public static BankingTest3 newInstance() {
        BankingTest3 fragment = new BankingTest3();
        Bundle args = new Bundle();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //뷰 선언
        View bankingTest3 = inflater.inflate(R.layout.fragment_banking_test_3, container, false);
        Button bankingTest3_an1 = (Button) bankingTest3.findViewById(R.id.bankingtest_3_an1);
        Button bankingTest3_an2 = (Button) bankingTest3.findViewById(R.id.bankingtest_3_an2);
        Button bankingTest3_an3 = (Button) bankingTest3.findViewById(R.id.bankingtest_3_an3);
        //전달한 번들 메소드 받기
        Bundle bundle = getArguments();
        //값이 있다면
        if(bundle != null) {
            bankingTestResult1 = bundle.getString("bankingTestResult1");
            bankingTestResult2 = bundle.getString("bankingTestResult2");
            bankingTestResult3 = bundle.getString("bankingTestResult3");
            //데이터 전달 및 프래그먼트 변경
            BankingTest4 bankingTest4 = new BankingTest4();
```

- 위에 번틀 메소드를 받고 데이터를 전달하는 부분에 있어서 초기 코드 같은 경우 중복된 코드가 많았으나
현재 리팩토링을 통해서 중복코드를 최소한으로 줄였습니다.

# ✍ 후기

- 어플을 만드는 것을 쉽게 생각했는데 컨텐츠 개발에 시간이 제일 많이 걸렸던 것 같습니다
- 플레이스토어에 배포까지 구글 콘솔 개발자 계정 등록부터 심사과정이 오래 걸리는 걸 보고 다음에 프로젝트를 한다면 이 기간까지 염두하고 해야한다는 걸 배울 수 있었습니다

new)
- 모든 테스트 액티비티를 프래그먼트로 바꾸는 과정이 시간이 많이 걸려 힘들었습니다. 개발하기 전에 구현에 있어서 어떤 걸 사용할지 충분하게 고민을 하고 계획을 세워야 하는 점을 깨달았습니다.
- 리팩토링하면서 중복 코드를 개선하면서 코드의 재사용성에 대해서 공부할 수 있는 시간이었습니다.


***

# 개발자

|김수빈|장민주|
|:---:|:---:|
|[subinkim26](https://github.com/subinkim26)|[minm063](https://github.com/minm063)|

