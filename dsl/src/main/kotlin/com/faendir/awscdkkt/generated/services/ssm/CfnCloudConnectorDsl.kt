package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnCloudConnector
import software.amazon.awscdk.services.ssm.CfnCloudConnectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudConnector(
  id: String,
  props: CfnCloudConnectorProps,
  initializer: @AwsCdkDsl CfnCloudConnector.() -> Unit = {},
): CfnCloudConnector = CfnCloudConnector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCloudConnector(id: String, initializer: @AwsCdkDsl CfnCloudConnector.Builder.() -> Unit = {}): CfnCloudConnector = CfnCloudConnector.Builder.create(this, id).apply(initializer).build()
