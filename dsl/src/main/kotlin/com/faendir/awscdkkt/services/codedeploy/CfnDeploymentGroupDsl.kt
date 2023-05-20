@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroupProps
import software.constructs.Construct

public fun Construct.cfnDeploymentGroup(
  id: String,
  props: CfnDeploymentGroupProps,
  initializer: CfnDeploymentGroup.() -> Unit = {},
): CfnDeploymentGroup = CfnDeploymentGroup(this, id, props).apply(initializer)
