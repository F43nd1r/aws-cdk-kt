package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnUrl
import software.amazon.awscdk.services.lambda.CfnUrlProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUrl(
  id: String,
  props: CfnUrlProps,
  initializer: CfnUrl.() -> Unit = {},
): CfnUrl = CfnUrl(this, id, props).apply(initializer)
