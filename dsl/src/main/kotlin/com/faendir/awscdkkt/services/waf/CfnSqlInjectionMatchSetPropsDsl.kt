package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnSqlInjectionMatchSetProps

@Generated
public fun cfnSqlInjectionMatchSetProps(initializer: CfnSqlInjectionMatchSetProps.Builder.() -> Unit
    = {}): CfnSqlInjectionMatchSetProps =
    CfnSqlInjectionMatchSetProps.builder().apply(initializer).build()
