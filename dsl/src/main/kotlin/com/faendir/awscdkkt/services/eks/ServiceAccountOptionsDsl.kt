@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ServiceAccountOptions

public fun serviceAccountOptions(initializer: ServiceAccountOptions.Builder.() -> Unit):
    ServiceAccountOptions = ServiceAccountOptions.builder().apply(initializer).build()
