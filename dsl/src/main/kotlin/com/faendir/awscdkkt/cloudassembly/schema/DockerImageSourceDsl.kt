package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DockerImageSource

@Generated
public fun dockerImageSource(initializer: DockerImageSource.Builder.() -> Unit = {}):
    DockerImageSource = DockerImageSource.builder().apply(initializer).build()
