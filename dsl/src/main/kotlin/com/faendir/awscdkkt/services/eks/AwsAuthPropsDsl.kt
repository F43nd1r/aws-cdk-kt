package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.AwsAuthProps

@Generated
public fun awsAuthProps(initializer: AwsAuthProps.Builder.() -> Unit = {}): AwsAuthProps =
    AwsAuthProps.builder().apply(initializer).build()
