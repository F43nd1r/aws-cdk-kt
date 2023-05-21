package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun responseInspectionProperty(initializer: CfnWebACL.ResponseInspectionProperty.Builder.() -> Unit
    = {}): CfnWebACL.ResponseInspectionProperty =
    CfnWebACL.ResponseInspectionProperty.builder().apply(initializer).build()
