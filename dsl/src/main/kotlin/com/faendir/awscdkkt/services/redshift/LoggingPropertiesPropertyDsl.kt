@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnCluster

public
    fun loggingPropertiesProperty(initializer: CfnCluster.LoggingPropertiesProperty.Builder.() -> Unit):
    CfnCluster.LoggingPropertiesProperty =
    CfnCluster.LoggingPropertiesProperty.builder().apply(initializer).build()
