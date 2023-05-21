package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun defaultActionProperty(initializer: CfnWebACL.DefaultActionProperty.Builder.() -> Unit =
    {}): CfnWebACL.DefaultActionProperty =
    CfnWebACL.DefaultActionProperty.builder().apply(initializer).build()
