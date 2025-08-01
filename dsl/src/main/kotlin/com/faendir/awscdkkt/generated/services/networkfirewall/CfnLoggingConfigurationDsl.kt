package com.faendir.awscdkkt.generated.services.networkfirewall

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLoggingConfiguration(
  id: String,
  props: CfnLoggingConfigurationProps,
  initializer: @AwsCdkDsl CfnLoggingConfiguration.() -> Unit = {},
): CfnLoggingConfiguration = CfnLoggingConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLoggingConfiguration(id: String, initializer: @AwsCdkDsl CfnLoggingConfiguration.Builder.() -> Unit = {}): CfnLoggingConfiguration = CfnLoggingConfiguration.Builder.create(this, id).apply(initializer).build()
