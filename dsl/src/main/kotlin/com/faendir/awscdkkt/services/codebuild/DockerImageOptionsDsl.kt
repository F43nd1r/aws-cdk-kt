@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.DockerImageOptions

public fun dockerImageOptions(initializer: DockerImageOptions.Builder.() -> Unit):
    DockerImageOptions = DockerImageOptions.builder().apply(initializer).build()
