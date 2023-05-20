@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
