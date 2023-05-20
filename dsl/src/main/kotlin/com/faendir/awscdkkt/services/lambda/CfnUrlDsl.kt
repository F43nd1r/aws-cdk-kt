@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnUrl
import software.amazon.awscdk.services.lambda.CfnUrlProps
import software.constructs.Construct

public fun Construct.cfnUrl(
  id: String,
  props: CfnUrlProps,
  initializer: CfnUrl.() -> Unit = {},
): CfnUrl = CfnUrl(this, id, props).apply(initializer)
