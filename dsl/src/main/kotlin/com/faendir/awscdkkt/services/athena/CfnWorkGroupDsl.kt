@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup
import software.amazon.awscdk.services.athena.CfnWorkGroupProps
import software.constructs.Construct

public fun Construct.cfnWorkGroup(
  id: String,
  props: CfnWorkGroupProps,
  initializer: CfnWorkGroup.() -> Unit = {},
): CfnWorkGroup = CfnWorkGroup(this, id, props).apply(initializer)
