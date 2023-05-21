package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DockerCacheOption

@Generated
public fun dockerCacheOption(initializer: DockerCacheOption.Builder.() -> Unit = {}):
    DockerCacheOption = DockerCacheOption.builder().apply(initializer).build()
