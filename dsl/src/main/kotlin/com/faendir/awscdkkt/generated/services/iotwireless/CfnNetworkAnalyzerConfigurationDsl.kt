package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkAnalyzerConfiguration(
  id: String,
  props: CfnNetworkAnalyzerConfigurationProps,
  initializer: @AwsCdkDsl CfnNetworkAnalyzerConfiguration.() -> Unit = {},
): CfnNetworkAnalyzerConfiguration = CfnNetworkAnalyzerConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkAnalyzerConfiguration(id: String, initializer: @AwsCdkDsl CfnNetworkAnalyzerConfiguration.Builder.() -> Unit = {}): CfnNetworkAnalyzerConfiguration = CfnNetworkAnalyzerConfiguration.Builder.create(this, id).apply(initializer).build()
