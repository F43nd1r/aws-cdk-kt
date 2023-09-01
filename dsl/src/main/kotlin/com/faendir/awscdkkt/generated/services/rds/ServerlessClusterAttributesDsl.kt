package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ServerlessClusterAttributes

@Generated
public fun buildServerlessClusterAttributes(initializer: @AwsCdkDsl
    ServerlessClusterAttributes.Builder.() -> Unit = {}): ServerlessClusterAttributes =
    ServerlessClusterAttributes.Builder().apply(initializer).build()
