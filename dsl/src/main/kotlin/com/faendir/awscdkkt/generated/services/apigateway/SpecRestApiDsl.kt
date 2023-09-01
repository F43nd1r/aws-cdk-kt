package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.SpecRestApi
import software.amazon.awscdk.services.apigateway.SpecRestApiProps
import software.constructs.Construct

@Generated
public fun Construct.specRestApi(
  id: String,
  props: SpecRestApiProps,
  initializer: @AwsCdkDsl SpecRestApi.() -> Unit = {},
): SpecRestApi = SpecRestApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSpecRestApi(id: String, initializer: @AwsCdkDsl
    SpecRestApi.Builder.() -> Unit = {}): SpecRestApi = SpecRestApi.Builder.create(this,
    id).apply(initializer).build()
