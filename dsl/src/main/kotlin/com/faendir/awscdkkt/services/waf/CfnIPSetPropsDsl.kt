package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnIPSetProps

@Generated
public fun cfnIPSetProps(initializer: CfnIPSetProps.Builder.() -> Unit = {}): CfnIPSetProps =
    CfnIPSetProps.builder().apply(initializer).build()
