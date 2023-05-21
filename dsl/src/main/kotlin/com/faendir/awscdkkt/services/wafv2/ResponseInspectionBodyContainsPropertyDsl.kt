package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun responseInspectionBodyContainsProperty(initializer: CfnWebACL.ResponseInspectionBodyContainsProperty.Builder.() -> Unit
    = {}): CfnWebACL.ResponseInspectionBodyContainsProperty =
    CfnWebACL.ResponseInspectionBodyContainsProperty.builder().apply(initializer).build()
