package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnModel
import software.amazon.awscdk.services.apigateway.CfnModelProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModel(
  id: String,
  props: CfnModelProps,
  initializer: CfnModel.() -> Unit = {},
): CfnModel = CfnModel(this, id, props).apply(initializer)
