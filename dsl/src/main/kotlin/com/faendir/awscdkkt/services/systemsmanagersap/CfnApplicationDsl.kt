@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.systemsmanagersap

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.systemsmanagersap.CfnApplication
import software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps
import software.constructs.Construct

public fun Construct.cfnApplication(
  id: String,
  props: CfnApplicationProps,
  initializer: CfnApplication.() -> Unit = {},
): CfnApplication = CfnApplication(this, id, props).apply(initializer)
