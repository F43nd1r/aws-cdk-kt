package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun singleHeaderProperty(initializer: CfnWebACL.SingleHeaderProperty.Builder.() -> Unit =
    {}): CfnWebACL.SingleHeaderProperty =
    CfnWebACL.SingleHeaderProperty.builder().apply(initializer).build()
