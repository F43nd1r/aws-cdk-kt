@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnGroup
import software.amazon.awscdk.services.greengrass.CfnGroupProps
import software.constructs.Construct

public fun Construct.cfnGroup(
  id: String,
  props: CfnGroupProps,
  initializer: CfnGroup.() -> Unit = {},
): CfnGroup = CfnGroup(this, id, props).apply(initializer)
