@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

public
    fun sqlConfigurationProperty(initializer: CfnDataSource.SqlConfigurationProperty.Builder.() -> Unit):
    CfnDataSource.SqlConfigurationProperty =
    CfnDataSource.SqlConfigurationProperty.builder().apply(initializer).build()
