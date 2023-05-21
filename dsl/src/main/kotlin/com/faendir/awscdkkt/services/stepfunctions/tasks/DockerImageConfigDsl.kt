package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.DockerImageConfig

@Generated
public fun dockerImageConfig(initializer: DockerImageConfig.Builder.() -> Unit = {}):
    DockerImageConfig = DockerImageConfig.builder().apply(initializer).build()
