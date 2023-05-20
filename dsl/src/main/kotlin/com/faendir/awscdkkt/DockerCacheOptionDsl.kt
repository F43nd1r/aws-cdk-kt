@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.DockerCacheOption

public fun dockerCacheOption(initializer: DockerCacheOption.Builder.() -> Unit): DockerCacheOption =
    DockerCacheOption.builder().apply(initializer).build()
