package com.faendir.awscdkkt.generated.cloud_assembly_schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloud_assembly_schema.DockerImageDestination

@Generated
public fun buildDockerImageDestination(initializer: @AwsCdkDsl
    DockerImageDestination.Builder.() -> Unit = {}): DockerImageDestination =
    DockerImageDestination.Builder().apply(initializer).build()
