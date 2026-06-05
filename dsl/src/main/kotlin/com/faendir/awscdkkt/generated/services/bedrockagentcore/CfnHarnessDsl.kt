package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnHarness
import software.amazon.awscdk.services.bedrockagentcore.CfnHarnessProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHarness(
  id: String,
  props: CfnHarnessProps,
  initializer: @AwsCdkDsl CfnHarness.() -> Unit = {},
): CfnHarness = CfnHarness(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHarness(id: String, initializer: @AwsCdkDsl CfnHarness.Builder.() -> Unit = {}): CfnHarness = CfnHarness.Builder.create(this, id).apply(initializer).build()
