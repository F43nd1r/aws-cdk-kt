package com.faendir.awscdkkt.generated.services.smsvoice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.smsvoice.CfnProtectConfiguration
import software.amazon.awscdk.services.smsvoice.CfnProtectConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProtectConfiguration(id: String, initializer: @AwsCdkDsl CfnProtectConfiguration.() -> Unit = {}): CfnProtectConfiguration = CfnProtectConfiguration(this, id).apply(initializer)

@Generated
public fun Construct.cfnProtectConfiguration(
  id: String,
  props: CfnProtectConfigurationProps,
  initializer: @AwsCdkDsl CfnProtectConfiguration.() -> Unit = {},
): CfnProtectConfiguration = CfnProtectConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProtectConfiguration(id: String, initializer: @AwsCdkDsl CfnProtectConfiguration.Builder.() -> Unit = {}): CfnProtectConfiguration = CfnProtectConfiguration.Builder.create(this, id).apply(initializer).build()
