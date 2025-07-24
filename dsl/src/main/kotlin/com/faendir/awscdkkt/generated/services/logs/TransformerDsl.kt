package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.Transformer
import software.amazon.awscdk.services.logs.TransformerProps
import software.constructs.Construct

@Generated
public fun Construct.transformer(
  id: String,
  props: TransformerProps,
  initializer: @AwsCdkDsl Transformer.() -> Unit = {},
): Transformer = Transformer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTransformer(id: String, initializer: @AwsCdkDsl Transformer.Builder.() -> Unit = {}): Transformer = Transformer.Builder.create(this, id).apply(initializer).build()
