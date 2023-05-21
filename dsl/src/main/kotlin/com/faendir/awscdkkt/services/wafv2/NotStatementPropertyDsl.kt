package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun notStatementProperty(initializer: CfnWebACL.NotStatementProperty.Builder.() -> Unit =
    {}): CfnWebACL.NotStatementProperty =
    CfnWebACL.NotStatementProperty.builder().apply(initializer).build()
