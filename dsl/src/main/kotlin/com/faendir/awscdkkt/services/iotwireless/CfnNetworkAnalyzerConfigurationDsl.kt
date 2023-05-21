package com.faendir.awscdkkt.services.iotwireless

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
  initializer: CfnNetworkAnalyzerConfiguration.() -> Unit = {},
): CfnNetworkAnalyzerConfiguration = CfnNetworkAnalyzerConfiguration(this, id,
    props).apply(initializer)
