package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.AwsApiProps

@Generated
public fun awsApiProps(initializer: AwsApiProps.Builder.() -> Unit = {}): AwsApiProps =
    AwsApiProps.builder().apply(initializer).build()
