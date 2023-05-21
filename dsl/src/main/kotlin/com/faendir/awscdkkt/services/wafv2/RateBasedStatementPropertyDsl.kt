package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun rateBasedStatementProperty(initializer: CfnWebACL.RateBasedStatementProperty.Builder.() -> Unit
    = {}): CfnWebACL.RateBasedStatementProperty =
    CfnWebACL.RateBasedStatementProperty.builder().apply(initializer).build()
