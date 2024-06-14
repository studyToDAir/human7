
window.addEventListener("load", () => {
    init();
    bind();
});

function init() {
    // 나중에 json으로 관리
    let category = [
        "한식",
        "중식",
        "양식"/*, "일식", "분식", "아시안"*/];
    let category_store = [
        ['콩나물국밥',
            '남도밥상',
            '옹심이 메밀막국수'], // 한식 : 가게명
        ['호호반점', '시훈마라탕', '탕화쿵푸'], // 중식 : 가게명
        ['돈까스다', '롯데리아', '맘스터치']
    ]

    let category_store_menu = [[
            ['콩나물비빔밥', '순대국밥'],
            ['후라이정식', '김치찌개'],
            ['팥죽', '팥칼국수']
        ],
        [
            ['짜장', '짬뽕'],
            ['마라탕'],
            ['마라탕']
        ],
        [
            ['돈까스', '파돈까스'],
            ['치킨버거','새우버거','불고기버거'],
            ['싸이버거', '휠레버거']
        ]
    ]

    for (let i = 0; i < category.length; i++) {
        // 나중에 append 하려고
        let li = document.createElement("li");

        let html = '';
        html += `<h2 class="selectable">${category[i]}</h2>`;
        let ul_store = document.createElement("ul");

        for (let j = 0; j < category_store[i].length; j++) {
            // 나중에 append 하려고
            let li_store = document.createElement("li");

            let html_store = '';
            html_store += `<li>`;
            html_store += `    <h3 class="selectable">${category_store[i][j]}</h3>`;

            let ul_menu = document.createElement("ul");
            for (let k = 0; k < category_store_menu[i][j].length; k++) {
                let li_menu = document.createElement("li");

                let html_menu = '';
                html_menu += `<li>`;
                html_menu += `    <span class="selectable">${category_store_menu[i][j][k]}</span><span>3500원</span>`;
                html_menu += `</li>`;

                li_menu.innerHTML = html_menu;

                ul_menu.append(li_menu);
            }

            html_store += `</li>`;
            li_store.innerHTML = html_store;
            li_store.append(ul_menu);

            ul_store.append(li_store);
        }

        li.innerHTML = html;
        li.append(ul_store);
        let ul = document.querySelector('.wrapper .menu > ul');
        ul.append(li);
    }


}
function bind() {
    document.querySelector("#getLunch").addEventListener("click", function(){
        getLunch();
    });

    window.addEventListener('mousemove', function(event){
        let cursor = document.querySelector('#cur1');
        cursor.style.pointerEvents = 'none';
        cursor.style.top = event.pageY-15 +'px';
        cursor.style.left = event.pageX-15 +'px';
        cursor.style.display = 'block';
    })
}
let _count_select_max = 10;
let _count_select = _count_select_max;
let _idx_timeout = -1;
let _next_interval_max = 100;
let _next_interval = _next_interval_max;
function getLunch(){

    _idx_timeout = setTimeout(function(){
        _count_select--;
        _next_interval *= 1.2;
        if(_count_select < 0){
            clearTimeout(_idx_timeout);
            _idx_timeout = -1;
            _count_select = _count_select_max;
            _next_interval = _next_interval_max

            document.querySelector('.selectable.active').style.fontSize = "20px";
            return;
        }

        let target = document.querySelectorAll('.selectable');
        target.forEach( dom => dom.classList.remove('active') );
    
        let idx_rand = Math.floor((Math.random() * target.length));
        target[idx_rand].classList.add('active');

        getLunch();
    }, _next_interval)
}
