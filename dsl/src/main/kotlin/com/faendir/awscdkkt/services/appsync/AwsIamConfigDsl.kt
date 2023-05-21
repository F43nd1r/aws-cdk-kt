package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AwsIamConfig

@Generated
public fun awsIamConfig(initializer: AwsIamConfig.Builder.() -> Unit = {}): AwsIamConfig =
    AwsIamConfig.builder().apply(initializer).build()
