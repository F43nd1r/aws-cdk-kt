@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnCustomResource
import software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps
import software.constructs.Construct

public fun Construct.cfnCustomResource(
  id: String,
  props: CfnCustomResourceProps,
  initializer: CfnCustomResource.() -> Unit = {},
): CfnCustomResource = CfnCustomResource(this, id, props).apply(initializer)
