@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.StepFunctionsRestApi
import software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps
import software.constructs.Construct

public fun Construct.stepFunctionsRestApi(
  id: String,
  props: StepFunctionsRestApiProps,
  initializer: StepFunctionsRestApi.() -> Unit = {},
): StepFunctionsRestApi = StepFunctionsRestApi(this, id, props).apply(initializer)
