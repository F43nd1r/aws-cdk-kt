@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRequestValidator
import software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps
import software.constructs.Construct

public fun Construct.cfnRequestValidator(
  id: String,
  props: CfnRequestValidatorProps,
  initializer: CfnRequestValidator.() -> Unit = {},
): CfnRequestValidator = CfnRequestValidator(this, id, props).apply(initializer)
