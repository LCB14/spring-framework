package com.lcb.circle;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lichangbao
 * @since 2023/10/17 18:38
 */
@Service
public class CircleB {
	@Resource
	private CircleA circleA;

	@Override
	public String toString() {
		return "CircleB{" +
				"circleA=" + circleA +
				'}';
	}
}
