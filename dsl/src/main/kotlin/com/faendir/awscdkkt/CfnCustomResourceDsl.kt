@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnCustomResource
import software.amazon.awscdk.CfnCustomResourceProps
import software.constructs.Construct

public fun Construct.cfnCustomResource(
  id: String,
  props: CfnCustomResourceProps,
  initializer: CfnCustomResource.() -> Unit = {},
): CfnCustomResource = CfnCustomResource(this, id, props).apply(initializer)
