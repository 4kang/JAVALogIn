package schoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SchooController {
	/**
	 * トップページのリクエスト
	 * @return index.htmlのパス
	 */
	//@マークはアノテーションという
	@GetMapping("/") //URLの末尾
	public String index() {
		// index.htmlのパスを返却
		// indexという文字列を返却
		return "index"; //この文字列はファイル名を指定している
	}
	/**
	 * ログイン処理リクエスト
	 * @param loginId ログイン
	 * @param loginPassword パスワード
	 * @return ログイン結果画面のパス
	 */
	@PostMapping("login")
	public String login(@RequestParam("loginId") String loginId,
			            @RequestParam("loginPassword") String loginPassword) {
		//ログインチェック
		if("schoo".equals(loginId) && "pass".equals(loginPassword)) {
			return "login-ok"; //ログイン成功
		} else {
			return "login-ng"; //ログイン失敗
		}
	}
	
}
