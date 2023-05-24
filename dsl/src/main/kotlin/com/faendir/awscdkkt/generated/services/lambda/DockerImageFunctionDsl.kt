package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.DockerImageFunction
import software.amazon.awscdk.services.lambda.DockerImageFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.dockerImageFunction(id: String, props: DockerImageFunctionProps):
    DockerImageFunction = DockerImageFunction(this, id, props)

@Generated
public fun Construct.dockerImageFunction(
  id: String,
  props: DockerImageFunctionProps,
  initializer: @AwsCdkDsl DockerImageFunction.() -> Unit,
): DockerImageFunction = DockerImageFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDockerImageFunction(id: String, initializer: @AwsCdkDsl
    DockerImageFunction.Builder.() -> Unit): DockerImageFunction =
    DockerImageFunction.Builder.create(this, id).apply(initializer).build()
