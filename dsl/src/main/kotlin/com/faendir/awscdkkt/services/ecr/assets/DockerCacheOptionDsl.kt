package com.faendir.awscdkkt.services.ecr.assets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerCacheOption

@Generated
public fun dockerCacheOption(initializer: DockerCacheOption.Builder.() -> Unit = {}):
    DockerCacheOption = DockerCacheOption.builder().apply(initializer).build()
