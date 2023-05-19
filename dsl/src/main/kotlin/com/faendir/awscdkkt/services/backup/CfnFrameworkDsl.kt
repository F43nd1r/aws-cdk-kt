@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
