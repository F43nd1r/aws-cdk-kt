package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.amazon.awscdk.services.apigateway.CfnMethodProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMethod(
  id: String,
  props: CfnMethodProps,
  initializer: CfnMethod.() -> Unit = {},
): CfnMethod = CfnMethod(this, id, props).apply(initializer)
