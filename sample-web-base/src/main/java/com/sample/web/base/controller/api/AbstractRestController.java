package com.sample.web.base.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sample.common.FunctionNameAware;
import com.sample.web.base.controller.BaseController;

import lombok.extern.slf4j.Slf4j;

/**
 * 基底APIコントローラー
 */
@ResponseStatus(HttpStatus.OK)
@Slf4j
public abstract class AbstractRestController extends BaseController implements FunctionNameAware {

}
