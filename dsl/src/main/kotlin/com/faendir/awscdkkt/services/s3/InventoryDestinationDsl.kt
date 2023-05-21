package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.InventoryDestination

@Generated
public fun inventoryDestination(initializer: InventoryDestination.Builder.() -> Unit = {}):
    InventoryDestination = InventoryDestination.builder().apply(initializer).build()
