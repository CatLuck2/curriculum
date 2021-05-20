import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * サーブレット
 * HTMLから情報を受け取り、表示させる処理
 *
 * 問①・②の回答をお願いします。
 *
 */
/**
 * 「処理の流れ」
 * select.html
 * 1：<form>で月（<select><option value="..">）を選択
 * 2：送信（<input>）をクリック
 * web.xml
 * 3：SecretServlet.javaに紐づくurl-patternでURLを生成
 * 4：URL（http://localhost:8080/4-2/url-pattern）をサーバーにリクエスト
 * 5：サーバーでSelectServlet.javaが実行される
 * SelectServlet.java
 * 6：選択した月を、GET通信 - request.getParameter(引数)で文字列で取得
 * 		引数には、select.html - <select>（月の選択肢を持つタグ）のname属性
 * 7：月の出力結果をクライアント（Webブラウザ）に返す
 * 
 */
public class SelectServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        // 問① select.htmlから渡された値を受け取るために下記を修正しましょう。
        String value = request.getParameter("month");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        // 問② エビデンスと同じ表示になるように修正しましょう。
        out.println("今は" + value + "月です。");
    }
}