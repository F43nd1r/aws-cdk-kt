package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.HttpStage
import software.amazon.awscdk.services.apigatewayv2.HttpStageProps
import software.constructs.Construct

@Generated
public fun Construct.httpStage(
  id: String,
  props: HttpStageProps,
  initializer: @AwsCdkDsl HttpStage.() -> Unit = {},
): HttpStage = HttpStage(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpStage(id: String, initializer: @AwsCdkDsl HttpStage.Builder.() -> Unit = {}): HttpStage = HttpStage.Builder.create(this, id).apply(initializer).build()
