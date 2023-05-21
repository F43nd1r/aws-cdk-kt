package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DockerImageDestination

@Generated
public fun dockerImageDestination(initializer: DockerImageDestination.Builder.() -> Unit = {}):
    DockerImageDestination = DockerImageDestination.builder().apply(initializer).build()
