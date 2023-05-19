@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DockerImageFunction
import software.amazon.awscdk.services.lambda.DockerImageFunctionProps
import software.constructs.Construct

public fun Construct.dockerImageFunction(
  id: String,
  props: DockerImageFunctionProps,
  initializer: DockerImageFunction.() -> Unit = {},
): DockerImageFunction = DockerImageFunction(this, id, props).apply(initializer)
