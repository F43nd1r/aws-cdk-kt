package com.faendir.awscdkkt.generated.cloud_assembly_schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloud_assembly_schema.DockerImageSource

@Generated
public fun buildDockerImageSource(initializer: @AwsCdkDsl DockerImageSource.Builder.() -> Unit =
    {}): DockerImageSource = DockerImageSource.Builder().apply(initializer).build()
