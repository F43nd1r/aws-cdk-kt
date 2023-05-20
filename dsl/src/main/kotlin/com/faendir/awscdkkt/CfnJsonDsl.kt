@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnJson
import software.amazon.awscdk.CfnJsonProps
import software.constructs.Construct

public fun Construct.cfnJson(
  id: String,
  props: CfnJsonProps,
  initializer: CfnJson.() -> Unit = {},
): CfnJson = CfnJson(this, id, props).apply(initializer)
