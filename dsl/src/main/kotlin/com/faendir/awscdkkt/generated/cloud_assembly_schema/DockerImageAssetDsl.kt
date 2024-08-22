package com.faendir.awscdkkt.generated.cloud_assembly_schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloud_assembly_schema.DockerImageAsset

@Generated
public fun buildDockerImageAsset(initializer: @AwsCdkDsl DockerImageAsset.Builder.() -> Unit = {}):
    DockerImageAsset = DockerImageAsset.Builder().apply(initializer).build()
