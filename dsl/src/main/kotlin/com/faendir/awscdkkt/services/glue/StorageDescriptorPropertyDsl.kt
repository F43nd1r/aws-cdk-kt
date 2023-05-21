package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTable

@Generated
public
    fun storageDescriptorProperty(initializer: CfnTable.StorageDescriptorProperty.Builder.() -> Unit
    = {}): CfnTable.StorageDescriptorProperty =
    CfnTable.StorageDescriptorProperty.builder().apply(initializer).build()
