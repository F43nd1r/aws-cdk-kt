package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnTable

@Generated
public
    fun magneticStoreWritePropertiesProperty(initializer: CfnTable.MagneticStoreWritePropertiesProperty.Builder.() -> Unit
    = {}): CfnTable.MagneticStoreWritePropertiesProperty =
    CfnTable.MagneticStoreWritePropertiesProperty.builder().apply(initializer).build()
