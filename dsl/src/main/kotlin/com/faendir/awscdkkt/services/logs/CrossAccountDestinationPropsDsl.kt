package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.CrossAccountDestinationProps

@Generated
public fun crossAccountDestinationProps(initializer: CrossAccountDestinationProps.Builder.() -> Unit
    = {}): CrossAccountDestinationProps =
    CrossAccountDestinationProps.builder().apply(initializer).build()
