package com.faendir.awscdkkt.generated.services.cassandra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

@Generated
public fun buildAutoScalingSettingProperty(initializer: @AwsCdkDsl
    CfnTable.AutoScalingSettingProperty.Builder.() -> Unit = {}):
    CfnTable.AutoScalingSettingProperty =
    CfnTable.AutoScalingSettingProperty.Builder().apply(initializer).build()
