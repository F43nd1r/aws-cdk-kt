package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.DockerRunOptions

@Generated
public fun dockerRunOptions(initializer: DockerRunOptions.Builder.() -> Unit = {}): DockerRunOptions
    = DockerRunOptions.builder().apply(initializer).build()
