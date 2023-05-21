package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DockerImageFunctionProps

@Generated
public fun dockerImageFunctionProps(initializer: DockerImageFunctionProps.Builder.() -> Unit = {}):
    DockerImageFunctionProps = DockerImageFunctionProps.builder().apply(initializer).build()
