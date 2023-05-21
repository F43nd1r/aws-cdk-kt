package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun responseInspectionHeaderProperty(initializer: CfnWebACL.ResponseInspectionHeaderProperty.Builder.() -> Unit
    = {}): CfnWebACL.ResponseInspectionHeaderProperty =
    CfnWebACL.ResponseInspectionHeaderProperty.builder().apply(initializer).build()
