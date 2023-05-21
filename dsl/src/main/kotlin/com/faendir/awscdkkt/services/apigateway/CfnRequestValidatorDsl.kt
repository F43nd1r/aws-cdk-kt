package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRequestValidator
import software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRequestValidator(
  id: String,
  props: CfnRequestValidatorProps,
  initializer: CfnRequestValidator.() -> Unit = {},
): CfnRequestValidator = CfnRequestValidator(this, id, props).apply(initializer)
