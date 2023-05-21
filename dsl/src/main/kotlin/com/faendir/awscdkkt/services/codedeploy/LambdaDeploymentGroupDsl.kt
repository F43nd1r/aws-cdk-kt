package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroup
import software.amazon.awscdk.services.codedeploy.LambdaDeploymentGroupProps
import software.constructs.Construct

@Generated
public fun Construct.lambdaDeploymentGroup(
  id: String,
  props: LambdaDeploymentGroupProps,
  initializer: LambdaDeploymentGroup.() -> Unit = {},
): LambdaDeploymentGroup = LambdaDeploymentGroup(this, id, props).apply(initializer)
