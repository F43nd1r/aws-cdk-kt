package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Model
import software.amazon.awscdk.services.apigateway.ModelProps
import software.constructs.Construct

@Generated
public fun Construct.model(
  id: String,
  props: ModelProps,
  initializer: @AwsCdkDsl Model.() -> Unit = {},
): Model = Model(this, id, props).apply(initializer)

@Generated
public fun Construct.buildModel(id: String, initializer: @AwsCdkDsl Model.Builder.() -> Unit = {}): Model = Model.Builder.create(this, id).apply(initializer).build()
