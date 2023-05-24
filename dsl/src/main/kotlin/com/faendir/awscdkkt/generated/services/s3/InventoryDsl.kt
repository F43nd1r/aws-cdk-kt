package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.Inventory

@Generated
public fun buildInventory(initializer: @AwsCdkDsl Inventory.Builder.() -> Unit): Inventory =
    Inventory.Builder().apply(initializer).build()
