package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnHarnessEndpoint
import software.amazon.awscdk.services.bedrockagentcore.CfnHarnessEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHarnessEndpoint(
  id: String,
  props: CfnHarnessEndpointProps,
  initializer: @AwsCdkDsl CfnHarnessEndpoint.() -> Unit = {},
): CfnHarnessEndpoint = CfnHarnessEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHarnessEndpoint(id: String, initializer: @AwsCdkDsl CfnHarnessEndpoint.Builder.() -> Unit = {}): CfnHarnessEndpoint = CfnHarnessEndpoint.Builder.create(this, id).apply(initializer).build()
