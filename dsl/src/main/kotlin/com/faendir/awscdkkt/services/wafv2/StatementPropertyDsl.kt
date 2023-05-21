package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun statementProperty(initializer: CfnWebACL.StatementProperty.Builder.() -> Unit = {}):
    CfnWebACL.StatementProperty = CfnWebACL.StatementProperty.builder().apply(initializer).build()
