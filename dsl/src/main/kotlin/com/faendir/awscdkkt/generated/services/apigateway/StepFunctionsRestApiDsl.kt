package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.StepFunctionsRestApi
import software.amazon.awscdk.services.apigateway.StepFunctionsRestApiProps
import software.constructs.Construct

@Generated
public fun Construct.stepFunctionsRestApi(
  id: String,
  props: StepFunctionsRestApiProps,
  initializer: @AwsCdkDsl StepFunctionsRestApi.() -> Unit = {},
): StepFunctionsRestApi = StepFunctionsRestApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStepFunctionsRestApi(id: String, initializer: @AwsCdkDsl StepFunctionsRestApi.Builder.() -> Unit = {}): StepFunctionsRestApi = StepFunctionsRestApi.Builder.create(this, id).apply(initializer).build()
