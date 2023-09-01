package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventSourceMapping(
  id: String,
  props: CfnEventSourceMappingProps,
  initializer: @AwsCdkDsl CfnEventSourceMapping.() -> Unit = {},
): CfnEventSourceMapping = CfnEventSourceMapping(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventSourceMapping(id: String, initializer: @AwsCdkDsl
    CfnEventSourceMapping.Builder.() -> Unit = {}): CfnEventSourceMapping =
    CfnEventSourceMapping.Builder.create(this, id).apply(initializer).build()
