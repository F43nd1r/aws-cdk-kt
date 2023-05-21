package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun requestInspectionProperty(initializer: CfnWebACL.RequestInspectionProperty.Builder.() -> Unit
    = {}): CfnWebACL.RequestInspectionProperty =
    CfnWebACL.RequestInspectionProperty.builder().apply(initializer).build()
