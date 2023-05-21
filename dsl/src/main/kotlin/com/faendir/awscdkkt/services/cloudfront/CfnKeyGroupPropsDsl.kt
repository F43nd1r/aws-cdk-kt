package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps

@Generated
public fun cfnKeyGroupProps(initializer: CfnKeyGroupProps.Builder.() -> Unit = {}): CfnKeyGroupProps
    = CfnKeyGroupProps.builder().apply(initializer).build()
