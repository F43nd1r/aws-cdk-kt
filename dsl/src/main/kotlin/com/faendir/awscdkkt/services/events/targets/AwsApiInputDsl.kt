package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.AwsApiInput

@Generated
public fun awsApiInput(initializer: AwsApiInput.Builder.() -> Unit = {}): AwsApiInput =
    AwsApiInput.builder().apply(initializer).build()
