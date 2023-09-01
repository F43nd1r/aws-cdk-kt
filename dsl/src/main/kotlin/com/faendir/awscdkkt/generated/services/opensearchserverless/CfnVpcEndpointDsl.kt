package com.faendir.awscdkkt.generated.services.opensearchserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcEndpoint(
  id: String,
  props: CfnVpcEndpointProps,
  initializer: @AwsCdkDsl CfnVpcEndpoint.() -> Unit = {},
): CfnVpcEndpoint = CfnVpcEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVpcEndpoint(id: String, initializer: @AwsCdkDsl
    CfnVpcEndpoint.Builder.() -> Unit = {}): CfnVpcEndpoint = CfnVpcEndpoint.Builder.create(this,
    id).apply(initializer).build()
