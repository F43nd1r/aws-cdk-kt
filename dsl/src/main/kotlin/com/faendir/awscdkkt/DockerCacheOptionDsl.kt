package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.DockerCacheOption

@Generated
public fun dockerCacheOption(initializer: DockerCacheOption.Builder.() -> Unit = {}):
    DockerCacheOption = DockerCacheOption.builder().apply(initializer).build()
