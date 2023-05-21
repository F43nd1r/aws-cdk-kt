package com.faendir.awscdkkt.services.ecr.assets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions

@Generated
public
    fun dockerImageAssetInvalidationOptions(initializer: DockerImageAssetInvalidationOptions.Builder.() -> Unit
    = {}): DockerImageAssetInvalidationOptions =
    DockerImageAssetInvalidationOptions.builder().apply(initializer).build()
