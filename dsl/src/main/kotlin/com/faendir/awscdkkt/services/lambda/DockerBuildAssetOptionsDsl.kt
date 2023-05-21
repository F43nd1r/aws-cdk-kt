package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DockerBuildAssetOptions

@Generated
public fun dockerBuildAssetOptions(initializer: DockerBuildAssetOptions.Builder.() -> Unit = {}):
    DockerBuildAssetOptions = DockerBuildAssetOptions.builder().apply(initializer).build()
