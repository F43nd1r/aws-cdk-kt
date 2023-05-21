package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ServiceAccountProps

@Generated
public fun serviceAccountProps(initializer: ServiceAccountProps.Builder.() -> Unit = {}):
    ServiceAccountProps = ServiceAccountProps.builder().apply(initializer).build()
