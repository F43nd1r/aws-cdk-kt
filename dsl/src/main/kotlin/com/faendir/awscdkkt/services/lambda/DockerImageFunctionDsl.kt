@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
