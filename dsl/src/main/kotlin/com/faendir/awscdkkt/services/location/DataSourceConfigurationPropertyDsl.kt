package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnPlaceIndex

@Generated
public
    fun dataSourceConfigurationProperty(initializer: CfnPlaceIndex.DataSourceConfigurationProperty.Builder.() -> Unit
    = {}): CfnPlaceIndex.DataSourceConfigurationProperty =
    CfnPlaceIndex.DataSourceConfigurationProperty.builder().apply(initializer).build()
