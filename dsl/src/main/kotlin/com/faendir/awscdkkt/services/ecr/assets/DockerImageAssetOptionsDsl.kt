package com.faendir.awscdkkt.services.ecr.assets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions

@Generated
public fun dockerImageAssetOptions(initializer: DockerImageAssetOptions.Builder.() -> Unit = {}):
    DockerImageAssetOptions = DockerImageAssetOptions.builder().apply(initializer).build()
