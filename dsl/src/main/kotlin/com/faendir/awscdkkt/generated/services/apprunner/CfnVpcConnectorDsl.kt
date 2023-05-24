package com.faendir.awscdkkt.generated.services.apprunner

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnVpcConnector
import software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcConnector(id: String, props: CfnVpcConnectorProps): CfnVpcConnector =
    CfnVpcConnector(this, id, props)

@Generated
public fun Construct.cfnVpcConnector(
  id: String,
  props: CfnVpcConnectorProps,
  initializer: @AwsCdkDsl CfnVpcConnector.() -> Unit,
): CfnVpcConnector = CfnVpcConnector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVpcConnector(id: String, initializer: @AwsCdkDsl
    CfnVpcConnector.Builder.() -> Unit): CfnVpcConnector = CfnVpcConnector.Builder.create(this,
    id).apply(initializer).build()
