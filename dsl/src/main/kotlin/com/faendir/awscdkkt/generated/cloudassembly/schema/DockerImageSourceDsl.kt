package com.faendir.awscdkkt.generated.cloudassembly.schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.DockerImageSource

@Generated
public fun buildDockerImageSource(initializer: @AwsCdkDsl DockerImageSource.Builder.() -> Unit):
    DockerImageSource = DockerImageSource.Builder().apply(initializer).build()
