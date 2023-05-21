package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnInstance

@Generated
public fun diskProperty(initializer: CfnInstance.DiskProperty.Builder.() -> Unit = {}):
    CfnInstance.DiskProperty = CfnInstance.DiskProperty.builder().apply(initializer).build()
