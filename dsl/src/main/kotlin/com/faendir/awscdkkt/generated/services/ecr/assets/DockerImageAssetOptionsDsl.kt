package com.faendir.awscdkkt.generated.services.ecr.assets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetOptions

@Generated
public fun buildDockerImageAssetOptions(initializer: @AwsCdkDsl
    DockerImageAssetOptions.Builder.() -> Unit = {}): DockerImageAssetOptions =
    DockerImageAssetOptions.Builder().apply(initializer).build()
