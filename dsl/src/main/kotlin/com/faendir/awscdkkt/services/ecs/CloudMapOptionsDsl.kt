package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CloudMapOptions

@Generated
public fun cloudMapOptions(initializer: CloudMapOptions.Builder.() -> Unit = {}): CloudMapOptions =
    CloudMapOptions.builder().apply(initializer).build()
