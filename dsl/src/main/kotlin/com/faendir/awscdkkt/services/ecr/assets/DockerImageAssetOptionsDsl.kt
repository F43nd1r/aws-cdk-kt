@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecr.assets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions

public fun dockerImageAssetOptions(initializer: DockerImageAssetOptions.Builder.() -> Unit):
    DockerImageAssetOptions = DockerImageAssetOptions.builder().apply(initializer).build()
