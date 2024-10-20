<template>
    <section class="conA">
		<div class="container">
            <figure class="text-center">
                <blockquote class="blockquote">
                  <p>안전 관리 담당자가<br>
                    연속적으로 봐야할<br>
                    주요 발생 내용들</p>
                </blockquote>
                <figcaption class="blockquote-footer">
                  <cite title="Source Title" id="currentTime"></cite> 기준정보
                </figcaption>
              </figure>
		</div>
        <div class="container">
            <div class="row text-end">
                <h4>
                    <small class="text-muted">실시간 기상정보</small>
                </h4>
            </div>
            <div class="row">
                <div class="col-lg-12 mt-5 mb-5">
                    <table id="weatherTable" class="table table-bordered" style="width: 100%">
                        <colgroup>
                            <col style="width:12%">
                            <col style="width:12%">
                            <col style="width:12%">
                            <col style="width:12%">
                            <col style="width:12%">
                            <col style="width:12%">
                            <col style="width:12%">
                            <col style="width:12%">
                        </colgroup>
                        <thead>
                            <tr>
                                <th>지역</th>
                                <th>날씨</th>
                                <th>온도</th>
                                <th>구름</th>
                                <th>습도</th>
                                <th>바람</th>
                                <th>일출</th>
                                <th>일몰</th>
                            </tr>
                        </thead>
                        <tbody id="weatherTbody">
                            <td>준비중</td>
                            <td>준비중</td>
                            <td>준비중</td>
                            <td>준비중</td>
                            <td>준비중</td>
                            <td>준비중</td>
                            <td>준비중</td>
                            <td>준비중</td>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row text-end">
                <h4>
                    <small class="text-muted">실시간 긴급재난문자</small>
                </h4>
            </div>
            <div class="row">
                <div class="col-lg-12 mt-5 mb-5">
                    <table id="emergencyTable" class="table table-bordered" style="width: 100%">
                        <colgroup>
                            <col style="width:8%">
                            <col style="width:20%">
                            <col style="width:56%">
                            <col style="width:8%">
                            <col style="width:8%">
                        </colgroup>
                        <thead>
                            <tr>
                                <th>일시</th>
                                <th>지역</th>
                                <th>내용</th>
                                <th>분류</th>
                                <th>상세</th>
                            </tr>
                        </thead>
                        <tbody id="emergencyTbody">
                            <tr>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row text-end">
                <h4>
                    <small class="text-muted">실시간 교통돌발상황</small>
                </h4>
            </div>
            <div class="row">
                <div class="col-lg-12 mt-5 mb-5">
                    <table id="trafficTable" class="table table-bordered" style="width: 100%">
                        <colgroup>
                            <col style="width:8%">
                            <col style="width:12%">
                            <col style="width:8%">
                            <col style="width:52%">
                            <col style="width:8%">
                            <col style="width:12%">
                        </colgroup>
                        <thead>
                            <tr>
                                <th>일시</th>
                                <th>도로명</th>
                                <th>도로위치</th>
                                <th>내용</th>
                                <th>분류</th>
                                <th>상세</th>
                            </tr>
                        </thead>
                        <tbody id="trafficTbody">
                            <tr>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row text-end">
                <h4>
                    <small class="text-muted">실시간 연합뉴스</small>
                </h4>
            </div>
            <div class="row">
                <div class="col-lg-12 mt-5 mb-5">
                    <table id="yeonhapTable" class="table table-bordered" style="width: 100%">
                        <colgroup>
                            <col style="width:8%">
                            <col style="width:16%">
                            <col style="width:76%">
                        </colgroup>
                        <thead>
                            <tr>
                                <th>일시</th>
                                <th>제목</th>
                                <th>내용</th>
                            </tr>
                        </thead>
                        <tbody id="yeonhapTbody">
                            <tr>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row text-end">
                <h4>
                    <small class="text-muted">서버정보</small>
                </h4>
            </div>
            <div class="row">
                <div class="col-lg-12 mt-5 mb-5">
                    <table id="emergencyTable" class="table table-bordered" style="width: 100%">
                        <colgroup>
                            <col style="width:15%">
                            <col style="width:15%">
                            <col style="width:15%">
                            <col style="width:15%">
                            <col style="width:15%">
                            <col style="width:15%">
                        </colgroup>
                        <thead>
                            <tr>
                                <th>아키텍쳐</th>
                                <th>시스템명칭</th>
                                <th>시스템부하</th>
                                <th>총메모리</th>
                                <th>사용메모리</th>
                                <th>잔여메모리</th>
                            </tr>
                        </thead>
                        <tbody id="applicationTbody">
                            <tr>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                                <td>준비중</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
	</section>
</template>
  
<style>
    @media (min-width: 1024px) {
        .about {
            min-height: 100vh;
            display: flex;
            align-items: center;
        }
    }
</style>
  
  <script>
        var eventSource;
        var eventSource1;
        var eventSource2;
        var eventSource3;
        var currentResponse;
        var currentResponse1;
        var currentResponse2;
        var currentResponse3;
        window.addEventListener("load", function () {
    
                // Connect to the server
                eventSource = new EventSource("http://localhost:8080/dashboard/main/info");
    
                // Receive messages
                eventSource.onmessage = function (event) {
                    currentResponse = event.data;
                    emergencyJsonParser(event.data);
                    applicationJsonParser(event.data);
                    weatherJsonParser(event.data);
                    trafficJsonParser(event.data);
                    yeonhapJsonParser(event.data);
                };
                eventSource.onerror = function (e) {
                    console.log("EventSource failed: " + e);
                };
            },
            false);

            window.addEventListener("load", function () {
            
                // Connect to the server
                eventSource1 = new EventSource("http://localhost:8080/dashboard/main/traffic");

                // Receive messages
                eventSource1.onmessage = function (event) {
                    currentResponse1 = event.data;
                    trafficJsonParser(event.data);
                };
                eventSource1.onerror = function (e) {
                    console.log("EventSource failed: " + e);
                };
            },
            false);

            window.addEventListener("load", function () {
            
                // Connect to the server
                eventSource2 = new EventSource("http://localhost:8080/dashboard/main/emergency");

                // Receive messages
                eventSource2.onmessage = function (event) {
                    currentResponse2 = event.data;
                    emergencyJsonParser(event.data);
                };
                eventSource2.onerror = function (e) {
                    console.log("EventSource failed: " + e);
                };
            },
            false);

            window.addEventListener("load", function () {
            
                // Connect to the server
                eventSource3 = new EventSource("http://localhost:8080/dashboard/main/yeonhap");

                // Receive messages
                eventSource3.onmessage = function (event) {
                    currentResponse3 = event.data;
                    yeonhapJsonParser(event.data);
                };
                eventSource3.onerror = function (e) {
                    console.log("EventSource failed: " + e);
                };
            },
            false);
    </script>