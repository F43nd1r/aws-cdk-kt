package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBProxyEndpoint
import software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDBProxyEndpoint(
  id: String,
  props: CfnDBProxyEndpointProps,
  initializer: @AwsCdkDsl CfnDBProxyEndpoint.() -> Unit = {},
): CfnDBProxyEndpoint = CfnDBProxyEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDBProxyEndpoint(id: String, initializer: @AwsCdkDsl CfnDBProxyEndpoint.Builder.() -> Unit = {}): CfnDBProxyEndpoint = CfnDBProxyEndpoint.Builder.create(this, id).apply(initializer).build()
