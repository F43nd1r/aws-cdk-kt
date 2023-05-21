package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnRuleProps

@Generated
public fun cfnRuleProps(initializer: CfnRuleProps.Builder.() -> Unit = {}): CfnRuleProps =
    CfnRuleProps.builder().apply(initializer).build()
