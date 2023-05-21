package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ServiceAccountOptions

@Generated
public fun serviceAccountOptions(initializer: ServiceAccountOptions.Builder.() -> Unit = {}):
    ServiceAccountOptions = ServiceAccountOptions.builder().apply(initializer).build()
