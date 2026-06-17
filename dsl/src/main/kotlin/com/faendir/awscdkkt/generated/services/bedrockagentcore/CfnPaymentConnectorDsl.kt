package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnPaymentConnector
import software.amazon.awscdk.services.bedrockagentcore.CfnPaymentConnectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPaymentConnector(
  id: String,
  props: CfnPaymentConnectorProps,
  initializer: @AwsCdkDsl CfnPaymentConnector.() -> Unit = {},
): CfnPaymentConnector = CfnPaymentConnector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPaymentConnector(id: String, initializer: @AwsCdkDsl CfnPaymentConnector.Builder.() -> Unit = {}): CfnPaymentConnector = CfnPaymentConnector.Builder.create(this, id).apply(initializer).build()
