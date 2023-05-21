package com.faendir.awscdkkt.services.ecr.assets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps

@Generated
public fun dockerImageAssetProps(initializer: DockerImageAssetProps.Builder.() -> Unit = {}):
    DockerImageAssetProps = DockerImageAssetProps.builder().apply(initializer).build()
