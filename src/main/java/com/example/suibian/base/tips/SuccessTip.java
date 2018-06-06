package com.example.suibian.base.tips;

import com.example.suibian.enums.TipEnum;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 返回给前台的成功提示
 * @author Lyz
 * @time 2018-6-6 11:35
 */
public class SuccessTip<T> extends Tip {
	
	public SuccessTip(){
		super.code = TipEnum.SUCCESS.code();
		super.message = TipEnum.SUCCESS.msg();
		super.data = null;
	}

	public SuccessTip(T data){
		super.code = TipEnum.SUCCESS.code();
		super.message = TipEnum.SUCCESS.msg();
		super.data = data;
	}

}
