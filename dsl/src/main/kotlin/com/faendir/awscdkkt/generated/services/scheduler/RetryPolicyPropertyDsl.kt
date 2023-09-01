package com.faendir.awscdkkt.generated.services.scheduler

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public fun buildRetryPolicyProperty(initializer: @AwsCdkDsl
    CfnSchedule.RetryPolicyProperty.Builder.() -> Unit = {}): CfnSchedule.RetryPolicyProperty =
    CfnSchedule.RetryPolicyProperty.Builder().apply(initializer).build()
