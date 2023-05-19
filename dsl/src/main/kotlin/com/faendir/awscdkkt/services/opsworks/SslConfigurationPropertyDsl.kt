@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnApp

public
    fun sslConfigurationProperty(initializer: CfnApp.SslConfigurationProperty.Builder.() -> Unit):
    CfnApp.SslConfigurationProperty =
    CfnApp.SslConfigurationProperty.builder().apply(initializer).build()
