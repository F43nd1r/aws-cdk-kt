package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun buildRateBasedStatementProperty(initializer: @AwsCdkDsl
    CfnWebACL.RateBasedStatementProperty.Builder.() -> Unit = {}):
    CfnWebACL.RateBasedStatementProperty =
    CfnWebACL.RateBasedStatementProperty.Builder().apply(initializer).build()
