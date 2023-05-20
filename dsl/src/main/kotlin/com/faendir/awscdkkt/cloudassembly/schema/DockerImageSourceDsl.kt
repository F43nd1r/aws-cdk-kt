@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DockerImageSource

public fun dockerImageSource(initializer: DockerImageSource.Builder.() -> Unit): DockerImageSource =
    DockerImageSource.builder().apply(initializer).build()
