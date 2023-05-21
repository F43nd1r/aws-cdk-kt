package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun blockActionProperty(initializer: CfnWebACL.BlockActionProperty.Builder.() -> Unit = {}):
    CfnWebACL.BlockActionProperty =
    CfnWebACL.BlockActionProperty.builder().apply(initializer).build()
