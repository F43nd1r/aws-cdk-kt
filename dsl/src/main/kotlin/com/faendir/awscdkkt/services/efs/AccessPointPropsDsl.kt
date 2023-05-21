package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.AccessPointProps

@Generated
public fun accessPointProps(initializer: AccessPointProps.Builder.() -> Unit = {}): AccessPointProps
    = AccessPointProps.builder().apply(initializer).build()
