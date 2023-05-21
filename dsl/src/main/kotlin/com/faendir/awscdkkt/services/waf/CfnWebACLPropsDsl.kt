package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnWebACLProps

@Generated
public fun cfnWebACLProps(initializer: CfnWebACLProps.Builder.() -> Unit = {}): CfnWebACLProps =
    CfnWebACLProps.builder().apply(initializer).build()
