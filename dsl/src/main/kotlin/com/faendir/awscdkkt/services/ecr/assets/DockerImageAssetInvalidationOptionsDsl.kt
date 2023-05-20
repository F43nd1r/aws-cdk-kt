@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecr.assets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions

public
    fun dockerImageAssetInvalidationOptions(initializer: DockerImageAssetInvalidationOptions.Builder.() -> Unit):
    DockerImageAssetInvalidationOptions =
    DockerImageAssetInvalidationOptions.builder().apply(initializer).build()
