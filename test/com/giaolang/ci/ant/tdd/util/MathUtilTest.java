package com.giaolang.ci.ant.tdd.util;

import static com.toilabao.ci.ant.util.MathUtil.*;
//chỉ có từ JDK 5, chỉ dành cho static. Khi dùng thì mọi hàm trong class này khi gọi sẽ ko cần 
//tên class. vì gọi như C, vì hiểu ngầm đã chấm rồi
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author giao-lang | fb/giao.lang.bis version 20.1115
 */
public class MathUtilTest {
    //class nay là class xài bộ thư viện JUnit dùng để test code
    // theo dạng xanh - đỏ, thay vì nhìn bằng mắt như bên main() sout()
    //2 file .jar đã được add vào project này, và ta thoải mái xài các hàm của
    // nó
    // trong các hàm của thư viện này có n hàm đặc biệt đều có tên xuất phát là
    // assertX(expected và actual đưa vào)
    //nếu có thấy expected honng có bằng actual, nó thảy ra màu đỏ
    // bằng thì ra màu xanh
    // tất cả xanh --> Xanh, một cái đỏ thì là đỏ
    //ĐẢM BẢO ĐÚNG TOÀN BỘ CASE
    //Nâng cao: dùng tham số hóa tập data cần test. TBA ...
    @Test
    public void getFactorial_ReturnsWell_IfValidArgument() {
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(120, getFactorial(5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument() {
        getFactorial(-5);        
    }
}
