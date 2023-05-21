package com.faendir.awscdkkt.services.scheduler

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

@Generated
public fun retryPolicyProperty(initializer: CfnSchedule.RetryPolicyProperty.Builder.() -> Unit =
    {}): CfnSchedule.RetryPolicyProperty =
    CfnSchedule.RetryPolicyProperty.builder().apply(initializer).build()
