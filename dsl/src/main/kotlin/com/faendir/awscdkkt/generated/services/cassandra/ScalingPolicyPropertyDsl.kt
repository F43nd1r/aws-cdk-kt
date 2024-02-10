package com.faendir.awscdkkt.generated.services.cassandra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

@Generated
public fun buildScalingPolicyProperty(initializer: @AwsCdkDsl
    CfnTable.ScalingPolicyProperty.Builder.() -> Unit = {}): CfnTable.ScalingPolicyProperty =
    CfnTable.ScalingPolicyProperty.Builder().apply(initializer).build()
