package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun sizeConstraintStatementProperty(initializer: CfnWebACL.SizeConstraintStatementProperty.Builder.() -> Unit
    = {}): CfnWebACL.SizeConstraintStatementProperty =
    CfnWebACL.SizeConstraintStatementProperty.builder().apply(initializer).build()
