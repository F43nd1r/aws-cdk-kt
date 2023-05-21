package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.AwsAuthMapping

@Generated
public fun awsAuthMapping(initializer: AwsAuthMapping.Builder.() -> Unit = {}): AwsAuthMapping =
    AwsAuthMapping.builder().apply(initializer).build()
