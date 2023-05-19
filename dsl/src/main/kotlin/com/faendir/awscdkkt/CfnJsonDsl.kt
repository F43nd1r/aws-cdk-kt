@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
