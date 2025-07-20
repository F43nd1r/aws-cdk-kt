package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Deployment
import software.amazon.awscdk.services.apigateway.DeploymentProps
import software.constructs.Construct

@Generated
public fun Construct.deployment(
  id: String,
  props: DeploymentProps,
  initializer: @AwsCdkDsl Deployment.() -> Unit = {},
): Deployment = Deployment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDeployment(id: String, initializer: @AwsCdkDsl Deployment.Builder.() -> Unit = {}): Deployment = Deployment.Builder.create(this, id).apply(initializer).build()
