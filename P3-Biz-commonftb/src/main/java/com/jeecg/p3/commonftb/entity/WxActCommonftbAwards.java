package com.jeecg.p3.commonftb.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

import com.jeecg.p3.commonftb.annotation.Excel;

/**
 * 描述：</b>WxActCommonsjAwards:领取奖品记录表<br>
 * @author pituo
 * @since：2015年11月30日 15时51分47秒 星期一 
 * @version:1.0
 */
public class WxActCommonftbAwards implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	@Excel(exportName="openid", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="昵称", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="昵称", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="手机号", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="详细地址", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	@Excel(exportName="卡券id", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	/**
	 *卡券密码
	 */
	@Excel(exportName="卡券密码", exportConvertSign = 0, exportFieldWidth = 30, importConvertSign = 0)
	private String cardPsd;
		return couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public Date getCreateTime() {
	public String getCardPsd() {
		return cardPsd;
	}
	public void setCardPsd(String cardPsd) {
		this.cardPsd = cardPsd;
	}
	
}
