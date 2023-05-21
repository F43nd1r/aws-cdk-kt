package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public fun spotOptionsProperty(initializer: CfnLaunchTemplate.SpotOptionsProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.SpotOptionsProperty =
    CfnLaunchTemplate.SpotOptionsProperty.builder().apply(initializer).build()
