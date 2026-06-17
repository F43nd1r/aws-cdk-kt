package com.faendir.awscdkkt.generated.services.bedrockagentcore

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrockagentcore.CfnConfigurationBundle
import software.amazon.awscdk.services.bedrockagentcore.CfnConfigurationBundleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationBundle(
  id: String,
  props: CfnConfigurationBundleProps,
  initializer: @AwsCdkDsl CfnConfigurationBundle.() -> Unit = {},
): CfnConfigurationBundle = CfnConfigurationBundle(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfigurationBundle(id: String, initializer: @AwsCdkDsl CfnConfigurationBundle.Builder.() -> Unit = {}): CfnConfigurationBundle = CfnConfigurationBundle.Builder.create(this, id).apply(initializer).build()
