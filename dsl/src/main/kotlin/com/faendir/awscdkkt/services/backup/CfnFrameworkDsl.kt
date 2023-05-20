@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnFramework
import software.amazon.awscdk.services.backup.CfnFrameworkProps
import software.constructs.Construct

public fun Construct.cfnFramework(
  id: String,
  props: CfnFrameworkProps,
  initializer: CfnFramework.() -> Unit = {},
): CfnFramework = CfnFramework(this, id, props).apply(initializer)
