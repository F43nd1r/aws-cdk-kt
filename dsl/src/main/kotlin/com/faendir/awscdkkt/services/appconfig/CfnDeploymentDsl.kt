@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnDeployment
import software.amazon.awscdk.services.appconfig.CfnDeploymentProps
import software.constructs.Construct

public fun Construct.cfnDeployment(
  id: String,
  props: CfnDeploymentProps,
  initializer: CfnDeployment.() -> Unit = {},
): CfnDeployment = CfnDeployment(this, id, props).apply(initializer)
