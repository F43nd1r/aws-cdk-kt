package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun byteMatchStatementProperty(initializer: CfnWebACL.ByteMatchStatementProperty.Builder.() -> Unit
    = {}): CfnWebACL.ByteMatchStatementProperty =
    CfnWebACL.ByteMatchStatementProperty.builder().apply(initializer).build()
