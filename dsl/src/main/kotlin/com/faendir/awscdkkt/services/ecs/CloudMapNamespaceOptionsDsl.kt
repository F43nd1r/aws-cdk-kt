package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions

@Generated
public fun cloudMapNamespaceOptions(initializer: CloudMapNamespaceOptions.Builder.() -> Unit = {}):
    CloudMapNamespaceOptions = CloudMapNamespaceOptions.builder().apply(initializer).build()
