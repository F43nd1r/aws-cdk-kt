package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun headerMatchPatternProperty(initializer: CfnWebACL.HeaderMatchPatternProperty.Builder.() -> Unit
    = {}): CfnWebACL.HeaderMatchPatternProperty =
    CfnWebACL.HeaderMatchPatternProperty.builder().apply(initializer).build()
