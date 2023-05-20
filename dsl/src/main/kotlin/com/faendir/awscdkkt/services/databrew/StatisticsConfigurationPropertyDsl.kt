@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

public
    fun statisticsConfigurationProperty(initializer: CfnJob.StatisticsConfigurationProperty.Builder.() -> Unit):
    CfnJob.StatisticsConfigurationProperty =
    CfnJob.StatisticsConfigurationProperty.builder().apply(initializer).build()
