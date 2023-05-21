package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.DockerVolume

@Generated
public fun dockerVolume(initializer: DockerVolume.Builder.() -> Unit = {}): DockerVolume =
    DockerVolume.builder().apply(initializer).build()
