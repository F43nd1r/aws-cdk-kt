package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun orStatementProperty(initializer: CfnWebACL.OrStatementProperty.Builder.() -> Unit = {}):
    CfnWebACL.OrStatementProperty =
    CfnWebACL.OrStatementProperty.builder().apply(initializer).build()
