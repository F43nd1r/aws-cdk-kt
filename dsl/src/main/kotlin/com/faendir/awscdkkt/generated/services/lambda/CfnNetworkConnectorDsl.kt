package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnNetworkConnector
import software.amazon.awscdk.services.lambda.CfnNetworkConnectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkConnector(
  id: String,
  props: CfnNetworkConnectorProps,
  initializer: @AwsCdkDsl CfnNetworkConnector.() -> Unit = {},
): CfnNetworkConnector = CfnNetworkConnector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkConnector(id: String, initializer: @AwsCdkDsl CfnNetworkConnector.Builder.() -> Unit = {}): CfnNetworkConnector = CfnNetworkConnector.Builder.create(this, id).apply(initializer).build()
