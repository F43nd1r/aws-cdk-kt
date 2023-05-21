package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun responseInspectionJsonProperty(initializer: CfnWebACL.ResponseInspectionJsonProperty.Builder.() -> Unit
    = {}): CfnWebACL.ResponseInspectionJsonProperty =
    CfnWebACL.ResponseInspectionJsonProperty.builder().apply(initializer).build()
