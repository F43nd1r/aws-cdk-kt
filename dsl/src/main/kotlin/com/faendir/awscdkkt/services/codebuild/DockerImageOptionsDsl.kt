@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.DockerImageOptions

public fun dockerImageOptions(initializer: DockerImageOptions.Builder.() -> Unit):
    DockerImageOptions = DockerImageOptions.builder().apply(initializer).build()
