package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDevEndpoint
import software.amazon.awscdk.services.glue.CfnDevEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDevEndpoint(
  id: String,
  props: CfnDevEndpointProps,
  initializer: @AwsCdkDsl CfnDevEndpoint.() -> Unit = {},
): CfnDevEndpoint = CfnDevEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDevEndpoint(id: String, initializer: @AwsCdkDsl CfnDevEndpoint.Builder.() -> Unit = {}): CfnDevEndpoint = CfnDevEndpoint.Builder.create(this, id).apply(initializer).build()
