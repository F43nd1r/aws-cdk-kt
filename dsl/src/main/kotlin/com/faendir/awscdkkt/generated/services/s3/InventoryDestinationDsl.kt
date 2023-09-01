package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.InventoryDestination

@Generated
public fun buildInventoryDestination(initializer: @AwsCdkDsl InventoryDestination.Builder.() -> Unit
    = {}): InventoryDestination = InventoryDestination.Builder().apply(initializer).build()
