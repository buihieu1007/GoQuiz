package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    TextView question;
    int score = 0;
    int index = 0;
    boolean check = true;
    Button Traloi;
    TextView questionText;
    RadioButton ansText1;
    RadioButton ansText2;
    RadioButton ansText3;
    RadioButton ansText4;
    ArrayList<Question> QuestionArray;
    Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        int subjectID = intent.getIntExtra("SubjectID", 0);
        int isHard = intent.getIntExtra("hardMode", 0);
        question = findViewById(R.id.question);
        QuestionArray = new ArrayList<>();
        if (subjectID == 1 && isHard == 0) {
            QuestionArray.add(new Question(1, "Thủ đô của Pháp là gì?", new String[]{"Madrid", "Paris", "Rome", "Berlin"}, 1, "Địa lý", false));
            QuestionArray.add(new Question(2, "Dòng sông nào chảy qua Thành phố London?", new String[]{"Rhine", "Seine", "Thames", "Danube"}, 2, "Địa lý", false));
            QuestionArray.add(new Question(3, "Núi Kilimanjaro nằm ở quốc gia nào?", new String[]{"Rwanda", "Uganda", "Tanzania", "Kenya"}, 2, "Địa lý", false));
            QuestionArray.add(new Question(4, "Quốc gia nào nằm ở cực Nam của châu Phi?", new String[]{"Ghana", "Kenya", "Nigeria", "Nam Phi"}, 3, "Địa lý", false));
            QuestionArray.add(new Question(5, "Biển nào nằm giữa châu Á và châu Âu?", new String[]{"Biển Trung Hoa", "Biển Đen", "Biển Aegean", "Biển Đỏ"}, 1, "Địa lý", false));
            QuestionArray.add(new Question(6, "Đất nước nào nằm ở Bán đảo Ả Rập?", new String[]{"Iraq", "Saudi Arabia", "Jordan", "Iran"}, 1, "Địa lý", false));
            QuestionArray.add(new Question(7, "Thành phố nào được biết đến là 'Thủ đô Hòa bình'?", new String[]{"Vienna", "Oslo", "Geneva", "Stockholm"}, 2, "Địa lý", false));
            QuestionArray.add(new Question(8, "Quốc gia nào nằm ở cực Bắc của châu Âu?", new String[]{"Thụy Điển", "Phần Lan", "Iceland", "Na Uy"}, 3, "Địa lý", false));
            QuestionArray.add(new Question(9, "Núi Everest, đỉnh núi cao nhất thế giới, nằm ở dãy núi nào?", new String[]{"Andes", "Himalaya", "Rockies", "Alps"}, 1, "Địa lý", false));
            QuestionArray.add(new Question(10, "Quốc gia nào có hình dạng hình trái tim?", new String[]{"Brazil", "Australia", "Canada", "Italy"}, 3, "Địa lý", false));
        } else if (subjectID == 1 && isHard == 1) {
            QuestionArray.add(new Question(1, "Dãy núi nào kéo dài qua Nepal, Bhutan, và Ấn Độ?", new String[]{"Himalaya", "Rockies", "Andes", "Alps"}, 0, "Địa lý", true));
            QuestionArray.add(new Question(2, "Quốc gia nào có nền kinh tế chủ yếu dựa vào dịch vụ tài chính?", new String[]{"Australia", "Saudi Arabia", "Singapore", "Brazil"}, 2, "Địa lý", true));
            QuestionArray.add(new Question(3, "Thành phố nào được gọi là 'Venice of the North'?", new String[]{"Hamburg", "St. Petersburg", "Amsterdam", "Copenhagen"}, 1, "Địa lý", true));
            QuestionArray.add(new Question(4, "Vịnh nào là vịnh lớn nhất thế giới?", new String[]{"Vịnh Thái Lan", "Vịnh Mexico", "Vịnh Bengal", "Vịnh Ba Tư"}, 3, "Địa lý", true));
            QuestionArray.add(new Question(5, "Quốc gia nào là quốc gia có diện tích lớn nhất thế giới?", new String[]{"Trung Quốc", "Nga", "Mỹ", "Canada"}, 1, "Địa lý", true));
            QuestionArray.add(new Question(6, "Núi cao nhất châu Phi là gì?", new String[]{"Table Mountain", "Kilimanjaro", "Ras Dashen", "Simien Mountains"}, 2, "Địa lý", true));
            QuestionArray.add(new Question(7, "Dòng sông nào là dòng sông dài nhất thế giới?", new String[]{"Amazon", "Mississippi", "Nile", "Yangtze"}, 2, "Địa lý", true));
            QuestionArray.add(new Question(8, "Thành phố nào nằm ở cửa sông Amazon?", new String[]{"Manaus", "Belem", "Santarem", "Belo Horizonte"}, 0, "Địa lý", true));
            QuestionArray.add(new Question(9, "Quốc gia nào nằm ở cực Nam của châu Phi?", new String[]{"Botswana", "Swaziland", "Nam Phi", "Lesotho"}, 2, "Địa lý", true));
            QuestionArray.add(new Question(10, "Đảo nào là đảo lớn nhất thế giới?", new String[]{"Madagascar", "Borneo", "Greenland", "New Guinea"}, 2, "Địa lý", true));
        }
        else if (subjectID == 2 && isHard == 0)
        {
            QuestionArray.add(new Question(1, "5 + 3 bằng mấy?", new String[]{"7", "8", "9", "10"}, 1, "Toán học", false));
            QuestionArray.add(new Question(2, "Phép cộng 6 và 4 bằng mấy?", new String[]{"9", "10", "11", "12"}, 3, "Toán học", false));
            QuestionArray.add(new Question(3, "2 nhân 3 bằng mấy?", new String[]{"5", "6", "7", "8"}, 2, "Toán học", false));
            QuestionArray.add(new Question(4, "15 chia 3 bằng mấy?", new String[]{"3", "4", "5", "6"}, 0, "Toán học", false));
            QuestionArray.add(new Question(5, "Giá trị của pi là bao nhiêu?", new String[]{"3.14", "3.141", "3.1415", "3.14159"}, 2, "Toán học", false));
            QuestionArray.add(new Question(6, "Bảy trừ ba bằng mấy?", new String[]{"2", "3", "4", "5"}, 0, "Toán học", false));
            QuestionArray.add(new Question(7, "25 nhân 0 bằng mấy?", new String[]{"0", "5", "10", "25"}, 0, "Toán học", false));
            QuestionArray.add(new Question(8, "Bốn chia 2 bằng mấy?", new String[]{"1", "2", "3", "4"}, 1, "Toán học", false));
            QuestionArray.add(new Question(9, "Có bao nhiêu mũoi trong 100?", new String[]{"5", "10", "15", "20"}, 1, "Toán học", false));
            QuestionArray.add(new Question(10, "Bậc hai của 9 là bao nhiêu?", new String[]{"3", "6", "9", "12"}, 0, "Toán học", false));
        }
        else if (subjectID == 2 && isHard == 1)
        {
            QuestionArray.add(new Question(1, "Phương trình bậc hai có dạng là ax^2 + bx + c = 0. Công thức giải delta là gì?", new String[]{"b^2 - 4ac", "b^2 + 4ac", "b^2 / 4ac", "4ac - b^2"}, 0, "Toán học", true));
            QuestionArray.add(new Question(2, "Tích của hai số phức (a + bi) và (c + di) là gì?", new String[]{"(ac - bd) + (ad + bc)i", "(ac + bd) + (ad + bc)i", "(ac - bd) + (ad - bc)i", "(ac + bd) + (ad - bc)i"}, 0, "Toán học", true));
            QuestionArray.add(new Question(3, "Phép nhân ma trận A (kích thước m x n) và B (kích thước n x p) sẽ tạo ra ma trận nào?", new String[]{"Ma trận kích thước m x p", "Ma trận kích thước n x p", "Ma trận kích thước m x n", "Ma trận kích thước m x n x p"}, 0, "Toán học", true));
            QuestionArray.add(new Question(4, "Công thức nào dùng để tính giới hạn của một hàm số khi x tiến đến vô cùng?", new String[]{"lim (x → ∞) f(x) = L", "lim (x → 0) f(x) = L", "lim (x → a) f(x) = L", "lim (x → b) f(x) = L"}, 0, "Toán học", true));
            QuestionArray.add(new Question(5, "Công thức Euler e^(iπ) + 1 = 0 liên quan đến những số nào?", new String[]{"e, i, π, và 1", "e và i", "e và π", "i và 1"}, 0, "Toán học", true));
            QuestionArray.add(new Question(6, "Quy tắc nào được sử dụng để tính tích phân của một hàm liên tục trên một đoạn [a, b]?", new String[]{"Quy tắc hình thang", "Quy tắc Simpson", "Quy tắc cộng", "Quy tắc nhân"}, 0, "Toán học", true));
            QuestionArray.add(new Question(7, "Số Euler (e) được định nghĩa như thế nào?", new String[]{"e = lim (n → ∞) (1 + 1/n)^n", "e = lim (n → ∞) (1 - 1/n)^n", "e = lim (n → ∞) (1 + 1/n)", "e = lim (n → ∞) (1 - 1/n)"}, 0, "Toán học", true));
            QuestionArray.add(new Question(8, "Khái niệm 'vector riêng' và 'giá trị riêng' xuất hiện trong lĩnh vực nào của đại số tuyến tính?", new String[]{"Đại số tuyến tính", "Giải tích", "Hình học", "Toán ứng dụng"}, 0, "Toán học", true));
            QuestionArray.add(new Question(9, "Điều kiện nào sau đây đảm bảo một hàm số có đạo hàm tại mọi điểm trên miền xác định của nó?", new String[]{"Tồn tại giới hạn (lim) của hàm số", "Liên tục trên miền xác định", "Đồ thị hàm số là đường cong liên tục", "Tồn tại đạo hàm bậc 2"}, 1, "Toán học", true));
            QuestionArray.add(new Question(10, "Định lý Pythagoras liên quan đến những gì?", new String[]{"Tam giác vuông", "Đa giác lồi", "Hình cầu", "Hình hộp chữ nhật"}, 0, "Toán học", true));
        }
        else if (subjectID == 3 && isHard == 0)
        {
            QuestionArray.add(new Question(1, "Ai là người sáng lập ra Đế chế La Mã?", new String[]{"Julius Caesar", "Alexander the Great", "Constantine", "Romulus and Remus"}, 3, "Lịch sử", false));
            QuestionArray.add(new Question(2, "Sự kiện nào đánh dấu sự kết thúc Chiến tranh thế giới thứ hai?", new String[]{"Bom nguyên tử Hiroshima và Nagasaki", "Dự Đại hội Đảng Cộng sản Việt Nam lần thứ VII", "Gạt tên Lê Duẩn khỏi lịch sử Việt Nam", "Hồ Chí Minh trở thành Chủ tịch nước Việt Nam Dân chủ Cộng hòa"}, 0, "Lịch sử", false));
            QuestionArray.add(new Question(3, "Sự kiện nào gây ra Cuộc Cách mạng Công nghiệp?", new String[]{"Bảo tàng Louvre mở cửa", "Bắt đầu Chiến tranh thế giới thứ nhất", "Phát minh ra máy in", "Máy bơi lặn được chế tạo"}, 2, "Lịch sử", false));
            QuestionArray.add(new Question(4, "Ai là người lãnh đạo của Cuộc Cách mạng Xanh ở Nga?", new String[]{"Vladimir Putin", "Joseph Stalin", "Leon Trotsky", "Mikhail Gorbachev"}, 1, "Lịch sử", false));
            QuestionArray.add(new Question(5, "Ai là vị vua nổi tiếng của Ai Cập cổ đại xây dựng Đại Kim tự tháp?", new String[]{"Ramesses II", "Cleopatra", "Hatshepsut", "Khufu"}, 3, "Lịch sử", false));
            QuestionArray.add(new Question(6, "Cuộc Cách mạng Pháp diễn ra vào năm nào?", new String[]{"1789", "1689", "1889", "1785"}, 0, "Lịch sử", false));
            QuestionArray.add(new Question(7, "Ai là người sáng lập ra Đế chế Ottoman?", new String[]{"Suleiman the Magnificent", "Mehmed the Conqueror", "Osman I", "Murad I"}, 2, "Lịch sử", false));
            QuestionArray.add(new Question(8, "Ai là người lãnh đạo của Cuộc Cách mạng Màu Hồng ở Nga?", new String[]{"Mikhail Gorbachev", "Joseph Stalin", "Vladimir Lenin", "Boris Yeltsin"}, 0, "Lịch sử", false));
            QuestionArray.add(new Question(9, "Ai là người sáng lập ra Đế chế Maurya ở Ấn Độ cổ đại?", new String[]{"Chandragupta Maurya", "Ashoka the Great", "Harsha", "Chandra Gupta II"}, 0, "Lịch sử", false));
            QuestionArray.add(new Question(10, "Ai là Tổng thống thứ 16 của Hoa Kỳ và đã ký Hiệp ước Versailles?", new String[]{"Woodrow Wilson", "Franklin D. Roosevelt", "Herbert Hoover", "John F. Kennedy"}, 0, "Lịch sử", false));
        }
        else if (subjectID == 3 && isHard == 1)
        {
            QuestionArray.add(new Question(31, "Cuộc Cách mạng Nga năm 1917 được thực hiện dưới sự lãnh đạo của ai?", new String[]{"Vladimir Lenin", "Joseph Stalin", "Leon Trotsky", "Mikhail Gorbachev"}, 0, "Lịch sử", true));
            QuestionArray.add(new Question(32, "Thành phố nào đã trở thành thủ đô của Đức sau thảm họa Chiến tranh thế giới thứ hai?", new String[]{"Munich", "Berlin", "Hamburg", "Dresden"}, 1, "Lịch sử", true));
            QuestionArray.add(new Question(33, "Ai là Tổng thống Hoa Kỳ đầu tiên?", new String[]{"George Washington", "Thomas Jefferson", "John Adams", "James Madison"}, 0, "Lịch sử", true));
            QuestionArray.add(new Question(34, "Dòng sông nào chứng kiến cuộc đổ bộ Normandy vào ngày D-Day trong Chiến tranh thế giới thứ hai?", new String[]{"Sông Seine", "Sông Thames", "Sông Rhine", "Sông Orne"}, 2, "Lịch sử", true));
            QuestionArray.add(new Question(35, "Ai là người sáng lập ra Đế chế Mongol lớn nhất trong lịch sử?", new String[]{"Genghis Khan", "Kublai Khan", "Ogedei Khan", "Timur"}, 0, "Lịch sử", true));
            QuestionArray.add(new Question(36, "Ngày 14 tháng 7 được biết đến với tên gọi nào trong lịch sử Pháp?", new String[]{"Ngày Bastille", "Ngày Quốc khánh", "Ngày Độc lập", "Ngày Quốc tế Lao động"}, 0, "Lịch sử", true));
            QuestionArray.add(new Question(37, "Trận chiến nào kết thúc với chiến thắng quyết định của Liên Xô trước quân Đức Quốc xã trong Chiến tranh thế giới thứ hai?", new String[]{"Trận Stalingrad", "Trận Kursk", "Trận Leningrad", "Trận Moscow"}, 0, "Lịch sử", true));
            QuestionArray.add(new Question(38, "Ai là vị vua nổi tiếng của Ai Cập xây dựng đền thờ Karnak và Luxor?", new String[]{"Tutankhamun", "Ramesses II", "Hatshepsut", "Akhenaten"}, 1, "Lịch sử", true));
            QuestionArray.add(new Question(39, "Vị vua nào được biết đến với biệt danh 'William the Conqueror' và lãnh đạo của Trận chiến Hastings năm 1066?", new String[]{"Harold Godwinson", "Edward the Confessor", "Richard the Lionheart", "William I of England"}, 3, "Lịch sử", true));
            QuestionArray.add(new Question(40, "Dự Đại hội Đảng Cộng sản Việt Nam lần thứ I diễn ra vào năm nào?", new String[]{"1930", "1945", "1951", "1960"}, 0, "Lịch sử", true));
        }
        else if (subjectID == 4 && isHard == 0)
        {
            QuestionArray.add(new Question(1, "Nguyên tố nào là nguyên tố đơn duy nhất trong bảng tuần hoàn?", new String[]{"Hydro", "Oxygen", "Helium", "Gold"}, 2, "Hóa học", false));
            QuestionArray.add(new Question(2, "Loại phân tử nào chiếm phần lớn trong không khí?", new String[]{"Oxygen", "Carbon dioxide", "Nitrogen", "Hydrogen"}, 2, "Hóa học", false));
            QuestionArray.add(new Question(3, "Nguyên tố nào làm cho lá cây có màu xanh?", new String[]{"Chlorine", "Carbon", "Oxygen", "Nitrogen"}, 0, "Hóa học", false));
            QuestionArray.add(new Question(4, "Công thức hóa học của nước là gì?", new String[]{"CO2", "H2O", "O2", "C6H12O6"}, 1, "Hóa học", false));
            QuestionArray.add(new Question(5, "Nguyên tố nào chiếm phần lớn trong cơ thể con người?", new String[]{"Calcium", "Iron", "Oxygen", "Carbon"}, 2, "Hóa học", false));
            QuestionArray.add(new Question(6, "Loại phản ứng hóa học nào là quá trình cháy?", new String[]{"Phản ứng trùng hợp", "Phản ứng thế", "Phản ứng oxi hóa khử", "Phản ứng trao đổi"}, 2, "Hóa học", true));
            QuestionArray.add(new Question(7, "Nguyên tố nào tạo nên hơi nước?", new String[]{"Hydrogen", "Oxygen", "Nitrogen", "Sulfur"}, 1, "Hóa học", false));
            QuestionArray.add(new Question(8, "Công thức hóa học của khí methane là gì?", new String[]{"CH4", "CO2", "H2O", "O2"}, 0, "Hóa học", false));
            QuestionArray.add(new Question(9, "Loại phản ứng hóa học nào tạo ra nước?", new String[]{"Phản ứng trùng hợp", "Phản ứng thế", "Phản ứng oxi hóa khử", "Phản ứng trao đổi"}, 0, "Hóa học", false));
            QuestionArray.add(new Question(10, "Nguyên tố nào tạo nên đèn neon phát sáng?", new String[]{"Neon", "Argon", "Krypton", "Xenon"}, 0, "Hóa học", false));
        }
        else if (subjectID == 4 && isHard == 1)
        {
            QuestionArray.add(new Question(1, "Phản ứng hóa học của quá trình điện phân nước là gì?", new String[]{"2H2O → 2H2 + O2", "4H2O → 2H2 + O2", "H2O → H2 + O2", "2H2O → H2 + 2O2"}, 0, "Hóa học", true));
            QuestionArray.add(new Question(2, "Loại hợp chất nào có liên kết ion?", new String[]{"Hợp chất ion", "Hợp chất cộng hóa trị", "Hợp chất phân cực", "Hợp chất cặp electron"}, 0, "Hóa học", true));
            QuestionArray.add(new Question(3, "Nguyên tố nào có số nguyên tử đặc trưng là Avogadro?", new String[]{"Carbon", "Oxygen", "Hydrogen", "Molebdnum"}, 2, "Hóa học", true));
            QuestionArray.add(new Question(4, "Quy tắc Hund đề cập đến gì trong nguyên tử?", new String[]{"Phân bố electron vào các orbital theo chiều kim đồng hồ", "Không có hai electron trong một orbital có spin giống nhau", "Không có hai electron nào có cùng năng lượng", "Sự biến mất của electron"}, 1, "Hóa học", true));
            QuestionArray.add(new Question(5, "Phản ứng hóa học của quá trình sục khí CO2 vào nước là gì?", new String[]{"CO2 + H2O → H2CO3", "CO2 + H2O → H2O2 + CO", "CO2 + H2O → CO + H2O2", "CO2 + H2O → H2 + CO + O2"}, 0, "Hóa học", true));
            QuestionArray.add(new Question(6, "Nguyên tắc bảo toàn điện tích trong phản ứng hóa học là gì?", new String[]{"Số nguyên tử nguyên tố còn lại bằng số nguyên tử nguyên tố mất điện", "Số nguyên tử nguyên tố lẻ", "Số nguyên tử nguyên tố chẵn", "Số nguyên tử nguyên tố mất điện nhỏ hơn số nguyên tử nguyên tố còn lại"}, 0, "Hóa học", true));
            QuestionArray.add(new Question(7, "Tác động của chất xúc tác trong phản ứng hóa học là gì?", new String[]{"Tăng tốc phản ứng mà không bị tiêu hao", "Giảm tốc độ phản ứng", "Không ảnh hưởng đến tốc độ phản ứng", "Tăng tốc phản ứng nhưng tiêu hao chất xúc tác"}, 0, "Hóa học", true));
            QuestionArray.add(new Question(8, "Nguyên tắc không gian trong lý thuyết lượng tử có nghĩa là gì?", new String[]{"Không có hai electron nào trong một orbital có cùng năng lượng", "Sự không chắn của electron", "Không có hai electron trong một orbital có spin giống nhau", "Không gian quanh nhân tố có tối đa hai electron"}, 2, "Hóa học", true));
            QuestionArray.add(new Question(9, "Nguyên tố nào có tính chất từ tính mạnh nhất?", new String[]{"Fe", "Co", "Ni", "Mn"}, 0, "Hóa học", true));
            QuestionArray.add(new Question(10, "Đơn vị tính của khối lượng mol là gì?", new String[]{"gram", "kilogram", "gram/mol", "kilogram/mol"}, 2, "Hóa học", true));
        }
        else if (subjectID == 5 && isHard == 0)
        {
            QuestionArray.add(new Question(1, "Đơn vị đo nhiệt độ trong hệ thống đo lường quốc tế là gì?", new String[]{"Độ Celsuis", "Độ Fahrenheit", "Kelvin", "Độ Rankine"}, 2, "Vật lý", false));
            QuestionArray.add(new Question(2, "Trái đất quay quanh trục của mình mất bao lâu để hoàn thành một vòng quay đầy đủ?", new String[]{"24 giờ", "365 ngày", "1 tháng", "12 giờ"}, 0, "Vật lý", false));
            QuestionArray.add(new Question(3, "Đơn vị đo công trong hệ thống quốc tế là gì?", new String[]{"Joule", "Calorie", "Newton", "Watt"}, 0, "Vật lý", false));
            QuestionArray.add(new Question(4, "Tia cực tím có bước sóng nằm trong khoảng màu nào của quang phổ?", new String[]{"Violet", "Red", "Green", "Blue"}, 0, "Vật lý", false));
            QuestionArray.add(new Question(5, "Ánh sáng trắng được tạo ra từ sự pha trộn của bao nhiêu màu cơ bản?", new String[]{"5", "7", "3", "6"}, 1, "Vật lý", false));
            QuestionArray.add(new Question(6, "Đơn vị đo áp suất trong hệ thống đo lường quốc tế là gì?", new String[]{"Pascal", "Newton", "Joule", "Watt"}, 0, "Vật lý", false));
            QuestionArray.add(new Question(7, "Vật thể nào rơi xuống đất nhanh hơn trong hỗn hợp gió và không khí?", new String[]{"Vật thể nặng", "Vật thể nhẹ", "Cả hai rơi nhanh như nhau", "Phụ thuộc vào hình dáng của vật thể"}, 2, "Vật lý", false));
            QuestionArray.add(new Question(8, "Khối lượng của một vật thể là gì?", new String[]{"Lực hấp dẫn mà vật thể tạo ra", "Số chất liệu cấu tạo nên vật thể", "Sức đàn hồi của vật thể", "Lượng vật chất trong vật thể"}, 3, "Vật lý", false));
            QuestionArray.add(new Question(9, "Những hạt nhỏ nhất tạo nên nguyên tử là gì?", new String[]{"Proton", "Electron", "Neutron", "Quark"}, 3, "Vật lý", false));
            QuestionArray.add(new Question(10, "Lực nào giữ cho các hành tinh xoay quanh Mặt Trời?", new String[]{"Lực hấp dẫn", "Lực điện", "Lực từ", "Lực hạt nhân"}, 0, "Vật lý", false));
        }
        else if (subjectID == 5 && isHard == 1)
        {
            QuestionArray.add(new Question(11, "Quả cầu kim loại mắc kẹt trong một tụ điện chứa điện tích dương. Sự cân bằng giữa lực đàn hồi và lực điện động là hiệu ứng của định luật nào?", new String[]{"Định luật Coulomb", "Định luật Gauss", "Định luật Ohm", "Định luật Ampere"}, 1, "Vật lý", true));
            QuestionArray.add(new Question(12, "Loại tia phóng xạ nào có thể xâm nhập vào vật chất, gây ion hóa và được sử dụng trong y tế?", new String[]{"Tia alpha", "Tia beta", "Tia gamma", "Tia X"}, 2, "Vật lý", true));
            QuestionArray.add(new Question(13, "Trong vật lý hạ nguyên tử, quy luật nào đặt ra nguyên tắc không thể xác định chính xác vị trí và đồng thời động lượng của một hạt nhỏ?", new String[]{"Nguyên lý bất định Heisenberg", "Nguyên lý Pauli", "Nguyên lý de Broglie", "Nguyên lý Schrödinger"}, 0, "Vật lý", true));
            QuestionArray.add(new Question(14, "Quy luật nào mô tả rằng năng lượng của một hệ thống luôn giữ nguyên trạng thái của nó trừ khi có tác động từ bên ngoại?", new String[]{"Định luật biến đổi năng lượng", "Định luật bảo toàn năng lượng", "Định luật bảo toàn động lượng", "Định luật bảo toàn điện tích"}, 1, "Vật lý", true));
            QuestionArray.add(new Question(15, "Hiện tượng nào diễn ra khi ánh sáng chuyển từ môi trường có chỉ số khúc xạ thấp sang môi trường có chỉ số khúc xạ cao?", new String[]{"Phản xạ toàn phần", "Phản xạ ánh sáng", "Phản xạ giao thoa", "Phản xạ đàn hồi"}, 0, "Vật lý", true));
            QuestionArray.add(new Question(16, "Sự tán xạ Compton liên quan đến quá trình gì?", new String[]{"Tán xạ ánh sáng", "Tán xạ hạt nhân", "Tán xạ electron", "Tán xạ nhiệt độ"}, 2, "Vật lý", true));
            QuestionArray.add(new Question(17, "Hiệu ứng Zeeman liên quan đến sự thay đổi gì khi hạt nhân tự quay?", new String[]{"Tần suất sóng", "Sức cảm ứng từ", "Gia tốc", "Chuyển động quay"}, 1, "Vật lý", true));
            QuestionArray.add(new Question(18, "Tốc độ âm thanh nhanh nhất trong không gian nào?", new String[]{"Không gian rỗng", "Không khí", "Nước", "Kim loại"}, 0, "Vật lý", true));
            QuestionArray.add(new Question(19, "Hạt nào làm thành chủ thể cơ bản của năng lượng hạt nhân trong sao neutron?", new String[]{"Proton", "Electron", "Neutron", "Quark"}, 2, "Vật lý", true));
            QuestionArray.add(new Question(20, "Trong cơ học lượng tử, quy luật nào mô tả sự chuyển động của các hạt nhỏ như electron?", new String[]{"Nguyên lý Schrödinger", "Nguyên lý Einstein", "Nguyên lý Heisenberg", "Nguyên lý Pauli"}, 0, "Vật lý", true));
        }
        else if (subjectID == 6 && isHard == 0)
        {
            QuestionArray.add(new Question(1, "Loại tế bào nào không có hạt nhân?", new String[]{"Tế bào sợi cơ", "Tế bào thần kinh", "Tế bào máu", "Tế bào vi khuẩn"}, 3, "Sinh học", false));
            QuestionArray.add(new Question(2, "Cơ quan nào trong hệ tiêu hóa sản xuất nước bã nhờn để giúp quá trình tiêu hóa thức ăn?", new String[]{"Dạ dày", "Ruột non", "Gan", "Tuỷ sống"}, 0, "Sinh học", false));
            QuestionArray.add(new Question(3, "Quá trình nào chịu ảnh hưởng trực tiếp của quả thận?", new String[]{"Quá trình tiêu hóa", "Quá trình thở", "Quá trình lọc máu", "Quá trình trao đổi chất"}, 2, "Sinh học", false));
            QuestionArray.add(new Question(4, "Bộ phận nào của tế bào chịu trách nhiệm cho việc sản xuất năng lượng?", new String[]{"Lysosome", "Mitochondria", "Endoplasmic reticulum", "Nucleus"}, 1, "Sinh học", false));
            QuestionArray.add(new Question(5, "Chất nào có nhiệm vụ chủ yếu là lưu trữ thông tin gen di truyền?", new String[]{"Protein", "Carbohydrate", "Lipid", "DNA"}, 3, "Sinh học", false));
            QuestionArray.add(new Question(6, "Sinh vật nào thuộc nguyên giới Vi khuẩn?", new String[]{"Mushroom", "Amoeba", "E. coli", "Frog"}, 2, "Sinh học", false));
            QuestionArray.add(new Question(7, "Quá trình quang hợp xảy ra ở bộ phận nào của tế bào cây?", new String[]{"Mitochondria", "Chloroplast", "Nucleus", "Endoplasmic reticulum"}, 1, "Sinh học", false));
            QuestionArray.add(new Question(8, "Sinh vật nào là nguyên ngạch của tất cả các loài động vật?", new String[]{"Bacteria", "Archaea", "Protista", "Eukaryotes"}, 3, "Sinh học", false));
            QuestionArray.add(new Question(9, "Tế bào nào thực hiện chức năng lọc máu và sản xuất nước tiểu?", new String[]{"Tế bào sợi cơ", "Tế bào thần kinh", "Tế bào thận", "Tế bào tâm thần"}, 2, "Sinh học", false));
            QuestionArray.add(new Question(10, "Chất nào đóng vai trò quan trọng trong việc truyền đạt thông tin gen từ DNA đến ribosome để sản xuất protein?", new String[]{"RNA", "ATP", "NADH", "mRNA"}, 0, "Sinh học", false));
        }
        else if (subjectID == 6 && isHard == 1)
        {
            QuestionArray.add(new Question(11, "Quá trình nào tạo ra mRNA từ DNA?", new String[]{"Dịch mã", "Phân tử hoá", "Chuyển mã", "Tạo mã"}, 0, "Sinh học", true));
            QuestionArray.add(new Question(12, "Loại RNA nào chịu trách nhiệm đưa axit amin đến ribosome để xây dựng protein?", new String[]{"rRNA", "tRNA", "mRNA", "snRNA"}, 1, "Sinh học", true));
            QuestionArray.add(new Question(13, "Quá trình nào xảy ra ở màng tế bào để tạo ra ATP?", new String[]{"Quảng hợp ảnh sáng", "Nhuộm màu", "Sự trao đổi chất", "Hoạt động proton"}, 3, "Sinh học", true));
            QuestionArray.add(new Question(14, "Môi trường nào có thể hỗ trợ sự sống của vi khuẩn Methanogens?", new String[]{"Môi trường oxy hóa", "Môi trường acid", "Môi trường nhiệt đới", "Môi trường chất béo"}, 2, "Sinh học", true));
            QuestionArray.add(new Question(15, "Phenotype của một sinh vật được xác định bởi những gì?", new String[]{"Genotype", "Môi trường", "Điều kiện thời tiết", "Lịch sử tiến hóa"}, 1, "Sinh học", true));
            QuestionArray.add(new Question(16, "Cơ chế nào giúp tạo ra sự đa dạng genetict trong quần thể?", new String[]{"Hội tụ", "Đạo hóa", "Đột biến", "Giảm sự đa dạng"}, 2, "Sinh học", true));
            QuestionArray.add(new Question(17, "Quá trình nào xảy ra ở màng tế bào để tạo ra ATP?", new String[]{"Quảng hợp ảnh sáng", "Nhuộm màu", "Sự trao đổi chất", "Hoạt động proton"}, 3, "Sinh học", true));
            QuestionArray.add(new Question(18, "Chất gì xác định màu sắc của lá cây trong quá trình quang hợp?", new String[]{"Chlorophyll", "Xanthophyll", "Carotenoid", "Anthocyanin"}, 0, "Sinh học", true));
            QuestionArray.add(new Question(19, "Loại tế bào nào là trung tâm điều khiển của hệ thống miễn dịch?", new String[]{"Tế bào B", "Tế bào T", "Tế bào sợi cơ", "Tế bào thần kinh"}, 1, "Sinh học", true));
            QuestionArray.add(new Question(20, "Sự phát triển của một sinh vật từ trạng thái nhỏ đến trạng thái lớn được gọi là gì?", new String[]{"Phôi hóa", "Đào tạo", "Phát triển", "Quá trình học"}, 2, "Sinh học", true));
        }
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        questionText = findViewById(R.id.question);
        ansText1 = findViewById(R.id.answer_1);
        ansText2 = findViewById(R.id.answer_2);
        ansText3 = findViewById(R.id.answer_3);
        ansText4 = findViewById(R.id.answer_4);
        Traloi = findViewById(R.id.traloi);
        questionText.setText(QuestionArray.get(index).getQuestionText());
        ansText1.setText(QuestionArray.get(index).getAnswers()[0]);
        ansText2.setText(QuestionArray.get(index).getAnswers()[1]);
        ansText3.setText(QuestionArray.get(index).getAnswers()[2]);
        ansText4.setText(QuestionArray.get(index).getAnswers()[3]);
        Traloi.setOnClickListener(view -> {
            int ansID = radioGroup.getCheckedRadioButtonId();
            if (ansID == R.id.answer_1 && QuestionArray.get(index).getCorrectAnswerIndex() == 0) {
                score = score + 1 + isHard;
                index = index + 1;
            } else if (ansID == R.id.answer_2 && QuestionArray.get(index).getCorrectAnswerIndex() == 1) {
                score = score + 1 + isHard;
                index = index + 1;
            } else if (ansID == R.id.answer_3 && QuestionArray.get(index).getCorrectAnswerIndex() == 2) {
                score = score + 1 + isHard;
                index = index + 1;
            } else if (ansID == R.id.answer_4 && QuestionArray.get(index).getCorrectAnswerIndex() == 3) {
                score = score + 1 + isHard;
                index = index + 1;
            } else check = false;
            if (check == false || index == 10)
            {
                intent2 = new Intent(MainActivity3.this, MainActivity4.class);
                intent2.putExtra("score", score);
                intent2.putExtra("rightAns", index);
                intent2.putExtra("SubjectID", subjectID);
                intent2.putExtra("hardMode", isHard);
                startActivity(intent2);
            }
            else {
                radioGroup.clearCheck();
                questionText.setText(QuestionArray.get(index).getQuestionText());
                ansText1.setText(QuestionArray.get(index).getAnswers()[0]);
                ansText2.setText(QuestionArray.get(index).getAnswers()[1]);
                ansText3.setText(QuestionArray.get(index).getAnswers()[2]);
                ansText4.setText(QuestionArray.get(index).getAnswers()[3]);
            }
        });
    }
}