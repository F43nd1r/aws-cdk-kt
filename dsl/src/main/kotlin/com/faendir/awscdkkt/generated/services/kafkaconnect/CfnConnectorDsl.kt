package com.faendir.awscdkkt.generated.services.kafkaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnector(
  id: String,
  props: CfnConnectorProps,
  initializer: @AwsCdkDsl CfnConnector.() -> Unit = {},
): CfnConnector = CfnConnector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConnector(id: String, initializer: @AwsCdkDsl CfnConnector.Builder.() -> Unit = {}): CfnConnector = CfnConnector.Builder.create(this, id).apply(initializer).build()
