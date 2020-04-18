package com.example.effectivejava.item34;

import static com.example.effectivejava.item34.PayrollDay.PayType.*;

/**
 *
 * @author 93Hong on 2020-04-18
 *
 */
public enum PayrollDay {
	MONDAY(WEEKDAY),
	TUESDAY(WEEKDAY),
	WEDNESDAY(WEEKDAY),
	THURSDAY(WEEKDAY),
	FRIDAY(WEEKDAY),
	SATURDAY(WEEKEND),
	SUNDAY(WEEKEND);

	private final PayType payType;

	PayrollDay(PayType payType) {
		this.payType = payType;
	}

	int pay(int minutesWorked, int payRate) {
		return payType.pay(minutesWorked, payRate);
	}

	enum PayType {
		WEEKDAY {
			int overtimePay(int minsWorked, int payRate) {
				return minsWorked <= MINS_PER_SHIFT ? 0 :
					(minsWorked - MINS_PER_SHIFT) * payRate / 2;
			}
		},
		WEEKEND {
			int overtimePay(int minsWorked, int payRate) {
				return minsWorked * payRate / 2;
			}
		};

		abstract int overtimePay(int minsWorked, int payRate);

		private static final int MINS_PER_SHIFT = 8 * 60;

		int pay(int minsWorked, int payRate) {
			int basePay = minsWorked * payRate;
			return basePay + overtimePay(minsWorked, payRate);
		}
	}
}
