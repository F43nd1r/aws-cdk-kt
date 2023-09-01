package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnMLTransform
import software.amazon.awscdk.services.glue.CfnMLTransformProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMLTransform(
  id: String,
  props: CfnMLTransformProps,
  initializer: @AwsCdkDsl CfnMLTransform.() -> Unit = {},
): CfnMLTransform = CfnMLTransform(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMLTransform(id: String, initializer: @AwsCdkDsl
    CfnMLTransform.Builder.() -> Unit = {}): CfnMLTransform = CfnMLTransform.Builder.create(this,
    id).apply(initializer).build()
