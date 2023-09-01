package com.faendir.awscdkkt.generated.cloudassembly.schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DockerImageAsset

@Generated
public fun buildDockerImageAsset(initializer: @AwsCdkDsl DockerImageAsset.Builder.() -> Unit = {}):
    DockerImageAsset = DockerImageAsset.Builder().apply(initializer).build()
