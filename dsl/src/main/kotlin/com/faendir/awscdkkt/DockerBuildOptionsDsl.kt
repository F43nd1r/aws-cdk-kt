package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.DockerBuildOptions

@Generated
public fun dockerBuildOptions(initializer: DockerBuildOptions.Builder.() -> Unit = {}):
    DockerBuildOptions = DockerBuildOptions.builder().apply(initializer).build()
