package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.HostedConfiguration
import software.amazon.awscdk.services.appconfig.HostedConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.hostedConfiguration(
  id: String,
  props: HostedConfigurationProps,
  initializer: @AwsCdkDsl HostedConfiguration.() -> Unit = {},
): HostedConfiguration = HostedConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHostedConfiguration(id: String, initializer: @AwsCdkDsl HostedConfiguration.Builder.() -> Unit = {}): HostedConfiguration = HostedConfiguration.Builder.create(this, id).apply(initializer).build()
