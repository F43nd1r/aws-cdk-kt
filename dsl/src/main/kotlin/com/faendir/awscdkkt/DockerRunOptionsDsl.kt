@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.DockerRunOptions

public fun dockerRunOptions(initializer: DockerRunOptions.Builder.() -> Unit): DockerRunOptions =
    DockerRunOptions.builder().apply(initializer).build()
