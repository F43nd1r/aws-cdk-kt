package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun customResponseProperty(initializer: CfnWebACL.CustomResponseProperty.Builder.() -> Unit =
    {}): CfnWebACL.CustomResponseProperty =
    CfnWebACL.CustomResponseProperty.builder().apply(initializer).build()
