package com.faendir.awscdkkt.generated.services.b2bi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.b2bi.CfnTransformer
import software.amazon.awscdk.services.b2bi.CfnTransformerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransformer(
  id: String,
  props: CfnTransformerProps,
  initializer: @AwsCdkDsl CfnTransformer.() -> Unit = {},
): CfnTransformer = CfnTransformer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransformer(id: String, initializer: @AwsCdkDsl CfnTransformer.Builder.() -> Unit = {}): CfnTransformer = CfnTransformer.Builder.create(this, id).apply(initializer).build()
