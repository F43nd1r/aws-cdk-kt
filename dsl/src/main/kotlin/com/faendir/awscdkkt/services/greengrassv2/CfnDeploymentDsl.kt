@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.greengrassv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import software.amazon.awscdk.services.greengrassv2.CfnDeploymentProps
import software.constructs.Construct

public fun Construct.cfnDeployment(
  id: String,
  props: CfnDeploymentProps,
  initializer: CfnDeployment.() -> Unit = {},
): CfnDeployment = CfnDeployment(this, id, props).apply(initializer)
