package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.DeploymentLifecycleLambdaTarget
import software.amazon.awscdk.services.lambda.IFunction

@Generated
public fun buildDeploymentLifecycleLambdaTarget(
  handler: IFunction,
  id: String,
  initializer: @AwsCdkDsl DeploymentLifecycleLambdaTarget.Builder.() -> Unit = {},
): DeploymentLifecycleLambdaTarget = DeploymentLifecycleLambdaTarget.Builder.create(handler, id).apply(initializer).build()
