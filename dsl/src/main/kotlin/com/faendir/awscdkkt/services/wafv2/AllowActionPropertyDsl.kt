package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun allowActionProperty(initializer: CfnWebACL.AllowActionProperty.Builder.() -> Unit = {}):
    CfnWebACL.AllowActionProperty =
    CfnWebACL.AllowActionProperty.builder().apply(initializer).build()
