package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource

@Generated
public
    fun vpcConnectionPropertiesProperty(initializer: CfnDataSource.VpcConnectionPropertiesProperty.Builder.() -> Unit
    = {}): CfnDataSource.VpcConnectionPropertiesProperty =
    CfnDataSource.VpcConnectionPropertiesProperty.builder().apply(initializer).build()
