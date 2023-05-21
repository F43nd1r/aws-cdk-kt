package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.DockerImageAssetLocation

@Generated
public fun dockerImageAssetLocation(initializer: DockerImageAssetLocation.Builder.() -> Unit = {}):
    DockerImageAssetLocation = DockerImageAssetLocation.builder().apply(initializer).build()
