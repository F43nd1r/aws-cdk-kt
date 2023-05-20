@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.customerprofiles

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnObjectType
import software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps
import software.constructs.Construct

public fun Construct.cfnObjectType(
  id: String,
  props: CfnObjectTypeProps,
  initializer: CfnObjectType.() -> Unit = {},
): CfnObjectType = CfnObjectType(this, id, props).apply(initializer)
