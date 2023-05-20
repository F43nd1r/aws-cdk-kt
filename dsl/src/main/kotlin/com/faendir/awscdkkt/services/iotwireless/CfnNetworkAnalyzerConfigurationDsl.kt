@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfiguration
import software.amazon.awscdk.services.iotwireless.CfnNetworkAnalyzerConfigurationProps
import software.constructs.Construct

public fun Construct.cfnNetworkAnalyzerConfiguration(
  id: String,
  props: CfnNetworkAnalyzerConfigurationProps,
  initializer: CfnNetworkAnalyzerConfiguration.() -> Unit = {},
): CfnNetworkAnalyzerConfiguration = CfnNetworkAnalyzerConfiguration(this, id,
    props).apply(initializer)
