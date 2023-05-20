@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
