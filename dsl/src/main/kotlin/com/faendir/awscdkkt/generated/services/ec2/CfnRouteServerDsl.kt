package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRouteServer
import software.amazon.awscdk.services.ec2.CfnRouteServerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouteServer(
  id: String,
  props: CfnRouteServerProps,
  initializer: @AwsCdkDsl CfnRouteServer.() -> Unit = {},
): CfnRouteServer = CfnRouteServer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouteServer(id: String, initializer: @AwsCdkDsl CfnRouteServer.Builder.() -> Unit = {}): CfnRouteServer = CfnRouteServer.Builder.create(this, id).apply(initializer).build()
