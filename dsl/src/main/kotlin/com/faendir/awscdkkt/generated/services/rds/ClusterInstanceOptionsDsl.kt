package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.ClusterInstanceOptions

@Generated
public fun buildClusterInstanceOptions(initializer: @AwsCdkDsl
    ClusterInstanceOptions.Builder.() -> Unit = {}): ClusterInstanceOptions =
    ClusterInstanceOptions.Builder().apply(initializer).build()
