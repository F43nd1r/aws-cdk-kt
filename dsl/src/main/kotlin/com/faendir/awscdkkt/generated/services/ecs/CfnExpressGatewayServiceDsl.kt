package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnExpressGatewayService
import software.amazon.awscdk.services.ecs.CfnExpressGatewayServiceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExpressGatewayService(
  id: String,
  props: CfnExpressGatewayServiceProps,
  initializer: @AwsCdkDsl CfnExpressGatewayService.() -> Unit = {},
): CfnExpressGatewayService = CfnExpressGatewayService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExpressGatewayService(id: String, initializer: @AwsCdkDsl CfnExpressGatewayService.Builder.() -> Unit = {}): CfnExpressGatewayService = CfnExpressGatewayService.Builder.create(this, id).apply(initializer).build()
