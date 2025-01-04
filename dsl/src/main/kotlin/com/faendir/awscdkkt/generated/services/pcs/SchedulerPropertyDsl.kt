package com.faendir.awscdkkt.generated.services.pcs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pcs.CfnCluster

@Generated
public fun buildSchedulerProperty(initializer: @AwsCdkDsl
    CfnCluster.SchedulerProperty.Builder.() -> Unit = {}): CfnCluster.SchedulerProperty =
    CfnCluster.SchedulerProperty.Builder().apply(initializer).build()
