@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

public
    fun responseInspectionHeaderProperty(initializer: CfnWebACL.ResponseInspectionHeaderProperty.Builder.() -> Unit):
    CfnWebACL.ResponseInspectionHeaderProperty =
    CfnWebACL.ResponseInspectionHeaderProperty.builder().apply(initializer).build()
