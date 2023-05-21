package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.DockerImageAssetSource

@Generated
public fun dockerImageAssetSource(initializer: DockerImageAssetSource.Builder.() -> Unit = {}):
    DockerImageAssetSource = DockerImageAssetSource.builder().apply(initializer).build()
