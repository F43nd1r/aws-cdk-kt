package com.faendir.awscdkkt.services.apigateway

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
  initializer: Deployment.() -> Unit = {},
): Deployment = Deployment(this, id, props).apply(initializer)
