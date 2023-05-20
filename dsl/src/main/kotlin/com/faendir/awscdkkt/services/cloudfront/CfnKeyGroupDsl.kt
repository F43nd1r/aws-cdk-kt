@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
import software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps
import software.constructs.Construct

public fun Construct.cfnKeyGroup(
  id: String,
  props: CfnKeyGroupProps,
  initializer: CfnKeyGroup.() -> Unit = {},
): CfnKeyGroup = CfnKeyGroup(this, id, props).apply(initializer)
