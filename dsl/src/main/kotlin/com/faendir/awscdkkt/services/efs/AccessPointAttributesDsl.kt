package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPointAttributes

@Generated
public fun accessPointAttributes(initializer: AccessPointAttributes.Builder.() -> Unit = {}):
    AccessPointAttributes = AccessPointAttributes.builder().apply(initializer).build()
