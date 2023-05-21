package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPointOptions

@Generated
public fun accessPointOptions(initializer: AccessPointOptions.Builder.() -> Unit = {}):
    AccessPointOptions = AccessPointOptions.builder().apply(initializer).build()
