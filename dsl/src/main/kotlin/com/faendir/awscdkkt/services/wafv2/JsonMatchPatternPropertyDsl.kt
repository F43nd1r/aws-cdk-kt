package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun jsonMatchPatternProperty(initializer: CfnWebACL.JsonMatchPatternProperty.Builder.() -> Unit
    = {}): CfnWebACL.JsonMatchPatternProperty =
    CfnWebACL.JsonMatchPatternProperty.builder().apply(initializer).build()
