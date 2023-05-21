package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnApp

@Generated
public fun sslConfigurationProperty(initializer: CfnApp.SslConfigurationProperty.Builder.() -> Unit
    = {}): CfnApp.SslConfigurationProperty =
    CfnApp.SslConfigurationProperty.builder().apply(initializer).build()
