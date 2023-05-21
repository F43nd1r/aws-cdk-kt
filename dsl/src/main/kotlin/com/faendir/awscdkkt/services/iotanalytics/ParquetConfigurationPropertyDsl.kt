package com.faendir.awscdkkt.services.iotanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@Generated
public
    fun parquetConfigurationProperty(initializer: CfnDatastore.ParquetConfigurationProperty.Builder.() -> Unit
    = {}): CfnDatastore.ParquetConfigurationProperty =
    CfnDatastore.ParquetConfigurationProperty.builder().apply(initializer).build()
