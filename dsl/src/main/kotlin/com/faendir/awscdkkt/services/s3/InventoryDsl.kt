package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.Inventory

@Generated
public fun inventory(initializer: Inventory.Builder.() -> Unit = {}): Inventory =
    Inventory.builder().apply(initializer).build()
