@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsPath

public
    fun pathFilterProperty(initializer: CfnNetworkInsightsPath.PathFilterProperty.Builder.() -> Unit):
    CfnNetworkInsightsPath.PathFilterProperty =
    CfnNetworkInsightsPath.PathFilterProperty.builder().apply(initializer).build()
