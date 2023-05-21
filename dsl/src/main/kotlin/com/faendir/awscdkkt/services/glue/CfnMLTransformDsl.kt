package com.faendir.awscdkkt.services.glue

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
  initializer: CfnMLTransform.() -> Unit = {},
): CfnMLTransform = CfnMLTransform(this, id, props).apply(initializer)
