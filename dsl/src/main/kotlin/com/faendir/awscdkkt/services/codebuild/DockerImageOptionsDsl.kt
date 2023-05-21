package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.DockerImageOptions

@Generated
public fun dockerImageOptions(initializer: DockerImageOptions.Builder.() -> Unit = {}):
    DockerImageOptions = DockerImageOptions.builder().apply(initializer).build()
