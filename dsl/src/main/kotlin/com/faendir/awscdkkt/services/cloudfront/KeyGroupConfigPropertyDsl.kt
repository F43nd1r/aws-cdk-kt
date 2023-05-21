package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup

@Generated
public fun keyGroupConfigProperty(initializer: CfnKeyGroup.KeyGroupConfigProperty.Builder.() -> Unit
    = {}): CfnKeyGroup.KeyGroupConfigProperty =
    CfnKeyGroup.KeyGroupConfigProperty.builder().apply(initializer).build()
