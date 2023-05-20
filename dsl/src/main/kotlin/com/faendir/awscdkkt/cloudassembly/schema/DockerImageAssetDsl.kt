@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DockerImageAsset

public fun dockerImageAsset(initializer: DockerImageAsset.Builder.() -> Unit): DockerImageAsset =
    DockerImageAsset.builder().apply(initializer).build()
