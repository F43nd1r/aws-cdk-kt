package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun googleDriveConfigurationProperty(initializer: CfnDataSource.GoogleDriveConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.GoogleDriveConfigurationProperty =
    CfnDataSource.GoogleDriveConfigurationProperty.builder().apply(initializer).build()
