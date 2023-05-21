package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun regexMatchStatementProperty(initializer: CfnWebACL.RegexMatchStatementProperty.Builder.() -> Unit
    = {}): CfnWebACL.RegexMatchStatementProperty =
    CfnWebACL.RegexMatchStatementProperty.builder().apply(initializer).build()
