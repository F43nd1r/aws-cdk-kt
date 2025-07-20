package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.LayerVersion
import software.amazon.awscdk.services.lambda.LayerVersionProps
import software.constructs.Construct

@Generated
public fun Construct.layerVersion(
  id: String,
  props: LayerVersionProps,
  initializer: @AwsCdkDsl LayerVersion.() -> Unit = {},
): LayerVersion = LayerVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLayerVersion(id: String, initializer: @AwsCdkDsl LayerVersion.Builder.() -> Unit = {}): LayerVersion = LayerVersion.Builder.create(this, id).apply(initializer).build()
