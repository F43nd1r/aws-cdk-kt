package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun inventoryConfigurationProperty(initializer: CfnBucket.InventoryConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.InventoryConfigurationProperty =
    CfnBucket.InventoryConfigurationProperty.builder().apply(initializer).build()
