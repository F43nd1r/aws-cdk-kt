@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroup
import software.amazon.awscdk.services.codedeploy.EcsDeploymentGroupProps
import software.constructs.Construct

public fun Construct.ecsDeploymentGroup(
  id: String,
  props: EcsDeploymentGroupProps,
  initializer: EcsDeploymentGroup.() -> Unit = {},
): EcsDeploymentGroup = EcsDeploymentGroup(this, id, props).apply(initializer)
