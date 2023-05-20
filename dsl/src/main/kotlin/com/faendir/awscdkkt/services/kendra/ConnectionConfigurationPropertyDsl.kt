@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

public
    fun connectionConfigurationProperty(initializer: CfnDataSource.ConnectionConfigurationProperty.Builder.() -> Unit):
    CfnDataSource.ConnectionConfigurationProperty =
    CfnDataSource.ConnectionConfigurationProperty.builder().apply(initializer).build()
