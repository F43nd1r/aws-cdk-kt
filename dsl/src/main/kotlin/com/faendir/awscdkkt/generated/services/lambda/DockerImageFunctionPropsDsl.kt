package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DockerImageFunctionProps

@Generated
public fun buildDockerImageFunctionProps(initializer: @AwsCdkDsl
    DockerImageFunctionProps.Builder.() -> Unit = {}): DockerImageFunctionProps =
    DockerImageFunctionProps.Builder().apply(initializer).build()
