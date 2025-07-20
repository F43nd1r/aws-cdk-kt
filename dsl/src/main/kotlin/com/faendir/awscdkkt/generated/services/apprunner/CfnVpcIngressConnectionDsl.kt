package com.faendir.awscdkkt.generated.services.apprunner

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcIngressConnection(
  id: String,
  props: CfnVpcIngressConnectionProps,
  initializer: @AwsCdkDsl CfnVpcIngressConnection.() -> Unit = {},
): CfnVpcIngressConnection = CfnVpcIngressConnection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVpcIngressConnection(id: String, initializer: @AwsCdkDsl CfnVpcIngressConnection.Builder.() -> Unit = {}): CfnVpcIngressConnection = CfnVpcIngressConnection.Builder.create(this, id).apply(initializer).build()
