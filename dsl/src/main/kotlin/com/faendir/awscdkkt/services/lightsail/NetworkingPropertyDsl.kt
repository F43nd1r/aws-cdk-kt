package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnInstance

@Generated
public fun networkingProperty(initializer: CfnInstance.NetworkingProperty.Builder.() -> Unit = {}):
    CfnInstance.NetworkingProperty =
    CfnInstance.NetworkingProperty.builder().apply(initializer).build()
