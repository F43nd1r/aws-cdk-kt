package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.AwsDestination

@Generated
public fun awsDestination(initializer: AwsDestination.Builder.() -> Unit = {}): AwsDestination =
    AwsDestination.builder().apply(initializer).build()
