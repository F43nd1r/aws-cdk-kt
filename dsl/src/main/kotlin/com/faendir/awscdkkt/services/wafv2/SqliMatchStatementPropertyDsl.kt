package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun sqliMatchStatementProperty(initializer: CfnWebACL.SqliMatchStatementProperty.Builder.() -> Unit
    = {}): CfnWebACL.SqliMatchStatementProperty =
    CfnWebACL.SqliMatchStatementProperty.builder().apply(initializer).build()
